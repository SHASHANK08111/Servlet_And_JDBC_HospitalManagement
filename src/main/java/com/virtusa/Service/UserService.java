package com.virtusa.Service;

import com.db.DBConnect;
import com.virtusa.dao.UserDao;
import com.virtusa.entity.User;

import java.sql.Connection;
import java.util.List;

public class UserService {

    private UserDao userDao;
    public UserService(Connection conn) {
        userDao = new UserDao(conn);
    }


    public boolean userRegister(User u) {

        if(Validation.isValidUsername(u.getFirstName())&&Validation.isValidEmailAddress(u.getEmail())&&Validation.isValidPassword(u.getPassword())&& Validation.isValidPhoneNumber(u.getPhoneNumber())){
            return userDao.userRegister(u);
        }
        return false;
    }

    public User userLogin(String email, String password) {
        if(Validation.isValidEmailAddress(email)&&Validation.isValidPassword(password)){
            return userDao.userLogin(email, password);
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
