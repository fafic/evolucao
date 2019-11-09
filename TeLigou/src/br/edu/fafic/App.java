/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic;

/**
 *
 * @author Luciano
 */
public class App {
    
    public static void main(String[] args) {
        
        Observador o = new Observador();
        Observado obs = new Observado();
        
        Contato contato1 = new Contato("Jose", "123456");
        Contato contato2 = new Contato("Antonio", "321");
        o.getContato().add(contato1);
        o.getContato().add(contato2);
       
       
        obs.addObserver(o);
        
        
       
        obs.onLine();
//        obs.offLine();
        
        
    }
    
}
