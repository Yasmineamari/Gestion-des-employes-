/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Modele;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
;




/**
 *
 * @author EMNA
 */


/**
 *
 * @author EMNA
 */
public class Personnels extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
     
        Parent root =FXMLLoader.load(getClass().getResource("/View/MotdePOublieFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Connexion");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
