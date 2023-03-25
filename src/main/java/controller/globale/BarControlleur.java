package controller.globale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class BarControlleur {

    @FXML
    private Pane mainPane;

    @FXML
    void statistiqueTrade(ActionEvent event) {
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/statistique/Courbe.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionBlog(ActionEvent event) {

        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);
    }

    @FXML
    void gestionCloture(ActionEvent event) {
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/clotureAchat/AfficherListeClotureAchat.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionDétails(ActionEvent event) {
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/detailsLivraison/AfficherListeDetailsLivaisonLivre.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionEstimation(ActionEvent event) {
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/estimationProposition/AfficherListeEstimationOffreLivre.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionEvenement(ActionEvent event) {
        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionLivres(ActionEvent event) {

        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);

    }
    @FXML
    private Button button;

    @FXML
    void gestionProposition(ActionEvent event) {
        Pane newLoadedPane =null;
        try {
            //   Parent root = FXMLLoader.load(getClass().getResource("/propositionLivre/AfficherListeProposition.fxml"));

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/propositionLivre/AfficherListeProposition.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);
    }

    @FXML
    void gestionReclamation(ActionEvent event) {

        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);

    }

    @FXML
    void gestionUtilisateur(ActionEvent event) {

        Pane newLoadedPane =null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/supprimerAvecSucces.fxml"));
            newLoadedPane = loader.load();


        } catch (IOException e1) {
            // TODO Auto-generated catc1h block
            e1.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane);

    }
}

