//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class TextAndPasswordFieldExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		primaryStage.setTitle("Beispiel fuer Text- und Passwortfelder"); // Titel des Fensters
//		VBox verticalContainer = new VBox();
//		verticalContainer.setSpacing(10); // 10px Abstand zwischen allen Widgets innerhalb des Vertikalen Containers
//		verticalContainer.setPadding(new Insets(10)); // 10px Abstand zum Fenster
//
//		TextField textField = new TextField("Coburg"); // Erstelle Textfield mit dem Wert "Coburg"
//		textField.setFont(new Font(16)); // Setze die Schriftgroesse des Textfeldes aus 16px
//		textField.setDisable(true); // Verhindere, damit etwas in das Textfield geschrieben werden kann..
//		verticalContainer.getChildren().add(textField); // Fuege das TextField dem Vertikalen Container hinzu
//
//		PasswordField passwordField = new PasswordField(); // Erstelle ein Passwortfeldes
//		passwordField.setFont(new Font(16)); // Setze die Schriftgroess�e des Passwortfeldes aus 16px
//		verticalContainer.getChildren().add(passwordField); // Fuege das PasswortFeld dem Vertikalen Container hinzu
//
//		System.out.println(passwordField.getText()); // Gibt den aktuellen Wert des Passwortfeldes aus
//
//		/* Listener wird ausgel�st, wenn sich Text in der TextArea aendert */
//		passwordField.textProperty().addListener((observable, oldValue, newValue) -> {
//			System.out.println(newValue);
//		});
//
//		/* Listener wird ausgeloest, wenn Enter gedrueckt wird waehrend das Feld fokusiert ist */
//		passwordField.setOnAction(ae -> {
//			System.out.println("Enter wurde gedrueckt!");
//		});
//
//		/* Listener, der bei jeder Änderung die Cursorposition ausgibt */
//		passwordField.caretPositionProperty().addListener((observable, oldValue, newValue) -> {
//			System.out.println("Cursorposition: " + newValue);
//		});
//
//		// Achtung: Textfelder funktionieren GENAU wie Passwortfelder...
//
//		Scene s = new Scene(verticalContainer, 400, 100); // Erstelle eine Scene mit dem Button als Hauptwidget
//
//		primaryStage.setScene(s); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//
//	}
//}
