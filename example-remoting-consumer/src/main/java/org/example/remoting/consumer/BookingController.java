package org.example.remoting.consumer;

import org.example.remoting.common.Booking;
import org.example.remoting.common.BookingException;
import org.example.remoting.common.CabBookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookingController
 *
 * @author yongkyu.lee (yongkyu.lee@navercorp.com)
 */
@RestController
public class BookingController {
	private final CabBookingService cabBookingService;

	public BookingController(CabBookingService cabBookingService) {
		this.cabBookingService = cabBookingService;
	}

	@GetMapping("/bookRide")
	public Booking bookRide(@RequestParam(defaultValue = "13 Seagate Blvd, Key Largo, FL 33037") String pickUpLocation) throws BookingException {

		try {
			Booking booking = cabBookingService.bookRide(pickUpLocation);

			return booking;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
