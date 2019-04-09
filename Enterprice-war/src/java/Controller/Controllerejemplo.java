/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Ejemplo;
import Entity.Padre;
import Facade.FacadeEjemplo;
import Facade.PadreFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Cdis
 */
@Named(value = "controllerejemplo")
@SessionScoped
public class Controllerejemplo implements Serializable {

    
    @EJB
    private FacadeEjemplo facade;
    @EJB PadreFacade padre;
    
    /**
     * Creates a new instance of Controllerejemplo
     */
    public Controllerejemplo() {
    }
    
    
    public List<Ejemplo> getAll()
    {
        return facade.getAll();
        
    }
    
    public List<Padre> getAllPadre()
    {
        return padre.findAll();
    }
            
    
    
}
