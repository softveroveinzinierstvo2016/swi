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

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
