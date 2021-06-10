//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
//
//public class BorderLayoutExampleFX extends Application {
//
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		BorderPane borderPane = new BorderPane(); // Border Layout
//
//		/* Buttons erstellen */
//		Button top = new Button("Top");
//		top.setPrefWidth(400);
//		//top.setMinWidth(200);
//		Button mid = new Button("Mid");
//		Button left = new Button("Left");
//		Button right = new Button("Right");
//		Button bottom = new Button("Bottom");
//
//		/* Buttons an die Position im Layout setzen */
//		borderPane.setTop(top);
//		borderPane.setCenter(mid);
//		borderPane.setLeft(left);
//		borderPane.setRight(right);
//		borderPane.setBottom(bottom);
//
//		Scene mainScene = new Scene(borderPane, 900, 600); // Scene mit Border Layout welche 900x600pixel groß ist
//		primaryStage.setScene(mainScene); // Scene in Stage setzen
//		primaryStage.setTitle("Border Layout Example"); // Fenstername setzen
//		primaryStage.show(); // Fenster anzeigen
//	}
//}
