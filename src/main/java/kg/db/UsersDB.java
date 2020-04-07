package kg.db;

import kg.entity.Users;
import kg.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.util.List;

public class UsersDB {

    public static Users create(Users users){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(users);
        session.getTransaction().commit();
        session.close();
        return users;
    }

    public static List<Users> getAllAZ(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List users = session.createQuery("From kg.entity.Users where name like :name", Users.class)
                .setParameter("name", "A").list();//не понмню как это делали. Были спечиальный цифры который вычесляли алфавит
        session.close();
        return users;
    }

    public static List<Users> getAllNumberLike(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List users = session.createQuery("FROM kg.entity.Users where users like :users", Users.class)
                .setParameter("users")//метод пузирька
    }

}
