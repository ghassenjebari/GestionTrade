package controller.globale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class GlobalControlleur {

    @FXML
    void gestionBlog(ActionEvent event) {

        Pane pane= (Pane) button.getScene().getRoot();
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(newLoadedPane);
    }

    @FXML
    void gestionCloture(ActionEvent event) {
        Pane pane= (Pane) button.getScene().getRoot();
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionDétails(ActionEvent event) {
        Pane pane= (Pane) button.getScene().getRoot();
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionEstimation(ActionEvent event) {
        Pane pane= (Pane) button.getScene().getRoot();
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionEvenement(ActionEvent event) {
        Pane pane= (Pane) button.getScene().getRoot();
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionLivres(ActionEvent event) {

        Pane pane= (Pane) button.getScene().getRoot();
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(newLoadedPane);

    }
    @FXML
    private Button button;

    @FXML
    void gestionProposition(ActionEvent event) {
       Pane pane= (Pane) button.getScene().getRoot();
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(newLoadedPane);
    }

    @FXML
    void gestionReclamation(ActionEvent event) {
        Pane pane= (Pane) button.getScene().getRoot();
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionUtilisateur(ActionEvent event) {
        Pane pane= (Pane) button.getScene().getRoot();
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(newLoadedPane);

    }
}

