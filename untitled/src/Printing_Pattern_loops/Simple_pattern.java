package Printing_Pattern_loops;

import java.util.Scanner;

public class Simple_pattern {

    static void printpattern1(int a) {
        for(int i=0 ; i < a;i++){
            for (int j=0;j<a;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void printpattern2(int a){
        for (int i=0 ;i<a;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printpattern3(int a){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    static void printpattern4(int a){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void printpattern5(int a){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=a-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printpattern6(int a){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=a-i+1;j++){
                System.out.print( j);
            }
            System.out.println();
        }
    }

    static void printpattern7(int a){

        for (int i=0;i<a;i++){
//            space
            for (int j=0;j< a-i-1;j++){
                System.out.print(" ");
            }
//            star
            for (int k=0;k<2*i+1;k++){
                System.out.print("*");

            }
//            space
                for (int j=0;j< a-i-1;j++){
                    System.out.print(" ");
                }

            System.out.println();



        }
    }
    static void printpattern8(int a){

        for (int i=0;i<a;i++){
//            space
            for (int j=0;j<a-i-1;j++){
                System.out.print(" ");
            }
//            star
            for (int k=0;k<2*i+1;k++){
                System.out.print("*");

            }
//            space
            for (int j=0;j< a-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int val=sc.nextInt();

        for (int i=0;i<val;i++){

            int a=sc.nextInt();
            printpattern7(a);

        }
        sc.close();
    }
}
