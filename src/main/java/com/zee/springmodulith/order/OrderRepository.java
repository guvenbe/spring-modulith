package com.zee.springmodulith.order;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

interface OrderRepository extends CrudRepository<Order, Long> {
    Optional<Order> getOrderByOrderIdentifier(String orderIdentifier);
}
