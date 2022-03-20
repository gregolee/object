package ch01.step01.ticket.prev.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TheaterTest {

	private Long fee;
	private Ticket ticketOne;
	private Ticket ticketTwo;
	private Ticket ticketThree;
	private Ticket ticketFour;
	private Ticket ticketFive;
	private Long initialAmount;
	private TicketOffice ticketOffice;
	private TicketSeller ticketSeller;
	private Long audienceAmount;
	//초대장이 없는 방청객
	private Bag bagWithoutInvitation;
	private Audience audienceHasInvitation;
	//초대장이 있는 방청객
	private Invitation invitation;
	private Bag bagHasInvitation;
	private Audience audienceWithoutInvitation;

	@BeforeEach
	void initialize() {
		//티켓
		fee = 8000L;
		ticketOne = new Ticket(fee);
		ticketTwo = new Ticket(fee);
		ticketThree = new Ticket(fee);
		ticketFour = new Ticket(fee);
		ticketFive = new Ticket(fee);

		//티켓 창구 및 판매처
		initialAmount = 50000L;
		ticketOffice = new TicketOffice(initialAmount, ticketOne, ticketTwo, ticketThree, ticketFour, ticketFive);
		ticketSeller = new TicketSeller(ticketOffice);

		//초대장이 없는 방청객
		audienceAmount = 10000L;
		bagWithoutInvitation = new Bag(audienceAmount);
		audienceWithoutInvitation = new Audience(bagWithoutInvitation);

		//초대장이 있는 방청객
		invitation = new Invitation();
		bagHasInvitation = new Bag(invitation, audienceAmount);
		audienceHasInvitation = new Audience(bagHasInvitation);
	}

	@Test
	public void enterTheaterWhoIsAudienceWithoutInvitationTest() {
		//Given
		Theater theater = new Theater(ticketSeller);

		//When
		theater.enter(audienceWithoutInvitation);

		//Then
		Assertions.assertEquals(initialAmount + fee, ticketSeller.ticketOffice().amount());
		Assertions.assertEquals(true, audienceWithoutInvitation.bag().hasTicket());
		Assertions.assertEquals(audienceAmount - fee, audienceWithoutInvitation.bag().amount());
	}

	@Test
	public void enterTheaterWhoIsAudienceHasInvitationTest() {
		//Given
		Theater theater = new Theater(ticketSeller);

		//When
		theater.enter(audienceHasInvitation);

		//Then
		Assertions.assertEquals(initialAmount, ticketSeller.ticketOffice().amount());
		Assertions.assertEquals(true, audienceHasInvitation.bag().hasTicket());
		Assertions.assertEquals(audienceAmount, audienceHasInvitation.bag().amount());
	}
}
