package br.com.impacta.meuprimeiroprojeto;

import java.util.Scanner;

public class NameReader {
    public static void RunReader() {
        System.out.println("What is your name?");
        Scanner reader = new Scanner(System.in);

        String name = reader.nextLine();

        System.out.println("Yuri".equals(name));

        reader.close();
    }
}
