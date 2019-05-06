package flags;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Flag extends Application {

	ArrayList<KeyCode> keysPressed = new ArrayList<KeyCode>();
	int fIndex = 0;
	double width = 600;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 600, 400, Color.DIMGRAY);
		primaryStage.setScene(scene);
		primaryStage.show();

		Text info = new Text();
		info.setFill(Color.WHITE);
		info.setTranslateX(scene.getWidth() / 3);
		info.setTranslateY(scene.getHeight() / 3);
		info.setText("Left / Right or A / D change flags" + "\r\r" + "Up / Down or W / S change size");
		root.getChildren().add(info);

		AnimationTimer at = new AnimationTimer() {

			@Override
			public void handle(long arg0) {

				for (KeyCode key : keysPressed) {
					switch (key) {
					case UP:
					case W:
						width += 25;
						break;

					case DOWN:
					case S:
						width -= 25;
						break;

					case RIGHT:
					case D:
						fIndex++;
						break;

					case LEFT:
					case A:
						fIndex--;
						break;

					default:
						break;
					}

					if (width < 25) {
						width = 25;
					}

					Group[] flags = { Belgium(width), Russia(width), Netherland(width), Luxembourg(width), Togo(width),
							USA(width), Kuwait(width), Laos(width), Kongo(width), Greenland(width), Sweden(width),
							Norway(width), Estonia(width), France(width), Latvia(width), Myanmar(width) };

					fIndex = fIndex % flags.length;
					if (fIndex < 0) {
						fIndex = flags.length - 1;
					}

					root.getChildren().clear();
					root.getChildren().add(flags[fIndex]);

					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;

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

	public static Group Belgium(double width) {

		Color[] C = new Color[3];
		double proport = 13 / 15.0;
		C[0] = Color.BLACK;
		C[1] = Color.YELLOW;
		C[2] = Color.RED;

		Multcolor belgium = new Multcolor(3, 'v', width, proport, C);

		return belgium;

	}

	public static Group Russia(double width) {

		Color[] C = new Color[3];
		double proport = 2 / 3.0;
		C[0] = Color.WHITE;
		C[1] = Color.BLUE;
		C[2] = Color.RED;

		Multcolor russia = new Multcolor(3, 'h', width, proport, C);
		return russia;

	}

	public static Group Netherland(double width) {

		Color[] C = new Color[3];
		double proport = 2 / 3.0;
		C[0] = Color.CRIMSON;
		C[1] = Color.WHITE;
		C[2] = Color.DARKSLATEBLUE;

		Multcolor nethers = new Multcolor(3, 'h', width, proport, C);
		return nethers;

	}

	public static Group Luxembourg(double width) {

		Color[] C = new Color[3];
		double proport = 1 / 2.0;
		C[0] = Color.RED;
		C[1] = Color.WHITE;
		C[2] = Color.LIGHTBLUE;

		Multcolor lux = new Multcolor(3, 'h', width, proport, C);
		return lux;

	}

	public static Group Togo(double width) {

		Color[] C = new Color[5];
		double proport = 1 / 1.618;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				C[i] = Color.GREEN;
			} else {
				C[i] = Color.YELLOW;
			}
		}

		Multcolor togo = new Multcolor(5, 'h', width, proport, C);

		Rectangle sqr = new Rectangle();
		sqr.setWidth(width * proport * 3 / 5);
		sqr.setHeight(width * proport * 3 / 5);
		sqr.setFill(Color.RED);

		Star star = new Star(width * proport * 3 / 5 / 3);
		star.setTranslateX(width * proport * 3 / 5 / 2);
		star.setTranslateY(width * proport * 3 / 5 / 2);
		star.setFill(Color.WHITE);

		togo.getChildren().add(sqr);
		togo.getChildren().add(star);

		return togo;

	}

	public static Group USA(double width) {

		Color[] C = new Color[13];
		double proport = 10 / 19.0;

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
		fly.setHeight(width * proport * 7 / 13);
		fly.setFill(Color.BLUE);

		USA.getChildren().add(fly);

		Star[] stars = new Star[50];
		for (int i = 0; i < stars.length; i++) {

			stars[i] = new Star(width * proport * 2 / 5 / 13);
			stars[i].setFill(Color.WHITE);

			int x = (int) i / 11;
			int b = i % 11;
			double g = width * 2 / 5.0 / 12.0;
			double e = width * proport * 7 / 13.0 / 10.0;

			stars[i].setTranslateX(g);
			stars[i].setTranslateY(e);

			if (b < 6) {

				stars[i].setTranslateX(b * g * 2 + g);
				stars[i].setTranslateY(x * e * 2 + e);

			} else {

				stars[i].setTranslateX((b - 6) * g * 2 + g * 2);
				stars[i].setTranslateY(x * e * 2 + e * 2);

			}

		}

		USA.getChildren().addAll(stars);

		return USA;

	}

	public static Group Kuwait(double width) {

		Color[] C = new Color[3];
		double proport = 1 / 2.0;
		C[0] = Color.GREEN;
		C[1] = Color.WHITE;
		C[2] = Color.RED;

		Multcolor kuwait = new Multcolor(3, 'h', width, proport, C);

		Polygon rhomb = new Polygon(0, 0, 0, proport * width, width / 4.5, proport * width * 2 / 3.0, width / 4.5,
				proport * width / 3.0);

		rhomb.setFill(Color.BLACK);
		kuwait.getChildren().add(rhomb);

		return kuwait;

	}

	public static Group Laos(double width) {

		Color[] C = new Color[4];
		double proport = 2 / 3.0;
		C[0] = Color.CRIMSON;
		C[1] = Color.DARKBLUE;
		C[2] = Color.DARKBLUE;
		C[3] = Color.CRIMSON;

		Multcolor laos = new Multcolor(4, 'h', width, proport, C);

		Circle c = new Circle(width * proport * 4 / 20);
		c.setFill(Color.WHITE);

		c.setTranslateX(width / 2);
		c.setTranslateY(width * proport / 2);

		laos.getChildren().add(c);

		return laos;

	}

	public static Group Kongo(double width) {

		Color[] C = new Color[3];
		double proport = 2 / 3.0;
		C[0] = Color.YELLOW;
		C[1] = Color.GREEN;
		C[2] = Color.RED;

		Multcolor congo = new Multcolor(1, 'h', width, proport, C);

		Polygon p1 = new Polygon(0, 0, 0, width * proport, width * proport, 0);
		Polygon p2 = new Polygon(width, 0, width, width * proport, width - (width * proport), width * proport);
		p1.setFill(C[1]);
		p2.setFill(C[2]);

		congo.getChildren().addAll(p1, p2);

		return congo;

	}

	public static Group Greenland(double width) {

		Color[] C = new Color[2];
		double proport = 2 / 3.0;
		C[0] = Color.WHITE;
		C[1] = Color.RED;

		Multcolor green = new Multcolor(2, 'h', width, proport, C);

		Arc red = new Arc(width * 7 / 18, width * proport / 2, width * 4 / 18, width * 4 / 18, 0, 180);
		Arc white = new Arc(width * 7 / 18, width * proport / 2, width * 4 / 18, width * 4 / 18, 180, 180);

		red.setFill(C[1]);
		white.setFill(C[0]);

		green.getChildren().addAll(red, white);

		return green;

	}

	public static Group Sweden(double width) {

		Color[] C = new Color[2];
		double proport = 5 / 8.0;
		double SP = 2 / 16.0;
		double St = 5 / 16.0;
		C[0] = Color.BLUE;
		C[1] = Color.YELLOW;

		Cross swede = new Cross(width, proport, 1, SP, 0, St, 0, C);

		return swede;

	}

	public static Group Norway(double width) {

		Color[] C = new Color[3];
		double proport = 16 / 22.0;
		double SP = 2 / 24.0;
		double ST = 7 / 24.0;
		double SxT = 1 / 24.0;
		double SxP = 2;
		C[0] = Color.RED;
		C[1] = Color.DARKBLUE;
		C[2] = Color.WHITE;

		Cross norway = new Cross(width, proport, 2, SP, SxP, ST, SxT, C);

		return norway;

	}

	public static Group Estonia(double width) {

		Color[] C = new Color[3];
		double proport = 7 / 11.0;
		C[0] = Color.web("#0072CE");
		C[1] = Color.BLACK;
		C[2] = Color.WHITE;

		Multcolor estonia = new Multcolor(3, 'h', width, proport, C);
		return estonia;

	}

	public static Group France(double width) {

		Color[] C = new Color[3];
		double proport = 2 / 3.0;
		C[0] = Color.BLUE;
		C[1] = Color.WHITE;
		C[2] = Color.RED;

		Multcolor france = new Multcolor(3, 'v', width, proport, C);
		return france;

	}

	public static Group Latvia(double width) {
	
		Color[] C = new Color[5];
		double proport = 1 / 2.0;
		C[0] = Color.web("#9E1B34");
		C[1] = Color.web("#9E1B34");
		C[2] = Color.WHITE;
		C[3] = Color.web("#9E1B34");
		C[4] = Color.web("#9E1B34");

		Multcolor latvia = new Multcolor(5, 'h', width, proport, C);
		return latvia;
	
	}
	
	public static Group Myanmar(double width) {
		
		Color[] C = new Color[3];
		double proport = 2 / 3.0;
		C[0] = Color.web("#FECB00");
		C[1] = Color.web("#34B233");
		C[2] = Color.web("#EA2839");

		Multcolor myanmar = new Multcolor(3, 'h', width, proport, C);
		
		Star star = new Star(width * 4 / 15);
		star.setFill(Color.WHITE);
		star.setTranslateX(width / 2.0);
		star.setTranslateY(width * proport * 7 / 13.0);
		
		myanmar.getChildren().add(star);
		
		return myanmar;
		
	}

}
