//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class ButtonExampleFX extends Application {
//	public static void main(String[] args) {
//		launch(); // Ruft intern start(Stage primaryStage) auf
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		FlowPane fp = new FlowPane();
//		Scene s = new Scene(fp, 400, 100);
//
//		primaryStage.setTitle("Beispiel fuer Buttons"); // Titel des Fensters
//
//		Button b1 = new Button("Bestaetigen"); // Erstelle Button mit dem Test "Bestaetigen"
//		b1.setFont(new Font(16)); // Schriftgroesse des Buttons
//		b1.setMinHeight(25); // Hoehe des Button
//		b1.setMinWidth(110); // Weite des Button
//		fp.getChildren().add(b1); // Fuege Button der FlowPane hinzu
//
//		Button b2 = new Button("Abbrechen");
//		b2.setFont(new Font(16));
//		b2.setMinHeight(25);
//		b2.setMinWidth(110);
//		fp.getChildren().add(b2);
//
//		/* 1. Lambda Eventhandler */
//		b2.setOnAction(event -> {
//			System.out.println("lambda: " + event.getSource().toString());
//		});
//
//		/* 2. Anonyme Klasse EventHandler */
//		b2.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("closure: " + event.getSource().toString());
//			}
//		});
//
//		/* 3. Inner Klasse (Eigene EventHandler Klasse) */
//		class MeinButtonEventHandler implements EventHandler<ActionEvent> {
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("class: " + ((Button)event.getSource()).getText());
//				System.out.println("test: " + (event.getSource() == b2));
//			}
//		}
//
//		b2.setOnAction(new MeinButtonEventHandler()); // Setze "meinButtonEventHandler" als Handler fuer das Druecken des Buttons
//
//		//ImageView iv = new ImageView(new Image("hslogo.png")); // Siehe 10.5 (Controls)
//		//Button b3 = new Button("", iv);  // Button mit dem HS-Logo erstellen
//
//		Button b3 = new Button("Hello");
//		b3.setFont(new Font(16));
//		b3.setMinHeight(25);
//		b3.setMinWidth(110);
//		fp.getChildren().add(b3); // Fuege Button b3 der FlowPane hinzu
//
//		primaryStage.setScene(s); // Setze Scene in Stage
//		primaryStage.show(); // zeige Fenster an
//
//	}
//}
