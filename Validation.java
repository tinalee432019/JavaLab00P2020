/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0051;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {
    private final static Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + "," + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static String checkInputOperator(){
        while (true) {
            String result=in.nextLine().trim();
            if(result.isEmpty()){
                System.err.println("Not empty");
            }else if(result.equalsIgnoreCase("+")||result.equalsIgnoreCase("-")
                    ||result.equalsIgnoreCase("*")||result.equalsIgnoreCase("/")
                    ||result.equalsIgnoreCase("^")||result.equalsIgnoreCase("=")){
                return result;
            }else{
                System.err.println("Please input(+,-,*,/,^,=)");
            }
            System.out.print("Enter again: ");
        }
    }
}
