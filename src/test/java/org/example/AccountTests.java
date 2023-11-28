package org.example;

import org.example.bank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AccountTests {
    private Account account;

    @BeforeEach
    void setup() {
        account = new Account(150);

    }

    @Test
    public void testGetBalance() {
        var expected = 150;
        var actual = account.getBalance();

        assertEquals(expected, actual, "Acount balance shoud be 150");


    }

    @Test
    public void testDeposit() {
        //Act

        account.deposit(1000);

        var expected = 1150;
        var actual = account.getBalance();

        assertEquals(expected, actual, "Acount balance shoud be 1150");
    }
}
