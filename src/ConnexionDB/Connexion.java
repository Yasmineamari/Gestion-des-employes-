/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConnexionDB;
import java.sql.*;

/**
 *
 * @author EMNA
 */
public class Connexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection cnx =connecterDB();
    }
    public static Connection connecterDB (){
    try{
        Class.forName("com.mysql.jdbc.Driver");
      //  System.out.println("Driver c bon");
        String url="jdbc:mysql://localhost/gestion_personnels";
        String user="root";
        String password="";
        Connection cnx=DriverManager.getConnection(url,user,password);
        //System.out.println("Connexion bien etablie");
        
        return cnx;
        
    }
    catch(Exception e){
        System.out.println("Connexion échouée !");
        e.printStackTrace();
        return null;
    }
}
}
