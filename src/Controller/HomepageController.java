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
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
public class HomepageController implements Initializable {

    @FXML
    private Label MENU;
    @FXML
    private ImageView MenuBack;
    @FXML
    private ImageView Menu;
    @FXML
    private TextField CHERCHER;
    @FXML
    private Label QUITTER;
    @FXML
    private FontAwesomeIcon signout;
    @FXML
    private Label label2;
    @FXML
    private VBox slider;
    @FXML
    private AnchorPane parent;
    @FXML
    private AnchorPane topAnchPane;
    @FXML
    private AnchorPane LeftAnchorpan;
    @FXML
    private AnchorPane AnchorPs;
    @FXML
    private AnchorPane CenterAnchorPane;
    @FXML
    private JFXButton eve;
    @FXML
    private JFXButton Acc;
    @FXML
    private JFXButton qui;
    @FXML
    private JFXButton emp;
    @FXML
    private JFXButton chat;
    @FXML
    private JFXButton par;
  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
          
        MenuBack.setVisible(false);
         
           slider.setTranslateX(-190);
        Menu.setOnMouseClicked(event -> {
           
                TranslateTransition slide = new TranslateTransition();
                
                slide.setNode(slider);
                slide.setToX(0);
                slide.play();
                slider.setTranslateX(-190);
                slide.setOnFinished((ActionEvent e )->{
                    Menu.setVisible(false);
                    MenuBack.setVisible(true);
       
    });
                        });
            MenuBack.setOnMouseClicked(event -> {
                
           
                TranslateTransition slide = new TranslateTransition();
                
                slide.setNode(slider);
                slide.setToX(-190);
                slide.play();
                slider.setTranslateX(0);
                slide.setOnFinished((ActionEvent e )->{
                    MenuBack.setVisible(false);
                    Menu.setVisible(true);
                  
       
    });
                        });
    }

        // TODO
    


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
    @FXML
    private void CHAT(ActionEvent event) throws IOException {
          Stage logp = new Stage();
                signout.getScene().getWindow().hide();
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
    private void HOME(ActionEvent event) {
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
              qui.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Parametres.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Parametres");
                logp.show();
                logp.setResizable(false);
    }
    private AnchorPane getParent()
    {
        return this.parent;
    }
}
