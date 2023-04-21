/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EMNA
 */
public class ChatController implements Initializable {

    @FXML
    private TextField CHERCHER;
    @FXML
    private FontAwesomeIcon arrowtop;
    @FXML
    private TextField CHERCHER1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returntoprevious(MouseEvent event) throws IOException {
        Stage logp = new Stage();
               arrowtop.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Homepage.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
               logp.setTitle("HomePage");
                logp.show();
                logp.setResizable(false);
    }

    @FXML
    private void SendMessage(MouseEvent event) {
    }
    
}
