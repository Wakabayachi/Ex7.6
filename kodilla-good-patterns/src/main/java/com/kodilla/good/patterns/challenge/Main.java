package com.kodilla.good.patterns.challenge;

public class Main {
    public static void main(String[] args) {
        // Inicjalizacja serwisów
        InformationService informationService = new EmailInformationService();
        ProductRepository productRepository = new DatabaseProductRepository();

        // Inicjalizacja serwisu zamówień
        ProductService productService = new ProductOrderService(informationService, productRepository);

        // Przykładowe zamówienie
        User user = new User("John");
        Product product = new Product("Shoes");
        int quantity = 2;

        // Tworzenie żądania zamówienia
        OrderRequest orderRequest = new OrderRequest(user, product, quantity);

        // Przetwarzanie zamówienia
        boolean orderDto = productService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());

        // Obsługa wyniku zamówienia
        if (orderDto) {
            System.out.println("Zamówienie dla użytkownika " + orderDto + " zostało złożone.");
        } else {
            System.out.println("Zamówienie dla użytkownika " + orderDto + " nie mogło zostać zrealizowane.");
        }
    }
}