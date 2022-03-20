package ch01.step01.ticket.prev.domain;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvitationTest {

	@Test
	public void whenTest() {
		//Given
		Invitation invitation = new Invitation();

		//When
		LocalDateTime when = invitation.when();

		//Then
		Assertions.assertNull(when);
		//LocalDateTime.class.isAssignableFrom(when.getClass());
	}
}
