package com.assignment.BookStoreApi.Service;

import java.util.List;
import java.util.Optional;

import com.assignment.BookStoreApi.Entity.Order;

public interface OrderService {
	
	public Order saveOrder(Order order);
	public List<Order> getAllOrders();
	public  Optional<Order> getOrderById(Long orderId);
	public Order updateOrder(Long orderId, Order orderDetails);
	public void deleteOrder(Long orderId);

}
