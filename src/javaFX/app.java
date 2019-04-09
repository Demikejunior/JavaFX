package javaFX;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class app extends Application {

	public static final double SQUARE_SIZE = 70;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				Color c = Color.WHEAT;
				if ((row + col) % 2 == 0) {
					c = Color.SADDLEBROWN;
				}
				Rectangle r = new Rectangle(SQUARE_SIZE, SQUARE_SIZE, c);
				r.setTranslateY(SQUARE_SIZE * row);
				r.setTranslateX(SQUARE_SIZE * col);
				root.getChildren().add(r);
			}
		}

		Circle player = new Circle(SQUARE_SIZE / 2);

		root.getChildren().add(player);

		Scene scene = new Scene(root, SQUARE_SIZE * 8, SQUARE_SIZE * 8);

		scene.setOnKeyPressed(event -> {

			KeyCode key = event.getCode();

			switch (key) {
			case W:
				double temp = player.getTranslateY();
				player.setTranslateY(temp - 2);
			default:
				break;
			}
			switch (key) {
			case S:
				double temp = player.getTranslateY();
				player.setTranslateY(temp + 2);
			default:
				break;
			}
			switch (key) {
			case A:
				double temp = player.getTranslateX();
				player.setTranslateX(temp - 2);
			default:
				break;
			}
			switch (key) {
			case D:
				double temp = player.getTranslateX();
				player.setTranslateX(temp + 2);
			default:
				break;
			}

		});

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}

}
