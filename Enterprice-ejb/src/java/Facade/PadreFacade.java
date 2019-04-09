/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Padre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cdis
 */
@Stateless
public class PadreFacade extends AbstractFacade<Padre> {

    @PersistenceContext(unitName = "Enterprice-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PadreFacade() {
        super(Padre.class);
    }
    
}
