//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Orientation;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.FlowPane;
//import javafx.stage.Stage;
//
//public class FlowLayoutExample extends Application {
//	@Override
//	public void start(Stage primaryStage) {
//
//		primaryStage.setTitle("FlowPaneTest");
//
//		// Inhalt des Fensters horizontal anordnen
//		FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 4, 4);
//		flowPane.setVgap(8);
//		flowPane.setHgap(4);
//		flowPane.setPrefWrapLength(300);
//
//		Button okButton = new Button("Weiter");
//		okButton.setPrefSize(100, 20);
//		Button cancelButton = new Button("Abbruch");
//		cancelButton.setPrefSize(100, 20);
//
//		Button helpButton = new Button("Hilfe");
//		helpButton.setPrefSize(100, 20);
//
//		// Tasten zum FlowLayout hinzuf�gen
//		flowPane.getChildren().addAll(okButton, cancelButton, helpButton);
//		flowPane.setAlignment(Pos.CENTER);
//
//		Scene scene = new Scene(flowPane);
//
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//}
