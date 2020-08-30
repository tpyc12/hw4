package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextArea textArea1;

    @FXML
    public TextField textField;


    public void onClickSendText(ActionEvent actionEvent) {
        textArea1.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
