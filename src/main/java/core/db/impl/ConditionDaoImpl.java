/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.impl;

import core.db.HibernateUtil;
import core.db.entity.Condition;
import core.db.ints.ConditionDao;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rastislav
 */
public class ConditionDaoImpl implements ConditionDao {

    /**
     * prida podmienku do databazy
     *
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
     *
     * @param condition objekt Condition ktory ma byt zmazany z databazy
     * @see Condition
     */
    @Override
    public void deleteCondition(Condition condition) {
        Transaction tx = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            session.delete(condition);

            tx.commit();

        } catch (RuntimeException e) {
            try {
                tx.rollback();
            } catch (RuntimeException rbe) {

            }
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }

        }
    }

    /**
     * vrati vsetky podmienky z databazy
     *
     * @return zoznam podmienok
     * @see Condition
     */
    @Override
    public List<Condition> getAll() {
        List<Condition> conditions = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        conditions = session.createCriteria(Condition.class).list();
        session.close();
        return conditions;
    }

    /**
     * vrati podmienku podla id z databazy
     *
     * @param id id podmienky
     * @return vracia podmienku
     * @see Condition
     */
    @Override
    public Condition getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Condition.class);
        criteria.add(Restrictions.eq("id", id));
        List<Condition> conditions = criteria.list();
        if (conditions.get(0) != null) {
            Condition condition = conditions.get(0);
            session.close();
            return condition;
        } else {
            session.close();
            return null;
        }
    }

    /**
     * upravi parametre podmienky s danym id z databazy
     *
     * @param condition podmienka s tymto id sa upravi podla tohto objektu
     * @see Condition
     */
    @Override
    public void updateCondition(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean executeEpresion(String select, long idUsera, double pozicanaSuma, int mark,int bcValue) {
        int vysledok = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println(select);
        try{
        Query result = session.createSQLQuery(select).setParameter("idUsera", idUsera).setParameter("pozicanaSuma", pozicanaSuma).setParameter("mark", mark).setParameter("bcValue", bcValue);
      //  Query result = session.createSQLQuery(select);//.setParameter(1, idUsera).setParameter(2, pozicanaSuma).setParameter(0, bcValue);
        
        if (result == null) {
            return false;
        }
 
        vysledok = ((BigInteger) result.uniqueResult()).intValue();
        System.out.println("Vysledok = "+vysledok);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        session.close();
        if (vysledok == 1) {
            return true;
        } else {
            return false;
        }

    }
}
