/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amamune
 */
import java.util.ArrayList;
import java.util.Random;

public class shuffler {
    public static void main( String[] args) { 
        ArrayList<Object> list1 = new ArrayList<Object>();
        Random random = new Random(); 
        int start_value ; 
 
        for (start_value = 0; start_value < 10  ; start_value++ )  { 
            int n = start_value ; 
            list1.add(n) ; 
            System.out.println("Your value is " + n +"! And your list is " + list1); 
 
        }
         
        for (int i = 0 ; i < 10 ; i++) { 
            int num = (int) list1.get(i) ; 
            System.out.println(num); 
        }
 
 
        for (int j = 0 ; j < 10 ; j++) { 
            int ran_num = random.nextInt(list1.size()) ;
            int num2 = (int) list1.remove(ran_num) ; 
            System.out.println("You've removed " + num2+"." + list1) ; 
             
        } 
    }
}