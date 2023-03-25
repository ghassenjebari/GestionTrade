package controller.estimationProposition;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.EstimationOffreLivre;
import model.PropositionLivre;
import model.enums.Etat;
import service.EstimationOffreLivreService;

import java.io.IOException;
import java.util.regex.Pattern;

public class ajouterUneEstimationController {


    @FXML
    private Label date;

    @FXML
    private Label description;

    @FXML
    private Label edition;

    @FXML
    private TextField point;

    @FXML
    private Label titre;

    @FXML
    private Label erreur;
    @FXML
    private Pane pane;

    PropositionLivre propositionLivre;


    EstimationOffreLivreService estimationOffreLivreService = new EstimationOffreLivreService();

    public void pass(PropositionLivre propositionLivre) {
        this.propositionLivre = propositionLivre;


        date.setText(propositionLivre.getDateProposition().toString());
        description.setText(propositionLivre.getDescriptionEtat());
        edition.setText(propositionLivre.getEditon());
        titre.setText(propositionLivre.getTitreLivre());
    }




    public void ajouterEstimation(ActionEvent e) {

        String regex = "^[1-9][0-9]*$";
        Pattern pattern = Pattern.compile(regex);


        if (pattern.matcher(point.getText()).matches() ){
            EstimationOffreLivre estimationOffreLivre = new EstimationOffreLivre
                    (propositionLivre, Integer.valueOf(point.getText()), Etat.En_attente);
            System.out.println(estimationOffreLivre);

            estimationOffreLivreService.add(estimationOffreLivre);
            Pane newLoadedPane = null;
            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/shared/ajoutAvecSucces.fxml"));
                newLoadedPane = loader.load();


            } catch (IOException e1) {
                // TODO Auto-generated catc1h block
                e1.printStackTrace();
            }
            pane.getChildren().clear();
            pane.getChildren().add(newLoadedPane);
        } else erreur.setText("nombre negatif !!!");



    }

    public void supprimerAlert(MouseEvent e) {
        erreur.setText("");

    }
}

