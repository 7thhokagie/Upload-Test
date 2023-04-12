package classVI;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your height");
        int heightS=scan.nextInt();
        System.out.println(heightS);
        if(heightS<60){
            System.out.println("Short");
        }else if(heightS>=60 && heightS<=72){
            System.out.println("Medium");
        }else{
            System.out.println("Tall");
        }

    }
}
