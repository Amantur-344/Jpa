package kg.entity;

import javax.persistence.*;

@Entity
@Table(name = "likes")//просто для красоты
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;// кто лайкнул
    @Column(name = "number")
    private Integer number;

    public Likes() {
    }

    public Likes(Users users, Integer number) {
        this.users = users;
        this.number = number;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Likes{" +
                "id=" + id +
                ", users=" + users +
                ", number=" + number +
                '}';
    }
}
