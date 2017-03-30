/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StoreX;

import java.util.*;

/**
 *
 * @author Boneless
 */
public class PrimeCheck {
    
    public static void main(String[] args) {
        String x="0";
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Prime No Check App");
        PrimeLoads kev=new PrimeLoads();
        do{
         System.out.println("1.Select 1 to check if a number is prime\n2.Select 2 to check all prime numbers in a range\n3.To exit");
            x=input.nextLine();
            
            if(x.equals("1")){
            kev.justOne();
            }
            else if(x.equals("2")){
            kev.range();
            }
        
           else if(x.equals("3")){
               System.exit(0);
           }else{
           System.out.println("Wrong Input! Choose 1 or 2.");
           }
           
        }while(true);
        }
  }  
