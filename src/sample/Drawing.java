package sample;

import java.util.ArrayList;

public class Drawing {
    private String name;
    private ArrayList<DrawingItem> drawingItemArrayList = new ArrayList<DrawingItem>();



    public void drawItem(DrawingItem drawingItem)
    {
        drawingItemArrayList.add(drawingItem);
    }

    public ArrayList<DrawingItem> getDrawingItemArrayList() {
        return drawingItemArrayList;
    }

    public Drawing(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
