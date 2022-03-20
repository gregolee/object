package ch01.step01.ticket.prev.domain;

public class Bag {

	private Long NO_MONEY = 0L;
	private Invitation invitation;
	private Ticket ticket;
	private Long amount;

	public Bag(long amount) {
		this(null, amount);
	}

	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}

	public boolean hasInvitation() {
		return this.invitation != null;
	}

	public boolean hasTicket() {
		return this.ticket != null;
	}

	public void takeTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Long amount() {
		return this.amount;
	}

	public void minusAmount(Long amount) {
		if(this.amount - amount < NO_MONEY) {
			return;
		}
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}
