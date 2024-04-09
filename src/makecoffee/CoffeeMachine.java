/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makecoffee;

import java.awt.TextArea;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author M7md Qash
 */
public class CoffeeMachine {

    private Beans beans;
    private WaterTank water;
    private Grinder grinder;
    private Trash trash;
    private boolean Ready;

    public CoffeeMachine(Beans beans, WaterTank waterTank, Grinder grinder, Trash trash, boolean Ready) {
        this.beans = beans;
        this.water = waterTank;
        this.grinder = grinder;
        this.trash = trash;
        this.Ready = Ready;
    }

    public void fillBeans(double amount, double arabica) throws BeansException {
        double rebosta = 100 - arabica;
        beans.fillBeans(amount);
        beans.setArabicaCoffee(arabica * amount / 100);
        beans.setRobustaCoffee(rebosta * amount / 100);

    }

    public void fillWater(double amount) throws WaterTankException {
        water.fillWater(amount);
    }

    public void shotDose(boolean A, boolean B, boolean C, boolean D) throws BeansException, WaterTankException, TrashException {
        if (A == true && B == true) {
            if (beans.getCurrentLevel() >= 7) {
                if (water.getCurrentLevel() >= 30) {
                    if (trash.getCurrentLevel() <= 593) {
                        beans.useBeans(7.0);
                        water.drainWater(30.0);
                        trash.discardWaste(7.0);

                    } else {
                        JOptionPane.showMessageDialog(null, "Not enough space in the drip tray .");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not enough water in the container to make coffee.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Not enough beans to make coffee.");

            }
        } else if (A == true && D == true) {
            if (beans.getCurrentLevel() >= 14) {
                if (water.getCurrentLevel() >= 60) {
                    if (trash.getCurrentLevel() <= 586) {
                        beans.useBeans(14.0);
                        water.drainWater(60.0);
                        trash.discardWaste(14.0);

                    } else {
                        JOptionPane.showMessageDialog(null, "Not enough space in the drip tray .");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not enough water in the container to make coffee.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Not enough beans to make coffee.");

            }

        } else if (C == true && B == true) {
            if (beans.getCurrentLevel() >= 7) {
                if (water.getCurrentLevel() >= 170) {
                    if (trash.getCurrentLevel() <= 593) {
                        beans.useBeans(7.0);
                        water.drainWater(170.0);
                        trash.discardWaste(7.0);

                    } else {
                        JOptionPane.showMessageDialog(null, "Not enough space in the drip tray .");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not enough water in the container to make coffee.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Not enough beans to make coffee.");

            }

        } else if (C == true && D == true) {
            if (beans.getCurrentLevel() >= 14) {
                if (water.getCurrentLevel() >= 220) {
                    if (trash.getCurrentLevel() <= 586) {
                        beans.useBeans(14.0);
                        water.drainWater(220.0);
                        trash.discardWaste(14.0);

                    } else {
                        JOptionPane.showMessageDialog(null, "Not enough space in the drip tray .");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not enough water in the container to make coffee.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Not enough beans to make coffee.");

            }

        }

    }

    public boolean isReady() {
        return Ready;

    }

    public void clear() {
        trash.cleanTrash();
    }

    public void grinding(int level) throws GrinderException {

        grinder.setGrinderLevel(level);
    }

    public int grindlevel() throws GrinderException {

        return grinder.getGrinderLevel();
    }

    public void setReady(boolean Ready) {
        this.Ready = Ready;
    }

    public boolean check() {
        if (beans.checkBeans() && water.checkwater() && trash.checktrach()) {
            Ready = true;
        } else {
            Ready = false;
        }

        return Ready;

    }

    public String getInfo() {
        return beans.getInfo() + water.getInfo() + trash.getInfo();

    }

    public double caffiene(boolean A, boolean B, boolean C, boolean D) {
        double sum, caffiene = 0;
        sum = (beans.getArabicaCoffee() * 1.4 + beans.getRobustaCoffee() * 2.3) / 100;
        if (A == true && B == true) {
            caffiene = sum * 7.0;
        } else if (A == true && D == true) {
            caffiene = sum * 14;
        } else if (C == true && B == true) {
            caffiene = sum * 7;
        } else if (C == true && D == true) {
            caffiene = sum * 14;
        }

        return caffiene;
    }

    public String Espresosingle() {
        return "\nthe beans consumption is 7.0 gram and 30 ml of water";

    }

    public String Espresodouble() {
        return "\nthe beans consumption is 14.0 gram and 60 ml of water ";

    }

    public String americansingle() {
        return "\nthe beans consumption is 7.0 gram and 170 ml of water ";

    }

    public String americandouble() {
        return "\nthe beans consumption is 14.0 gram and 220 ml of water ";

    }

}
