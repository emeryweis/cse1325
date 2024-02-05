public class Customer {

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        int astIndex;

        if (email.indexOf("@") == -1) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        } else {
            astIndex = email.indexOf("@");
        }
        if (email.indexOf(".", astIndex) == -   1 ) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        
    }

    @Override
    public String toString() {
        return name + '(' + email + ')';
    }

    private String name;
    private String email;
}