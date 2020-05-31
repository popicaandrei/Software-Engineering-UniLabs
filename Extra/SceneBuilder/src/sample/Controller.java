package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label1;

    @FXML
    public void handleAction(){
        label1.setText("Button pressed");
    }
}
