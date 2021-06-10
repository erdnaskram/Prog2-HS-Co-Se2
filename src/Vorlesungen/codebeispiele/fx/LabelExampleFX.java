//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.FlowPane;
//import javafx.stage.Stage;
//
//public class LabelExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		FlowPane fp = new FlowPane();
//		Scene s = new Scene(fp, 400, 100);
//
//		primaryStage.setTitle("Beispiel fuer Labels"); // Titel des Fensters
//
//		/* Normales Label */
//		Label easyLabel = new Label("Easy Label"); // Erstelle Label mit dem Text "Easy Label"
//		fp.getChildren().add(easyLabel); // Fuege das Label der FlowPane hinzu
//
//		/* Label mit Bild */
//		ImageView iv = new ImageView(new Image("hslogo.png")); // Siehe 10.5 (Controls)
//		Label imageLabel = new Label("", iv);  // Label mit dem HS-Logo erstellen
//		fp.getChildren().add(imageLabel); // Fuege das Label imageLabel der FlowPane hinzu
//
//		primaryStage.setScene(s); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//	}
//}
