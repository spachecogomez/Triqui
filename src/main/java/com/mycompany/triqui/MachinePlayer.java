/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.triqui;

import java.util.List;

/**
 *
 * @author sebastian
 */
public class MachinePlayer implements Runnable{
    
    private Tablero tablero;
    
    private final String jugada = "o";
    
    public MachinePlayer(Tablero tablero){
        this.tablero = tablero;
    }

    
    
    public void run() {
        List<String[][]> siguiente = null;
        while(!tablero.isTerminado()){
            if(getTablero().isTurnoAgente()){
                siguiente = getTablero().getSiguiente();
                getTablero().setTurnoAgente(false);
            }
        }
    }

    /**
     * @return the tablero
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * @param tablero the tablero to set
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    
    
    
}
