/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.connection.Connection
 *  fun.crashsystem.jdrpc.protocol.Frame
 *  fun.crashsystem.jdrpc.protocol.FrameReader
 *  fun.crashsystem.jdrpc.protocol.FrameWriter
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
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

final class WindowsConnection
implements Connection {
    private static Logger log = LogManager.getLogger((String)"fun.crashsystem.jdrpc.connection.WindowsConnection");
    private static final int POLL_INTERVAL_MS = 50;
    private final ReentrantLock writeLock = new ReentrantLock();
    public final RandomAccessFile file;
    private final InputStream inputStream;
    private final OutputStream outputStream;
    public volatile boolean closed;

    WindowsConnection(String string) throws IOException {
        this.file = new RandomAccessFile(string, "rw");
        this.inputStream = new /* Unavailable Anonymous Inner Class!! */;
        this.outputStream = new OutputStream(){

            @Override
            public void write(int b) throws IOException {
                WindowsConnection.this.file.write(b);
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                if (b == null) {
                    throw new NullPointerException("b is marked non-null but is null");
                }
                WindowsConnection.this.file.write(b, off, len);
            }
        };
        log.debug("Connected to Windows pipe: {}", (Object)string);
    }

    public boolean isOpen() {
        return !this.closed;
    }

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

    public Frame read() throws IOException {
        return FrameReader.read((InputStream)this.inputStream);
    }

    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.file.close();
        log.debug("Windows connection closed");
    }

    private void ensureOpen() throws IOException {
        if (this.closed) {
            throw new IOException("Connection is closed");
        }
    }
}

