package ch01.step01.ticket.prev.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
	private int INDEX_OF_FIRST_TICKET = 0;
	private Long amount;
	private final List<Ticket> tickets = new ArrayList<>();

	public TicketOffice(Long amount, Ticket ... tickets) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets));
	}

	public Ticket issueTicket() {
		return tickets.remove(INDEX_OF_FIRST_TICKET);
	}

	public Long amount() {
		return this.amount;
	}

	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}
