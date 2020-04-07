package kg.entity;

import org.hibernate.dialect.Database;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")//для красоты
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer number;
    @Column(name = "address_posts",nullable = false)
    private String addressPosts;
    @OneToMany
    @JoinColumn(name = "like_id",nullable = false)
    private Likes likes;
    @Column(nullable = false)
    private Database database;

    public Posts() {
    }

    public Posts(Integer number, String addressPosts) {
        this.number = number;
        this.addressPosts = addressPosts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAddressPosts() {
        return addressPosts;
    }

    public void setAddressPosts(String addressPosts) {
        this.addressPosts = addressPosts;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", number=" + number +
                ", addressPosts='" + addressPosts + '\'' +
                ", likes=" + likes +
                ", database=" + database +
                '}';
    }
}
