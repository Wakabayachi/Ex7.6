package com.kodilla.good.patterns.challenge;

import java.time.LocalDateTime;

public class ProductOrderService implements ProductService {
    private InformationService informationService;
    private ProductRepository productRepository;

    public ProductOrderService(InformationService informationService, ProductRepository productRepository) {
        this.informationService = informationService;
        this.productRepository = productRepository;
    }

    @Override
    public boolean order(User user, Product product, int quantity) {
        /* Logika zamawiania produktu */
        boolean isOrdered = false;
        if (isOrdered) {
            informationService.inform(user);
            productRepository.createOrder(user, product, quantity, LocalDateTime.now());
            return true;
        } else {
            return false;
        }
    }
}