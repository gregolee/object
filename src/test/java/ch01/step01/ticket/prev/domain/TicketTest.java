package ch01.step01.ticket.prev.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketTest {

	private Long fee;

	@BeforeEach
	void initialize() {
		fee = 8000L;
	}

	@Test
	public void getFeeTest() {
		//Given
		Ticket ticket = new Ticket(this.fee);

		//When
		Long feeFromTicket = ticket.fee();

		//Then
		Assertions.assertEquals(this.fee, feeFromTicket);
	}
}
