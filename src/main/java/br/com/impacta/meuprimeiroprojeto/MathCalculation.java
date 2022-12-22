package br.com.impacta.meuprimeiroprojeto;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class MathCalculation {

    public void playMath(String Name, int x, int multiFactor){
        x = x * multiFactor;

        System.out.println("x is " + x + " to "+Name+  "'s calculation!!!");
    }

    public static void RunMathCalculation() {
        System.out.println("What is your name?");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println("What is the value of x?");
        Scanner readerX = new Scanner(System.in);
        int xValue = readerX.nextInt();
        System.out.println("What is the value of Multiplication Factor?");
        Scanner readerFactor = new Scanner(System.in);
        int multiFactor = readerFactor.nextInt();

        MathCalculation mathCalculation = new MathCalculation();
        mathCalculation.playMath(name, xValue, multiFactor);
    }
}
