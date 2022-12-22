package br.com.impacta.meuprimeiroprojeto;

import java.util.Scanner;

public class Operators {

    public String GreaterLesserOrEqual(int x, int y){
        if (x == y){
            return "The number "+x+" and "+y+" are equal";
        }
        if ( x > y){
            return "Number: "+x+" is greater than y;";
        }
        return "Number: "+y+" is greater than x;";
    }


    public String EvenOrOdd(int x){
        if ( (x % 2) == 0){
            return "Even";
        }
        return "Odd";
    }
    public boolean Equal (int x, int y){
        return x == y;
    }

    public boolean NotEqual (int x, int y){
        return x != y;
    }

    public boolean And (boolean conditionA, boolean conditionB){
        return conditionA && conditionB;
    }

    public boolean Or (boolean conditionA, boolean conditionB){
        return conditionA || conditionB;
    }

    public boolean Not (boolean conditionA, boolean conditionB){
        if (conditionA != conditionB){
            return false;
        }
        return true;
    }

    public static void RunOperatorProgram() {
        Operators operators = new Operators();

        System.out.println("What is the value of x?");
        Scanner readerX = new Scanner(System.in);
        int xValue = readerX.nextInt();
        System.out.println("What is the value of y?");
        Scanner readerFactor = new Scanner(System.in);
        int yValue = readerFactor.nextInt();

        String resultGreaterLesserOrEqual;

        resultGreaterLesserOrEqual = operators.GreaterLesserOrEqual(xValue, yValue);
        System.out.println(resultGreaterLesserOrEqual);

        String resultOddOrEven;
        resultOddOrEven = operators.EvenOrOdd(xValue);
        System.out.println("The number is: " +resultOddOrEven);


        boolean FirstOperation;
        boolean SecondOperation;

        FirstOperation = operators.Equal(xValue, yValue);
        System.out.println("The x and y are equals? "+FirstOperation);

        SecondOperation = operators.NotEqual(xValue, yValue);
        System.out.println("The x and y are not equals?"+ SecondOperation);

        boolean andOperation;

        andOperation = operators.And(FirstOperation, SecondOperation);
        System.out.println("And operator is: " + andOperation);

        boolean orOperation;
        orOperation = operators.Or(FirstOperation, SecondOperation);
        System.out.println("Or operator is: " + orOperation);

        boolean notOperation;
        notOperation = operators.Not(FirstOperation, SecondOperation);
        System.out.println("Not operator is: " + notOperation);
    }

}