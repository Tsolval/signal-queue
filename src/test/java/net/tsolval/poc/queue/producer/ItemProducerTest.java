package net.tsolval.poc.queue.producer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tsolval on 6/22/16.
 */
public class ItemProducerTest {
    @Test
    public void get() throws Exception {
        ItemProducer ip = new ItemProducer();
        assertEquals("Unexpected Item Returned", "0", ip.get().getMessage());
        assertEquals("Unexpected Item Returned", "1", ip.get().getMessage());
        assertEquals("Unexpected Item Returned", "2", ip.get().getMessage());
    }
}