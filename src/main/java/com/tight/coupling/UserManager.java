package com.tight.coupling;

public class UserManager {
    private UserDatabase db = new UserDatabase();

    public String getUserData(){
        return db.getData();
    }

}
