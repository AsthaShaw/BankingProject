package com.bank.mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author asthashaw
 *
 */
class OverdraftTest {
	/* Test case for testing the Overdraft method */
	@Test
	public void Overdrafttest() {
		Account account = new Account();
		Boolean response = account.overdraftResponse();
		assertEquals(Boolean.valueOf(true), response);
	}

}
