//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Menu;
//import javafx.scene.control.MenuBar;
//import javafx.scene.control.MenuItem;
//import javafx.scene.control.RadioMenuItem;
//import javafx.scene.control.SeparatorMenuItem;
//import javafx.scene.input.KeyCode;
//import javafx.scene.input.KeyCodeCombination;
//import javafx.scene.input.KeyCombination;
//import javafx.scene.layout.Pane;
//import javafx.stage.Stage;
//
//public class MenuExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//
//		Pane p = new Pane();
//		Scene scene = new Scene(p, 350, 300); // Erstelle Scene mit dem Label als Hauptwidget
//
//		primaryStage.setTitle("Beispiel fuer Menus"); // Titel des Fensters
//
//		MenuBar menuBar = new MenuBar(); // Erstelle eine Menueleiste
//
//		Menu menuOptions = new Menu("Optionen"); // Erstelle das Optionen Menue
//
//		RadioMenuItem standard = new RadioMenuItem("Standard"); // Erstelle den Menue-Gegenstand "Standard"
//		RadioMenuItem science = new RadioMenuItem("Wissenschaftlich"); // Erstelle den Menue-Gegenstand "Wissenschaftlich"
//		RadioMenuItem prog = new RadioMenuItem("Programmierer"); // Erstelle den Menue-Gegenstand "Programmierer"
//		SeparatorMenuItem spm = new SeparatorMenuItem(); // Erstelle eine Trennlinie
//		MenuItem ex = new MenuItem("Exit"); // Erstelle den Menue-Gegenstand "Exit"
//
//		standard.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN)); // Setze Tastaturkuerzel: "STRG + S" fuer "Standard"
//		science.setAccelerator(new KeyCodeCombination(KeyCode.W, KeyCombination.CONTROL_DOWN)); // Setze Tastaturkuerzel: "STRG + W" fuer "Wissenschaftlich"
//		prog.setAccelerator(new KeyCodeCombination(KeyCode.P, KeyCombination.CONTROL_DOWN)); // Setze Tastaturkuerzel: "STRG + P"  fuer "Programmierer"
//		ex.setAccelerator(new KeyCodeCombination(KeyCode.E, KeyCombination.CONTROL_DOWN)); // Setze Tastaturkuerzel: "STRG + E" fuer "Exit"
//
//		menuOptions.getItems().addAll(standard, science, prog, spm, ex); // Fuege die Menu-Gegenstände dem Optionen Menue hinzu
//
//		Menu menuEdit = new Menu("Bearbeiten"); // Erstelle das Bearbeiten Menue
//		Menu menuView = new Menu("Ansicht"); // Erstelle das Ansicht Menue
//
//		menuBar.getMenus().addAll(menuOptions, menuEdit, menuView); // Fuege die Menues in die MenuBar ein
//
//		p.getChildren().add(menuBar); // Fuege die MenuBar dem Haupt-Widget hinzu
//
//		/* Listener, welcher aufgerufen wird, wenn "Standart" an- oder abgewählt wurde */
//		standard.selectedProperty().addListener((observable, oldValue, newValue) -> {
//			System.out.println(newValue); // Gibt aus, ob das RadioMenuItem "Standard" ausgewaehlt ist oder nicht
//		});
//
//		/* Listener, welcher aufgerufen wird, wenn "Exit" angeklickt wurde */
//		ex.setOnAction(event -> {
//			System.out.println("Schlieߟen");
//		});
//
//		primaryStage.setScene(scene); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//	}
//}
