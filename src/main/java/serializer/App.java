package serializer;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        DrawerWithSave container = new DrawerWithSave(800, 600);
        root.getChildren().add(container);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}