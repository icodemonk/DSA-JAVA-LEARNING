package Printing_Pattern_loops;

import java.util.Scanner;

public class Simple_pattern {

    static void printpattern(int a) {
        for(int i=0 ; i < a;i++){
            for (int j=0;j<a;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int val=sc.nextInt();

        for (int i=0;i<val;i++){

            int a=sc.nextInt();
            printpattern(a);

        }
        sc.close();
    }
}
