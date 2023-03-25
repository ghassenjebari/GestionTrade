module com.example.pidev {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires twilio;
    requires java.desktop;
    exports controller.statistique to javafx.fxml;
    opens controller.statistique;

    opens controller.sharedController to com.example.pidev, javafx.fxml;
    opens controller.clotureAchat to com.example.pidev, javafx.fxml;
    //opens com.example.pidev to javafx.fxml;

    exports controller.sharedController;
    exports controller.clotureAchat;
    opens controller.globale to javafx.fxml;



    exports com.example.pidev;

    exports vue to javafx.graphics,controller;
    opens vue to controller;
    exports controller.estimationProposition;


    opens model to javafx.base;
    opens controller.estimationProposition to javafx.fxml;
    exports controller.proposition to javafx.fxml;
    opens controller.proposition to javafx.fxml;


    exports controller.detailsLivraison to javafx.fxml;
    opens controller.detailsLivraison to javafx.fxml;


}