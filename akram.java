/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singelton;

/**
 *
 * @author khaled
 */
public class akram {
     private static akram akr;


    private akram() {
    }

    public static akram getInstance() {
        if (akr == null) {
            akr = new akram();
        }
        return akr;
    }
    
    
        public void log() {
        System.out.println("this is akram");
    }
}
