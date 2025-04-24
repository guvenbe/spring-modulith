package com.zee.springmodulith.order;

import com.zee.springmodulith.order.type.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.Instant;

@Getter
@Setter
@ToString
@Entity
@Table(name= "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderIdentifier;
    private String customerName;
    private String customerEmail;
    private Timestamp orderDate = Timestamp.from(Instant.now());
    private Status status= Status.OPEN;
}
