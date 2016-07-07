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
public class MachinePlayer {
    
    private Tablero tablero;
    
    private String sigJugada;
    
    boolean agente = true;
    
    public MachinePlayer(Tablero tablero){
        this.tablero = tablero;
        generarArbol(tablero);
    }

    public void generarArbol(Tablero tablero){
        
        if(tablero != null && tablero.getSiguiente().size() > 0){
            tablero.setTurnoAgente(agente);
            for(Tablero sig : tablero.getSiguiente()){
                agente = !agente;
                sig.setTurnoAgente(agente);
                generarArbol(sig);
                
                System.out.println("Agente->"+agente);
                
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

    /**
     * @return the sigJugada
     */
    public String getSigJugada() {
        return sigJugada;
    }

    /**
     * @param sigJugada the sigJugada to set
     */
    public void setSigJugada(String sigJugada) {
        this.sigJugada = sigJugada;
    }
    
    
    
    
}
