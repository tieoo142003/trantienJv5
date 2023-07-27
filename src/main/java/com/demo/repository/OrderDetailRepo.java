package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.OrderDetail;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetail, String> {

}
