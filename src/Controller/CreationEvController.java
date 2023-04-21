package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EMNA
 */
public class CreationEvController implements Initializable {

    @FXML
    private TextField textid;
    @FXML
    private TextField texttitre;
    @FXML
    private TextField textddebut;
    @FXML
    private TextField textdfin;
    @FXML
    private TextField textdescription;
    @FXML
    private TextField textactivite;
    @FXML
    private Button buttonconff;
    @FXML
    private Button buttonannuler;
    @FXML
    private Label labevnt;
    @FXML
    private FontAwesomeIcon previous;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmerevent(ActionEvent event) {
    }

    @FXML
    private void Annulerevent(ActionEvent event) {
    }

    @FXML
    private void Backtoprevious(MouseEvent event) throws IOException {
         Stage logp = new Stage();
                previous.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Evenement.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
               logp.setTitle("Evenement");
                logp.show();
                logp.setResizable(false);
    }
    
}
