package kg.entity;

import sun.rmi.server.UnicastServerRef;

import javax.persistence.*;

@Entity
@Table(name = "followers")
public class FollowersSubscriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToMany
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;

    public FollowersSubscriptions() {
    }

    public FollowersSubscriptions(Users users) {
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "FollowersSubscriptions{" +
                "id=" + id +
                ", users=" + users +
                '}';
    }
}
