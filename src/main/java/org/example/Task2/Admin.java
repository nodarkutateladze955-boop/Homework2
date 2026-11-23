package org.example.Task2;

public class Admin extends User{
    public void deleteUser(String userName){
        if (userName !=null&& !userName.isEmpty()&&!userName.isBlank()){
            System.out.println("User deleted"+userName);
        }
        else {
            System.out.println("Invalid username");
        }


    }
}
