package net.tsolval.poc.queue.consumer;

import net.tsolval.poc.queue.entity.Item;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import static org.junit.Assert.*;

/**
 * Created by tsolval on 6/22/16.
 */
public class ItemConsumerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    @Test
    public void testItemConsumer() {
        Consumer<Item> ic = new ItemConsumer();
        ic.accept(new Item("Hello"));
        assertEquals("Invalid Response from Consumer", "Consumed message: 'Hello'.  Yum!", outContent.toString().trim());
    }
}