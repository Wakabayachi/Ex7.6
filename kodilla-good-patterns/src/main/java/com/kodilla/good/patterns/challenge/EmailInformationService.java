package com.kodilla.good.patterns.challenge;

public class EmailInformationService implements InformationService {
    @Override
    public void inform(User user) {
        // Logika wysyłania informacji email
        System.out.println("Wysyłanie potwierdzenia zamówienia na adres email: " + user.getName());
    }
}