package ch01.step01.ticket.prev.domain;

public class TicketSeller {
	private final TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public TicketOffice ticketOffice() {
		return this.ticketOffice;
	}
}
