/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statecapitals3;

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
public class StateCapitalsApp {
    public static void main(String[] args)throws Exception {
        // declarations
        String answer = "";
        
        Random rando = new Random();
        
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(new BufferedReader(new FileReader("statecapitals3.txt")));
        sc.useDelimiter("::|\\n");
        
        Map<String, Capital> stateCapitals = new HashMap<>();
        
        int recordCounter = 0;
        // Reads file into Map
        while (sc.hasNextLine())
        {
            String currentLine = sc.nextLine();
            String[] stringArray = currentLine.split("::");
            
            Capital capital = new Capital();
            
            capital.setName(stringArray[1]);
            capital.setPopulation(Integer.parseInt(stringArray[2]));
            capital.setSqMiles(Float.parseFloat(stringArray[3]));
            stateCapitals.put(stringArray[0], capital);
            
            recordCounter++;
        }
        System.out.println(recordCounter + "/50 records added.");
        
        
        List<String> keys = new ArrayList<String>(stateCapitals.keySet());
        for (String k : keys)
        {
            System.out.println("State: " + k + " \nCapital: " + stateCapitals.get(k).getName() + " \nPopulation: " + stateCapitals.get(k).getPopulation() + 
                    " \nArea: " + stateCapitals.get(k).getSqMiles()+ " square miles");
        }
        
        System.out.println("What's the minimum population of the capitals you're looking for? ");
        int minPop = Integer.parseInt(input.nextLine());
        for (String k : keys)
        {
            if (stateCapitals.get(k).getPopulation() > minPop)
            {
                System.out.println("State: " + k + " \nCapital: " + stateCapitals.get(k).getName() + " \nPopulation: " + stateCapitals.get(k).getPopulation() + 
                    " \nArea: " + stateCapitals.get(k).getSqMiles()+ " square miles");
            }
        }
        System.out.println("What's the maximum area of the capitals you're looking for? ");
        float maxArea = Float.parseFloat(input.nextLine());
        for (String k : keys)
        {
            if (stateCapitals.get(k).getPopulation() > maxArea)
            {
                System.out.println("State: " + k + " \nCapital: " + stateCapitals.get(k).getName() + " \nPopulation: " + stateCapitals.get(k).getPopulation() + 
                    " \nArea: " + stateCapitals.get(k).getSqMiles()+ " square miles");
            }
        }
        
    }
}
