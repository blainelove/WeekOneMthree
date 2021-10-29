/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Blaine
 */
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        int age;
        int hr = 220;
        int max;
        double high;
        int half;
        
        System.out.println("What is your age?");
        Scanner userChoice = new Scanner(System.in);
        age = userChoice.nextInt();
        max = hr - age;
        System.out.println("Your maximum heart rate should be "+ max + " beats per minute");
        half = max /2;
        high = max * .85;
        System.out.println("Your target HR Zone is "+ half +" - " + high + " beats per minute");
        
        
    }
    
}
