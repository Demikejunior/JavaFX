package javaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class grafik extends Application{
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root,700,500,Color.DARKSLATEBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		// Cirkel
		
		int r = 50;
		
		Circle circle = new Circle();
		circle.setRadius(r);
		circle.setTranslateX(250);
		circle.setTranslateY(250);
		circle.setFill(Color.CRIMSON);
		circle.setRotationAxis(Rotate.Y_AXIS);
		circle.setRotate(0);
		
		root.getChildren().add(circle);
		
		// Retkangel
		
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(50);
		rectangle.setHeight(50);
		rectangle.setFill(Color.DEEPPINK);
		rectangle.setTranslateX(100);
		rectangle.setTranslateY(100);
		rectangle.setRotate(45);
		
		root.getChildren().add(rectangle);
		
		// Polygon
		
		Polygon poly = new Polygon();
		poly.getPoints().add(30.0); // X
		poly.getPoints().add(20.0); // Y
		
		poly.getPoints().add(100.0); // X
		poly.getPoints().add(10.0); // Y
		
		poly.getPoints().add(20.0); // X
		poly.getPoints().add(30.0); // Y
		
		poly.getPoints().add(10.0); // X
		poly.getPoints().add(100.0); // Y
		
		poly.setTranslateX(70);
		poly.setTranslateY(110);
		poly.setRotate(45);
		
		root.getChildren().add(poly);
		
		Polygon poly2 = new Polygon(10,50,50,100,50,50,100,100);
		
		root.getChildren().add(poly2);
		
		
		for (int i = 0; i < 10000; i++) {
			Star star = new Star(Math.random() * 70);
			
			Color rand = Color.color(Math.random(), Math.random(), Math.random()); 
			
			star.setFill(rand);
			star.setTranslateX(Math.random() * 700);
			star.setTranslateY(Math.random() * 500);
			star.setTranslateZ(Math.random());
			root.getChildren().add(star);
		}
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
}
