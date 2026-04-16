
package com.hotel.operations;

import com.hotel.models.*;
import com.hotel.enums.RoomType;
import java.time.LocalDate;
import java.util.List;

public interface HotelOperations {
    // Room Management
    void addRoom(Room room);
    List<Room> findAvailableRooms(RoomType type, LocalDate start, LocalDate end);

    // Transactional Logic
    Booking createBooking(Guest guest, Room room, LocalDate start, LocalDate end);
    void checkIn(String bookingId);
    
    /**
     * Should return a calculated Invoice object.
     */
    Invoice processCheckOut(String bookingId);
}