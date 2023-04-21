/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import ConnexionDB.Connexion;
import Modele.Utilisateur;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import org.controlsfx.control.Notifications;
import org.controlsfx.validation.ValidationSupport;
import org.controlsfx.validation.Validator;
   

/**
 * FXML Controller class
 *
 * @author EMNA
 */
public class UtilisateurFXMLController implements Initializable {

    private TextField TxtLogin;
    @FXML
    private Hyperlink HyOublier;
    @FXML
    private JFXTextField txtlogin;
    @FXML
    private JFXTextField txtmotpA;
    @FXML
    private JFXPasswordField txtmotpCa;

    @FXML
    private JFXComboBox combojx;
    @FXML 
    private Button btnlogin; 
    @FXML 
    private Hyperlink HyInsc;
    @FXML
    private CheckBox ChbMotpa;
    Utilisateur u =new Utilisateur();
    @FXML
    private Label txtBienvenue;
    ValidationSupport validationSupport = new ValidationSupport();
   
     private Connexion conn;
    private PreparedStatement pst;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Connexion conn = new Connexion();
        ObservableList<String> list = FXCollections.observableArrayList("Administrateur","Utilisateur");
        combojx.setItems(list);
       btnlogin.setCursor(Cursor.HAND);
        ChbMotpa.setCursor(Cursor.HAND);
        validationSupport.registerValidator(txtlogin, Validator.createEmptyValidator("Field is required"));
        validationSupport.registerValidator(txtmotpCa, Validator.createEmptyValidator("Field is required"));
     
   
    }    

    @FXML
    private void inscrire(ActionEvent event) throws IOException {
        
        Stage Ins = new Stage();
        HyInsc.getScene().getWindow().hide();
        Parent rootB;
        rootB=FXMLLoader.load(getClass().getResource("/View/Inscription.fxml"));
        
        Scene scene = new Scene(rootB);
        Ins.setScene(scene);
        Ins.setTitle("Inscription");
        Ins.show();
        Ins.setResizable(false);
            }
            
        
        


    @FXML
    private void Seconnecter(ActionEvent event) throws IOException, SQLException, InterruptedException {
     
         u.setLogin(txtlogin.getText());
         u.setMotdepasse(txtmotpCa.getText());
          String q1 = "SELECT * FROM utilisateur WHERE login=? AND mdp=? AND Role=?";
        try
        {
            pst = (PreparedStatement) conn.connecterDB().prepareStatement(q1);
            pst.setString(1, txtlogin.getText());
            pst.setString(2,txtmotpCa.getText());
            pst.setString(3, (String) combojx.getValue());
            
            ResultSet rs = pst.executeQuery();
            int count = 0;
            while(rs.next())
            {
                count++;
            }
            
            if (count==1)
            {
            
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Succes");
        alert.setContentText("Connexion avec succés");
        alert.setX(1150);
        alert.setY(620);
        alert.showAndWait();
   
       
        
           
                Stage logp = new Stage();
                btnlogin.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Homepage.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("HomePage");
                logp.show();
               
                logp.setResizable(false);
               
               
    }
        else 
        {
            
            Alert alert2 = new Alert(Alert.AlertType.WARNING);
            alert2.setTitle("Echoue");
            alert2.setContentText("Veuillez vérifier votre Email et votre Mot de passe !!");
            alert2.setX(1150);
            alert2.setY(620);
            alert2.showAndWait();
            
            
               
        }
             } catch (SQLException ex) {
        }
        
        finally
        {
            try {
                conn.connecterDB().close();
            } catch (SQLException ex) {
            }
        }
    }

    


    @FXML
    private void Selectrole(ActionEvent event) {
        String s = combojx.getSelectionModel().getSelectedItem().toString();
        u.setRole(s);
    }
    
    @FXML
    void MotPOublier(ActionEvent event) throws IOException {
        Stage SMotp=new Stage();
        HyOublier.getScene().getWindow().hide();
        Parent rootC;
        rootC=FXMLLoader.load(getClass().getResource("/View/MotdePOublieFXML.fxml"));
        Scene scene=new Scene(rootC);
        SMotp.setScene(scene);
        SMotp.setTitle("Mot de passe oublier");
        SMotp.show();
        SMotp.setResizable(false);
        
        
        
        

    }

          
    
        
         @FXML
    void AfficherMotP(ActionEvent event) {
      if(ChbMotpa.isSelected())
      {
          txtmotpA.setText(txtmotpCa.getText());
          txtmotpA.setVisible(true);
          txtmotpCa.setVisible(false);
          
        
      }
      else
      {
          txtmotpCa.setText(txtmotpA.getText());
          txtmotpCa.setVisible(true);
          txtmotpA.setVisible(false);
      }
   }
    }
      

