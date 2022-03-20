package ch01.step01.ticket.prev.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AudienceTest {

	@Test
	public void bagTest() {
		//Given
		Bag bag = new Bag(10000);

		//When
		Audience audience = new Audience(bag);
		boolean isBagInstance = Bag.class.isInstance(audience.bag());

		//Then
		Assertions.assertEquals(true, isBagInstance);
	}
}
