package flags;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Flag extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 500, 600, Color.GRAY);
		primaryStage.setScene(scene);
		primaryStage.show();

		double proport = 0;
		Color C[] = new Color[13];
		int width = 300;

		
		// Belgium

//		proport = 13 / 15.0;
//		C[0] = Color.BLACK;
//		C[1] = Color.YELLOW;
//		C[2] = Color.RED;
//
//		Multcolor belgium = new Multcolor(3, 'v', width, proport, C);
//
//		root.getChildren().add(belgium);
//
//		
//		// Russia
//
//		proport = 2 / 3.0;
//		C[0] = Color.WHITE;
//		C[1] = Color.BLUE;
//		C[2] = Color.RED;
//
//		Multcolor russia = new Multcolor(3, 'h', width, proport, C);
//		russia.setTranslateY(width);
//
//		root.getChildren().add(russia);
//
//		
//		// Netherlands
//
//		proport = 2 / 3.0;
//		C[0] = Color.CRIMSON;
//		C[1] = Color.WHITE;
//		C[2] = Color.DARKSLATEBLUE;
//
//		Multcolor nethers = new Multcolor(3, 'h', width, proport, C);
//		nethers.setTranslateY(width * 2);
//
//		root.getChildren().add(nethers);
//
//		
//		// Togo
//
//		proport = 1 / 1.618;
//		for (int i = 0; i < 5; i++) {
//			if (i % 2 == 0) {
//				C[i] = Color.GREEN;
//			} else {
//				C[i] = Color.YELLOW;
//			}
//		}
//
//		Multcolor togo = new Multcolor(5, 'h', width, proport, C);
//		
//		
//		Rectangle sqr = new Rectangle();
//		sqr.setWidth(width * proport * 3 / 5);
//		sqr.setHeight(width * proport * 3 / 5);
//		sqr.setFill(Color.RED);
//		
//		Star star = new Star(width * proport * 3 / 5 / 3);
//		star.setTranslateX(width * proport * 3 / 5 / 2);
//		star.setTranslateY(width * proport * 3 / 5 / 2);
//		star.setFill(Color.WHITE);
//		
//		togo.getChildren().add(sqr);
//		togo.getChildren().add(star);
//		togo.setTranslateX(width * 1.1);
//		
//		root.getChildren().add(togo);
		
		
		// USA
		
		proport = 10 /19.0;
		for (int i = 0; i < 13; i++) {
			if (i % 2 == 0) {
				C[i] = Color.RED;
			} else {
				C[i] = Color.WHITE;
			}
		}
		
		Multcolor USA = new Multcolor(13, 'h', width, proport, C);
		
		
		Rectangle fly = new Rectangle();
		fly.setWidth(width * 2 / 5);
		fly.setHeight(width * proport * 6 / 13);
		fly.setFill(Color.BLUE);
		
		USA.getChildren().add(fly);
		
		Star[] stars = new Star[50];
		for (int i = 0; i < 50; i++) {
			
			stars[i] = new Star(width * proport * 2 / 5 / 13);
			stars[i].setFill(Color.WHITE);
			
			int x = 0;
			int b = i;
			
			while (b > 11) {
				x++;
				b =- 11;
			}
			
			stars[i].setTranslateX(b * width * 1 / 5 / 6 + width * 1 / 5 / 12);
			stars[i].setTranslateY(x * width * 6 / 13 / 5 * proport + width * 6 / 13 / 10 * proport);
			
			if (i % 2 == 1) {
				for (int j = 0; j < 5; j++) {
					stars[i].setTranslateX(stars[i].getTranslateX() + width * 1 / 5 / 12);
					stars[i].setTranslateY(stars[i].getTranslateY() + width * 3 / 13 / 10 * proport);
				}
			}
			
		}
		
		USA.getChildren().addAll(stars);
//		USA.setTranslateX(width * 1.1);
//		USA.setTranslateY(width);
		
		root.getChildren().add(USA);
		
		
	}

	public static void main(String[] args) {
		launch();
	}

}
