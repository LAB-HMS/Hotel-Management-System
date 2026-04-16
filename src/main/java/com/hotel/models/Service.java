package com.hotel.models;

/**
 * Open-Closed Principle: New services (Spa, Gym, etc.) can be added 
 * by implementing this interface without changing the Invoice logic.
 */
public interface Service {
    String getDescription();
    double getPrice();
}