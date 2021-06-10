//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//public class GridLayoutExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		GridPane gp = new GridPane(); // Flow Layout
//		Scene s = new Scene(gp, 800, 155);
//
//		primaryStage.setTitle("Beispiel fuer GridPane"); // Titel des Fensters
//
//		/* Erstelle Buttons und fuege diese in die GridPane ein */
//		for(int i = 0; i < 5; i++) {
//			for(int x = 0; x < 6; x++) {
//				Button b = new Button("Reihe: " + i + " Spalte: " + x);
//				gp.add(b, x, i); // X Gibt die Splate in der GridPane an und I die Reihe
//			}
//		}
//
//		primaryStage.setScene(s); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//
//	}
//}
