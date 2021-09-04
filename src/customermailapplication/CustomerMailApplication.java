/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private static Customer customer;

    public String generateMail() {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        CustomerMailApplication app = new CustomerMailApplication();
        Scanner inp = new Scanner(System.in);
        System.out.println("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int typeNumber = inp.nextInt();
        String type = "";
        switch(typeNumber){
                case 1:
                    type = "Regular";
                    break;
                case 2:
                    type = "Mountain";
                    break;
                case 3:
                    type = "Delinquent";
                    break;
        }
        customer = CustomerFactory.createCustomer(type);
        System.out.println(app.generateMail());        
    }
}
