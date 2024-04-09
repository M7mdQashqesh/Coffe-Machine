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
public class Trash implements Method {

    private double capacity; // in grams
    private double currentLevel; // in grams

    public Trash() {
        this.capacity = 600.0;
        this.currentLevel = 0.0; // initialize current level to 0
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void discardWaste(double amount) throws TrashException {
        double spaceAvailable = capacity - currentLevel;
        if (amount <= spaceAvailable) {
            currentLevel += amount;
        } else {
            JOptionPane.showMessageDialog(null, "Not enough space in the drip tray .");
        }
    }

    public void cleanTrash() {
        currentLevel = 0.0;
    }

    public boolean checktrach() {
        if (currentLevel < 600) {
            return true;
        }
        return false;

    }

    @Override
    public String getInfo() {
        return "Current level of waste in the waste tray: " + currentLevel + " grams\n";
    }
}
