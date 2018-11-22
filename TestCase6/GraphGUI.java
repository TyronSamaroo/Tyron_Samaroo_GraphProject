package TestCase6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GraphGUI extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Graph Interface");

       // BoarderPane for all board
        BorderPane boarderpane = new BorderPane();

        //sets of buttons will be on a grid
        GridPane radiogrid = new GridPane();
        //Names of buttons
        RadioButton AddVertex = new RadioButton("Add Vertex");
        RadioButton AddEdge = new RadioButton("Add Edge");
        RadioButton RemoveEdge = new RadioButton("Remove Edge");
        RadioButton MoveVertex = new RadioButton("Move Vertex");
        // Looks
        radiogrid.setHgap(10);
        radiogrid.setVgap(10);
        radiogrid.add(AddVertex, 0, 1);
        radiogrid.add(AddEdge, 0, 2);
        radiogrid.add(RemoveEdge, 0, 3);
        radiogrid.add(MoveVertex, 0, 4);

        ToggleGroup toggleGroup = new ToggleGroup();

        boarderpane.setLeft(radiogrid);


        StackPane root = new StackPane();

        root.getChildren().addAll(boarderpane);
        Scene scene = (new Scene(root, 800, 400));
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}