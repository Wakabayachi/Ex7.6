package com.kodilla.good.patterns.challenge;

import java.time.LocalDateTime;

public class DatabaseProductRepository implements ProductRepository {
    @Override
    public void createOrder(User user, Product product, int quantity, LocalDateTime orderDateTime) {
        // Logika zapisu zamówienia do bazy danych
        System.out.println("Zapisywanie zamówienia w bazie danych: " + user.getName() + ", " + product.getName() + ", " + quantity + ", " + orderDateTime);
    }
}