package store;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

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
        if (email.indexOf(".", at) == -1 ) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        
    }

    public Customer(BufferedReader br) throws IOException {
        this.name = br.readLine();
        this.email = br.readLine();
    }

    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + "\n");
        bw.write(email + "\n");
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, email);
    }

    private String name;
    private String email;
}