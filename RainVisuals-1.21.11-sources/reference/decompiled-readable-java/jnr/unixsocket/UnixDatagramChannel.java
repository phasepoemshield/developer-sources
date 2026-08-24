/*
 * Decompiled with CFR 0.152.
 */
package jnr.unixsocket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.MembershipKey;
import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jnr.constants.platform.ProtocolFamily;
import jnr.constants.platform.Sock;
import jnr.unixsocket.BindHandler;
import jnr.unixsocket.Common;
import jnr.unixsocket.Native;
import jnr.unixsocket.SockAddrUnix;
import jnr.unixsocket.UnixDatagramSocket;
import jnr.unixsocket.UnixSocketAddress;
import jnr.unixsocket.UnixSocketOptions;
import jnr.unixsocket.impl.AbstractNativeDatagramChannel;

public class UnixDatagramChannel
extends AbstractNativeDatagramChannel {
    private final BindHandler bindHandler;
    private State state;
    private UnixSocketAddress remoteAddress = null;
    private UnixSocketAddress localAddress = null;
    private final ReadWriteLock stateLock = new ReentrantReadWriteLock();

    private UnixDatagramChannel() throws IOException {
        this(Native.socket(ProtocolFamily.PF_UNIX, Sock.SOCK_DGRAM, 0));
    }

    public final UnixSocketAddress getLocalSocketAddress() {
        return this.localAddress != null ? this.localAddress : (this.localAddress = Common.getsockname(this.getFD()));
    }

    public UnixDatagramChannel connect(UnixSocketAddress remote) {
        this.stateLock.writeLock().lock();
        this.remoteAddress = remote;
        this.state = State.CONNECTED;
        this.stateLock.writeLock().unlock();
        return this;
    }

    @Override
    public SocketAddress getRemoteAddress() throws IOException {
        return this.remoteAddress;
    }

    /*
     * WARNING - void declaration
     */
    public static final UnixDatagramChannel[] pair() throws IOException {
        void var0;
        int[] nArray = new int[2];
        nArray[0] = -1;
        nArray[1] = -1;
        int[] sockets = nArray;
        Native.socketpair(ProtocolFamily.PF_UNIX, Sock.SOCK_DGRAM, 0, sockets);
        UnixDatagramChannel[] unixDatagramChannelArray = new UnixDatagramChannel[2];
        unixDatagramChannelArray[0] = new UnixDatagramChannel(sockets[0], State.CONNECTED, true);
        unixDatagramChannelArray[1] = new UnixDatagramChannel((int)var0[1], State.CONNECTED, true);
        return unixDatagramChannelArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    UnixDatagramChannel(int fd, State initialState, boolean initialBoundState) {
        super(fd);
        this.stateLock.writeLock().lock();
        try {
            this.state = initialState;
            this.bindHandler = new BindHandler(initialBoundState);
        }
        finally {
            this.stateLock.writeLock().unlock();
        }
    }

    @Override
    public SocketAddress getLocalAddress() throws IOException {
        return this.localAddress;
    }

    @Override
    public long write(ByteBuffer[] srcs, int offset, int length) throws IOException {
        if (this.state == State.CONNECTED) {
            return super.write(srcs, offset, length);
        }
        if (this.state == State.IDLE) {
            return 0L;
        }
        throw new ClosedChannelException();
    }

    @Override
    public UnixDatagramChannel disconnect() throws IOException {
        this.stateLock.writeLock().lock();
        this.remoteAddress = null;
        this.state = State.IDLE;
        this.stateLock.writeLock().unlock();
        return this;
    }

    UnixDatagramChannel(int fd, UnixSocketAddress remote) throws IOException {
        this(fd);
        this.connect(remote);
    }

    @Override
    public int read(ByteBuffer dst) throws IOException {
        if (this.state == State.CONNECTED) {
            return super.read(dst);
        }
        if (this.state == State.IDLE) {
            return 0;
        }
        throw new ClosedChannelException();
    }

    @Override
    public int write(ByteBuffer src) throws IOException {
        if (this.state == State.CONNECTED) {
            return super.write(src);
        }
        if (this.state == State.IDLE) {
            return 0;
        }
        throw new ClosedChannelException();
    }

    @Override
    public UnixDatagramChannel bind(SocketAddress local) throws IOException {
        this.localAddress = this.bindHandler.bind(this.getFD(), local);
        return this;
    }

    UnixDatagramChannel(ProtocolFamily domain, int protocol) throws IOException {
        this(Native.socket(domain, Sock.SOCK_DGRAM, protocol));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean isConnected() {
        void var1_1;
        this.stateLock.readLock().lock();
        boolean isConnected = this.state == State.CONNECTED;
        this.stateLock.readLock().unlock();
        return (boolean)var1_1;
    }

    @Override
    public MembershipKey join(InetAddress group, NetworkInterface interf) {
        throw new UnsupportedOperationException("join is not supported");
    }

    @Override
    public UnixDatagramSocket socket() {
        try {
            return new UnixDatagramSocket(this);
        }
        catch (SocketException e) {
            throw new NullPointerException("Could not create UnixDatagramSocket");
        }
    }

    @Override
    public final Set<SocketOption<?>> supportedOptions() {
        return DefaultOptionsHolder.defaultOptions;
    }

    boolean isBound() {
        return this.bindHandler.isBound();
    }

    @Override
    public MembershipKey join(InetAddress group, NetworkInterface interf, InetAddress source) {
        throw new UnsupportedOperationException("join is not supported");
    }

    public static final UnixDatagramChannel open() throws IOException {
        return new UnixDatagramChannel();
    }

    @Override
    public <T> T getOption(SocketOption<T> name) throws IOException {
        if (!this.supportedOptions().contains(name)) {
            throw new UnsupportedOperationException("'" + name + "' not supported");
        }
        return Common.getSocketOption(this.getFD(), name);
    }

    @Override
    public <T> DatagramChannel setOption(SocketOption<T> name, T value) throws IOException {
        if (name == null) {
            throw new IllegalArgumentException("name may not be null");
        }
        if (!this.supportedOptions().contains(name)) {
            throw new UnsupportedOperationException("'" + name + "' not supported");
        }
        Common.setSocketOption(this.getFD(), name, value);
        return this;
    }

    public final UnixSocketAddress getRemoteSocketAddress() {
        if (!this.isConnected()) {
            return null;
        }
        return this.remoteAddress != null ? this.remoteAddress : (this.remoteAddress = Common.getpeername(this.getFD()));
    }

    @Override
    public DatagramChannel connect(SocketAddress remote) throws IOException {
        if (remote instanceof UnixSocketAddress) {
            return this.connect((UnixSocketAddress)remote);
        }
        throw new UnsupportedAddressTypeException();
    }

    UnixDatagramChannel(int fd) {
        this(fd, State.IDLE, false);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public UnixSocketAddress receive(ByteBuffer src) throws IOException {
        void var2_2;
        UnixSocketAddress remote = new UnixSocketAddress();
        int n = Native.recvfrom(this.getFD(), src, remote.getStruct());
        if (n < 0) {
            throw new IOException(Native.getLastErrorString());
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int send(ByteBuffer src, SocketAddress target) throws IOException {
        UnixSocketAddress remote = null;
        if (null == target) {
            if (!this.isConnected()) throw new IllegalArgumentException("Destination address cannot be null on unconnected datagram sockets");
            remote = this.remoteAddress;
        } else {
            if (!(target instanceof UnixSocketAddress)) {
                throw new UnsupportedAddressTypeException();
            }
            remote = (UnixSocketAddress)target;
        }
        SockAddrUnix sa = null == remote ? null : remote.getStruct();
        int addrlen = null == sa ? 0 : sa.length();
        int n = Native.sendto(this.getFD(), src, sa, addrlen);
        if (n >= 0) void var6_6;
        return (int)var6_6;
        throw new IOException(Native.getLastErrorString());
    }

    public static final UnixDatagramChannel open(ProtocolFamily domain, int protocol) throws IOException {
        return new UnixDatagramChannel(domain, protocol);
    }

    static final class State
    extends Enum<State> {
        private static final /* synthetic */ State[] $VALUES;
        public static final /* enum */ State UNINITIALIZED = new State();
        public static final /* enum */ State IDLE;
        public static final /* enum */ State CONNECTED;

        static {
            CONNECTED = new State();
            IDLE = new State();
            State[] stateArray = new State[3];
            stateArray[0] = UNINITIALIZED;
            stateArray[1] = CONNECTED;
            stateArray[2] = IDLE;
            $VALUES = stateArray;
        }

        public static State valueOf(String name) {
            return Enum.valueOf(State.class, name);
        }

        public static State[] values() {
            return (State[])$VALUES.clone();
        }
    }

    private static class DefaultOptionsHolder {
        static final Set<SocketOption<?>> defaultOptions = DefaultOptionsHolder.defaultOptions();

        private static Set<SocketOption<?>> defaultOptions() {
            HashSet<SocketOption<Object>> set = new HashSet<SocketOption<Object>>(5);
            set.add(UnixSocketOptions.SO_SNDBUF);
            set.add(UnixSocketOptions.SO_SNDTIMEO);
            set.add(UnixSocketOptions.SO_RCVBUF);
            set.add(UnixSocketOptions.SO_RCVTIMEO);
            set.add(UnixSocketOptions.SO_PEERCRED);
            return Collections.unmodifiableSet(set);
        }

        private DefaultOptionsHolder() {
        }
    }
}

