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

    @Override
    public void addCondition(Condition condition) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.save(condition);
        session.close();
    }

    @Override
    public void deleteCondition(Condition condition) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.delete(condition);
        session.close();
    }

    @Override
    public List<Condition> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condition getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCondition(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
