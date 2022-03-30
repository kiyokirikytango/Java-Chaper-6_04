/*
Chapter 6 Programming excercise 04
Riky Hernandez
9/13/21
Description: User enters digits and the program returns them in reverse order
`;-.          ___,
  `.`\_...._/`.-"`
    \        /      ,
    /()   () \    .' `-._
   |)  .    ()\  /   _.'
   \  -'-     ,; '. <
    ;.__     ,;|   > \
   / ,    / ,  |.-'.-'
  (_/    (_/ ,;|.<`
    \    ,     ;-`
     >   \    /
    (_,-'`> .'
          (_,'
 */
package chapter6_04;

import java.util.Scanner;


public class Chapter6_04 {

    
   public static void reverse (int num){
       while (num != 0) {                       //method: grabs the number and % by 10 , then it goes to the next number from left to right to theres no numbers left
           int remainder = num % 10;
           System.out.print(remainder);
           num = num / 10;
       }
   }
    
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        
        System.out.println("Enter an interger: ");      //prints the numbers backwards using the method above
        int num = input.nextInt();
        reverse(num);
        
    }
    
}
