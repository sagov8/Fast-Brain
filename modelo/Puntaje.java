/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Puntaje extends Thread {

    private int ronda;

    public Puntaje(int ronda) {
        this.ronda = ronda;
    }
    
    
    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                setRonda(i);
                Thread.sleep(6000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Puntaje.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
