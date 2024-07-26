package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDatabaseProvider dataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(dataProvider);
        System.out.println(userManagerWithDB.getUserInfo());
    }
}
