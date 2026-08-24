/*
 * Decompiled with CFR 0.152.
 */
package jnr.enxio.channels;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelectionKey;
import jnr.enxio.channels.NativeSelectableChannel;
import jnr.enxio.channels.PollSelector;

class PollSelectionKey
extends AbstractSelectionKey {
    private final NativeSelectableChannel channel;
    private final PollSelector selector;
    private int readyOps = 0;
    private int index = -1;
    private int interestOps = 0;

    void setIndex(int index) {
        this.index = index;
    }

    int getIndex() {
        return this.index;
    }

    @Override
    public SelectionKey interestOps(int ops) {
        this.interestOps = ops;
        this.selector.interestOps(this, ops);
        return this;
    }

    @Override
    public int interestOps() {
        return this.interestOps;
    }

    @Override
    public SelectableChannel channel() {
        return (SelectableChannel)((Object)this.channel);
    }

    void readyOps(int readyOps) {
        this.readyOps = readyOps;
    }

    public PollSelectionKey(PollSelector selector, NativeSelectableChannel channel) {
        this.selector = selector;
        this.channel = channel;
    }

    @Override
    public int readyOps() {
        return this.readyOps;
    }

    int getFD() {
        return this.channel.getFD();
    }

    @Override
    public Selector selector() {
        return this.selector;
    }
}

