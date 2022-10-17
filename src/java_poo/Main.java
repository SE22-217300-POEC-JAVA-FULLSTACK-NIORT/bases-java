package java_poo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      User user1=new User();

        User user1;//null
        user1=new User("Christian","Lisangola","chris@gmail.com","abc");
//        user1.firstName="4567";
//        user1.setFirstName("Christian");
//        user1.setLastName("Lisangola");
//        user1.setEmail("chris@gmail.com");
//        user1.setPassword("43434344");
        System.out.printf("First name : %s\n",user1.getFirstName());
        System.out.printf("Last name : %s\n",user1.getLastName());
        System.out.printf("Email : %s\n",user1.getEmail());
        System.out.printf("Age : %d\n",user1.getAge());
        System.out.printf("Weight : %f\n",user1.getWeight());
        System.out.printf("Married: %b\n",user1.isMarried());


        var user2=new User();
//        user2.firstName="Pierre";
//        user2.lastName="Gauthier";
//        user2.email="pierre.gauthier@gmail.com";
//        user2.password="s478wr";

        User user3=new User();
//        user3.firstName="Azadeh";
//        user3.lastName="Ghassemizadeh";
//        user3.email="azadeh@yahoo.fr";
//        user3.password="467h3";

    }
}
