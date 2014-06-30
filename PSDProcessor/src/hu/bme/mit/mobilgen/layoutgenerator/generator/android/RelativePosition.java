package hu.bme.mit.mobilgen.layoutgenerator.generator.android;

import psdstructure.Grid;
import psdstructure.View;
import psdstructure.ViewGroup;

public class RelativePosition {

	public static final int TOP = 0;
	public static final int RIGHT = 1;
	public static final int BOTTOM = 2;
	public static final int LEFT = 3;

	private String[] neightbours = { "", "", "", "" };
	private boolean[] alignParent = { false, false, false, false };
	private int[] margins = { 0, 0, 0, 0 };
	private int[] paddings = {0, 0, 0, 0};
	private boolean centerHorizontal = false;

	public void setNeighbour(String id, int direction) {
		neightbours[direction] = id;
	}

	public void setAlignParent(boolean value, int direction) {
		alignParent[direction] = value;
	}

	public void setMargin(int value, int direction) {
		margins[direction] = value;
	}

	public void setPadding(int value, int direction) {
		paddings[direction] = value;
	}
	
	public void setCenterHorizontal(boolean value) {
		centerHorizontal = true;
	}
	
	public String getNeighbour(int direction) {
		return neightbours[direction];
	}

	public boolean getAlignParent(int direction) {
		return alignParent[direction];
	}

	public int getMargin(int direction) {
		return margins[direction];
	}

	public int getPadding(int direction) {
		return paddings[direction];
	}
	
	public boolean getCenterHorizontal() {
		return centerHorizontal;
	}
	
	public boolean hasPadding(){
		for (int i = 0; i < paddings.length; i++) {
			if(paddings[i] > 0){
				return true;
			}
		}
		return false;
	}

	public static RelativePosition getPosition(ViewGroup root, View item) {
		RelativePosition pos = new RelativePosition();

		ViewGroup parent = findParentGroup(root, item);
		if(parent == null || parent instanceof Grid) {
			return pos;
		}
		
		// get closest item above the current view
		View top = getClosest(parent, item, TOP);
		if (top == null) {
			pos.setAlignParent(true, TOP);
			pos.setMargin(item.getPos().getY(), TOP);
		} else {
			pos.setNeighbour(top.getID(), TOP);
			int marginTop = item.getPos().getY() - (top.getPos().getY()
					+ top.getSize().getY());
			pos.setMargin(marginTop, TOP);
		}

		// get closest item on the right
		View right = getClosest(parent, item, RIGHT);
		if (right == null) {
			pos.setAlignParent(true, RIGHT);
			pos.setMargin(parent.getSize().getX() - (item.getPos().getX()
					+ item.getSize().getX()), RIGHT);
		} else {
			pos.setNeighbour(right.getID(), RIGHT);
			// right margin is zero to prevent double margins on the sides
			// between views
			pos.setMargin(0, RIGHT);
		}

		// get closest item below
		View bottom = getClosest(parent, item, BOTTOM);
		if (bottom == null) {
			pos.setAlignParent(true, BOTTOM);
			pos.setMargin(parent.getSize().getY() - (item.getPos().getY()
					+ item.getSize().getY()), BOTTOM);
		} else {
			pos.setNeighbour(bottom.getID(), BOTTOM);
			// bottom margin is zero to prevent double margins on between views
			pos.setMargin(0, LEFT);
		}

		// get closest item on the left
		View left = getClosest(parent, item, LEFT);
		if (left == null) {
			pos.setAlignParent(true, LEFT);
			pos.setMargin(item.getPos().getX(), LEFT);
		} else {
			pos.setNeighbour(left.getID(), LEFT);
			int marginLeft = item.getPos().getX() - (left.getPos().getX()
					+ left.getSize().getX());
			pos.setMargin(marginLeft, LEFT);
		}
		
		// check center position
		if(pos.getAlignParent(LEFT) && pos.getAlignParent(RIGHT)) {
			pos.setCenterHorizontal(true);
			
			//calculate padding
			int centerSideSpace = (parent.getSize().getX()/2) - (item.getSize().getX()/2);
			int spaceDifference = pos.getMargin(LEFT) - centerSideSpace;
			if(spaceDifference > 0) {
				pos.setPadding(spaceDifference, LEFT);
			}
			else {
				pos.setPadding(-spaceDifference, RIGHT);
			}
		}

		return pos;
	}

	
	
	private static ViewGroup findParentGroup(ViewGroup root, View item) {
		ViewGroup parent = null;
		
		if(root.equals(item)){
			return null;
		}
		
		if(root.getChildren().contains(item)) {
			return root;
		}
		
		for(View v : root.getChildren()) {
			if(v instanceof ViewGroup) {
				parent = findParentGroup((ViewGroup) v, item);
				if(parent != null) {
					return parent;
				}
			}
		}
		
		return parent;
	}

	/**
	 * Returns the closest view in the given direction
	 */
	private static View getClosest(ViewGroup parent, View item, int direction) {
		View closest = null;
		
		switch (direction) {
		case TOP:
			for (View child : parent.getChildren()) {
				if (child.getPos().getY() + child.getSize().getY() < item
						.getPos().getY()) {
					// the child is above the current item
					if (closest == null) {
						closest = child;
					} else if (closest.getPos().getY()
							+ closest.getSize().getY() < child.getPos().getY()
							+ child.getSize().getY()) {
						// child is closer than the current closest
						closest = child;
					}
				}
			}
			break;
		case RIGHT:
			for (View child : parent.getChildren()) {
				if (item.getPos().getX() + item.getSize().getX() < child
						.getPos().getX()) {
					// the child is right to the item
					if (closest == null) {
						closest = child;
					} else if (closest.getPos().getX() < child.getPos().getX()) {
						// child is closer than the current closest
						closest = child;
					}
				}
			}
			break;
		case BOTTOM:
			for (View child : parent.getChildren()) {
				if (child.getPos().getY() > item
						.getPos().getY() + item.getSize().getY()) {
					// the child is below the current item
					if (closest == null) {
						closest = child;
					} else if (closest.getPos().getY() > child.getPos().getY()) {
						// child is closer than the current closest
						closest = child;
					}
				}
			}
			break;
		case LEFT:
			for (View child : parent.getChildren()) {
				if (child.getPos().getX() + child.getSize().getX() < item
						.getPos().getX()) {
					// the child is left to the current item
					if (closest == null) {
						closest = child;
					} else if (closest.getPos().getX()
							+ closest.getSize().getX() < child.getPos().getX()
							+ child.getSize().getX()) {
						// child is closer than the current closest
						closest = child;
					}
				}
			}
			break;
		default:
			break;
		}
		return closest;
	}

}
