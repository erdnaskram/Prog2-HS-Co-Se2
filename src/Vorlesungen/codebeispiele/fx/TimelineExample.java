//package Vorlesungen.codebeispiele.fx;
//
//import javafx.animation.KeyFrame;
//import javafx.animation.KeyValue;
//import javafx.animation.Timeline;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Bounds;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//public class TimelineExample extends Application {
//
//	@Override
//	public void start(Stage stage) {
//		Pane canvas = new Pane();
//		Scene scene = new Scene(canvas, 300, 300);
//		Circle ball = new Circle(100, Color.RED);
//		ball.relocate(50, 40);
//
//		canvas.getChildren().add(ball);
//
//		stage.setTitle("Color Ball");
//		stage.setScene(scene);
//		stage.show();
//
//		// Timeline Example
//
//		// Code, der bei jedem Event ausgef�hrt wird
//		EventHandler<ActionEvent> handler = event -> {
//			if (ball.getFill() == Color.RED)
//				ball.setFill(Color.BLACK);
//			else
//				ball.setFill(Color.RED);
//
//		};
//
//		// Nach 2 Sekunden sendet Timeline ein Event und fuehrt den Code des Eventhandlers aus
//		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), handler));
//
//		/*
//		 * Oder direkt als Lambda Ausdruck:
//		 *
//		 * Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), event -> {
//		 * if (ball.getFill() == Color.RED)
//		 * 		ball.setFill(Color.BLACK);
//		 * else
//		 * 		ball.setFill(Color.RED); };));
//		 */
//
//		// Starten des Timers
//		timeline.play();
//	}
//
//	public static void main(String[] args) {
//		launch();
//	}
//
//}
