package src.controller;

import src.model.Product;
import src.repository.ProductRepository;
import src.repository.implementation.ProductImplementation;

import java.util.List;

public class ProductController {
    private ProductRepository repository = new ProductImplementation();

    public List<Product> printAll() {

        return repository.getAll();
    }

    public void addProduct(Product newProduct) {
        repository.add(newProduct);
    }

    public void deleteProduct(Long index) {
        repository.deleteById(index);
    }

    public void updateProduct(Long id, Product updateProduct) {
        repository.update(id, updateProduct);
    }

    public Product getValueByIndex(Long index) {

        return repository.getById(index);
    }
}