package br.com.impacta.meuprimeiroprojeto;

import java.util.Scanner;

public class Astrazenica {

    public String WhichVaccine(int age){

        if(age <= 45 || age >= 50){
            return "Astrazenica";
        }

        return "Pfizer or Moderna";
    }

    public static void RunAstrazenica() {
        Scanner readerX = new Scanner(System.in);

        Astrazenica astrazenica = new Astrazenica();

        System.out.println("What is the patient age?");

        int age = readerX.nextInt();

        String result;
        result = astrazenica.WhichVaccine(age);
        System.out.println(result);

        readerX.close();
    }
}
