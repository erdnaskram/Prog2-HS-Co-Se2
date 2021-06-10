//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.scene.*;
//import javafx.stage.Stage;
//import javafx.scene.control.*;
//import javafx.scene.shape.Polygon;
//
//
//public class GroupExample extends Application {
//
//	@Override
//	public void start(Stage stage) throws Exception {
//
//		// Nodes
//		Node label = new Label("Hello World");
//
//		Polygon polygon = new Polygon();
//		polygon.getPoints().addAll(new Double[]{
//		100.0, 100.0,320.0, 110.0,150.0, 130.0,170.0, 180.0,
//		290.0, 200.0,110.0, 230.0 });
//
//
//		// Group erbt von Node und erlaubt die Gruppierung mehrerer Nodes.
//		Group root = new Group();
//		//root.getChildren().add(label);
//		root.getChildren().add(polygon);
//
//		root.getChildren().add(label);
//
//
//		Scene scene = new Scene(root, 400,400);
//
//		stage.setTitle("JavaFX Fenster");
//		stage.setScene(scene);
//		stage.show();
//	}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//}
