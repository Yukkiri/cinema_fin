package ru.puchkova.restcinemahometask.service;

import ru.puchkova.restcinemahometask.data.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {

    List<CustomerEntity> getAll();

    CustomerEntity findById(Long id);

    CustomerEntity findByName(String firstName, String lastName);

    CustomerEntity findByPhone(String phone);

    CustomerEntity findByEmail(String email);

    void delete(Long id);

    void update(CustomerEntity customer);

    void add(CustomerEntity customer);

}
