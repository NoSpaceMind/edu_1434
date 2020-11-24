package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextArea messageBar;

    @FXML
    TextField textBar;

    @FXML
    private void send() {
        String msg = textBar.getText();
        messageBar.appendText(msg + "\n");
        textBar.clear();
        textBar.requestFocus();
    }
}
