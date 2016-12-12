package core.db.impl;

import core.db.HibernateUtil;
import core.db.entity.User;
import core.db.ints.UserDao;
import java.util.ArrayList;
import org.hibernate.Session;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class UserDaoImpl implements UserDao {

    /**
     * vrati zoznam vsetkych uzivatelov z databazy
     *
     * @return zoznam uzlivatelov
     */
    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        users = session.createCriteria(User.class).list();
        session.close();
        return users;
    }

    /**
     * vrati uzivatela podla id z databazy
     *
     * @param id id uzivatela
     * @return vrati uzivatela podla zadaneho id
     * @see User
     */
    @Override
    public User getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("id", id));
        List<User> users = criteria.list();
        User user = users.get(0);
        session.close();
        return user;
    }

    /**
     * overi ci uzivatel so zadanym menom splna podmienky verifikacie <br>
     * ak splna podmienky vrati ho ako objekt, inak vracia null
     *
     * @param name meno uzivatela ktory sa chce prihlasit
     * @return vracia objekt User s menom name ak splna podmienky verifikacie,
     * inak vracia null
     * @see User
     */
    @Override
    public User getVerifedUser(String name) {
        System.out.println("menooo" + name);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("name", name));
        System.out.println("crteraia: " + criteria.list().toString());
        List<User> users = criteria.list();
        if (users.size() > 1) {
            return null;
        }
        if (users.size() == 0) {
            return null;
        } else {
            User user = users.get(0);

            session.close();
            return user;
        }
    }

    /**
     * prida usera do databazy
     *
     * @param user objekt User, ktory bude pridany
     * @see User
     */
    @Override
    public void saveUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.save(user);
        session.close();
    }

    /**
     * maze usera z databazy
     *
     * @param user objekt User, ktory bude zmazany
     * @see User
     */
    @Override
    public void deleteUser(User user) {
        Transaction tx = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            session.delete(user);

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

    @Override
    public List<User> findSortedClients(Long idBanky) {
       
        List<Integer> zoznamIdUserov = new ArrayList<>();
        List<User> klienti = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query result = session.createQuery("(select T.id from (\n" +
"select U.id,sum(statement) 'vysl' from user U  left join accountstatements ACS on U.id = ACS.idU where U.idB = :idBanky and role = 'user' and  month(ACS.time)=month(now()-interval 1 month) and year(ACS.time)=year(now()-interval 1 month) and statement is not null and monthly_balance is null and statement > 0 group by U.id order by 'vysl'\n" +
")T order by T.vysl)").setParameter("idBanky", idBanky);
        if (result == null) {
            return null;
        }
        for (final Object o : result.list()) {
            zoznamIdUserov.add((Integer) o);
        }
        for(Integer i : zoznamIdUserov){
            klienti.add(getById((long)i));
        }
        return klienti;
    }

}
