package br.com.impacta.meuprimeiroprojeto;

import java.util.Scanner;

public class Salary {

    public static String BudgetVerification(int income, int spending){

        if(income >= spending){
            return "Spending within budget.";
        }
        return "Over budget";
    }

    public static void RunSalary() {
        Salary salary = new Salary();

        Scanner getSalary = new Scanner(System.in);
        System.out.println("Enter your salary.");
        int income = getSalary.nextInt();
        System.out.println("Enter your spendings.");
        int spending = getSalary.nextInt();

        String result;
        result = BudgetVerification(income, spending);
        System.out.println(result);
    }
}
