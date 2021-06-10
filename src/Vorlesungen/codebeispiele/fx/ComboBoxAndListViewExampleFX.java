//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.ListView;
//import javafx.scene.control.SelectionMode;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.CornerRadii;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class ComboBoxAndListViewExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		FlowPane fp = new FlowPane(); // Flow Layout
//		fp.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY))); // Weisser Hintergrund
//		fp.setPadding(new Insets(15));  // 15px Abstand zum Rand des Fensters
//		fp.setHgap(20); // Horizontaler Abstand innerhalb der FlowPane 20px
//		fp.setVgap(20); // Vertikaler Abstand innerhalb der FlowPane: 20px
//		Scene s = new Scene(fp, 750, 300); // Scene mit Hauptlayout FlowPane 750px Weit, 300px Hoch
//
//		primaryStage.setTitle("Beispiel fuer ComboBox und ListView"); // Setze Titel des Fensters
//
//		/* Initialisiere ComboBox mit den Werten "Weiss�", "Rot", "Gruen" und "Gelb" */
//		ComboBox<String> combox = new ComboBox<String>(
//				FXCollections.observableArrayList("Weiss", "Rot", "Gruen", "Gelb"));
//		combox.setStyle("-fx-font: 16px \"Serif\";"); // Schriftgröße 16px, Schriftart: Serif ... Hier funktioniert nur setStyle(...) und kein setFont(...)
//		combox.setMinWidth(200); // Setze Minimale Breite der ComboBox auf 200px
//		fp.getChildren().add(combox); // Fuege die ComboBox der FlowPane hinzu
//
//		System.out.println(combox.getValue()); // Gibt den jetzigen Wert der ComboBox aus
//
//		/* Listener, welcher den Wert der ComboBox nach jeder Änderung ausgibt */
//		combox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
//			System.out.println(newValue);
//		});
//
//
//		/* Initialisiere ListView mit den unten angegebenen Werten */
//		ListView<String> lv = new ListView<>(
//				FXCollections.observableArrayList("Kerry Matheson", "Waldemar Panin", "John Doe", "Elon Musk"));
//		lv.setStyle("-fx-font: 16px \"Serif\";"); // Schriftgroess�e 16px, Schriftart: Serif ... Hier funktioniert nur setStyle(...) und kein setFont(...)
//		lv.setMinWidth(200); // Setze Minimale Breite der ListView auf 200px
//		lv.setMaxHeight(100); // Setze Minimale H�he der ListView auf 100px
//		fp.getChildren().add(lv); // Fuege die ListView der FlowPane hinzu
//
//		/* Listener, welcher den Wert der ListView nach jeder Änderung ausgibt */
//		lv.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> {
//			System.out.println(newValue); // Gibt den Gegenstand zurueck, welcher zuletzt ausgewaehlt wurde
//			System.out.println(lv.getSelectionModel().getSelectedItems()); // Gibt im SelectionMode.MULTIPLE ALLE selektierten Gegenstände zurück
//		});
//
//		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); // Ermoeglicht die Auswahl mehrerer Gegenstaende
//
//		primaryStage.setScene(s); // Setze Scene in Stage
//		primaryStage.show(); // Zeige Fenster an
//
//	}
//}
