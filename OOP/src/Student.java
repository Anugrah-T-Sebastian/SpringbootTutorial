public class Student extends User {
    private boolean verified = false;

    void setVerified(boolean verified){
        this.verified = verified;
    }

    boolean getVerified(){
        return this.verified;
    }
}
