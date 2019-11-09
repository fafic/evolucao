/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Luciano
 */
public class Observador implements Observer {
    
    private List<Contato> contatos;

    public List<Contato> getContato() {
      if(contatos == null)  {
          contatos = new ArrayList();
      }
        return contatos;
    }

    public void setContato(List<Contato> contato) {
        this.contatos = contato;
    }

    public void teLigou(){
        for(Contato c: contatos )
        System.out.println("Te Ligou - > Nome: " +c.getNome() + " - Nº: " +c.getTelefone());
    }

    @Override
    public void update(Observable o, Object arg) {
        String status =  String.valueOf(arg);
        
        if(status.equals("on")){
            this.teLigou();
        }
    }
    
}
