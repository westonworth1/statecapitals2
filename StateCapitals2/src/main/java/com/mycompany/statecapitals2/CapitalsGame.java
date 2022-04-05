/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statecapitals2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author westo
 */
public class CapitalsGame {
    public static void main(String[] args) throws Exception {
        // declarations
        String answer = "";
        
        Random rando = new Random();
        
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
        sc.useDelimiter("::|\\n");
        
        Map<String, String> stateCapitals = new HashMap<>();
        
        // Reads file into Map
        while (sc.hasNextLine())
        {
            stateCapitals.put(sc.next(), sc.next());
        }
        
        // List of keys to iterate through for printing (ArrayList is so that a random int can pull a random key later)
        List<String> keys = new ArrayList<String>(stateCapitals.keySet());
        for (String k : keys)
        {
            System.out.println("The capital of " + k + " is " + stateCapitals.get(k));
        }
        
        // Generate a random key/state and prompt the user for its capital
        String randState = keys.get(rando.nextInt(keys.size()));
        System.out.println("What's the capital of " + randState + "?");
        answer = input.nextLine();
        
        // Let the user know if they're right
        if(answer.equals(stateCapitals.get(randState)))
        {
            System.out.println("That's right!");
        }
        else 
        {
            System.out.println("Actually, it's : " + stateCapitals.get(randState));
        }
        
    }
}
