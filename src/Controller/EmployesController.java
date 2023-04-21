/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EMNA
 */
public class EmployesController implements Initializable {

    @FXML
    private AnchorPane parent;
    @FXML
    private AnchorPane topAnchPane;
    @FXML
    private Label MENU;
    @FXML
    private ImageView Menu;
    @FXML
    private TextField CHERCHER;
    @FXML
    private Label QUITTER;
    @FXML
    private FontAwesomeIcon signout;
    @FXML
    private AnchorPane LeftAnchorpan;
    @FXML
    private VBox slider;
    @FXML
    private AnchorPane AnchorPs;
    @FXML
    private Button confirmer;
    @FXML
    private AnchorPane CenterAnchorPane;
    @FXML
    private Button idemployes;
    @FXML
    private Label Listeemploye;
    @FXML
    private TableView<?> idemp;
    @FXML
    private JFXButton eve;
    @FXML
    private JFXButton home;
    @FXML
    private JFXButton qui;
    @FXML
    private JFXButton emp;
    @FXML
    private JFXButton chat;
    @FXML
    private JFXButton para;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

  
   @FXML
    private void Quitter(MouseEvent event) throws IOException {
           Stage logp = new Stage();
                signout.getScene().getWindow().hide();
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/UtilisateurFXML.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Connexion");
                logp.show();
                logp.setResizable(false);
    }
    private void CHAT(ActionEvent event) throws IOException {
          Stage logp = new Stage();
                chat.getScene().getWindow().hide();
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Chat.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Chat");
                logp.show();
                logp.setResizable(false);
    }
 
    @FXML
    private void EVENEMENT(ActionEvent event) throws IOException {
          Stage logp = new Stage();
              eve.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Evenement.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Evenement");
                logp.show();
                logp.setResizable(false);
    }

    @FXML
    private void HOME(ActionEvent event) throws IOException {
          Stage logp = new Stage();
              home.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Homepage.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Employes");
                logp.show();
                logp.setResizable(false);
    }

    @FXML
    private void QUIZ(ActionEvent event) throws IOException {
        Stage logp = new Stage();
              qui.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/quiz.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Quiz!");
                logp.show();
                logp.setResizable(false);
    }

    @FXML
    private void EMPLOYE(ActionEvent event) throws IOException {
         Stage logp = new Stage();
              emp.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Employes.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Employes");
                logp.show();
                logp.setResizable(false);
    }

    @FXML
    private void PARAMETRE(ActionEvent event) throws IOException {
            Stage logp = new Stage();
              para.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Parametres.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Quiz!");
                logp.show();
                logp.setResizable(false);
    }
    @FXML
    private void Confirmations(ActionEvent event) {
    }

    @FXML
    private void actioncreerevent(ActionEvent event) {
    }

   /* @FXML
    private void tabemplyes(SortEvent<> event) {
    }*/
    
}
