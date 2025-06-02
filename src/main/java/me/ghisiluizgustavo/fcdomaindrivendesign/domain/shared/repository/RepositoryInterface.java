package me.ghisiluizgustavo.fcdomaindrivendesign.domain.shared.repository;

import java.util.List;

public interface RepositoryInterface<T> {

    void create(T entity);
    void update(T entity);
    T find(String id);
    List<T> findAll();

}
