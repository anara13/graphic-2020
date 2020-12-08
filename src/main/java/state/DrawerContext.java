package state;


import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class DrawerContext {

    Drawer drawer;
    DrawerState currentState;

    public DrawerContext(Drawer drawer) {
        this.drawer = drawer;
    }

    void mousePressed(MouseEvent event){
        currentState.mousePressed(this,event.getX(),event.getY());

    }

    void mouseReleased(MouseEvent event){
        currentState.mouseReleased(this,event.getX(),event.getY());
    }

    void mouseMoved(MouseEvent event){}

    void keyPressed(KeyEvent event) {
        switch (event.getText()) {
            case "c":
                currentState = new StateCircle0();
        }
    }
}
