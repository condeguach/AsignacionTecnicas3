/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignaciontecnicas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santamaria
 */
public class ListaPersona {
    
    private List<Persona>lPersonas;

    public ListaPersona(List<Persona> lPersonas) {
        this.lPersonas = lPersonas;
    }

    public ListaPersona() {
        
        lPersonas = new ArrayList<>();
        
    }

    public List<Persona> getlPersonas() {
        return lPersonas;
    }

    public void setlPersonas(List<Persona> lPersonas) {
        this.lPersonas = lPersonas;
    }
    
    
    
    
    
}
