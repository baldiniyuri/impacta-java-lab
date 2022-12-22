package br.com.impacta.meuprimeiroprojeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ChooseProgram = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("* Chose a number for the following programs. *");
        System.out.println("*           1 for Operators.                 *");
        System.out.println("*           2 for Name Reader.               *");
        System.out.println("*           3 for Astrazenica.               *");
        System.out.println("*           4 for Math Calculation.          *");
        System.out.println("*           5 for Math Birthdate.            *");
        System.out.println("*           6 for Salary.                    *");
        System.out.println("*           7 for Divisible by 2.            *");
        System.out.println("*           8 for Gol.                       *");
        System.out.println("*           9 for Water Reservoir.           *");
        System.out.println("*           10 for Repetition.               *");
        System.out.println("*           0 for terminate program.         *");
        System.out.println("**********************************************");
        int ProgramNumber = ChooseProgram.nextInt();


        switch (ProgramNumber) {
            case 0:
                System.exit(1);
            case 1:
                Operators.RunOperatorProgram();
                break;
            case 2:
                NameReader.RunReader();
                break;
            case 3:
                Astrazenica.RunAstrazenica();
                break;
            case 4:
                MathCalculation.RunMathCalculation();
                break;
            case 5:
                Birthdate.RunBirthdate();
                break;
            case 6:
                Salary.RunSalary();
                break;
            case 7:
                DivisibleBy2.RunDivisibleBy2();
                break;
            case 8:
                Gol.RunGol();
                break;
            case 9:
                WaterReservoir.RunWaterReservoir();
                break;
            case 10:
                Repetition.RunRepetition();
                break;
            default:
                System.out.println("Invalid program number, select a valid one, ending program.");
                System.exit(1);
        }
    }
}
