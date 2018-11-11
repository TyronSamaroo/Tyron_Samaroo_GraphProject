package TestCase2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CanvasTest extends Application {


    public void start(Stage primaryStage) {
        primaryStage.setTitle("Graph Interface");

        GridPane buttongrid = new GridPane();
        buttongrid.setAlignment(Pos.BASELINE_LEFT);
        Button AddAllEdges = new Button("Add all Edges");
        Button Connected = new Button("Show Connected Components");
        Button CutVertices = new Button("Show Cut Vertices");
        Button Help = new Button("Help");
        buttongrid.setHgap(10);
        buttongrid.setVgap(10);
        buttongrid.add(AddAllEdges, 0, 15);
        buttongrid.add(Connected, 0, 16);
        buttongrid.add(CutVertices, 0, 17);
        buttongrid.add(Help, 0, 18);

        GridPane radiogrid = new GridPane();
        radiogrid.setAlignment(Pos.BASELINE_LEFT);
        RadioButton AddVertex = new RadioButton("Add Vertex");
        RadioButton AddEdge = new RadioButton("Add Edge");
        RadioButton RemoveEdge = new RadioButton("Remove Edge");
        RadioButton MoveVertex = new RadioButton("Move Vertex");
        ToggleGroup choices = new ToggleGroup();

        AddVertex.setToggleGroup(choices);
        AddEdge.setToggleGroup(choices);
        RemoveEdge.setToggleGroup(choices);
        MoveVertex.setToggleGroup(choices);

        radiogrid.setHgap(10);
        radiogrid.setVgap(10);
        radiogrid.add(AddVertex, 0, 1);
        radiogrid.add(AddEdge, 0, 2);
        radiogrid.add(RemoveEdge, 0, 3);
        radiogrid.add(MoveVertex, 0, 4);

        AddVertex.setOnAction((ActionEvent event) -> {

            System.out.println("Node Created");
        });


        Canvas canvas = new Canvas(500, 200 );
        StackPane root = new StackPane();
        root.getChildren().addAll(buttongrid, radiogrid, canvas);
        Scene scene = (new Scene(root, 800, 400));
        primaryStage.setScene(scene);
        primaryStage.show();


        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.RED);
        gc.setLineWidth(2.0);

        scene.setOnMousePressed(event -> {
            gc.beginPath();
            gc.lineTo(event.getSceneX(), event.getSceneY());
            gc.stroke();
        });

        scene.setOnMouseDragged(event -> {
            gc.beginPath();
            gc.lineTo(event.getSceneX(), event.getSceneY());
            gc.stroke();
        });

    }
        public static void main (String[]args){
            Application.launch(args);
        }

}

