package flags;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Flag extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root,700,500, Color.BEIGE);
		primaryStage.setScene(scene);
		primaryStage.show();
		int[] proport = new int[2];
		Color c1;
		Color c2;
		Color c3;
		
		// Belgium
		
		proport[0] = 13;
		proport[1] = 15;
		c1 = Color.BLACK;
		c2 = Color.YELLOW;
		c3 = Color.RED;
		
		Tricolor belgium = new Tricolor('v', 200, proport, c1, c2, c3);
		
		root.getChildren().add(belgium);
		
		// Russia
		
		proport[0] = 2;
		proport[1] = 3;
		c1 = Color.WHITE;
		c2 = Color.BLUE;
		c3 = Color.RED;
		
		Tricolor russia = new Tricolor('h', 200, proport, c1, c2, c3);
		russia.setTranslateX(250);
		
		root.getChildren().add(russia);
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
