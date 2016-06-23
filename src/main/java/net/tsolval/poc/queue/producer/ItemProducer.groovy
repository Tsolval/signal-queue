package net.tsolval.poc.queue.producer

import net.tsolval.poc.queue.entity.Item

import java.util.function.Supplier

/**
 * Created by tsolval on 6/22/16.
 */
class ItemProducer implements Supplier<Item>{
    Long itemNumber = 0

    Item get() {
        String itemName = itemNumber.toString()
        itemNumber++
        return new Item(itemName)
    }
}
