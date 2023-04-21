/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;


import ConnexionDB.Connexion;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.PreparedStatement;
import javax.mail.*;
import javax.mail.Session;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author EMNA
 */
public class MotdePOublieFXMLController implements Initializable {

    @FXML
    private FontAwesomeIcon Previous;
    @FXML
    private JFXTextField motdepasseO;
 private Connexion conn;
    private PreparedStatement pst;
    @FXML
    private JFXButton btnEnvoie;
    @FXML
    private Label msgE;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Previous.setCursor(Cursor.HAND);
        btnEnvoie.setCursor(Cursor.HAND);
        // TODO
    }    

    @FXML
    private void EnvoieEmail(ActionEvent event) throws SQLException {
           try{
            String host ="smtp.gmail.com" ;
            String user = "emna.belhareth19@gmail.com";
            String pass = "wxeldfrjtywdjwaq";
            String to = motdepasseO.getText() ;
            System.out.println(to);
            if(to.isEmpty())
            {
               msgE.setText("Veuillez remplir ce champ");
            }
            else
            {
            String from = "emna.belhareth19@gmail.com";
            String subject = "Mot de passe oublié ";
            String q1 = "SELECT prenom,nom FROM employe WHERE email = ?";
            pst = (PreparedStatement) conn.connecterDB().prepareStatement(q1);
            pst.setString(1,to);
             ResultSet rs = pst.executeQuery();
             while (rs.next())
             {
               
              
             
           
         
            String messageText = "Bienvenue " + rs.getString("nom")+"\nVous avez oubliez votre mot de passe? , ne vous inquietez pas !!\n Vous pouvez le recuperez facilement , Veuillez svp cliquer sur le lien ci-dessous ";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getInstance(props, null);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new java.util.Date());
            msg.setText(messageText);

             Transport transport = mailSession.getTransport("smtp");
                     
                 transport.connect(host, user, pass);
 
                 transport.sendMessage(msg, msg.getAllRecipients());
             }
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Succes");
        alert.setContentText("Verifier votre email svp!!");
        alert.setX(1150);
        alert.setY(620);
        alert.showAndWait();
               
        }
           }
catch(MessagingException ex)
        {
            System.out.println(ex);
        }
} 


            
                    

    
      
   

    @FXML
    private void ReturntoPrevious(MouseEvent event) throws IOException {
         Stage logp = new Stage();
              Previous.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/UtilisateurFXML.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
               logp.setTitle("Connexion");
                logp.show();
                logp.setResizable(false);
    }
    
}
