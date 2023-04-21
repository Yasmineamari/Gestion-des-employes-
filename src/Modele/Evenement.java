/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import java.util.HashMap;

/**
 *
 * @author EMNA
 */
public class Evenement {

    private String titre;
    private String lieu;
    private String dated;
    private String datef;
    private String description;
    private HashMap<Activite,Integer> activites;
    public Evenement(String titre , String lieu , String dated , String datef , String description) {
        this.titre=titre;
        this.lieu=lieu;
        this.dated=dated;
        this.datef=datef;
        this.description=description;
        activites = new HashMap<Activite,Integer>();
    }

    public String getdated() {
        return dated;
    }
 
    public String getdatef() {
        return datef;
    }

    public void setdated(String d) {
        d = this.dated;
    }

    public void setdatef(String d) {
        d = this.datef;
    }

    public String gettitre() {
        return titre;
    }

    public String getlieu() {
        return lieu;
    }

    public String getdescription() {
        return description;
    }

    public void Settitre(String titre) {
        this.titre = titre;
    }

    public void Setdescription(String description) {
        this.description = description;
    }
    public HashMap<Activite,Integer> getactivite()
   {
       return this.activites ;
   }
   public void setAct(HashMap<Activite,Integer> activites)
   {
       this.activites=activites;
   }
   public void addAct(Activite act,Integer ordre) //addition
   {
       activites.put(act, ordre);
   }
   public void removeAct(Activite act,Integer ordre) // suppression
   {
       activites.remove(act, ordre);
   }
   public void afficherAct() //affichage
   {
       activites.forEach((key, value) -> System.out.println(key + " => " + value));
   }
    @Override
    public String toString() {
        return "l activites "+activites.keySet()+"de l'ordre "+activites.values();
    }
   
    /*public Evenement ajouterevenement() {
        Scanner scan = new Scanner(System.in);
        Evenement e=new Evenement("","","","","");
        
        ArrayList<Activite> listac=new ArrayList<Activite> ();
        System.out.println("Entrez le titre evenement:");
        e.titre = scan.nextLine();
        System.out.println("Entrez la date de debut de l'evenement:");
        e.dated = scan.nextLine();
        System.out.println("Entrez la date de fin de l'evenement:");
        e.datef = scan.nextLine();
        System.out.println("Entrez la description de l'evenement:");
        e.description=scan.nextLine();
        System.out.println("Entrez les activites qui correspond à cet evenement");
       while (true) {
            Activite a =new Activite("","","","");
            a.SaisirActivite();
            
            
            listac.add(a);
            
            System.out.println("Voulez vous ajouter un autre activité?{oui/non}");
            String c = scan.nextLine();
            if (c.toUpperCase().equals("NON")) {
                break;
            }
            
            

        }
        System.out.println("le titre de l'evenement : "+e.titre);
        System.out.println("la date de debut l'evenement :"+e.dated);
        System.out.println("la date de fin de l'evenement :"+e.datef);
        System.out.println("la description de l'evenement :"+e.description);
        System.out.println("Les activites  :");
        listac.get(0).AfficherActivite();
       return e;
    }

  */

}
