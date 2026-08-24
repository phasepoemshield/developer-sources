/*
 * Decompiled with CFR 0.152.
 */
package jnr.unixsocket.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.DatagramChannel;
import java.nio.channels.spi.SelectorProvider;
import jnr.enxio.channels.Native;
import jnr.enxio.channels.NativeSelectableChannel;
import jnr.enxio.channels.NativeSelectorProvider;
import jnr.unixsocket.impl.Common;

public abstract class AbstractNativeDatagramChannel
extends DatagramChannel
implements NativeSelectableChannel,
ByteChannel {
    private final Common common;

    @Override
    public long write(ByteBuffer[] srcs, int offset, int length) throws IOException {
        return this.common.write(srcs, offset, length);
    }

    @Override
    protected void implCloseSelectableChannel() throws IOException {
        Native.close(this.common.getFD());
    }

    @Override
    public int read(ByteBuffer dst) throws IOException {
        return this.common.read(dst);
    }

    @Override
    public long read(ByteBuffer[] dsts, int offset, int length) throws IOException {
        return this.common.read(dsts, offset, length);
    }

    @Override
    protected void implConfigureBlocking(boolean block) throws IOException {
        Native.setBlocking(this.common.getFD(), block);
    }

    @Override
    public final int getFD() {
        return this.common.getFD();
    }

    AbstractNativeDatagramChannel(SelectorProvider provider, int fd) {
        super(provider);
        this.common = new Common(fd);
    }

    @Override
    public int write(ByteBuffer src) throws IOException {
        return this.common.write(src);
    }

    public void setFD(int fd) {
        this.common.setFD(fd);
    }

    public AbstractNativeDatagramChannel(int fd) {
        this(NativeSelectorProvider.getInstance(), fd);
    }
}

