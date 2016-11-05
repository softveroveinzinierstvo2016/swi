/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.impl;

import core.db.HibernateUtil;
import core.db.entity.Condition;
import core.db.ints.ConditionDao;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Rastislav
 */
public class ConditionDaoImpl implements ConditionDao {
    
    /**
     * prida podmienku do databazy
     * @param condition objekt Condition ktory sa prida do databazy
     * @see Condition
     */
    @Override
    public void addCondition(Condition condition) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.save(condition);
        session.close();
    }
     /**
     * zmaze podmienku z databazy
     * @param condition objekt Condition ktory ma byt zmazany z databazy
     * @see Condition
     */
    @Override
    public void deleteCondition(Condition condition) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.delete(condition);
        session.close();
    }
    /**
     * vrati vsetky podmienky z databazy
     * @return zoznam podmienok
     * @see Condition
    *@throws UnsupportedOperationException
    */
    @Override
    public List<Condition> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * vrati podmienku podla id z databazy
     * @param id id podmienky
     * @return vracia podmienku
     * @see Condition
    *@throws UnsupportedOperationException
    */
    @Override
    public Condition getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     /**
     * upravi parametre podmienky s danym id z databazy
     * @param condition podmienka s tymto id sa upravi podla tohto objektu
     * @see Condition
     *@throws UnsupportedOperationException
    */
    @Override
    public void updateCondition(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
