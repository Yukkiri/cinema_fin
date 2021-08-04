package ru.puchkova.restcinemahometask.service;

import ru.puchkova.restcinemahometask.data.entity.OrderEntity;

import java.util.List;

public interface OrderService {

    List<OrderEntity> getAllOrders();

    OrderEntity findById(Long id);

    void update(OrderEntity order);

}
