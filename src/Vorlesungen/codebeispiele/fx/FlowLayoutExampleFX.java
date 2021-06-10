//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.CornerRadii;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class FlowLayoutExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		FlowPane fp = new FlowPane(); // Flow Layout
//		fp.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY))); // Purple Hintergrund
//		fp.setPadding(new Insets(15));  // 15px Abstand zum Rand des Fensters
//		fp.setHgap(20); // Horizontaler Abstand innerhalb der FlowPane 20px
//		fp.setVgap(20); // Vertikaler Abstand innerhalb der FlowPane: 20px
//		Scene s = new Scene(fp, 400, 100);
//
//		primaryStage.setTitle("Beispiel f�r FlowPane"); // Titel des Fensters
//
//		Button b1 = new Button("Best�tigen"); // Erstelle Button mit dem Test "Bestaetigen"
//		b1.setFont(new Font(16)); // Schriftgroesse des Buttons
//		b1.setMinHeight(25); // Hoehe des Button
//		b1.setMinWidth(110); // Weite des Button
//		fp.getChildren().add(b1); // Fuege Button der FlowPane hinzu
//
//		Button b2 = new Button("Abbrechen");
//		b2.setFont(new Font(16));
//		b2.setMinHeight(55);
//		b2.setMinWidth(110);
//		fp.getChildren().add(b2);
//
//
//		primaryStage.setScene(s); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//
//	}
//}
