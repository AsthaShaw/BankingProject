/**
 * 
 */
package com.bank.mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author asthashaw
 *
 */
class WithdrawTest {
	/* Test case for testing the withdraw method */
	@Test
	public void Withdrawtest() {
		Account account = new Account();
		Double amount = account.withdraw(500);
		assertEquals(Double.valueOf(-1), amount);
	}

}
