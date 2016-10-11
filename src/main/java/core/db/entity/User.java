package core.db.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * The User class represent object with instances(Long id, String role, String
 * name, String userName, String surname, String password, String email, Date
 * contractStart, Date contractEnd, Long idProject). Object contains
 * toString,getter and setters. Object defines one of users(admin, manager,
 * student).
 *
 * @author Rastislav Vocko
 * @version 1.0
 * @since 2016-04-25
 */
@Entity
@Table(name = "user")
public class User implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "idB")
    private Long idB;

    @Column(name = "role")
    @Size(min = 1, max = 25)
    private String role;

    @NotNull
    @Column(name = "name")
    @Size(min = 1, max = 25)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdB() {
        return idB;
    }

    public void setIdB(Long idB) {
        this.idB = idB;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
