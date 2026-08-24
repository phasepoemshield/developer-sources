/*
 * Decompiled with CFR 0.152.
 */
package jnr.enxio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;
import jnr.constants.platform.Shutdown;
import jnr.enxio.channels.Native;
import jnr.enxio.channels.NativeSelectableChannel;
import jnr.enxio.channels.NativeSelectorProvider;

public class NativeSocketChannel
extends AbstractSelectableChannel
implements ByteChannel,
NativeSelectableChannel {
    private static final int SHUT_RD = Shutdown.SHUT_RD.intValue();
    private final int fd;
    private final int validOps;
    private static final int SHUT_WR = Shutdown.SHUT_WR.intValue();

    public NativeSocketChannel(int fd, int ops) {
        this(NativeSelectorProvider.getInstance(), fd, ops);
    }

    NativeSocketChannel(SelectorProvider provider, int fd, int ops) {
        super(provider);
        this.fd = fd;
        this.validOps = ops;
    }

    @Override
    public final int getFD() {
        return this.fd;
    }

    @Override
    public final int validOps() {
        return this.validOps;
    }

    public void shutdownOutput() throws IOException {
        int n = Native.shutdown(this.fd, SHUT_WR);
        if (n < 0) {
            throw new IOException(Native.getLastErrorString());
        }
    }

    @Override
    public int write(ByteBuffer src) throws IOException {
        int n = Native.write(this.fd, src);
        if (n < 0) {
            switch (Native.getLastError()) {
                case EAGAIN: 
                case EWOULDBLOCK: {
                    return 0;
                }
            }
            throw new IOException(Native.getLastErrorString());
        }
        return n;
    }

    public void shutdownInput() throws IOException {
        int n = Native.shutdown(this.fd, SHUT_RD);
        if (n < 0) {
            throw new IOException(Native.getLastErrorString());
        }
    }

    @Override
    protected void implCloseSelectableChannel() throws IOException {
        Native.close(this.fd);
    }

    @Override
    protected void implConfigureBlocking(boolean block) throws IOException {
        Native.setBlocking(this.fd, block);
    }

    public NativeSocketChannel(int fd) {
        this(NativeSelectorProvider.getInstance(), fd, 5);
    }

    @Override
    public int read(ByteBuffer dst) throws IOException {
        int n = Native.read(this.fd, dst);
        switch (n) {
            case 0: {
                return -1;
            }
            case -1: {
                switch (Native.getLastError()) {
                    case EAGAIN: 
                    case EWOULDBLOCK: {
                        return 0;
                    }
                }
                throw new IOException(Native.getLastErrorString());
            }
        }
        return n;
    }
}

