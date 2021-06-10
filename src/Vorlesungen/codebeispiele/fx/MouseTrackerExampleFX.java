//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class MouseTrackerExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		Label mousePosition = new Label("MOVE MOUSE"); // Erstelle Label mit dem - vorlaeufigen - Text "MOVE MOUSE"
//		mousePosition.setFont(new Font(100)); // Setze Schriftgroesse des Labels auf 200px
//		mousePosition.setAlignment(Pos.BASELINE_CENTER); // Positioniere Label Mittig
//
//		Scene scene = new Scene(mousePosition, 1000, 400); // Erstelle Scene mit dem Label als Hauptwidget
//
//		primaryStage.setTitle("Beispiel für MouseTracker"); // Titel des Fensters
//
//		/*
//		 * Listener, der ausgel�st wird, wenn eine Tate gedrueckt wird und das Fenster
//		 * im Fokus ist
//		 */
//		scene.addEventFilter(MouseEvent.MOUSE_MOVED, e -> {
//			mousePosition.setText("X: " + e.getSceneX() + " | Y: " + e.getSceneY()); // Setze den Text auf die X und Y
//																						// Koordinaten der Maus
//		});
//
//		primaryStage.setScene(scene); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//	}
//}
