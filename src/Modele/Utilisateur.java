/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import java.util.Scanner;
import java.security.NoSuchAlgorithmException;  
import java.security.MessageDigest;  
/**
 *
 * @author EMNA
 */
public class Utilisateur {
   
   private String login;
   private String motdepasse;
   private String role;
    public void Utilisateur( String login , String motdepasse,String role)
   {
   this.login=login;
   this.motdepasse=motdepasse;
   this.role=role;
   }
  /* public void connecter (Tabutilisateurs tab) throws ErreurCon
   {
      
       Scanner scan= new Scanner(System.in);
       System.out.println("Login:");
       login=scan.nextLine();
       System.out.println("Mot de passe:");
       motdepasse=scan.nextLine();
       for(int i=0;i<tab.getUtilisateurs().size();i++)
       {
          if(tab.getutilisateur(i).login!=login || tab.getutilisateur(i).motdepasse!=motdepasse )
          {
              throw new ErreurCon ();
          }
          else 
              System.out.println("Success!");
       }
       
           
   }
    public String hashage (String motdepasse)
    {
        String motdepasseHashe = null;   
        try{
            MessageDigest m = MessageDigest.getInstance("MD5");  
              
            m.update(motdepasse.getBytes());  
                
            byte[] bytes = m.digest();  
                
            StringBuilder s = new StringBuilder();  
            for(int i=0; i< bytes.length ;i++)  
            {  
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
            }  
               
            motdepasseHashe = s.toString();
            return motdepasseHashe;
        }
           catch (NoSuchAlgorithmException e)   
        {  
            e.printStackTrace(); 
            return "0";
        }
        
    

    }*/
    public String getMotDePasse()
    {
        return motdepasse;
    }
    public void setMotdepasse(String m ){
        this.motdepasse=m;
    }
    public String getLogin()
    {
        return login;
    }
    public void setLogin(String l)
    {
        this.login=l;
    }
      public String getRole()
        {
            return role;
        }
      public void setRole(String role)
      {
          this.role=role;
      }
    /*public void inscrire () throws Exception
    {
        
       Scanner scan= new Scanner(System.in);
       System.out.println("\t\t*********Menu********");
       System.out.println("\t\t* 1.Administrateur       *");
       System.out.println("\t\t* 2.Utilisateur          *");
       System.out.println("\t\t*********************");
       System.out.println("Tapez le numero corresspondant de votre poste:");
       int s =scan.nextInt();
       do{
       switch (s)
       {
           case 1 -> {
               role="Administrateur";
               break;
           }
           case 2 -> {
               role="Utilisateur";
               break;
           }
           default -> {System.out.println("Veuillez choisir soit 1 soit 2 ");
           inscrire();
           }
  
       }
       }while(s>2 && s<=0);
       System.out.println("Veuillez entrer le login:");
       String k=scan.nextLine();
       login=scan.nextLine();
       System.out.println("Veuillez entrer le mot de passe:");
       motdepasse=scan.nextLine();
       System.out.println("Veuillez confirmer le mot de passe:");
       String remotdepasse=scan.nextLine();
       if(motdepasse.equals(remotdepasse))
       {
           System.out.println("C'est Bon!");
       }
       else 
           throw new Exception ("les mot de passe ne sont pas compatibles  ");
      
           
       
    }
    */
    @Override
    public String toString(){
        
    return "[Login:"+this.login+"|| Mot de passe :" +motdepasse+"|| Role :"+this.role+"]";
}
    
}
