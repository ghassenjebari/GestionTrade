package vue;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class test extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {




           //  Parent root = FXMLLoader.load(getClass().getResource("/clotureAchat/AfficherListeClotureAchat.fxml"));
          //  Parent root = FXMLLoader.load(getClass().getResource("/detailsLivraison/AfficherListeDetailsLivaisonLivre.fxml"));
           // Parent root = FXMLLoader.load(getClass().getResource("/estimationProposition/AfficherListeEstimationOffreLivre.fxml"));
     //   Parent root = FXMLLoader.load(getClass().getResource("/propositionLivre/AfficherListeProposition.fxml"));

              Parent root = FXMLLoader.load(getClass().getResource("/globale/bar.fxml"));

           // Parent root = FXMLLoader.load(getClass().getResource("/statistique/Courbe.fxml"));





            Scene scene = new Scene(root, 1500, 600);
            scene.getStylesheets().add(getClass().getResource("/shared/style.css").toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch();
    }
}