/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication48;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/* Scanner input = new Scanner(System.in);        
 System.out.print("Enter number to check if divisible by 3 or 5 or both: ");
 int number = input.nextInt();
 if (number % 3 == 0 && number % 5 == 0) {
 System.out.println("Divisible by 3 and 5");
 } else if (number % 3 == 0) {
 System.out.println("Divisible by 3");
 } else if (number % 5 == 0) {
 System.out.println("Divisible by 5");
 } else {
 System.out.println("Not Divisible by 3 or 5");
 }*/
 Scanner input = new Scanner(System.in);
 System.out.print("Enter month number (1-12): ");
 int month = input.nextInt();
 switch (month) {
 case 12:
 case 1:
 case 2:
 System.out.println("Winter");
 break;
 case 3:
 case 4 :   
 case 5:       
 System.out.println("Spring");
 break;       
   case 6:
 case   7:   
 case   8:      
  System.out.println("Summer");
 break;
  case  9:
 case  10:   
 case  11: 
   System.out.println("Fall");   
  break;    
     default:
 System.out.println("Invalid month");
    }
    }
}
