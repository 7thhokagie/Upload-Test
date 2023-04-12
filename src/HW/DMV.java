package HW;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if(age<18){
            System.out.println("You can't drive and you'll need a permit");
        }else{
            System.out.println("You can have your driver license");
        }

    }
}
