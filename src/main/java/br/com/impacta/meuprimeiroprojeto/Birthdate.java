package br.com.impacta.meuprimeiroprojeto;

import java.util.Scanner;

public class Birthdate {

    public boolean CheckDate(int day, int month, int year){

        return day >= 1 && day <= 31 && month >= 1 && month <= 12 && year <= 2021;
    }

    public static void RunBirthdate() {
        Birthdate birthdate = new Birthdate();

        Scanner ChooseProgram = new Scanner(System.in);
        System.out.println("Enter the day of your Birthdate.");
        int day = ChooseProgram.nextInt();
        System.out.println("Enter the month of your Birthdate.");
        int month = ChooseProgram.nextInt();
        System.out.println("Enter the year of your Birthdate.");
        int year = ChooseProgram.nextInt();

        boolean CheckBirthDate;
        CheckBirthDate = birthdate.CheckDate(day, month, year);
        System.out.println("Birthdate validation is: "+ CheckBirthDate);
    }

}
