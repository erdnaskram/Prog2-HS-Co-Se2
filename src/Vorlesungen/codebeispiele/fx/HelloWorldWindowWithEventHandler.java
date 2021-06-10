//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//
//import javafx.stage.Stage;
//
//public class HelloWorldWindowWithEventHandler extends Application {
//
//	class ButtonEventHandler implements EventHandler<ActionEvent> {
//
//		public void handle(ActionEvent ev) {
//			System.out.println("Hello World");
//		}
//	}
//
//	@Override
//	public void start(Stage primaryStage) {
//
//		Button btn = new Button();
//
//		btn.setText("Say 'Hello World'");
//
//		// 3 Varianten zur Bearbeitung von Events
//
//		// Variante 1: Eventhandler als Lambda expression
//		btn.setOnAction(e -> System.out.println("Hello World!"));
//
//		// Variante 2: Eventhandler als anonyme Klasse
//		/* btn.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("Hello World!");
//			}
//		});
//		*/
//
//		// Variante 3: EIgener ActionEven Handler als eigene Klasse
//		// btn.setOnAction(new ButtonEventHandler() );
//
//
//		Group root = new Group();
//		root.getChildren().add(btn);
//
//		Scene scene = new Scene(root, 300, 250);
//
//		primaryStage.setTitle("Hello World!");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//}
