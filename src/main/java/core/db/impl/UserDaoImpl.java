package core.db.impl;

import core.db.HibernateUtil;
import core.db.entity.User;
import core.db.ints.UserDao;
import java.util.ArrayList;
import org.hibernate.Session;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class UserDaoImpl implements UserDao {
    /**
    * vrati zoznam vsetkych uzivatelov z databazy
    * @return zoznam uzlivatelov
    *@throws UnsupportedOperationException
    */
    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * vrati uzivatela podla id z databazy
     * @param id id uzivatela
     * @return vrati uzivatela podla zadaneho id
     * @see User
     *@throws UnsupportedOperationException
    */
    @Override
    public User getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      /**
     * overi ci uzivatel so zadanym menom splna podmienky verifikacie <br>
     * ak splna podmienky vrati ho ako objekt, inak vracia null
     * @param name meno uzivatela ktory sa chce prihlasit
     * @return vracia objekt User s menom name ak splna podmienky verifikacie, inak vracia null
     * @see User
     */
    @Override
    public User getVerifedUser(String name) {
        System.out.println("menooo"+name );
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("name", name));
        System.out.println("crteraia: "+criteria.list().toString());
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

   
    
}
