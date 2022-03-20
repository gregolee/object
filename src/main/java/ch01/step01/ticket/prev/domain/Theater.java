package ch01.step01.ticket.prev.domain;

public class Theater {
	private final TicketSeller ticketSeller;

	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}

	public void enter(Audience audience) {
		Ticket ticket = ticketSeller.ticketOffice().issueTicket();

		if(!audience.bag().hasInvitation()) {
			ticketSeller.ticketOffice().plusAmount(ticket.fee());
			audience.bag().minusAmount(ticket.fee());
		}

		audience.bag().takeTicket(ticket);
	}
}
