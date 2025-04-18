module mcci.businessschool.bts.sio.slam.pharmagest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.base;
    requires java.desktop;
    requires itextpdf;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires com.github.librepdf.openpdf;

    opens mcci.businessschool.bts.sio.slam.pharmagest.utilisateur.controleur to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.utilisateur.controleur;
    opens mcci.businessschool.bts.sio.slam.pharmagest.utilisateur to javafx.base;
    exports mcci.businessschool.bts.sio.slam.pharmagest;
    opens mcci.businessschool.bts.sio.slam.pharmagest to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.login.controleur;
    opens mcci.businessschool.bts.sio.slam.pharmagest.login.controleur to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.login.service;
    opens mcci.businessschool.bts.sio.slam.pharmagest.login.service to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.maintenance.controleur;
    opens mcci.businessschool.bts.sio.slam.pharmagest.maintenance.controleur to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.dashboard.controleur;
    opens mcci.businessschool.bts.sio.slam.pharmagest.dashboard.controleur to javafx.fxml;
    opens mcci.businessschool.bts.sio.slam.pharmagest.medicament to javafx.base;
    exports mcci.businessschool.bts.sio.slam.pharmagest.medicament.controleur;
    opens mcci.businessschool.bts.sio.slam.pharmagest.medicament.controleur to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.approvisionnement.controleur to javafx.fxml;
    opens mcci.businessschool.bts.sio.slam.pharmagest.approvisionnement.controleur to javafx.fxml;
    opens mcci.businessschool.bts.sio.slam.pharmagest.commande.controleur to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.commande.controleur to javafx.fxml;
    opens mcci.businessschool.bts.sio.slam.pharmagest.commande.service to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.commande.service to javafx.fxml;
    opens mcci.businessschool.bts.sio.slam.pharmagest.commande.dao to javafx.base;
    exports mcci.businessschool.bts.sio.slam.pharmagest.commande.dao to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.commande;
    exports mcci.businessschool.bts.sio.slam.pharmagest.fournisseur;
    exports mcci.businessschool.bts.sio.slam.pharmagest.pharmacien;
    opens mcci.businessschool.bts.sio.slam.pharmagest.commande to javafx.base;
    opens mcci.businessschool.bts.sio.slam.pharmagest.livraison.controleur to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.livraison.controleur to javafx.fxml;
    opens mcci.businessschool.bts.sio.slam.pharmagest.vente.dao to javafx.base;
    exports mcci.businessschool.bts.sio.slam.pharmagest.vente.dao to javafx.fxml;
    opens mcci.businessschool.bts.sio.slam.pharmagest.vente to javafx.base;
    exports mcci.businessschool.bts.sio.slam.pharmagest.vente to javafx.fxml;
    opens mcci.businessschool.bts.sio.slam.pharmagest.vente.controleur to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.vente.controleur to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.facture to javafx.base;
    exports mcci.businessschool.bts.sio.slam.pharmagest.paiement;
    exports mcci.businessschool.bts.sio.slam.pharmagest.prescription;
    exports mcci.businessschool.bts.sio.slam.pharmagest.medicament;
    exports mcci.businessschool.bts.sio.slam.pharmagest.vendeur;
    exports mcci.businessschool.bts.sio.slam.pharmagest.patient;
    exports mcci.businessschool.bts.sio.slam.pharmagest.fournisseur.controleur;
    opens mcci.businessschool.bts.sio.slam.pharmagest.fournisseur.controleur to javafx.fxml;
    exports mcci.businessschool.bts.sio.slam.pharmagest.famille;


}
