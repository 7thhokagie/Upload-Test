package HW;

public class PositiveOrNegative {
    public static void main(String[] args) {

        int digit=-10;
        if(digit>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }

        int number=10;
        int remainder=number%2;
        if(remainder==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

    }
}
