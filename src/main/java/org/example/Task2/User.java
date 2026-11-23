package org.example.Task2;

public class User {
    protected String userName;
    protected String email;

    public static void main(String[] args) {

        Admin admin=new Admin();
        admin.userName="nodo";
        admin.email="nodarkutateladze055@gmail.com";
        admin.displayUserInfo();
        admin.deleteUser("nodo");
        admin.deleteUser("keti");
        admin.deleteUser(null);
        admin.deleteUser("");
        admin.deleteUser("  ");

    }
    protected void displayUserInfo(){
        System.out.println("მომხმარებლის სახელი :" +userName +"ელფოსტა :"+ email);


    }
}
