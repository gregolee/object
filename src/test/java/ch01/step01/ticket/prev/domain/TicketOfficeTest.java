package ch01.step01.ticket.prev.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketOfficeTest {

	private Long fee;
	private Ticket ticketOne;
	private Ticket ticketTwo;
	private Ticket ticketThree;
	private Ticket ticketFour;
	private Ticket ticketFive;
	private Long initialAmount;
	private Long minusAmount;
	private Long plusAmount;

	@BeforeEach
	void initialize() {
		fee = 8000L;
		ticketOne = new Ticket(fee);
		ticketTwo = new Ticket(fee);
		ticketThree = new Ticket(fee);
		ticketFour = new Ticket(fee);
		ticketFive = new Ticket(fee);
		initialAmount = 50000L;
		minusAmount = 10000L;
		plusAmount = 20000L;
	}

	@Test
	public void issueTicketTest() {
		//Given
		TicketOffice ticketOffice = new TicketOffice(initialAmount, ticketOne, ticketTwo, ticketThree, ticketFour, ticketFive);

		//When
		Ticket issuedTicket = ticketOffice.issueTicket();

		//Then
		Assertions.assertNotNull(issuedTicket);
		Assertions.assertEquals(true, Ticket.class.isInstance(issuedTicket));
	}

	@Test
	public void minusAmountTest() {
		//Given
		TicketOffice ticketOffice = new TicketOffice(initialAmount, ticketOne, ticketTwo, ticketThree, ticketFour, ticketFive);

		//When
		ticketOffice.minusAmount(minusAmount);

		//Then
		Assertions.assertEquals(initialAmount-minusAmount, ticketOffice.amount());
	}

	@Test
	public void plusAmountTest() {
		//Given
		TicketOffice ticketOffice = new TicketOffice(initialAmount, ticketOne, ticketTwo, ticketThree, ticketFour, ticketFive);

		//When
		ticketOffice.plusAmount(plusAmount);

		//Then
		Assertions.assertEquals(initialAmount+plusAmount, ticketOffice.amount());
	}


}
