package br.anderson.infnet.exercicio04;

import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private ArrayList<Address> addresses =  new ArrayList<>();

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
