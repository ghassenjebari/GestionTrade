package controller.sharedController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class SupressionController {
    @FXML
    private Pane  pane;

    @FXML
    public void fermer(ActionEvent e) {
        pane.getChildren().clear();
    }
}
