//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.CornerRadii;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class BackgroundExampleFX extends Application {
//
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		Pane blankPane = new Pane(); // Blankes Layout
//		/* Hintergrund der Pane setzen */
//		blankPane.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
//
//		/*
//		 * Alternativ: blankPane.setStyle("-fx-background-color: yellow");
//		 */
//
//		Scene mainScene = new Scene(blankPane, 900, 600); // Scene mit blankem Layout welche 900x600pixel groß ist
//		primaryStage.setScene(mainScene); // Scene in Stage setzen
//		primaryStage.setTitle("Background Example"); // Fenstername setzen
//		primaryStage.show(); // Fenster anzeigen
//	}
//}
