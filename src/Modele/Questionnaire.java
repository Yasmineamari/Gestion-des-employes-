/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EMNA
 */
public class Questionnaire {

    private static String titre = "************Evaluation**********";
    private ArrayList<Question> questions;
    private int numero = -1;
    private double total = 0.0;

    public Questionnaire() {
        questions = new ArrayList();
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitre() {
        return titre;
    }

    public double getTotal() {
        return total;
    }

    public void ajouterQuestion(Question question) {
        questions.add(question);

    }

    public boolean resteDesQuestions() {
        numero++;
        return (questions.size() > numero);
    }

    public void afficherQuestionSuivante() {
        System.out.println(questions.get(numero));
    }

    public void testerReponse(Scanner sc) {
        boolean b = questions.get(numero).lireReponseAuClavier(sc);
        if (b) {
            total += 1;
        }
    }

    public double resultat() {
        return ((total * 100) / questions.size());
    }

    public void reinitialiser() {
        setNumero(-1);
        setTotal(0);
    }

    public void displayQuiz() {

        Questionnaire questionnaire = new Questionnaire();
        Question question = new Question("Votre travail est-il intéressant ?");
        question.ajouterReponse("Oui");
        question.ajouterReponse("Non");
        question.setPos(1);
        questionnaire.ajouterQuestion(question);
        question = new Question("Votre travail est-il difficile ?");
        question.ajouterReponse("Oui");
        question.ajouterReponse("Non");
        question.setPos(2);
        questionnaire.ajouterQuestion(question);
        question = new Question("Au cours d'une semaine ordinaire, vous sentez-vous souvent stressé(e) au travail ?");
        question.ajouterReponse("Oui");
        question.ajouterReponse("Non");
        question.setPos(2);
        questionnaire.ajouterQuestion(question);
        question = new Question("Êtes-vous bien payé(e) pour le travail que vous fournissez ?");
        question.ajouterReponse("Oui");
        question.ajouterReponse("Non");
        question.setPos(1);
        questionnaire.ajouterQuestion(question);
        question = new Question("Votre responsable vous confie-t-il régulièrement des tâches qui vous font évoluer professionnellement ?");
        question.ajouterReponse("Oui");
        question.ajouterReponse("Non");
        question.setPos(1);
        questionnaire.ajouterQuestion(question);
        question = new Question("Quelle est la probabilité que vous recherchiez un autre emploi en dehors de l'entreprise ?");
        question.ajouterReponse("0%");
        question.ajouterReponse("50%");
        question.ajouterReponse("100%");
        question.setPos(1);
        questionnaire.ajouterQuestion(question);
        questionnaire.reinitialiser();
        System.out.println(questionnaire.getTitre());
        Scanner sc = new Scanner(System.in);
        while (questionnaire.resteDesQuestions()) {

            questionnaire.afficherQuestionSuivante();
            questionnaire.testerReponse(sc);
        }
        System.out.println();
        if (80 <= questionnaire.resultat() && questionnaire.resultat() <= 100) {
            System.out.println("Satisfaction "+Etat.eleve);
        } else if (50 <= questionnaire.resultat() && questionnaire.resultat() < 80) {
            System.out.println("Satisfaction"+Etat.moyenne);
        } else {
            System.out.println("Satisfaction"+Etat.faible);
            
        }
    }
}

    
