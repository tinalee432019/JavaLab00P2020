/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0051;

/**
 *
 * @author Quynh Tran Ly
 */
public class J1SP0051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            Manager.menu();
            Calculator calculator = new Calculator();
            int choice = Validation.checkInputIntLimit(1, 3);
            switch (choice) {
                case 1:
                    calculator.normalCalculator();
                    break;
                case 2:
                    calculator.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }
    
}
