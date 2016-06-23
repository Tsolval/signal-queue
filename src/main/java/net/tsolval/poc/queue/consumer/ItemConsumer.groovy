package net.tsolval.poc.queue.consumer

import net.tsolval.poc.queue.entity.Item

import java.util.function.Consumer

/**
 * Created by tsolval on 6/22/16.
 */
class ItemConsumer implements Consumer<Item> {
    void accept(Item item) {
        println("Consumed message: '${item.message}'.  Yum!")
    }
}
