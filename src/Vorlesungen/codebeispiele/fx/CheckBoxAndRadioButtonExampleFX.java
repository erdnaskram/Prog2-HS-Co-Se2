//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.ToggleGroup;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.CornerRadii;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class CheckBoxAndRadioButtonExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		FlowPane fp = new FlowPane(); // Flow Layout
//		fp.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY))); // Weisser Hintergrund
//		fp.setPadding(new Insets(15)); // 15px Abstand zum Rand des Fensters
//		fp.setHgap(20); // Horizontaler Abstand innerhalb der FlowPane 20px
//		fp.setVgap(20); // Vertikaler Abstand innerhalb der FlowPane: 20px
//		Scene s = new Scene(fp, 400, 600); // Scene mit Hauptlayout FlowPane 400px Weit, 600px Hoch
//
//		primaryStage.setTitle("Beispiel fuer CheckBox und RadioButton"); // Titel des Fensters
//
//		/* Setup f�r die CheckBoxes */
//		Label l = new Label("Pizza Belaege"); // Text Label
//		l.setFont(new Font(18)); // Schriftgr�sse des Labels
//
//		VBox checkBoxes = new VBox(); // Container um Widgets vertikal anzuordnen
//
//		CheckBox cb1 = new CheckBox("Meeresfruechte"); // CheckBox mit dem Text "Meeresfruechte"
//		cb1.setMinHeight(25); // Hoehe der CheckBox: 25px
//		cb1.setMinWidth(25); // Weite der CheckBox: 25px
//		cb1.setFont(new Font(16)); // Schriftgroesse der CheckBox: 16pt
//
//		CheckBox cb2 = new CheckBox("Pilze");
//		cb2.setMinHeight(25);
//		cb2.setMinWidth(25);
//		cb2.setFont(new Font(16));
//
//		CheckBox cb3 = new CheckBox("Salami");
//		cb3.setMinHeight(25);
//		cb3.setMinWidth(25);
//		cb3.setFont(new Font(16));
//
//		CheckBox cb4 = new CheckBox("Schinken");
//		cb4.setMinHeight(25);
//		cb4.setMinWidth(25);
//		cb4.setFont(new Font(16));
//
//		/* Listener, welcher aufgerufen wird, wenn sich der Ausgewaehlt Status von cb3 aendert */
//		cb3.selectedProperty().addListener((observable, oldValue, newValue) ->  {
//			System.out.println(newValue); // Gibt den Status von cb3 aus (Selektiert oder nicht selektiert als Boolean)
//		});
//
//		checkBoxes.getChildren().addAll(l, cb1, cb2, cb3, cb4); // Fuege alle das Label und alle CheckBoxes in den Vertikalen Container
//		checkBoxes.setPadding(new Insets(10)); // 10px Abstand des Vertikalen Containers zu anderen Widgets im Layout
//		checkBoxes.setSpacing(10); // 10px Abstand zwischen jedem Widget innerhalb des Vertikalen Containers
//		fp.getChildren().add(checkBoxes); // Fuege den Vertikalen Container der FlowPane hinzu
//
//
//		/* Setup fuer die RadioButton */
//		ToggleGroup rtgroup = new ToggleGroup(); // Benoetigt fuer die Gruppierung der RadioButtons
//
//		RadioButton rb1 = new RadioButton("Standartlieferung"); // Erstelle RadioButton mit dem Text "Standartlieferung"
//		rb1.setFont(new Font(16)); // Schriftgroesse des RadioButton: 16pt
//		rb1.setToggleGroup(rtgroup); // Fuege den RadioButton der logischen "Umschaltgruppe" hinzu
//
//		RadioButton rb2 = new RadioButton("Expresslieferung");
//		rb2.setFont(new Font(16));
//		rb2.setToggleGroup(rtgroup);
//
//		RadioButton rb3 = new RadioButton("Lieferung mit Drone");
//		rb3.setFont(new Font(16));
//		rb3.setToggleGroup(rtgroup);
//
//		/* Listener, welcher Aufgerufen wird, wenn ein RadioButton angewaehlt wird */
//		rtgroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
//			System.out.println(newValue); // Gibt den angewaehlten RadioButton aus
//			System.out.println(rtgroup.getSelectedToggle()); // Gibt ebenfalls den angewaehlten RadioButton aus
//		});
//
//		/* Listener, welcher aufgerufen wird, wenn der RadioButton rb3 seinen Status aendert */
//		rb3.selectedProperty().addListener(new ChangeListener<Boolean>() {
//			@Override
//			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
//				System.out.println(newValue); // Gibt den Status von rb3 aus (Selektiert oder nicht selektiert als Boolean)
//			}
//		});
//
//
//		Label l2 = new Label("Versandoptionen"); // Erstelle Label
//		l2.setFont(new Font(18)); // Setze Label Schriftgroesse
//
//		VBox rbbox = new VBox(); // Erstelle Vertikalen Container
//		rbbox.setPadding(new Insets(5)); // Setze innenabstand im Vertikalen Container auf 5px
//		rbbox.setSpacing(10); // Setze Abstand zwischen Widgets im Vertikalen Container auf 10px
//		rbbox.getChildren().addAll(l2, rb1, rb2, rb3); // Fuege das Label und alle RadioButton in den Vertikalen Container ein
//		fp.getChildren().add(rbbox); // fuege den Vertikalen Container der FlowPane hinzu
//
//		primaryStage.setScene(s); // Setze Scene in die Stage
//		primaryStage.show(); // Zeige Fenster an
//
//	}
//}
