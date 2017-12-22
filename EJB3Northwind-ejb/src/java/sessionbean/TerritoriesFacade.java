/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean;

import entityclass.Territories;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @name TerritoriesFacade
 * @author Le Thi Minh Loan
 */
@Stateless
public class TerritoriesFacade extends AbstractFacade<Territories> implements TerritoriesFacadeLocal {

    @PersistenceContext(unitName = "EJB3Northwind-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TerritoriesFacade() {
        super(Territories.class);
    }

}
