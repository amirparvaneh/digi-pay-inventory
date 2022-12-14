package com.digipay.inventory.service;

import com.digipay.inventory.exception.BusinessException;
import com.digipay.inventory.model.category.Category;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {
    void save(T t);

    void delete(T t);

    Optional<T> update(Long id,T t);

    Category find(Long id) throws BusinessException;

    List<T> findAll();

    void deleteById(Long id);
}
