package ch01.step01.ticket.prev.domain;

public class Ticket {
	private Long fee;

	public Ticket(Long fee) {
		this.fee = fee;
	}

	public Long fee() {
		return this.fee;
	}
}
