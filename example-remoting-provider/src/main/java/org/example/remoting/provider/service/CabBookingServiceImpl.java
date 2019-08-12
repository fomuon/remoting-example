package org.example.remoting.provider.service;

import org.example.remoting.common.Booking;
import org.example.remoting.common.BookingException;
import org.example.remoting.common.CabBookingService;
import org.springframework.stereotype.Service;

import static java.lang.Math.random;
import static java.util.UUID.randomUUID;

@Service
public class CabBookingServiceImpl implements CabBookingService {
	@Override
	public Booking bookRide(String pickUpLocation) throws BookingException {
		if (random() < 0.3) throw new BookingException("Cab unavailable");
		return new Booking(randomUUID().toString());
	}
}
