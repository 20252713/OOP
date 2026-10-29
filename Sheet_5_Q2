/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication37;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] students = new String[3][2];
        int countA = 0;
        int countPrefix = 0;

        System.out.println("Enter name and grade for 3 students:");

        for (int i = 0; i < 3; i++) {
            students[i][0] = input.next();
            students[i][1] = input.next();
        }

        // 1. Print each student as name: grade using concat
        for (int i = 0; i < 3; i++) {
            System.out.println(
                students[i][0].concat(": ").concat(students[i][1])
            );
        }

        // 2. Count students with grade A (case-insensitive)
        for (int i = 0; i < 3; i++) {
            if (students[i][1].equalsIgnoreCase("A")) {
                countA++;
            }
        }

        System.out.println("Students with grade A: " + countA);

        // 3. Read a prefix and count names starting with it
        System.out.print("Enter first letter: ");
        String prefix = input.next();

        for (int i = 0; i < 3; i++) {
            if (students[i][0].startsWith(prefix)) {
                countPrefix++;
            }
        }

        System.out.println("Names starting with " + prefix + ": " + countPrefix);

        input.close();
    }
}
