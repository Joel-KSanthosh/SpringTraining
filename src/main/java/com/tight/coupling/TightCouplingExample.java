package com.tight.coupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        //Everytime if you need to any other services we need to change the UserDatabase and also UserManager so its tightly coupled
        UserManager um = new UserManager();
        System.out.println(um.getUserData());
    }
}
