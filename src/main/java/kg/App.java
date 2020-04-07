package kg;

import kg.entity.Posts;
import kg.entity.Users;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args ){
        Posts posts = new Posts(6,"uwhfuwfh");//это адрес поста
        Posts posts1 = new Posts(9,"vjfwef");
        Posts posts2 = new Posts(25,"hygyug");

        Users Instagram = new Users();
        Users Shamil = new Users("Shamil","Satarov",posts,Instagram);
        Users Amantur = new Users("Amantur","Ubaidilaev",posts1, Shamil);
        Users Azat = new Users("Azat","Dzanibekov",posts1,Instagram);
        Users Lola = new Users("Lola","Ibragimova",posts2,Azat);
        // не нужен

    }
}
