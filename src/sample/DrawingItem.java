package sample;

public abstract class DrawingItem {

    private Color color;

    public DrawingItem(Color color) {
        this.color = color;
    }

    public abstract Point getAnchor();
    public abstract Double getWidth();
    public abstract Double getHeight();


}


