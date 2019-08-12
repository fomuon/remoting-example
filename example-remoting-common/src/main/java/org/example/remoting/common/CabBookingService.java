package org.example.remoting.common;

public interface CabBookingService {
	Booking bookRide(String pickUpLocation) throws BookingException;
}
