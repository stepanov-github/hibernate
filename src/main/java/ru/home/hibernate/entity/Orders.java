package ru.home.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORDERS")
@Entity
public class Orders {
    @Id
    private int id;

    @Column(nullable = false)
    private Timestamp date;

    @Column
    private int customer_id;

    @Column(nullable = false)
    private String product_name;

    @Column
    private int amount;
}
