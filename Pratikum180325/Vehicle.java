/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum180325;

/**
 *
 * @author habibi
 */
public class Vehicle {
    public double load;
    public double maxLoad;
    
    public Vehicle(double maxload){
        this.maxLoad = maxLoad;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
}
