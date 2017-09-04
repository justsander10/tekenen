package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);

    }



    @Override
    public void start(Stage primaryStage) throws IOException {
        Drawing d = new Drawing("Tekening");
        d.drawItem(new Oval(Color.Black, new Point(3.0,2.0),5.0,4.0,3.0));
        d.drawItem(new Image(Color.Black, new File("C:\\Temp\\Actor.png"), new Point(1.0, 2.0), 2.0, 1.0));
        d.drawItem(new PaintedText(Color.Black, "tekst", "arial", new Point(1.0, 2.0), 1.0, 2.0));
        d.drawItem(new Polygon(Color.Black, new ArrayList<Point>(){{
            add(new Point(3.0, 6.0));
            add(new Point(1.0, 3.0));
            add(new Point(5.0, 3.0));
        }}, 2.0));

        ArrayList<DrawingItem> items = d.getDrawingItemArrayList();
        //Collections.sort(items, new DrawingAnchor )
        for(DrawingItem a: items)
            System.out.println(a.toString());
    }





}
