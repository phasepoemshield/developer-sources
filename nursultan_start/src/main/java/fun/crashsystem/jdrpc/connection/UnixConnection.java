/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.protocol.Frame
 *  fun.crashsystem.jdrpc.protocol.FrameReader
 *  fun.crashsystem.jdrpc.protocol.FrameWriter
 *  java.net.UnixDomainSocketAddress
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package fun.crashsystem.jdrpc.connection;

import fun.crashsystem.jdrpc.connection.Connection;
import fun.crashsystem.jdrpc.protocol.Frame;
import fun.crashsystem.jdrpc.protocol.FrameReader;
import fun.crashsystem.jdrpc.protocol.FrameWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolFamily;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.net.UnixDomainSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class UnixConnection
implements Connection {
    private static final Logger log = LogManager.getLogger(UnixConnection.class);
    private final ReentrantLock writeLock = new ReentrantLock();
    final SocketChannel channel = SocketChannel.open((ProtocolFamily)StandardProtocolFamily.UNIX);
    private final InputStream inputStream;
    private final OutputStream outputStream;
    private volatile boolean closed;

    UnixConnection(String string) throws IOException {
        this.channel.connect((SocketAddress)UnixDomainSocketAddress.of((Path)Path.of(string, new String[0])));
        this.inputStream = Channels.newInputStream(this.channel);
        this.outputStream = Channels.newOutputStream(this.channel);
        log.debug("Connected to Unix socket: {}", (Object)string);
    }

    @Override
    public boolean isOpen() {
        return !this.closed && this.channel.isOpen();
    }

    @Override
    public void write(Frame frame) throws IOException {
        this.ensureOpen();
        this.writeLock.lock();
        try {
            this.ensureOpen();
            FrameWriter.write((OutputStream)this.outputStream, (Frame)frame);
        }
        finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public Frame read() throws IOException {
        return FrameReader.read((InputStream)this.inputStream);
    }

    @Override
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.channel.close();
        log.debug("Unix connection closed");
    }

    private void ensureOpen() throws IOException {
        if (this.closed) {
            throw new IOException("Connection is closed");
        }
    }
}

