package com.assignment.BookStoreApi.Service;

import java.nio.charset.CoderResult;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.BookStoreApi.Entity.Order;
import com.assignment.BookStoreApi.Repository.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository or ;

	@Override
	public Order saveOrder(Order order) {
		
		return or.save(order);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return (List<Order>) or.findAll();
	}

	@Override
	public Optional<Order> getOrderById(Long orderId) {
		// TODO Auto-generated method stub
		return or.findById(orderId);
	}

	@Override
	public Order updateOrder(Long orderId, Order orderDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(Long orderId) {
		// TODO Auto-generated method stub
		or.deleteById(orderId);
	}

	

}
