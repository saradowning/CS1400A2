// Sara Downing
// CS 1400
// Assignment 2
// 9/20/2024
import javax.swing.JOptionPane;

public class TaskA {
    public static void main(String[] args){
        double totalShortbread = 0.0;
        String input = JOptionPane.showInputDialog(null, "How many pieces of shortbread do you want to make?");
        if(input != null){
            totalShortbread = Double.parseDouble(input);
        }
        
        // Variables are set to the number of grams/oz of each ingredient that makes the amount of shortbread the user wants
        double butterG = (125.0 / 24) * totalShortbread;
        double butterOz = (4.0 / 24) * totalShortbread;
        double sugarG = (55.0 / 24) * totalShortbread;
        double sugarOz = (2.0 / 24) * totalShortbread;
        double flourG = (180.0 / 24) * totalShortbread;
        double flourOz = (6.0 / 24) * totalShortbread;

        String measurementsMessage = "To make " + totalShortbread + " pieces of shortbread, you need:\n" + 
                                      butterG + "g/" + butterOz + "oz of butter\n" + 
                                      sugarG + "g/" + sugarOz + "oz of sugar\n" + 
                                      flourG + "g/" + flourOz + "oz of flour";
        JOptionPane.showMessageDialog(null, measurementsMessage);
    }
}