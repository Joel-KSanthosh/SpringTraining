package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserData() {
        return "This is the data given by SQL through interface";
    }
}
