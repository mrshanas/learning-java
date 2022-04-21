package LabSession3;
import java.util.Scanner;

public class Program {
    /* 
        Qn 1
        Java program to calculate simple interest
        P=10000, R=5, T=5
    */
    
    public static void main(String[] args) {
        int principal = 10000, rate = 5, time = 5, interest;
        // interest = (principal * rate * time) / 100;
        // System.out.println(interest);
    

    /*
        Qn 2
        Takes in principle, rate and time and computes interest
        if interest > 10 print UNACCEPTABLE RATE
        else prints the simple interest
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter principal");
        principal = input.nextInt();
        System.out.println("Please enter rate");
        rate = input.nextInt();
        System.out.println("Please enter time");
        time = input.nextInt();
        input.close();

        if(rate > 10){
            System.out.println("UNACCEPTABLE RATE");
        }else{
            interest = (principal * rate * time) / 100;
            System.out.println(interest);
        }
    }
}
