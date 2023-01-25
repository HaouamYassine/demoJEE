package com.example.demojee.dao;

public interface DaoFactory {

    public static PastryDao getPastryDao() {
        return new PastryJpaDao();
    }
}
