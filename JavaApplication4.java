/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author ADMIN-FUE
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int secret = generatsecret();
     int[] guesses = new int[5]; 
     int attempts = 0;
     boolean found = false;
     for (int i = 0; i <= 5; i++){
     System.out.println("Enter your guess: ");
     guesses[i] = input.nextInt();
     
     attempts++;
     
     String result = checkGuess(guesses[i] , secret);
     
     System.out.println(result);
     
     if(result.equals("Correct")){
     found = true;
     System.out.println("Correct in" + attempts + "attempts");
     break;
        }
     }
     if(found == false){
         System.out.println("You failed the attempt the secret is: " + secret);
     }
    input.close();
    }
    public static int generatsecret(){
        return (int) (Math.random() * 50)+1;
    }
    public static String checkGuess(int guess , int secret){
    if (guess == secret){
    return "Correct";
    }
    else if (guess < secret){
    return "Higher";
    }
    else{
    return "Lower";
    }
    }
}
