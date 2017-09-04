package sample;

public class PaintedText extends DrawingItem{
    public PaintedText(Color color, String content, String fontName, Point anchor, Double width, Double height) {
        super(color);
        this.content = content;
        this.fontName = fontName;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
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

    private String content;
    private String fontName;
    private Point anchor;
    private Double width;
    private Double height;

    @Override
    public String toString() {
        return String.format("TEXT(c='%s'; f=%s; a=%s; w=%4.3f; h=%4.3f)", this.content, this.fontName, this.anchor.toString(), this.width, this.height);
    }
}
