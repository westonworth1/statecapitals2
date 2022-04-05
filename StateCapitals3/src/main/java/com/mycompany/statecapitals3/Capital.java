/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statecapitals3;

/**
 *
 * @author westo
 */
public class Capital {
    private String state;
    private String name;
    private int population;
    private float sqMiles;

    // Getters
    public String getState() {
        return state;
    }
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public float getSqMiles() {
        return sqMiles;
    }

    // Setters
    public void setState(String state) {
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSqMiles(float sqMiles) {
        this.sqMiles = sqMiles;
    }
    
    
}
