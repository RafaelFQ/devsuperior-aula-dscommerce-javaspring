package com.auladevsuperior.dscommerce.repositories;

import com.auladevsuperior.dscommerce.entities.OrderItem;
import com.auladevsuperior.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
