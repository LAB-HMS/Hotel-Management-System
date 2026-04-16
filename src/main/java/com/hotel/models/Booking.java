package com.hotel.models;

import java.time.LocalDate;
import com.hotel.enums.BookingStatus;

public class Booking {
    private String bookingId;
    private Guest guest;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private BookingStatus status;

    // Student must implement: Duration calculation and validation logic
}