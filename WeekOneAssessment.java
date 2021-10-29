/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Blaine
 */

import java.util.Random;
import java.util.Scanner;

public class WeekOneAssessment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int choice;
        int rounds;
        int count;
        int youWon;
        int youLost;
        int youTie;
        boolean playAgain = true;
        
        
        Scanner numbOfRounds = new Scanner(System.in);
        System.out.println("How many rounds ");
        rounds = numbOfRounds.nextInt();
         
        String[] pickName = {"Rock", "Paper", "Scissors"};
        
        
        if(rounds <1 || rounds>10){
            System.out.println("can only play between 1 -10 rounds");
        };
        youTie = 0;
        youLost = 0;
        youWon = 0;
        do{
            
            for(count = 0; count < rounds; count++){
           
                System.out.println("1. Rock, 2. Paper, 3. Scissor: ");
                Scanner userChoice = new Scanner(System.in);
                choice = userChoice.nextInt();
                Random compRockPaper = new Random();
                int rockPaperScissors = compRockPaper.nextInt(3) + 1;
                if(choice == rockPaperScissors){
                    System.out.println("Tie");
                    youTie++;
                }else{
                    if(choice == 1){
                        if(rockPaperScissors == 2){
                            System.out.println("You Lose");
                            youLost++;
                        }else{
                            System.out.println("You Win");
                            youWon++;
                        }
                    }
                    if(choice == 2){
                        if(rockPaperScissors == 3){
                            System.out.println("You Lose");
                            youLost++;
                        }else{
                            System.out.println("You Win");
                            youWon++;
                        }
                    }
                    if(choice == 3){
                        if(rockPaperScissors == 1){
                            System.out.println("You Lose");
                            youLost++;
                        }else{
                            System.out.println("You Win");
                            youWon++;
                        }
                    }

                }
            }
        System.out.println("You won " + youWon + " Times");
        System.out.println("You lost " + youLost + " Times");
        System.out.println("You tied " + youTie + " Times");
        System.out.println("Play again? Write true if you do and false if not");
        Scanner Again = new Scanner(System.in);
        playAgain = Again.nextBoolean();
        }while(playAgain);
        System.out.println("over");
          
        
            
       
        
        
         
          
    }
}
