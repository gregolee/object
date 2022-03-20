package ch01.step01.ticket.prev.domain;

public class Audience {
	private final Bag bag;

	public Audience(Bag bag) {
		this.bag = bag;
	}

	public Bag bag() {
		return this.bag;
	}
}
