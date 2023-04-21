/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author EMNA
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Question {

    private String enonce;
    private int pos;      // position de la bonne réponse à partir de 1
    private ArrayList<String> reponses;

    public Question(String enonce) {
        this.enonce = enonce;
        reponses = new ArrayList();
    }

    public void ajouterReponse(String reponse) {
        reponses.add(reponse);
    }
// setters et getters

    public void setPos(int pos) {
        if (pos <= reponses.size()) {
            this.pos = pos;
        }
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public int getPos() {
        return pos;
    }

    public String getEnonce() {
        return enonce;
    }

    public boolean lireReponseAuClavier(Scanner sc) {

        System.out.println("donner le numéro de votre réponse à partir de 1 :");
        int rep = sc.nextInt();
        return (rep == pos);
    }

    @Override
    public String toString() {
        String str = getEnonce() + "\n";
        for (String elt : reponses) {
            str += elt + "\n";
        }
        return str;
    }
}
