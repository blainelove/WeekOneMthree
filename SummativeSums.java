/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Blaine
 */
public class SummativeSums {
     public static void myMethod(int[] sums) {
         
         int answer = 0;
         for(int i = 0; i < sums.length; i++){
             answer += sums[i];
         }
         System.out.println("Array Sum: " + answer);
         
    }
    public static void main(String[] args) {
        
        int[] myNum = {10,20,30,-5};
        myMethod(myNum);
        int[] myNums = {10,25,30,-50};
        myMethod(myNums);
        
    }
       
    
}
