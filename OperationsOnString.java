/*
 * Q1/ Write a Java program to check whether a string
 *  contains only a certain set of characters (in this case a-z, A-Z and 0-9)
 * Q2/Write a Java program that matches a string that has a p followed by zero or more q's.
 * Q3/Write a Java program to remove leading zeros from a given IP address
 */
package operationsonstring;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @Nadaِ
 */
public class OperationsOnString {
 public static void checkNoSymbols(String s){
   
    if(s.matches("[A-Za-z0-9]+")){
        System.out.print("Correct ! ,valid string !");
    } else {
      System.out.print("Ooops wrong input !");
    }
     
 }
 
 public static void checkpq(String s){
   
    if(s.matches("[pq*]+")){
        System.out.print("Correct ! ,valid string !");
    } else {
      System.out.print("Ooops wrong input !");
    }
     
 }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi! Lets Play Matches Game \nPress :\n1 for no symbols "
              + "\n2 for pq's\n3 to remove Leading 0 from IP Address  :");
      int gameno = in.nextInt();
      
      while(gameno > 3){
        System.out.println("Please Enter a Number from 1 To 3 !");
        gameno = in.nextInt();
      }
      
      System.out.println("Ok ,Now Enter Your Input: ");
      String string = in.next();
     switch(gameno){
         case 1:
            checkNoSymbols(string);
            break;
         case 2:
            checkpq(string);
            break;
         case 3:
           System.out.println(string.replaceAll("(?<=^|\\.)0+(?!\\.|$)",""));
             break;
         default:
           System.out.println("Try Again");

           
     }
     
     
    
     
                 
      
    }
    
}
