package javaFX2;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class CarGame extends Application{
	
	ArrayList<KeyCode> keysPressed = new ArrayList<KeyCode>();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root,1000,500,Color.DARKSLATEBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		Car car = new Car(Color.DEEPSKYBLUE);
		car.setTranslateY(150);
		root.getChildren().add(car);
		
		AnimationTimer at = new AnimationTimer() {

			int dir = 1;
			
			@Override
			public void handle(long arg0) {
				
				car.setTranslateX(car.getTranslateX() + 5 * dir);
				
				if (car.getTranslateX() > 900 || car.getTranslateX() < 0) {
					dir *= -1;
					car.setRotationAxis(Rotate.Y_AXIS);
					car.setRotate(car.getRotate() + 180);
				}
				
				for (KeyCode key : keysPressed) {
					switch (key) {
						case UP:
						case W:
							car.setTranslateY(car.getTranslateY() - 3);
							if (car.getTranslateY() < 0) {
								car.setTranslateY(0);
							}
							break;
						case DOWN:
						case S:
							car.setTranslateY(car.getTranslateY() + 3);
							if (car.getTranslateY() > 500 - 62.5) {
								car.setTranslateY(500 - 62.5);
							}
							break;
					default:
						break;

					}
				}
		
				
			}
			
		};
		
		scene.setOnKeyPressed(e -> {
			KeyCode key = e.getCode();
			
			if (!keysPressed.contains(key)) {
				keysPressed.add(key);
			}
		});
		
		scene.setOnKeyReleased(e -> {
			KeyCode key = e.getCode();
			
			if (keysPressed.contains(key)) {
				keysPressed.remove(key);
			}
		});
		
		at.start();
	}
	
	public static void main(String[] args) {
		launch();
	}
	
}
