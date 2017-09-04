package sample;

import java.io.File;

public class Image extends DrawingItem {
    public Image(Color color, File file, Point anchor, Double width, Double height) {
        super(color);
        this.file = file;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    private File file;
    private Point anchor;
    private Double width;
    private Double height;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Point getAnchor() {
        return anchor;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("IMAGE(f=%s; a=%s; w=%4.3f; h=%4.3f)", this.file.getName(), this.anchor.toString(), this.width, this.height);
    }
}
