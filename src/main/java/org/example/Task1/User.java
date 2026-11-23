package org.example.Task1;

public class User {

    private String username;
    private String password;
    private int age;

    public static void main(String[] args){

        User object1=new User();
        object1.setUsername("nodarkutateladze1");
        object1.setPassword("nodo123***");
        object1.setAge(31);
        object1.validateUser();



        User object2=new User();
        object2.setUsername("nuki1");
        object2.setPassword("nuki123***");
        object2.setAge(17);
        object2.validateUser();

        User object3=new User();
        object3.setUsername("  ");
        object3.setPassword("kutateladze");
        object3.setAge(68);
        object3.validateUser();




    }
    public void validateUser() {
        if (username != null && !username.isEmpty() && !username.isBlank() && password != null && !password.isBlank() && password.length() >= 8 && age >= 18) {
            System.out.println("User validation passed");
        } else {
            System.out.println("User validation failed");
        }

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

