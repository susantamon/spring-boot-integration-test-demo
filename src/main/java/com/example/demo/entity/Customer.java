package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "customer_generator", sequenceName = "customer_sequence", allocationSize = 1)
@Data
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;
}
