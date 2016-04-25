package sport;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class run extends Application {
    public Image like = new Image("/google.jpg");
    int x = 100, y = 100, w= 500, h = 500;

    public void start(Stage stage) throws Exception{
        stage.setTitle("INFDEV02-3 - Assignment");

        Group root = new Group();
        Scene theScene = new Scene( root, Color.GRAY );
        stage.setScene( theScene );

        final Canvas canvas = new Canvas(800,800);
        root.getChildren().add( canvas );

        final GraphicsContext gc = canvas.getGraphicsContext2D();
        stage.show();

        new AnimationTimer() {
            public void handle(long now) {
                gc.drawImage(like,x,y,w,h);
            }
        }.start();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
