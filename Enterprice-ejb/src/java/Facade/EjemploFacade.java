/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Ejemplo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cdis
 */
@Stateless
public class EjemploFacade extends AbstractFacade<Ejemplo> {

    @PersistenceContext(unitName = "Enterprice-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EjemploFacade() {
        super(Ejemplo.class);
    }
    
}
