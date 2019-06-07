package com.bank.mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author asthashaw
 *
 */
class DepositTest {

	/* Test case for testing the deposit method */
	@Test
	public void DepositTest() {
		Account account = new Account();
		Double amount = account.deposit(500);
		assertEquals(Double.valueOf(500), amount);
	}

}
