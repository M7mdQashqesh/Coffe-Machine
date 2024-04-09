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
public class BeansException extends Exception {

    public BeansException() {
        super("Not enough beans in the container to make coffee.");
    }

    public BeansException(double amount) {
        super("Not enough space in the beans container to fill.");
    }

}
