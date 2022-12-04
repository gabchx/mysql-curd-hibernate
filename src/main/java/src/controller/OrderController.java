package src.controller;

import src.model.Order;
import src.repository.OrderRepository;
import src.repository.implementation.OrderImplementation;

import java.util.List;

public class OrderController {
    private OrderRepository repository = new OrderImplementation();

    public List<Order> printAll() {

        return repository.getAll();
    }

    public void addOrder(Order newOrder) {
        repository.add(newOrder);
    }

    public void deleteOrder(Long index) {
        repository.deleteById(index);
    }

    public void updateOrder(Long id, Order updateOrder) {
        repository.update(id, updateOrder);
    }

    public Order getValueByIndex(Long index) {

        return repository.getById(index);
    }
}