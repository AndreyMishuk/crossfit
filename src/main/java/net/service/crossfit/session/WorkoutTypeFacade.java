/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.service.crossfit.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.service.crossfit.entity.WorkoutType;

/**
 *
 * @author andrey
 */
@Stateless
public class WorkoutTypeFacade extends AbstractFacade<WorkoutType> {

    @PersistenceContext(unitName = "net.service_crossfit_war_0.01PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WorkoutTypeFacade() {
        super(WorkoutType.class);
    }
    
}
