package mcci.businessschool.bts.sio.slam.pharmagest.approvisionnement.controleur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ApprovisionnementControleur {
    @FXML
    private Button gestionCommandeBtn;
    @FXML
    private Button livraisonBtn;
    @FXML
    private Button retourDashboard;
    @FXML
    private Button commandeBtn;


    @FXML
    public void ouvrirLivraison(ActionEvent event) {
        try {
            // Charger le fichier FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/commande/Livraison.fxml"));
            Scene nouvelleScene = new Scene(loader.load());

            // Obtenir la fenêtre actuelle
            Stage stage = (Stage) livraisonBtn.getScene().getWindow();

            // Mettre à jour la scène avec la nouvelle vue
            stage.setScene(nouvelleScene);
            stage.setMaximized(true);
            stage.setTitle("Réception des Commandes");

        } catch (IOException e) {
            System.err.println("❌ Erreur lors de l'ouverture de la réception de commande : " + e.getMessage());
            e.printStackTrace();  // 🔴 Afficher l'erreur complète pour le débogage
        }
    }


    @FXML
    public void ouvrirGestionCommande(ActionEvent event) {
        try {
            // Nouvelle scène
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/commande/GestionCommande.fxml"));
            Scene nouvelleScene = new Scene(loader.load());
            // La référence de la scène actuelle
            Stage stage = (Stage) gestionCommandeBtn.getScene().getWindow();
            // Afficher la nouvelle scène
            stage.setScene(nouvelleScene);
            stage.setMaximized(true);
        } catch (IOException e) {
            System.err.println("❌ Erreur lors de l'ouverture de la génération de commande : " + e.getMessage());
            e.printStackTrace();  // 🔴 Affiche l'erreur complète avec les détails
        }
    }

    @FXML
    public void ouvrirCommande(ActionEvent event) {
        try {
            // Nouvelle scène
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/commande/ListeCommande.fxml"));
            Scene nouvelleScene = new Scene(loader.load());
            // La référence de la scène actuelle
            Stage stage = (Stage) commandeBtn.getScene().getWindow();
            // Afficher la nouvelle scène
            stage.setScene(nouvelleScene);
            stage.setMaximized(true);
        } catch (IOException e) {
            System.err.println("❌ Erreur lors de l'ouverture de la génération de commande : " + e.getMessage());
            e.printStackTrace();  // 🔴 Affiche l'erreur complète avec les détails
        }
    }



    @FXML
    public void retourDashboardOnAction(ActionEvent e) throws IOException {
        // Nouvelle scène
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/dashboard/Dashboard.fxml"));
        Scene nouvelleScene = new Scene(loader.load());
        // La référence de la scène actuelle
        Stage stage = (Stage) retourDashboard.getScene().getWindow();
        // Afficher la nouvelle scène
        stage.setScene(nouvelleScene);
        stage.setMaximized(true);
    }
}
