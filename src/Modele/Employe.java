/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author EMNA
 */
public class Employe extends Utilisateur implements Personnel {
    private int id;
    private String nom;
    private String dep;
    private int nbrHeures;
    private double prixHeure;
    
    public Employe()
    {
        
    }

    public Employe(String login , String motdepasse,String role,int id,String nom, String dep, int nbrHeures, double prixHeure) 
    {
        super();
        this.id = id;
        this.nom = nom;
        this.dep=dep;
        this.nbrHeures = nbrHeures;
        this.prixHeure = prixHeure;
    }

    @Override
   public double CalculerPaye() {
        return nbrHeures * prixHeure;
    }

    public void setNbrHeures(int nbrHeures) {
        this.nbrHeures = nbrHeures;
    }

    public void setPrixHeure(double prixHeure) {
        this.prixHeure = prixHeure;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public double getPrixHeure() {
        return prixHeure;
    }
        public void setDep (String dep) {
        this.dep = dep;
    }
    
}


