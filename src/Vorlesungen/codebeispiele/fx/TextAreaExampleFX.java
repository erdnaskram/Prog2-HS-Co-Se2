//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.TextArea;
//import javafx.stage.Stage;
//
//public class TextAreaExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		primaryStage.setTitle("Beispiel für TextAreas"); // Titel des Fensters
//
//		TextArea ta = new TextArea();
//		ta.setText("In einer TextArea\nkann mehrzeiliger Text\neingegeben werden");
//
//		System.out.println(ta.getText()); // Gibt den Inhalt der TextArea aus
//
//		/* Listener, welcher ausgeloest wird, wenn sich Text in der TextArea aendert */
//		ta.textProperty().addListener((observable, oldValue, newValue) -> System.out.println(newValue));
//
//		/* Listener, welcher bei jeder Änderung die Cursorposition ausgibt */
//		ta.caretPositionProperty().addListener((observable, oldValue, newValue) -> {
//			System.out.println("Cursorposition: " + newValue);
//		});
//
//		/* Listener, welcher bei jeder Änderung den ausgewählten Text ausgibt */
//		ta.selectedTextProperty().addListener((observable, oldValue, newValue) -> {
//			System.out.println("Ausgewählter Text: " + newValue);
//		});
//
//		Scene s = new Scene(ta, 600, 200); // Erstelle eine Scene mit der TextArea als Hauptwidget
//
//		primaryStage.setScene(s); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//
//	}
//}
