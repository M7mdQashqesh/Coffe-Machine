/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makecoffee;

/**
 *
 * @author M7md Qash
 */
public class WaterTankException extends Exception {

    public WaterTankException() {
        super("Not enough water in the container to make coffee.");
    }

    public WaterTankException(double a) {
        super("Not enough space in the water tank to fill.  ");
    }
}
