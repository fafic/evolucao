/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic;

import java.util.Observable;

/**
 *
 * @author Luciano
 */
public class Observado extends Observable {
    
    public String status;
    
    public void onLine(){
        status = "on";
        mudaEstado();
    }
    
    public void offLine(){
        status = "off";
        mudaEstado();
    }
    
    public void mudaEstado(){
        setChanged();
        notifyObservers(status);
    }
    
    
}
