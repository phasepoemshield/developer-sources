/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.transport.jnr;

import java.io.IOException;
import java.net.SocketOption;
import java.nio.channels.SocketChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import jnr.posix.util.Platform;
import jnr.unixsocket.UnixServerSocketChannel;
import jnr.unixsocket.UnixSocketAddress;
import jnr.unixsocket.UnixSocketChannel;
import jnr.unixsocket.UnixSocketOptions;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.connections.transports.AbstractUnixTransport;
import org.freedesktop.dbus.exceptions.TransportConfigurationException;
import org.freedesktop.dbus.transport.jnr.JnrUnixBusAddress;
import org.freedesktop.dbus.transport.jnr.JnrUnixSocketHelper;
import org.freedesktop.dbus.utils.Util;

public class UnixSocketTransport
extends AbstractUnixTransport {
    private final UnixSocketAddress unixSocketAddress;
    private UnixServerSocketChannel serverSocket;
    private UnixSocketChannel socket;

    @Override
    public int getUid(SocketChannel _sock) throws IOException {
        return JnrUnixSocketHelper.getUid(_sock);
    }

    @Override
    protected boolean hasFileDescriptorSupport() {
        return true;
    }

    @Override
    public SocketChannel acceptImpl() throws IOException {
        this.socket = this.serverSocket.accept();
        this.socket.configureBlocking(true);
        if (!Util.isMacOs() && !Platform.IS_FREEBSD) {
            this.socket.setOption((SocketOption)UnixSocketOptions.SO_PASSCRED, (Object)true);
        }
        return this.socket;
    }

    UnixSocketTransport(JnrUnixBusAddress _address, TransportConfig _config) throws TransportConfigurationException {
        super(_address, _config);
        if (_address.isAbstract()) {
            this.unixSocketAddress = new UnixSocketAddress("\u0000" + _address.getAbstract());
        } else if (_address.hasPath()) {
            this.unixSocketAddress = new UnixSocketAddress(_address.getPath());
        } else {
            throw new TransportConfigurationException("Unix socket url has to specify 'path' or 'abstract'");
        }
        this.getSaslConfig().setAuthMode(1);
    }

    @Override
    public SocketChannel connectImpl() throws IOException {
        if (this.getAddress().isListeningSocket()) {
            throw new IOException("Connect connect to a listening socket (use listenImpl() instead)");
        }
        this.socket = UnixSocketChannel.open(this.unixSocketAddress);
        this.socket.configureBlocking(true);
        if (!Util.isMacOs() && !Platform.IS_FREEBSD) {
            this.socket.setOption((SocketOption)UnixSocketOptions.SO_PASSCRED, (Object)true);
        }
        return this.socket;
    }

    @Override
    public void bindImpl() throws IOException {
        if (!this.getAddress().isListeningSocket()) {
            throw new IOException("Cannot listen on a client connection (use connectImpl() instead)");
        }
        if (!this.isBound()) {
            this.serverSocket = UnixServerSocketChannel.open();
            this.serverSocket.configureBlocking(true);
            this.serverSocket.socket().bind(this.unixSocketAddress);
        }
    }

    @Override
    protected void closeTransport() throws IOException {
        if (this.socket != null && this.socket.isOpen()) {
            this.socket.close();
        }
        if (this.serverSocket != null && this.serverSocket.isOpen()) {
            this.serverSocket.close();
            String p = this.unixSocketAddress.humanReadablePath();
            if (p != null && !p.startsWith("@")) {
                Files.deleteIfExists(Path.of(p, new String[0]));
            }
        }
    }

    @Override
    protected boolean isBound() {
        return this.serverSocket != null && this.serverSocket.isOpen();
    }
}

