/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.triqui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author sebastian
 */
public class Main {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        JFrame frame = new JFrame("Triqui");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(400, 400);
        MachinePlayer machinePlayer = new MachinePlayer(tablero);
        JButton b00 = new JButton();
        JButton b01 = new JButton();
        JButton b02 = new JButton();
        JButton b10 = new JButton();
        JButton b11 = new JButton();
        JButton b12 = new JButton();
        JButton b20 = new JButton();
        JButton b21 = new JButton();
        JButton b22 = new JButton();
        b00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b00.setText("x");
                tablero.getTablero()[0][0] = "x";
                b00.setEnabled(false);
                tablero.setTurnoAgente(true);
                machinePlayer.setTablero(tablero);
                
                tablero.imprimir();
            }
        });
        b01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b01.setText("x");
                tablero.getTablero()[0][1] = "x";
                b01.setEnabled(false);
                tablero.setTurnoAgente(true);
                machinePlayer.setTablero(tablero);
                tablero.imprimir();
            }
        });
        b02.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b02.setText("x");
                tablero.getTablero()[0][2] = "x";
                b02.setEnabled(false);
                tablero.setTurnoAgente(true);
                machinePlayer.setTablero(tablero);
                tablero.imprimir();
            }
        });
        
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b10.setText("x");
                tablero.getTablero()[1][0] = "x";
                b10.setEnabled(false);
                tablero.setTurnoAgente(true);
                machinePlayer.setTablero(tablero);
                tablero.imprimir();
            }
        });
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b11.setText("x");
                tablero.getTablero()[1][1] = "x";
                b11.setEnabled(false);
                tablero.setTurnoAgente(true);
                machinePlayer.setTablero(tablero);
                tablero.imprimir();
            }
        });
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b12.setText("x");
                tablero.getTablero()[1][2] = "x";
                b12.setEnabled(false);
                tablero.setTurnoAgente(true);
                machinePlayer.setTablero(tablero);
                tablero.imprimir();
            }
        });
        
        b20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b20.setText("x");
                tablero.getTablero()[2][0] = "x";
                b20.setEnabled(false);
                tablero.setTurnoAgente(true);
                machinePlayer.setTablero(tablero);
                tablero.imprimir();
            }
        });
        b21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b21.setText("x");
                tablero.getTablero()[2][1] = "x";
                tablero.setTurnoAgente(true);
                machinePlayer.setTablero(tablero);
                b21.setEnabled(false);
                tablero.imprimir();
            }
        });
        b22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b22.setText("x");
                tablero.getTablero()[2][2] = "x";
                b22.setEnabled(false);
                tablero.setTurnoAgente(true);
                machinePlayer.setTablero(tablero);
                tablero.imprimir();
            }
        });
        frame.add(b00);
        frame.add(b01);
        frame.add(b02);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.add(b20);
        frame.add(b21);
        frame.add(b22);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
