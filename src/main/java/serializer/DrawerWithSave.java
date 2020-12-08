package serializer;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import shape.Shape;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class DrawerWithSave extends state.Drawer {

    public DrawerWithSave(int width, int height) {
        super(width, height);
    }

    void write(){
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Save");
    File file = fileChooser.showSaveDialog(getScene().getWindow());
    if (file == null) return;
    try {
        ShapeWriter.write(file, super.shapes);
    }
    catch (IOException e) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Ooops, there was an error!");
        alert.showAndWait();
    }
    }
    public void load() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load");
        File file = fileChooser.showOpenDialog(getScene().getWindow());
        if (file == null) return;
        try {
            super.shapes = ShapeReader.read(file, Collectors.toList());
            repaint();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Ooops, there was an error!");
            alert.showAndWait();
        }
    }
}
