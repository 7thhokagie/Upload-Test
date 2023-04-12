package HW;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CityWeather {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What city do you live in?");
        String cityName=scanner.nextLine();
        System.out.println("What's the tempature in your city?");
        double cityTemp=scanner.nextDouble();
        System.out.println("Your tempature into celsius is "+(cityTemp-32)/1.8+" degrees");

    }
}
