package classVII;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Type in a whole number greater than 1");
        int number=scanner.nextInt();

        int counter=1;
        while(counter<=number){
            System.out.print(counter+" ");
            counter++;
        }

    }
}
