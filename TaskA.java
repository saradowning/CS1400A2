// Sara Downing
// CS 1400
// Assignment 2
// 9/20/2024
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args){
        double totalShortbread = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many pieces of shortbread do you want to make?");
        totalShortbread = input.nextDouble();
        
        // Variables are set to the number of grams/oz of each ingredient that makes the amount of shortbread the user wants
        double butterG = (125.0 / 24) * totalShortbread;
        double butterOz = (4.0 / 24) * totalShortbread;
        double sugarG = (55.0 / 24) * totalShortbread;
        double sugarOz = (2.0 / 24) * totalShortbread;
        double flourG = (180.0 / 24) * totalShortbread;
        double flourOz = (6.0 / 24) * totalShortbread;

        System.out.println("To make " + totalShortbread + " pieces of shortbread, you need:");
        System.out.println(butterG + "g/" + butterOz + "oz of butter");
        System.out.println(sugarG + "g/" + sugarOz + "oz of sugar");
        System.out.println(flourG + "g/" + flourOz + "oz of flour");

        input.close();
    }
}