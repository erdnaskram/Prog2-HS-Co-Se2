//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class SimpleButtonExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		primaryStage.setTitle("Beispiel fuer Buttons"); // Titel des Fensters
//
//		Button b1 = new Button("Bestaetigen"); // Erstelle Button mit dem Text "Bestaetigen"
//		b1.setFont(new Font(16)); // Schriftgroess�e des Buttons
//		b1.setMinHeight(25); // H�he des Button
//		b1.setMinWidth(110); // Weite des Button
//
//		/* Listener, welcher ausgel�st wird, wenn der Button gedrueckt wird */
//		b1.setOnAction(event -> {
//			System.out.println("Button wurde gedrueckt!");
//		});
//
//		Scene s = new Scene(b1, 400, 100); // Erstelle eine Scene mit dem Button als Hauptwidget
//
//		primaryStage.setScene(s); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//
//	}
//}
