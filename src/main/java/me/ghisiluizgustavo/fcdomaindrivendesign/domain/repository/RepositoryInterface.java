package me.ghisiluizgustavo.fcdomaindrivendesign.domain.repository;

import java.util.List;

public interface RepositoryInterface<T> {

    void create(T entity);
    void update(T entity);
    T find(String id);
    List<T> findAll();

}
