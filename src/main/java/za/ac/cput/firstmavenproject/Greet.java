/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.firstmavenproject;

import java.util.Scanner;

/**
 *
 * @author nzwakie
 */
public class Greet {
        public static void main(String[] args){
        Scanner userName = new Scanner(System.in);
        
        String name;
        
        System.out.println("Please enter your name: ");
        name = userName.next();
   
        System.out.println("Hello, " + name);
    
    }
}
