package com.kodilla.shop;

interface ProducerStrategy {
    boolean processOrder(String supplier, int quantity, String productType);
}

// Konkretna implementacja strategii dla producenta ExtraFoodShop
class ExtraFoodShopStrategy implements ProducerStrategy {
    @Override
    public boolean processOrder(String supplier, int quantity, String productType) {
        // Logika procesu zamawiania dla ExtraFoodShop
        System.out.println("Ordering " + quantity + " " + productType + " from ExtraFoodShop");
        // Implementacja procesu zamówienia
        return true; // Załóżmy, że zawsze się udaje
    }
}

// Konkretna implementacja strategii dla producenta HealthyShop
class HealthyShopStrategy implements ProducerStrategy {
    @Override
    public boolean processOrder(String supplier, int quantity, String productType) {
        // Logika procesu zamawiania dla HealthyShop
        System.out.println("Ordering " + quantity + " " + productType + " from HealthyShop");
        // Implementacja procesu zamówienia
        return true; // Załóżmy, że zawsze się udaje
    }
}

// Konkretna implementacja strategii dla producenta GlutenFreeShop
class GlutenFreeShopStrategy implements ProducerStrategy {
    @Override
    public boolean processOrder(String supplier, int quantity, String productType) {
        // Logika procesu zamawiania dla GlutenFreeShop
        System.out.println("Ordering " + quantity + " " + productType + " from GlutenFreeShop");
        // Implementacja procesu zamówienia
        return true; // Załóżmy, że zawsze się udaje
    }
}

// Kontekst, który używa strategii zamawiania produktów od producentów
class OrderProcessor {
    private ProducerStrategy strategy;

    public void setStrategy(ProducerStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean processOrder(String supplier, int quantity, String productType) {
        // Wywołanie konkretnej strategii zamawiania
        return strategy.processOrder(supplier, quantity, productType);
    }
}

// Testowanie działania systemu
public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        // Testowanie zamówienia od ExtraFoodShop
        orderProcessor.setStrategy(new ExtraFoodShopStrategy());
        orderProcessor.processOrder("ExtraFoodShop", 5, "Apples");

        // Testowanie zamówienia od HealthyShop
        orderProcessor.setStrategy(new HealthyShopStrategy());
        orderProcessor.processOrder("HealthyShop", 3, "Bananas");

        // Testowanie zamówienia od GlutenFreeShop
        orderProcessor.setStrategy(new GlutenFreeShopStrategy());
        orderProcessor.processOrder("GlutenFreeShop", 2, "Bread");
    }
}