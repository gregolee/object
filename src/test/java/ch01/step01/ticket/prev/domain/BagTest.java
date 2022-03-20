package ch01.step01.ticket.prev.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BagTest {

	private Long fee;

	@BeforeEach
	void initialize() {
		fee = 8000L;
	}

	@Test
	public void hasInvitationTest() {
		//Given
		Bag bag = new Bag(0);

		//When
		boolean hasInvitation = bag.hasInvitation();

		//Then
		Assertions.assertEquals(false, hasInvitation);
	}

	@Test
	public void hasTicketTest() {
		//Given
		Bag bag = new Bag(0);

		//When
		boolean hasTicket = bag.hasTicket();

		//Then
		Assertions.assertEquals(false, hasTicket);
	}

	@Test
	public void takeTicket() {
		//Given
		Bag bag = new Bag(0);
		Ticket ticket = new Ticket(fee);

		//When
		bag.takeTicket(ticket);
		boolean hasTicket = bag.hasTicket();

		//Then
		Assertions.assertEquals(true, hasTicket);
	}

	@Test
	public void minusAmount() {
		//Given
		Bag bag = new Bag(0);
		Long minusAmount = 1000L;

		//When
		bag.minusAmount(minusAmount);
		Long amount = bag.amount();

		//Then
		Assertions.assertEquals(0, amount);
	}

	@Test
	public void plusAmount() {
		//Given
		Bag bag = new Bag(0);
		Long plusAmount = 5000L;

		//When
		bag.plusAmount(plusAmount);
		Long amount = bag.amount();

		//Then
		Assertions.assertEquals(5000L, amount);
	}
}
