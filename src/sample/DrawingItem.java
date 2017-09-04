package sample;

public abstract class DrawingItem {

    private Color color;
    private DrawingItem previousDrawingItem;

    public DrawingItem(DrawingItem previousDrawingItem) {
        this.previousDrawingItem = previousDrawingItem;
    }

    public void setPreviousDrawingItem(DrawingItem previousDrawingItem) {
        this.previousDrawingItem = previousDrawingItem;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public DrawingItem(Color color) {
        this.color = this.color;
    }

    public abstract Point getAnchor();
    public abstract Double getWidth();
    public abstract Double getHeight();


}


