package com.hotel.models;

import java.util.List;
import java.util.ArrayList;

public class Invoice {
    private String invoiceId;
    private Booking booking;
    private List<Service> extraCharges = new ArrayList<>();
    private double totalAmount;

    // Student must implement: totalAmount calculation including the list of Services
}