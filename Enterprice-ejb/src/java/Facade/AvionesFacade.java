/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Aviones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cdis
 */
@Stateless
public class AvionesFacade extends AbstractFacade<Aviones> {

    @PersistenceContext(unitName = "Enterprice-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AvionesFacade() {
        super(Aviones.class);
    }
    
}
