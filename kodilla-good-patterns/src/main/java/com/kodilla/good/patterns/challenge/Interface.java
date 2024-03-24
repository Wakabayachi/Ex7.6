package com.kodilla.good.patterns.challenge;

import java.time.LocalDateTime;

interface InformationService {
    void inform(User user);
}

interface ProductService {
    boolean order(User user, Product product, int quantity);
}

interface ProductRepository {
    void createOrder(User user, Product product, int quantity, LocalDateTime orderDateTime);
}