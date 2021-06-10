//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class KeyListenerExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		Label lastKeyPressed = new Label("PRESS KEY"); // Erstelle Label mit dem - vorläufigen - Text "PRESS KEY"
//		lastKeyPressed.setFont(new Font(200)); // Setze Schriftgröße des Labels auf 200px
//		lastKeyPressed.setAlignment(Pos.BASELINE_CENTER); // Positioniere Label Mittig
//
//		Scene scene = new Scene(lastKeyPressed, 1000, 400); // Erstelle Scene mit dem Label als Hauptwidget
//
//		primaryStage.setTitle("Beispiel für KeyListener"); // Titel des Fensters
//
//		/* Listener, der ausl�st, wenn eine Tate gedrückt wird und das Fenester im Fokus ist */
//		// Setze den Text des Labels auf den Wert der gedrückten Taste
//		scene.setOnKeyPressed(event -> lastKeyPressed.setText(event.getCode().toString()));
//
//		primaryStage.setScene(scene); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//	}
//}
