//package Vorlesungen.codebeispiele.fx;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
//
//public class BorderLayoutExample extends Application {
//	@Override
//	public void start(Stage primaryStage) {
//		primaryStage.setTitle("Titeltext");
//
//		// Inhalt des Fensters anordnen
//		BorderPane borderPane = new BorderPane();
//
//		// Widgets zur BorderPane hinzuf�gen
//		Label topLabel = new Label("Label Top");
//		BorderPane.setAlignment(topLabel, Pos.TOP_CENTER);
//		BorderPane.setMargin(topLabel, new Insets(4.0, 4.0, 4.0, 4.0));
//		borderPane.setTop(topLabel);
//
//		borderPane.setLeft(new Button("Left"));
//		borderPane.setRight(new Button("Right"));
//
//		TextArea centerText = new TextArea("This is a TextArea positioned Center");
//		BorderPane.setAlignment(centerText, Pos.CENTER);
//		BorderPane.setMargin(centerText, new Insets(4.0, 4.0, 4.0, 4.0));
//		borderPane.setCenter(centerText);
//
//		Button b = new Button("Exit");
//		b.setOnAction(e -> System.exit(0));
//		BorderPane.setAlignment(b, Pos.BOTTOM_CENTER);
//		borderPane.setBottom(b);
//
//
//		Scene scene = new Scene(borderPane);
//
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//}
