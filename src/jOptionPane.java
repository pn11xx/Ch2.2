
import java.util.Scanner;
import javax.swing.JOptionPane;import javax.swing.*;

/**
 * @author pmn2644
 * Author: Phung Ngo
 * Date: 09/13/17
 * Purpose: Use Scanner to read input in primitive data types and output the results to JOptionPane dialog
 */

public class jOptionPane {
    /**
     *
     * @param args main method for program
     */
    public static void main(String [] args){
        /**
         * Declaring value for variable byte and scanner keyboard1
         * Print out direction for user's input
         * Set user's input equals to byte variable created earlier
         * Output user's value using JOptionPane dialog
         * repeat steps for each primitive data types
         */
        Byte byteValue;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Enter a byte value (number between -128 and 127)");
        byteValue = keyboard1.nextByte();
        JOptionPane.showMessageDialog(null, "You have just entered " + byteValue);



        Short shortValue;
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Enter a short value (number between -32,7688 and 32,767)");
        shortValue = keyboard2.nextShort();
        JOptionPane.showMessageDialog(null, "You have just entered " + shortValue);

        Integer intValue;
        Scanner keyboard3 = new Scanner(System.in);
        System.out.println("Enter an integer value (number between -2147483648 and 2147483647)");
        intValue = keyboard3.nextInt();
        JOptionPane.showMessageDialog(null, "You have just entered " + intValue);

        Long longValue;
        Scanner keyboard4 = new Scanner(System.in);
        System.out.println("Enter a long value (number between -9.22337204E18 and 9.223372037E18)");
        longValue = keyboard4.nextLong();
        JOptionPane.showMessageDialog(null, "You have just entered " + longValue);

        Float floatValue;
        Scanner keyboard5 = new Scanner(System.in);
        System.out.println("Enter an float value");
        floatValue = keyboard5.nextFloat();
        JOptionPane.showMessageDialog(null, "You have just entered " + floatValue);

        Double doubleValue;
        Scanner keyboard6 = new Scanner(System.in);
        System.out.println("Enter a double value");
        doubleValue = keyboard6.nextDouble();
        JOptionPane.showMessageDialog(null, "You have just entered " + doubleValue);

        String charValue;
        Scanner keyboard7 = new Scanner(System.in);
        System.out.println("Enter a character (between a and z)");
        charValue = keyboard7.nextLine();
        JOptionPane.showMessageDialog(null, "You have just entered " + charValue);

        /**
         * Boolean value can only be true or false
         * Therefore user can only input true or false
         */
        Boolean booleanValue;
        Scanner keyboard8 = new Scanner(System.in);
        System.out.println("Enter a boolean value (true or false)");
        booleanValue = keyboard7.nextBoolean();
        JOptionPane.showMessageDialog(null, "You have just entered " + booleanValue);
    }

}