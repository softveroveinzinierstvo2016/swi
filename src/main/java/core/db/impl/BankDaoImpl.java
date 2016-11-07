/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.impl;

import core.db.HibernateUtil;
import core.db.entity.Bank;
import core.db.ints.BankDao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rastislav
 */
public class BankDaoImpl implements BankDao {

    @Override
    public List<Bank> getAll() {
        List<Bank> banks = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        banks = session.createCriteria(Bank.class).list();
        session.close();
        return banks;
    }

    @Override
    public Bank getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Bank.class);
        criteria.add(Restrictions.eq("id", id));
        List<Bank> banks = criteria.list();
        Bank bank = banks.get(0);
        session.close();
        return bank;
    }

    @Override
    public void saveBank(Bank bank) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.save(bank);
        session.close();
    }

    @Override
    public void deleteBank(Bank bank) {
        Transaction tx = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            session.delete(bank);

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
}
