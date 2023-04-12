package HW;

import java.util.Scanner;

public class LoaningSpecialist {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How much is the amount you need loaned?");
        int moneyLoan=scan.nextInt();
        if(moneyLoan<200000){
            System.out.println("You are eligible for a loan");
        }else{
            System.out.println("You are ineligible for a loan");
        }

    }
}
