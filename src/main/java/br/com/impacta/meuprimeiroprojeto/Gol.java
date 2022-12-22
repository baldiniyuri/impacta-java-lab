package br.com.impacta.meuprimeiroprojeto;

import java.util.Scanner;

public class Gol {

    public String CheckGoals(int teamAPunctuation, int teamBPunctuation){

        if(teamAPunctuation == teamBPunctuation){
            return "A tie.";
        }
        if(teamAPunctuation > teamBPunctuation){
            return "Team A is the winner.";
        }
        return "Team B is the winner.";
    }

    public static void RunGol() {
        Gol gol = new Gol();

        Scanner match = new Scanner(System.in);
        System.out.println("Enter Team A punctuation.");
        int teamA = match.nextInt();
        System.out.println("Enter Team B punctuation.");
        int teamB = match.nextInt();

        String result;

        result = gol.CheckGoals(teamA, teamB);
        System.out.println(result);


    }
    
}
