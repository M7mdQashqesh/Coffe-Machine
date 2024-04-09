/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makecoffee;

import javax.swing.JOptionPane;

/**
 *
 * @author M7md Qash
 */
public class WaterTank implements Method {

    private double capacity; // in ml
    private double currentLevel; // in ml

    public WaterTank() {
        this.capacity = 1000.0; // initialize capacity to 1000.0 ml
        this.currentLevel = 0.0; // initialize current level to 0
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void fillWater(double amount) throws WaterTankException {
        double spaceAvailable = capacity - currentLevel;
        if (amount <= spaceAvailable) {
            currentLevel += amount;
        } else {
            JOptionPane.showMessageDialog(null, "Not enough space in the water tank to fill. ");
        }

    }

    public void drainWater(double amount) throws WaterTankException {

        if (amount <= currentLevel) {
            currentLevel -= amount;
        } else {
            JOptionPane.showMessageDialog(null, "Not enough water in the container to make coffee.");
        }

    }

    public boolean checkwater() {
        if (currentLevel > 0) {
            return true;
        }
        return false;

    }

    @Override
    public String getInfo() {
        return "Current water level in the tank: " + currentLevel + " Milliliter\n";
    }

}
