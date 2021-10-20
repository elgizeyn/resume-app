package com.company.main;

import com.company.dao.inter.UserDaoInter;

public class Main {

    public static void main(String[] args) {
        UserDaoInter userDao = Context.instanceUserDao();
        System.out.println(userDao.getAll());
    }
}
