package ru.home.hibernate.repositiry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.home.hibernate.entity.Orders;

import java.util.List;

@Repository
public class CustomersRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Orders> getProductName(String name) {
        var query = entityManager.createQuery("select p from Orders p inner JOIN Customers c on  p.customer_id=c.id WHERE lower(c.name) = lower(:name)", Orders.class);
//        var query = entityManager.createQuery("select p from Orders p WHERE customer_id = 3", Orders.class);
        query.setParameter("name", name.toLowerCase());
        return query.getResultList();

    }
}
