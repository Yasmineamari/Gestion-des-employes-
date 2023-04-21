/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author EMNA
 */
public class Directeur extends Utilisateur implements Personnel {
    private int id;
    private String nomPrenom;
    private String dep;
    private double salaire;
    private double prime;
    private int nbrEmployes;
    
    public Directeur (String login , String motdepasse,String role,int id, String nomPrenom,String dep , double salaire ,double prime,int nbrEmployes)
    {
        super();
   
        this.nomPrenom=nomPrenom;
        this.id=id;
        this.dep=dep;
        this.salaire=salaire;
        this.prime=prime;
        this.nbrEmployes=nbrEmployes;
    }
@Override
   public double CalculerPaye() {return salaire+prime;    }
   public double getSalaire(){return salaire;}
   public double getPrime(){return prime;}
   public int getNbrEmployes(){return nbrEmployes;}


}
