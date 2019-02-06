package bd.ohedulalam.mysqlJpaTutorial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;

    public Users() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}