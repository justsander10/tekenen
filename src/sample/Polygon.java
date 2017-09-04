package sample;

import java.util.ArrayList;

public class Polygon extends DrawingItem{
    public Polygon(Color color, ArrayList<Point> verteces, Double weight) {
        super(color);
        this.verteces = verteces;
        this.weight = weight;
    }

    private ArrayList<Point> verteces = new ArrayList<Point>();
    private Double weight;

    public void setVerteces(ArrayList<Point> verteces) {
        this.verteces = verteces;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public Point getAnchor() {
        return new Point(verteces.stream().mapToDouble(Point::getX).min().orElse(-1), verteces.stream().mapToDouble(Point::getY).max().orElse(-1));
    }

    @Override
    public Double getWidth() {
        return verteces.stream().mapToDouble(Point::getX).max().orElse(-1) - verteces.stream().mapToDouble(Point::getX).min().orElse(-1);
    }

    @Override
    public Double getHeight() {
        return verteces.stream().mapToDouble(Point::getY).max().orElse(-1) - verteces.stream().mapToDouble(Point::getY).min().orElse(-1);
    }
    @Override
    public String toString() {
        return String.format("POLYGON(a=%s h=%4.3f; w=%4.3f)", this.getAnchor().toString(), this.getHeight(), this.getWidth());
    }
}

