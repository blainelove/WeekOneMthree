/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Blaine
 */
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        System.out.println("What is your dog's name?");
        String dog_name;
        int dog_per = 100;
        int dog_numb;
        Scanner nameOfDog = new Scanner(System.in);
        
        dog_name = nameOfDog.next();
        System.out.println("Well then, I have this highly reliable report on " + dog_name +"'s prestigious background right here.");
       
        System.out.println(dog_name + "% is:");
        
        Random dogRan = new Random();
        int dog1 = dogRan.nextInt(dog_per) + 1;
        dog_per = dog_per - dog1;
        
        System.out.println(dog1 + "% St. Bernard");
        
        
        int dog2 = dogRan.nextInt(dog_per) + 1;
        dog_per = dog_per - dog2;
        
        System.out.println(dog2 + "% Chihuahua");
        
        int dog3 = dogRan.nextInt(dog_per) + 1;
         dog_per = dog_per - dog3;
        System.out.println(dog3 + "% Dramatic RedNosed Asian Pug");
        
        
        int dog4 = dogRan.nextInt(dog_per) + 1;
        dog_per = dog_per - dog4;
        
        System.out.println(dog4 + "% Common Cur");
        
       
        
        System.out.println(dog_per + "% King Doberman");
        
      
        
        System.out.println("Wow, that's QUITE the dog! ");
        
    }
    
}
