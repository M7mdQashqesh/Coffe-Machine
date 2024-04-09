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
public class Beans implements Method {

    private double capacity; // in grams
    private double currentLevel; // in grams
    private double ArabicaCoffee;
    private double RobustaCoffee;

    public Beans() {
        this.capacity = 1000.0; // initialize Beans to 1000.0 Gram
        this.currentLevel = 0.0; // initialize current level to 0
        this.ArabicaCoffee = 0.0;
        this.RobustaCoffee = 0.0;
    }

    public double getArabicaCoffee() {
        return ArabicaCoffee;
    }

    public void setArabicaCoffee(double ArabicaCoffee) {
        this.ArabicaCoffee = ArabicaCoffee;
    }

    public double getRobustaCoffee() {
        return RobustaCoffee;
    }

    public void setRobustaCoffee(double RobustaCoffee) {
        this.RobustaCoffee = RobustaCoffee;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void fillBeans(double amount) throws BeansException {
        double spaceAvailable = capacity - currentLevel;
        if (amount <= spaceAvailable) {
            currentLevel += amount;
        } else {
            JOptionPane.showMessageDialog(null, "Not enough space in the beans container to fill.");
        }
    }

    public void useBeans(double Amount) throws BeansException {
        double beansRequired = Amount;
        if (beansRequired <= currentLevel) {
            currentLevel -= beansRequired;
        } else {
            JOptionPane.showMessageDialog(null, "Not enough beans to make coffee.");
        }
    }

    public boolean checkBeans() {
        if (currentLevel > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String getInfo() {
        return "Current beans level in the container: " + getCurrentLevel() + " grams \n";
    }
}
