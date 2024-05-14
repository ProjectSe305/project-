package Test;

import static org.junit.Assert.assertEquals;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import BuyBusinessLayer;
import BuyPresentationLayer;

public class BuyPresentationLayerTest {
    private BuyBusinessLayer mockBusinessLayer;
    private BuyPresentationLayer presentationLayer;
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;



    @After
    public void tearDown() {
        System.setIn(systemIn);
    }

    @Test
    public void testStartBuy() {
        // Prepare test input
        double amount = 100.0;
        String input = amount + "\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Call method under test


        // Verify that the business layer method was called with the correct argument

    }
}
