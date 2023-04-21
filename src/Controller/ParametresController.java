/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXToggleButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EMNA
 */
public class ParametresController implements Initializable {

    @FXML
    private JFXToggleButton ToggOn;
    @FXML
    private JFXToggleButton ToNotiOn;
    @FXML
    private JFXSlider LumiSl;
    @FXML
    private FontAwesomeIcon retur;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SombrToClair(ActionEvent event) {
       ToggOn.selectedProperty().addListener(new ChangeListener <Boolean>()
       {
           @Override
           public void changed(ObservableValue<? extends Boolean> arg0,Boolean arg1,Boolean arg2)
           {
               if(ToggOn.isSelected()==true)
               {
                   ToggOn.setText("On");
                   setClairMode();
               }
               else 
               {
                   ToggOn.setText("Off");
                   setSombreMode();
               }
           }
           
       });
   
        
     
    }
    private void setClairMode(){
     
           
       }
        private void  setSombreMode(){
           
       }
    @FXML
    private void NotifAffiche(ActionEvent event) {
            ToNotiOn.selectedProperty().addListener(new ChangeListener <Boolean>()
       {
           @Override
           public void changed(ObservableValue<? extends Boolean> arg0,Boolean arg1,Boolean arg2)
           {
               if(ToNotiOn.isSelected()==true)
               {
                   ToNotiOn.setText("On");
                   setClairMode();
               }
               else 
               {
                   ToNotiOn.setText("Off");
                   setSombreMode();
               }
           }
           
       });
    }

    @FXML
    private void Luminslide(MouseDragEvent event) {
    }

    @FXML
    private void Enregistrer(ActionEvent event) {
    }

    @FXML
    private void ReturntoPrevious(MouseEvent event) throws IOException {
         Stage logp = new Stage();
                retur.getScene().getWindow().hide();
                Parent rootA;
                rootA = FXMLLoader.load(getClass().getResource("/View/Homepage.fxml"));
                Scene scene = new Scene(rootA);
                logp.setScene(scene);
               logp.setTitle("Homepage");
                logp.show();
                logp.setResizable(false);
    }

    @FXML
    private void Annuler(ActionEvent event) {
        
    }
    
}
