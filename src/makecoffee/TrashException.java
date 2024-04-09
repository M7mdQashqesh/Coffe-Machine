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
public class TrashException extends Exception {

    public TrashException() {
        super("Not enough water in the container to make coffee.");
    }
}
