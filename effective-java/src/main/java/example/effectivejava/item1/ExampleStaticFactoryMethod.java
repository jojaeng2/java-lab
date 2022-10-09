package example.effectivejava.item1;

import java.sql.Connection;
import java.util.EnumSet;

public class ExampleStaticFactoryMethod {

    public static void main(String[] args) {
        Users user1 = Users.userWithAddress(26, "jo", "Busan");
        Users user2 = Users.userWithEmail(26, "jo", "ds4ouj@naver.com");

        Users member = Users.getUserClass(26, "jo", "Busan", "ds4ouj@naver.com");
        System.out.println("member = " + member.getClass());
        Users member2 = Users.getUserClass(26, "jaeng", "Busan", "ds4ouj@naver.com");
        System.out.println("member = " + member2.getClass());

    }

    public static class Users {
        Connection
        private int age;
        private String name;
        private String address;
        private String email;

        public Users(int age, String name, String address, String email) {
            this.age = age;
            this.name = name;
            this.address = address;
            this.email = email;
        }

        public static Users userWithAddress(int age, String name, String address) {
            return new Users(age, name, address, "Null");
        }

        public static Users userWithEmail(int age, String name, String email) {
            return new Users(age, name, "Null", email);
        }

        public static Member member(int age, String name, String address, String email) {
            return new Member(age, name, address, email);
        }

        public static Users getUserClass(int age, String name, String address, String email) {
            if (name.equals("jo")) return new Admin(age, name, address, email);
            return new Member(age, name, address, email);
        }
    }

    public static class Member extends Users{

        public Member(int age, String name, String address, String email) {
            super(age, name, address, email);
        }
    }

    public static class Admin extends Users {
        public Admin(int age, String name, String address, String email) {
            super(age, name, address, email);
        }
    }
}
