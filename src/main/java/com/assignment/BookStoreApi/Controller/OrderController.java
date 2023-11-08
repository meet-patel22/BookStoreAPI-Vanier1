package com.assignment.BookStoreApi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.BookStoreApi.Entity.Order;
import com.assignment.BookStoreApi.Service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	 	@Autowired
	    private OrderService orderService;
	 


	    // Create a new order
	    @PostMapping("/save")
	    public void saveOrder(@RequestBody Order order) {
	        Order savedOrder = orderService.saveOrder(order);
	       
	    }

	    // Get all orders
	    @GetMapping("/")
	    public List<Order> getAllOrders() {
	        List<Order> orders = orderService.getAllOrders();
	        return orders;
	    }

	    // Get a specific order by ID
	    @GetMapping("/id")
	    public Optional<Order> getOrderById(@RequestParam Long orderId) {
	        Optional<Order> order = orderService.getOrderById(orderId);
	        if (order.isPresent()) {
	            return order;
	        } else {
	            return null ;
	        }
	    }

	    // Update an existing order
	    @PutMapping("/{orderId}")
//	    public Order updateOrder(@PathVariable Long orderId, @RequestBody Order orderDetails) {
//	        Order updatedOrder = orderService.updateOrder(orderId, orderDetails);
//	        if (updatedOrder != null) {
//	           // return new ResponseEntity<>(updatedOrder, HttpStatus.OK);
//	        } else {
//	          //  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	        }
//	    }

	    // Delete an order by ID
	    @DeleteMapping("/id")
	    public void deleteOrder(@RequestParam Long orderId) {
	        orderService.deleteOrder(orderId);
	        
	    }
	

}
