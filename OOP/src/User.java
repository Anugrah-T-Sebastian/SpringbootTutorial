import java.util.List;

public class User {
    private String name;
    private String membership = "Bronze";

    public static List<User> admins;

    public static void printAdminName(){
        for(User u :  admins)
            System.err.println(u);
    }
    
    public enum Membership {
        Brone, Silver, Gold;
    }

    
    public User() {
        setName(name);
        setMembership(membership);
    }

    public User(String name, String membership) {
        setName(name);
        setMembership(membership);
    }

    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return this.name;
    }
    
    void setMembership(String membership) {
        this.membership = membership;
    }

    void setMembership(Membership membership) {
        this.membership = membership.name();
    }

    String getMembership() {
        return this.membership;
    }

    public String toString() {
        return getName() + "->" + getMembership();
    }

    public boolean equals(User u) {
        if(this.getName() != u.getName())
            return false;
        else if(this.getMembership() != u.getMembership())
            return false;
        return true;
    }
}
