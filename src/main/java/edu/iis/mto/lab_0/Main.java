package edu.iis.mto.lab_0;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TailsGenerator t = new TailsGenerator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Give string:");
        String value = scan.nextLine();
        List<String> result = t.tails(value);

        for(String s : result){
            System.out.println(s);
        }
        System.out.println("Size of res: " + result.size());
    }
}
