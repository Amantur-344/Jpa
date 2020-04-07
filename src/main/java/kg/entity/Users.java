package kg.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name", nullable = false, unique = true)
    private String username; //это ник
    @Column(name = "name", nullable = false)
    private String name;
    @OneToMany//один юзер и много постов
    private Posts posts;

    @ManyToMany
    @JoinColumn(name = "users")
    private List <Users> users;
//    @OneToMany
//    @JoinColumn(name = "followers_subscription")
//    private List<FollowersSubscriptions> followersSubscription; // это подписки
//    @ManyToOne
//    @JoinColumn(name = "followers")
//    private List<FollowersSubscriptions> followers; // это подписчики

    public Users() {
    }

    public Users(String username, String name, Posts posts, Users users) {
        this.username = username;
        this.name = name;
        this.posts = posts;
        this.users = Arrays.asList(((List<Users>) users).toArray(new Users[0]));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }
//
//    public List<FollowersSubscriptions> getFollowersSubscription() {
//        return followersSubscription;
//    }
//
//    public void setFollowersSubscription(List<FollowersSubscriptions> followersSubscription) {
//        this.followersSubscription = followersSubscription;
//    }
//
//    public List<FollowersSubscriptions> getFollowers() {
//        return followers;
//    }
//
//    public void setFollowers(List<FollowersSubscriptions> followers) {
//        this.followers = followers;
//    }
//
//    @Override
//    public String toString() {
//        return "Users{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", name='" + name + '\'' +
//                ", posts=" + posts +
//                ", followersSubscription=" + followersSubscription +
//                ", followers=" + followers +
//                '}';
//    }

    public Users getUsers() {
        return (Users) users;
    }

    public void setUsers(Users users) {
        this.users = (List<Users>) users;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", posts=" + posts +
                ", users=" + users +
                '}';
    }
}
