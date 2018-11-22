package TestCase6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GraphGUI extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Graph Interface");

       // BoarderPane for all board
        BorderPane boarderpane = new BorderPane();




        GridPane grid = new GridPane();
        Button AddAllEdges = new Button("Add all Edges");
        Button Connected = new Button("Show Connected Components");
        Button CutVertices = new Button("Show Cut Vertices");
        Button Help = new Button("Help");

        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(AddAllEdges, 0, 8);
        grid.add(Connected, 0, 9);
        grid.add(CutVertices, 0, 10);
        grid.add(Help, 0, 11);


        //sets of buttons will be on a grid

        //Names of buttons
        RadioButton AddVertex = new RadioButton("Add Vertex");
        RadioButton AddEdge = new RadioButton("Add Edge");
        RadioButton RemoveEdge = new RadioButton("Remove Edge");
        RadioButton MoveVertex = new RadioButton("Move Vertex");
        // Looks
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(AddVertex, 0, 1);
        grid.add(AddEdge, 0, 2);
        grid.add(RemoveEdge, 0, 3);
        grid.add(MoveVertex, 0, 4);

        ToggleGroup toggleGroup = new ToggleGroup();
        AddVertex.setToggleGroup(toggleGroup);AddEdge.setToggleGroup(toggleGroup);
        RemoveEdge.setToggleGroup(toggleGroup);MoveVertex.setToggleGroup(toggleGroup);
        // toggleGroup.getSelectedToggle() to access button


        Pane wrapperPane = new Pane();
        boarderpane.setCenter(wrapperPane);
        Canvas canvas = new Canvas();
        wrapperPane.getChildren().add(canvas);
        canvas.widthProperty().bind(wrapperPane.widthProperty());
        canvas.heightProperty().bind(wrapperPane.heightProperty());







        //setting grid
        boarderpane.setLeft(grid);



        StackPane root = new StackPane();

        root.getChildren().addAll(boarderpane);
        Scene scene = (new Scene(root, 800, 400));
        primaryStage.setScene(scene);
        primaryStage.show();




        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5.0);

        canvas.setOnMousePressed(event -> {
            gc.beginPath();
            gc.lineTo(event.getX(), event.getY());
            gc.stroke();
        });

        canvas.setOnMouseDragged(event -> {
            gc.beginPath();
            gc.lineTo(event.getX(), event.getY());
            gc.stroke();
        });




    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}