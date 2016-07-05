/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.triqui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian
 */
public class Tablero {

    private boolean turnoAgente = false;

    private String[][] tablero;

    private List<String[][]> siguiente;

    public Tablero() {
        tablero = new String[3][3];
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public boolean isTerminado() {
        if (tablero[0][0] != null && tablero[0][1] != null && tablero[0][2] != null && tablero[0][0].equals(tablero[0][1].equals(tablero[0][2]))) {
            return true;
        }
        if (tablero[1][0] != null && tablero[1][1] != null && tablero[1][2] != null && tablero[1][0].equals(tablero[1][1].equals(tablero[1][2]))) {
            return true;
        }
        if (tablero[2][0] != null && tablero[2][1] != null && tablero[2][2] != null && tablero[2][0].equals(tablero[2][1].equals(tablero[2][2]))) {
            return true;
        }
        return false;
    }

    public void imprimir() {
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    System.out.print(tablero[i][j] + ",");
                } else {
                    System.out.print(tablero[i][j]);
                }
            }
            System.out.println("]");
        }
    }

    public synchronized boolean isTurnoAgente() {
        return turnoAgente;
    }

    public synchronized void setTurnoAgente(boolean turnoAgente) {
        this.turnoAgente = turnoAgente;
    }

    public List<String[][]> getSiguiente() {
        siguiente = new ArrayList<String[][]>();
        String[][] aux = new String[3][3];
        StringBuilder posiciones = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux[i][j] = tablero[i][j];
                if (tablero[i][j] == null) {
                    posiciones.append(i).append(",").append(j).append(";");
                }
            }
        }
        String[][] auxList;
        for (String auxJug : posiciones.toString().split(";")) {
            System.out.println("Juagada->" + auxJug);
            
            auxList = new String[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    auxList[i][j] = tablero[i][j];
                }
            }
            auxList[Integer.parseInt(auxJug.split(",")[0])][Integer.parseInt(auxJug.split(",")[1])] = "o";
            siguiente.add(auxList);
        }

        return siguiente;
    }

    public void setSiguiente(List<String[][]> siguiente) {
        this.siguiente = siguiente;
    }

}