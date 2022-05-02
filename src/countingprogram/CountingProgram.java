/*
 * Mr. Kaune
   May 2, 2022
   This program counts.
 */
package countingprogram;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CountingProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  1... Count from 0 to 10 by 1
            2... Count from 100 to 0 by 10
            3... Count from 50 to 500 by 50
            4... Count from 6000 to 1000 by 1000
            */
        
        Scanner input = new Scanner(System.in);
        int selection = 0;
        do{
            System.out.println("Please enter a choice from 1 to 6 (6 to exit)");
            
            System.out.println("1... Count from 0 to 10 by 1");
            System.out.println("2... Count from 100 to 0 by 10");
            System.out.println("3... Count from 50 to 500 by 50");
            System.out.println("4... Count from 6000 to 1000 by 1000");
            System.out.println("5... Count from some number to another number (needs to be higher) by one");
            selection = input.nextInt();
            if (selection==1){
                for(int i=0;i<=10;i++){
                    System.out.println(i);
                }
            }
            else if (selection == 2){
                for(int i=100;i>=0;i-=10){
                    System.out.println(i);
                }
            }
            else if (selection == 3){
                for(int i=50;i<=500;i+=50){
                    System.out.println(i);
                }
            }
            else if (selection == 4){
                for(int i=6000;i>0;i-=1000){
                    System.out.println(i);
                }
            }
            else if (selection == 5){
                System.out.println("Enter first number");
                int first = input.nextInt();
                System.out.println("Enter second number");
                int second = input.nextInt();
                System.out.println(first);
                System.out.println(second);
                for(int i=first;i<=second;i++){
                    System.out.println(i);
                }
            }
        }while(selection!=6);
    
    }
}
