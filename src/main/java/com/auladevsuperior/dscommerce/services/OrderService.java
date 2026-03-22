package com.auladevsuperior.dscommerce.services;

import com.auladevsuperior.dscommerce.dto.OrderDTO;
import com.auladevsuperior.dscommerce.entities.Order;
import com.auladevsuperior.dscommerce.repositories.OrderRepository;
import com.auladevsuperior.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
