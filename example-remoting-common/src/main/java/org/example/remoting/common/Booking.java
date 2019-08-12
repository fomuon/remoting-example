package org.example.remoting.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking implements Serializable {
	private String bookingCode;

//	public Booking(String bookingCode) {
//		this.bookingCode = bookingCode;
//	}

	@Override
	public String toString() {
		return String.format("Ride confirmed: code '%s'.", bookingCode);
	}
}
