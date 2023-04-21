/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import com.jfoenix.controls.JFXRadioButton;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Question6Controller {

    @FXML
    private JFXRadioButton button1;

    @FXML
    private JFXRadioButton button2;

    @FXML
    private JFXRadioButton button3;

    @FXML
    private Label label2;

    @FXML
    private Label question2;

    @FXML
    private Button suivant;

    @FXML
    void action1(ActionEvent event) {
        

    }

    @FXML
    void action2(ActionEvent event) {
   

    }

    @FXML
    void action3(ActionEvent event) {
 
    }

    @FXML
    void actionsuivant(ActionEvent event) throws IOException {
         Stage logp = new Stage();
             suivant.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Resultat.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Question6");
                logp.show();
                logp.setResizable(false);

    }

}
