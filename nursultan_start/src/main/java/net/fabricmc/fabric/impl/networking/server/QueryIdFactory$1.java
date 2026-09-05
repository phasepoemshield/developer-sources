/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.networking.server;

import java.util.concurrent.atomic.AtomicInteger;
import net.fabricmc.fabric.impl.networking.server.QueryIdFactory;

class QueryIdFactory$1
implements QueryIdFactory {
    private final AtomicInteger currentId = new AtomicInteger();

    QueryIdFactory$1() {
    }

    @Override
    public int nextId() {
        return this.currentId.getAndIncrement();
    }
}

