package ch01.step01.ticket.prev.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketSellerTest {

	private Long fee;
	private Ticket ticketOne;
	private Ticket ticketTwo;
	private Ticket ticketThree;
	private Ticket ticketFour;
	private Ticket ticketFive;
	private Long initialAmount;
	private TicketOffice ticketOffice;

	@BeforeEach
	void initialize() {
		ticketOne = new Ticket(fee);
		ticketTwo = new Ticket(fee);
		ticketThree = new Ticket(fee);
		ticketFour = new Ticket(fee);
		ticketFive = new Ticket(fee);
		initialAmount = 50000L;
		ticketOffice = new TicketOffice(initialAmount, ticketOne, ticketTwo, ticketThree, ticketFour, ticketFive);
	}

	@Test
	public void ticketOfficeTest() {
		//Given
		TicketSeller ticketSeller = new TicketSeller(ticketOffice);

		//When
		TicketOffice ticketOffice = ticketSeller.ticketOffice();

		//Then
		Assertions.assertNotNull(ticketOffice);
		Assertions.assertEquals(true, ticketOffice == ticketSeller.ticketOffice());
	}
}
