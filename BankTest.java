import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	private static int accountCounter = 0;
	@Test
    public void test_create_bank() {
        Bank b = new Bank();
        BankAccount b1 = b.getAccount(accountCounter + 1);
        BankAccount b2 = b.getAccount(accountCounter + 2);
        BankAccount b3 = b.getAccount(accountCounter + 3);
        BankAccount b4 = b.getAccount(accountCounter + 4);
        
		assertEquals("Unexpected balance for 1st account", 0.0, b1.getBalance(),0.00001);
        assertEquals("Unexpected account number for 1st account", accountCounter + 1, b1.getAccountNumber());
        assertEquals("Unexpected balance for 2nd account", 0.0,b2.getBalance(),0.00001);
        assertEquals("Unexpected account number for 2nd account", accountCounter + 2, b2.getAccountNumber());
        assertEquals("Unexpected balance for 3rd account", 0.0,b3.getBalance(),0.00001);
		assertEquals("Unexpected account number for 2nd account", accountCounter + 3, b3.getAccountNumber());
        assertEquals("Unexpected balance for 4th account", 0.0,b4.getBalance(),0.00001);
        assertEquals("Unexpected account number for 2nd account", accountCounter + 4, b4.getAccountNumber());

		accountCounter += 4;
                    
    }
    
	@Test
    public void test_getAccount() {
        Bank b = new Bank();
        BankAccount b1 = b.getAccount(accountCounter + 1);
        BankAccount copy1 = b.getAccount(accountCounter + 1);
		accountCounter += 4;
        assertTrue("Account 1 not found (got null)", b1 != null);
		assertTrue("Second copy of 1 not found (got null)", copy1 != null);
        assertTrue("Accounts should be considered equal", b1.equals(copy1));
        assertFalse("Accounts should not be same object", b1 == copy1);
    }

}