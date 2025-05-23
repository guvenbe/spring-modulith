package com.zee.springmodulith.payment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface PaymantRepository extends CrudRepository<Payment, Long> {
    Optional<Payment> getPaymentsByOrderId(String orderId);
}
