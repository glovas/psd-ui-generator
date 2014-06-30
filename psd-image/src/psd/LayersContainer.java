package psd;

public interface LayersContainer {
    public Layer getLayer(int index);
    public int indexOfLayer(Layer layer);
    public int getLayersCount();
    public int getWidth();
    public int getHeight();
    public int getX();
    public int getY();
    public int getRight();
    public int getBottom();
}
