/*
 * Decompiled with CFR 0.152.
 */
package jnr.enxio.channels;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelectionKey;
import jnr.enxio.channels.KQSelector;
import jnr.enxio.channels.NativeSelectableChannel;

class KQSelectionKey
extends AbstractSelectionKey {
    private int interestOps = 0;
    private final KQSelector selector;
    private int readyOps = 0;
    private final NativeSelectableChannel channel;

    void readyOps(int readyOps) {
        this.readyOps = readyOps;
    }

    public KQSelectionKey(KQSelector selector, NativeSelectableChannel channel, int ops) {
        this.selector = selector;
        this.channel = channel;
        this.interestOps = ops;
    }

    @Override
    public int readyOps() {
        return this.readyOps;
    }

    @Override
    public Selector selector() {
        return this.selector;
    }

    int getFD() {
        return this.channel.getFD();
    }

    @Override
    public SelectableChannel channel() {
        return (SelectableChannel)((Object)this.channel);
    }

    @Override
    public int interestOps() {
        return this.interestOps;
    }

    @Override
    public SelectionKey interestOps(int ops) {
        this.interestOps = ops;
        this.selector.interestOps(this, ops);
        return this;
    }
}

