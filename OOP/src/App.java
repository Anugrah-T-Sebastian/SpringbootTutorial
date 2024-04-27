import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        User u1 = new User("XYX", "Gold");
        User u2 = new User("ABC", "Gold");

        System.out.println(u1);
        System.out.println(u2);

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        ArrayList<User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        users.add(new User("ABC", "Bronze"));


        System.out.println(users.get(2).getName());

        for(User u : users)
            System.out.println(u);
            
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Anugrah", "Diamond"));
        User.printAdminName();



        Student s = new Student();
        System.out.println(s.getVerified());
        s.setMembership("Gold");
        System.out.println(s.getMembership());
    }
}
