package mcci.businessschool.bts.sio.slam.pharmagest.maintenance.controleur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.w3c.dom.Node;

import java.io.IOException;


public class MaintenanceControleur {
    @FXML
    private Button retourDashboard;
    @FXML
    private Button userButton;
    @FXML
    private Button medicamentButton;

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

    @FXML
    public void userButtonOnAction(ActionEvent e) throws IOException {
        // Nouvelle scène
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/utilisateur/Utilisateur.fxml"));
        Scene nouvelleScene = new Scene(loader.load());
        // La référence de la scène actuelle
        Stage stage = (Stage) userButton.getScene().getWindow();
        // Afficher la nouvelle scène
        stage.setScene(nouvelleScene);
        stage.setMaximized(true);
    }



    @FXML
    public void MedicamentOnAction(ActionEvent e) throws IOException {
        // Nouvelle scène
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/medicament/Medicament.fxml"));
        Scene nouvelleScene = new Scene(loader.load());

        // La référence de la scène actuelle
        Stage stage = (Stage) medicamentButton.getScene().getWindow();

        // Afficher la nouvelle scène
        stage.setScene(nouvelleScene);
        stage.setMaximized(true);
    }


}



