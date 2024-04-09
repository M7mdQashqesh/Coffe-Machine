/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makecoffee;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author M7md Qash
 */
public class Grinder implements Method {

    private int grinderLevel;

    public Grinder() {
        this.grinderLevel = 8;

    }

    public void setGrinderLevel(int level) throws GrinderException {
        if (level >= 0 && level <= 15) {
            this.grinderLevel = level;

        } else {

            this.grinderLevel = 8;

        }
    }

    public int getGrinderLevel() {
        return this.grinderLevel;
    }

    @Override
    public String getInfo() {
        return "The Grinder Level is " + getGrinderLevel();
    }
}
