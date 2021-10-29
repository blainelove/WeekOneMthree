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
        
        int[] myNum = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        myMethod(myNum);
        int[] myNum2 = { 999, -60, -77, 14, 160, 301 };
        myMethod(myNum2);
        int[] myNum3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 } ;
        myMethod(myNum3);
    }   
        
       
    
}
