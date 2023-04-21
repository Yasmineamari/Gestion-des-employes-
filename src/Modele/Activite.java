/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import java.util.Scanner;

/**
 *
 * @author EMNA
 */
public class Activite {
    
    private String titrea;
    private String typea;
    private String dateda;
    private String datefa;
    public Activite( String titrea,String typea , String dateda , String datefa) {
    this.titrea=titrea;
    this.typea=typea;
    this.dateda=dateda;
    this.datefa=datefa;
    }
    public Activite SaisirActivite(){
        Activite act=new Activite("","","","");
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le titre d'activite:");
        titrea = scan.nextLine();
        System.out.println("Entrez le type de l'activite:");
        typea = scan.nextLine();
        System.out.println("Entrez la date de debut de l'activite:");
        dateda = scan.nextLine();
        System.out.println("Entrez la date de fin de l'activite:");
        datefa = scan.nextLine();
        return act;
        
   
    
    }
    public void AfficherActivite(){
        System.out.println("Le titre d'activite:"+titrea);
        
        System.out.println("Le type de l'activite:"+typea);
       
        System.out.println("la date de debut de l'activite:"+dateda);
       
        System.out.println("La date de fin de l'activite:"+datefa);
        
    }
}
