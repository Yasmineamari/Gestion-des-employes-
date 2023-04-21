
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import ConnexionDB.Connexion;
import Modele.Employe;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.PreparedStatement;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.lang.System.Logger;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.sql.Date;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.localDate;

import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class InscriptionController implements Initializable {

    @FXML
    private Label idinscri;
    @FXML
    private JFXComboBox<String> ComboDep;
     ObservableList<String> list = FXCollections.observableArrayList("Production" , "VentesMarketing" , "RechercheDéveloppement" ,"ComptabilitéFinance" ,"Ressourcehumaines" , "ServiceClient" ,"IT" );
    
    @FXML
    private FontAwesomeIcon returArr;
    
    Employe e = new Employe();
    @FXML
    private JFXTextField Nom;
    @FXML
    private JFXTextField Prenom;
    @FXML
    private JFXTextField Matricule;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField motdepasse;
    @FXML
    private JFXPasswordField motdepassR;
    @FXML
    private JFXTextField motdepasseA;
    @FXML
    private CheckBox chbox;
    @FXML
    private JFXRadioButton RBf;
    @FXML
    private JFXRadioButton RBh;
    
    private Connexion conn;
    private PreparedStatement pst;
    @FXML
    private DatePicker date;
    @FXML
    private JFXButton annul;
    @FXML
    private JFXButton enreg;

       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Connexion conn = new Connexion();  
        ComboDep.setItems(list);
        ToggleGroup tg=new ToggleGroup();
        RBf.setToggleGroup(tg);
        RBh.setToggleGroup(tg);
        returArr.setCursor(Cursor.HAND);
        date.setCursor(Cursor.HAND);
        annul.setCursor(Cursor.HAND);
        enreg.setCursor(Cursor.HAND);
        chbox.setCursor(Cursor.HAND);
        RBf.setCursor(Cursor.HAND);
        RBh.setCursor(Cursor.HAND);
    
     
    }
      
  
    
    @FXML
    private void ReturntoPrevious(MouseEvent event) throws IOException {
          Stage logp = new Stage();
                returArr.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/UtilisateurFXML.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
               logp.setTitle("Connexion");
                logp.show();
                logp.setResizable(false);
    }

    @FXML
    private void SelectDep(ActionEvent event) {
        
         String dep = ComboDep.getSelectionModel().getSelectedItem().toString();
       
    }
    @FXML
    private void Enregistrer(ActionEvent event) throws SQLException {
      if( Nom.getText().isEmpty() ||
     Prenom.getText().isEmpty()||
     Matricule.getText().isEmpty()||
     date.getValue()==null ||
     RBh.isSelected()==false &&
     RBf.isSelected()==false ||
     ComboDep.getValue().isEmpty()||
     email.getText().isEmpty()||
     motdepasse.getText().isEmpty() ||
     motdepassR.getText().isEmpty())
      {
           Alert alert4 = new Alert(Alert.AlertType.ERROR);
                 alert4.setTitle("Echoue");
                 alert4.setContentText("Veuillez s'il vous plait remplir tous les champs ");
                   alert4.setX(1150);
                    alert4.setY(620);
                 alert4.showAndWait();
      }
          if(MatriculeValide() && EmailValide())
          {
      
        try
        {
            String q1 = "INSERT INTO employe(matricule,nom,prenom,dateN,sexe,Dep,email,mdp,mdpn)VALUES (?,?,?,?,?,?,?,?,?)";  
            pst = (PreparedStatement) conn.connecterDB().prepareStatement(q1);
         
            pst.setString(1, Matricule.getText());
            pst.setString(2,Nom.getText());
            pst.setString(3, Prenom.getText());
            java.sql.Date theDate = java.sql.Date.valueOf(date.getValue());
            pst.setDate(4,theDate);
           if(RBf.isSelected())
                 pst.setString(5, "Femme");
            else
                 pst.setString(5, "Homme");
              pst.setString(6, ComboDep.getValue());
          
                      
               pst.setString(7,email.getText() );
                      pst.setString(8,motdepasse.getText() );
                pst.setString(9,motdepassR.getText() );
              
           
                   
          
           
              
           
             if(motdepasse.getText().equals(motdepassR.getText() ))
             {
                    
                   pst.executeUpdate();
                  System.out.println("Employe ajouté avec succés !");
          
                 Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                 alert2.setTitle("Succes");
                 alert2.setContentText("Connexion avec succés");
        alert2.setX(1150);
        alert2.setY(620);
        alert2.showAndWait();
         
             
              
                   
                
                }
               else 
               {
                   
  Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setTitle("Echoue");
                 alert.setContentText("Le mot de passe et le mot de passe de confirmation ne correspondent pas ou bien votre email n'est pas sur la forme 'exemple @gmail.com' ");
                   alert.setX(1150);
                    alert.setY(620);
                 alert.showAndWait();
                    
               }
              }
              
           
              
               
                     
        
    
        
        catch (SQLException ex) {
            System.out.println("Erreur d'ajout !");
           
        }
    }
    }
    @FXML
    private void Annuler(ActionEvent event) {
     Nom.setText("");
     Prenom.setText("");
     Matricule.setText("");
     date.setValue(LocalDate.now());
     RBh.setSelected(false);
     RBf.setSelected(false);
     ComboDep.setValue("");
     email.setText("");
     motdepasse.setText("");
     motdepassR.setText("");
     
    }

    @FXML
    private void affichermotpasse(ActionEvent event) {
        if(chbox.isSelected())
      {
          motdepasseA.setText(motdepasse.getText());
         motdepasseA.setVisible(true);
         motdepasse.setVisible(false);
          
        
      }
      else
      {
          motdepasse.setText(motdepasseA.getText());
          motdepasse.setVisible(true);
          motdepasseA.setVisible(false);
      }
    }

    private boolean MatriculeValide() {
            Pattern p = Pattern.compile("[0-9]*");
        Matcher m=p.matcher(Matricule.getText());
        if(m.find() && m.group().equals(Matricule.getText()) && Matricule.getLength()==8 ){
            return true;
        }
        else 
        {
           Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setTitle("Echoue");
                 alert.setContentText(" La Matricule doit etre en chiffres et de longueur 8  ' ");
                   alert.setX(1150);
                    alert.setY(620);
                 alert.showAndWait(); 
                 return false;
        }
    }

    private boolean EmailValide() {
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m=p.matcher(email.getText());
        if(m.find() && m.group().equals(email.getText())){
            return true;
        }
        else 
        {
           Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setTitle("Echoue");
                 alert.setContentText(" L email doit etre sous la forme 'exemple @gmail.com' ");
                   alert.setX(1150);
                    alert.setY(620);
                 alert.showAndWait(); 
                 return false;
        }
            
    }





 
}

