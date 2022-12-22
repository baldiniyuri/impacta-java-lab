package br.com.impacta.meuprimeiroprojeto;

import java.util.Scanner;

public class DivisibleBy2 {

    public boolean CheckNumber(int number){
        return number % 2 == 0;
    }

    public static void RunDivisibleBy2() {
        DivisibleBy2 divisibleBy2 = new DivisibleBy2();

        Scanner NumReader = new Scanner(System.in);
        System.out.println("Enter a number.");
        int number = NumReader.nextInt();

        boolean result;

        result = divisibleBy2.CheckNumber(number);
        System.out.println("Is your number divisible by 2? " + result);

        NumReader.close();
    }
}
