package org.example.Task3;

public class Admin extends User implements Acces{
    @Override
    public void displayRole() {
        System.out.println("Role: Admin");
    }

    @Override
    public void checkAccess() {
        System.out.println("Access granted");
    }
}
