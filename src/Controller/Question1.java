/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EMNA
 */
public class Question1 implements Initializable {

    @FXML
    private Label question1;
    @FXML
    private JFXButton btnoui;
    @FXML
    private JFXButton btnnon;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void actionoui(ActionEvent event) throws IOException {
          Stage logp = new Stage();
                btnoui.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Question2.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Question2");
                logp.show();
                logp.setResizable(false);
    }

    @FXML
    private void actionnon(ActionEvent event) throws IOException {
          Stage logp = new Stage();
                btnnon.getScene().getWindow().hide();
              
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Question2.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
                logp.setTitle("Question2");
                logp.show();
                logp.setResizable(false);
    }

    
}
