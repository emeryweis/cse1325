public class Customer {

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        int at;

        if (email.indexOf("@") == -1) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        } else {
            at = email.indexOf("@");
        }
        if (email.indexOf(".", at) == -   1 ) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, email);
    }

    private String name;
    private String email;
}