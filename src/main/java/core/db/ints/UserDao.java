package core.db.ints;

import core.db.entity.User;
import java.util.List;

/**
 * The UserDao is a data access object interface. Interface contains methods for
 * implementation(adding, deleting, getting, updating).
 *
 * @author Rastislav Vocko
 * @version 1.0
 * @since 2016-04-25
 */
public interface UserDao {

    List<User> getAll();

    User getById(Long id);

    User getVerifedUser(String name);

}
