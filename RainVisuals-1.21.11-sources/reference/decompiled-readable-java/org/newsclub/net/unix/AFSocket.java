/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kohlschutter.annotations.compiletime.SuppressFBWarnings
 *  org.eclipse.jdt.annotation.NonNull
 *  org.eclipse.jdt.annotation.Nullable
 */
package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.newsclub.net.unix.AFInputStream;
import org.newsclub.net.unix.AFOutputStream;
import org.newsclub.net.unix.AFSocketAddress;
import org.newsclub.net.unix.AFSocketAddressFromHostname;
import org.newsclub.net.unix.AFSocketCapability;
import org.newsclub.net.unix.AFSocketChannel;
import org.newsclub.net.unix.AFSocketExtensions;
import org.newsclub.net.unix.AFSocketFactory;
import org.newsclub.net.unix.AFSocketImpl;
import org.newsclub.net.unix.AFSocketImplExtensions;
import org.newsclub.net.unix.AFSomeSocket;
import org.newsclub.net.unix.AFUNIXSocketCapability;
import org.newsclub.net.unix.BuildProperties;
import org.newsclub.net.unix.Closeables;
import org.newsclub.net.unix.NativeLibraryLoader;
import org.newsclub.net.unix.NativeUnixSocket;
import org.newsclub.net.unix.SentinelSocketAddress;
import org.newsclub.net.unix.SocketAddressFilter;
import org.newsclub.net.unix.SocketClosedException;

public abstract class AFSocket<A extends AFSocketAddress>
extends Socket
implements AFSomeSocket,
AFSocketExtensions {
    private static final byte[] ZERO_BYTES = new byte[0];
    private final AFSocketAddressFromHostname<A> afh;
    private final AFSocketImpl<A> impl;
    private final AtomicBoolean created;
    private static Integer capabilitiesValue = null;
    private final Closeables closeables = new Closeables();
    private @Nullable SocketAddressFilter connectFilter;
    private final AFSocketChannel<A> channel;
    static final String PROP_LIBRARY_DISABLE_CAPABILITY_PREFIX = "org.newsclub.net.unix.library.disable.";
    static String loadedLibrary;

    protected final AFSocketImplExtensions<A> getImplExtensions() {
        return this.getAFImpl(false).getImplExtensions();
    }

    /*
     * WARNING - void declaration
     */
    public static final <A extends AFSocketAddress> AFSocket<?> connectTo(@NonNull A addr) throws IOException {
        void var1_1;
        AFSocket<?> socket = addr.getAddressFamily().getSocketConstructor().newInstance(null, null);
        socket.connect(addr);
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    final boolean connect0(SocketAddress endpoint, int timeout) throws IOException {
        void var4_4;
        if (timeout < 0) {
            throw new IllegalArgumentException("connect: timeout can't be negative");
        }
        if (this.isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (this.connectFilter != null) {
            endpoint = this.connectFilter.apply(endpoint);
        }
        AFSocketAddress address = this.preprocessSocketAddress(endpoint);
        if (!this.isBound()) {
            this.internalDummyBind();
        }
        boolean success = this.getAFImpl().connect0(address, timeout);
        if (success) {
            int port = address.getPort();
            if (port > 0) {
                this.getAFImpl().updatePorts(this.getLocalPort(), port);
            }
        }
        this.internalDummyConnect();
        return (boolean)var4_4;
    }

    @Override
    public final void ensureAncillaryReceiveBufferSize(int minSize) {
        this.impl.ensureAncillaryReceiveBufferSize(minSize);
    }

    private static boolean isCapDisabled(AFSocketCapability cap) {
        return Boolean.parseBoolean(System.getProperty(PROP_LIBRARY_DISABLE_CAPABILITY_PREFIX + cap.name(), "false"));
    }

    @Deprecated
    public static final boolean supports(AFUNIXSocketCapability capability) {
        return (AFSocket.capabilities() & capability.getBitmask()) != 0;
    }

    public static final String getVersion() {
        String v = BuildProperties.getBuildProperties().get("git.build.version");
        if (v != null && !v.startsWith("$")) {
            return v;
        }
        try {
            return NativeLibraryLoader.getJunixsocketVersion();
        }
        catch (IOException e) {
            return null;
        }
    }

    @SuppressFBWarnings(value={"CT_CONSTRUCTOR_THROW"})
    protected AFSocket(AFSocketImpl<A> impl, AFSocketAddressFromHostname<A> afh) throws SocketException {
        super(impl);
        this.created = new AtomicBoolean(false);
        this.channel = this.newChannel();
        this.afh = afh;
        this.impl = impl;
    }

    final String toStringSuffix() {
        if (this.impl.getFD().valid()) {
            return "[local=" + String.valueOf(this.getLocalSocketAddress()) + ";remote=" + String.valueOf(this.getRemoteSocketAddress()) + "]";
        }
        return "[invalid]";
    }

    final AFSocketImpl<A> getAFImpl(boolean createSocket) {
        if (createSocket) {
            if (this.created.compareAndSet(false, true)) {
                try {
                    this.getSoTimeout();
                }
                catch (SocketException socketException) {
                    // empty catch block
                }
            }
        }
        return this.impl;
    }

    public final void addCloseable(Closeable closeable) {
        this.closeables.add(closeable);
    }

    @Override
    public final boolean isClosed() {
        return super.isClosed() || this.isConnected() && !this.impl.getFD().valid() || this.impl.isClosed();
    }

    @Override
    public final String toString() {
        return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode()) + this.toStringSuffix();
    }

    protected abstract AFSocketChannel<A> newChannel();

    @Override
    public void setShutdownOnClose(boolean enabled) {
        this.getAFImpl().getCore().setShutdownOnClose(enabled);
    }

    private AFSocketAddress preprocessSocketAddress(SocketAddress endpoint) throws SocketException {
        if (endpoint == null) {
            throw new IllegalArgumentException("endpoint is null");
        }
        if (endpoint instanceof SentinelSocketAddress) {
            return (AFSocketAddress)endpoint;
        }
        return AFSocketAddress.preprocessSocketAddress(this.socketAddressClass(), endpoint, this.afh);
    }

    public static boolean isSupported() {
        return NativeUnixSocket.isLoaded();
    }

    final AFSocketImpl<A> getAFImpl() {
        return this.getAFImpl(true);
    }

    public static boolean isRunningOnAndroid() {
        return NativeLibraryLoader.isAndroid();
    }

    @Override
    public final AFOutputStream getOutputStream() throws IOException {
        return this.getAFImpl().getOutputStream();
    }

    @Override
    public final void setAncillaryReceiveBufferSize(int size) {
        this.impl.setAncillaryReceiveBufferSize(size);
    }

    @Override
    public final int getAncillaryReceiveBufferSize() {
        return this.impl.getAncillaryReceiveBufferSize();
    }

    public final synchronized A getRemoteSocketAddress() {
        if (!this.isConnected()) {
            return null;
        }
        return this.impl.getRemoteSocketAddress();
    }

    final void internalDummyConnect() throws IOException {
        if (!this.isConnected()) {
            super.connect(AFSocketAddress.INTERNAL_DUMMY_CONNECT, 0);
        }
    }

    @Override
    public final FileDescriptor getFileDescriptor() throws IOException {
        return this.impl.getFileDescriptor();
    }

    public static final void ensureUnsafeSupported() throws IOException {
        if (!AFSocket.supports(AFSocketCapability.CAPABILITY_UNSAFE)) {
            throw new IOException("Unsafe operations are not supported in this environment");
        }
    }

    @Override
    public final void connect(SocketAddress endpoint, int timeout) throws IOException {
        this.connect0(endpoint, timeout);
    }

    public static void ensureSupported() throws UnsupportedOperationException {
        NativeUnixSocket.ensureSupported();
    }

    /*
     * WARNING - void declaration
     */
    protected static final <A extends AFSocketAddress> @NonNull AFSocket<A> connectTo(Constructor<A> constr, A addr) throws IOException {
        void var2_2;
        AFSocket<A> socket = constr.newInstance(null, null);
        socket.connect(addr);
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final synchronized void close() throws IOException {
        IOException superException = null;
        try {
            super.close();
        }
        catch (IOException e) {
            void var2_2;
            superException = var2_2;
        }
        this.closeables.close(superException);
    }

    public final AFSocket<A> connectHook(SocketAddressFilter hook) {
        this.connectFilter = hook;
        return this;
    }

    public final AFSocket<A> forceConnectAddress(SocketAddress endpoint) {
        return this.connectHook(orig -> {
            SocketAddress socketAddress;
            return orig == null ? null : socketAddress;
        });
    }

    @Override
    public final boolean isBound() {
        return this.impl.getFD().valid() && (super.isBound() || this.impl.isBound());
    }

    @Override
    public final AFInputStream getInputStream() throws IOException {
        return this.getAFImpl().getInputStream();
    }

    @Override
    public final void bind(SocketAddress bindpoint) throws IOException {
        if (bindpoint == null) {
            throw new IllegalArgumentException();
        }
        if (this.isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (this.isBound()) {
            throw new SocketException("Already bound");
        }
        this.preprocessSocketAddress(bindpoint);
        throw new SocketException("Use AF*ServerSocket#bind or #bindOn");
    }

    private static int initCapabilities() {
        int n;
        if (!AFSocket.isSupported()) {
            return 0;
        }
        int v = NativeUnixSocket.capabilities();
        if (System.getProperty("osv.version") != null) {
            v &= ~AFSocketCapability.CAPABILITY_FD_AS_REDIRECT.getBitmask();
        }
        AFSocketCapability[] aFSocketCapabilityArray = AFSocketCapability.values();
        int n2 = aFSocketCapabilityArray.length;
        for (int i = 0; i < n2; ++i) {
            AFSocketCapability cap = aFSocketCapabilityArray[i];
            if (!AFSocket.isCapDisabled(cap)) continue;
            n = v & ~cap.getBitmask();
        }
        return n;
    }

    @Override
    public final boolean isConnected() {
        return this.impl.getFD().valid() && (super.isConnected() || this.impl.isConnected());
    }

    /*
     * WARNING - void declaration
     */
    public boolean checkConnectionClosed() throws IOException {
        if (!this.isConnected()) {
            return true;
        }
        try {
            if (!AFSocket.supports(AFSocketCapability.CAPABILITY_ZERO_LENGTH_SEND)) {
                return false;
            }
            this.getOutputStream().write(ZERO_BYTES);
            return false;
        }
        catch (SocketClosedException e) {
            return true;
        }
        catch (IOException e) {
            void var1_2;
            if (!this.isConnected()) {
                return true;
            }
            throw var1_2;
        }
    }

    final void internalDummyBind() throws IOException {
        if (!this.isBound()) {
            super.bind(AFSocketAddress.INTERNAL_DUMMY_BIND);
        }
    }

    public static final boolean supports(AFSocketCapability capability) {
        return (AFSocket.capabilities() & capability.getBitmask()) != 0;
    }

    private static synchronized int capabilities() {
        if (capabilitiesValue == null) {
            capabilitiesValue = AFSocket.initCapabilities();
        }
        return capabilitiesValue;
    }

    protected static final <A extends AFSocketAddress> AFSocket<A> newInstance(Constructor<A> constr, AFSocketFactory<A> factory) throws SocketException {
        return AFSocket.newInstance0(constr, null, factory);
    }

    public static final String getLoadedLibrary() {
        return loadedLibrary;
    }

    public final A getLocalSocketAddress() {
        if (this.isClosed()) {
            return null;
        }
        return this.impl.getLocalSocketAddress();
    }

    static <A extends AFSocketAddress> AFSocket<A> newInstance(Constructor<A> constr, AFSocketFactory<A> sf, FileDescriptor fdObj, int localPort, int remotePort) throws IOException {
        if (!fdObj.valid()) {
            throw new SocketException("Invalid file descriptor");
        }
        int status = NativeUnixSocket.socketStatus(fdObj);
        if (status == -1) {
            throw new SocketException("Not a valid socket");
        }
        AFSocket<A> socket = AFSocket.newInstance0(constr, fdObj, sf);
        socket.getAFImpl().updatePorts(localPort, remotePort);
        switch (status) {
            case 2: {
                socket.internalDummyConnect();
                break;
            }
            case 1: {
                socket.internalDummyBind();
                break;
            }
            case 0: {
                break;
            }
            default: {
                throw new IllegalStateException("Invalid socketStatus response: " + status);
            }
        }
        socket.getAFImpl().setSocketAddress((AFSocketAddress)socket.getLocalSocketAddress());
        return socket;
    }

    protected final Class<? extends AFSocketAddress> socketAddressClass() {
        return this.getAFImpl(false).getAddressFamily().getSocketAddressClass();
    }

    private static <A extends AFSocketAddress> @NonNull AFSocket<A> newInstance0(Constructor<A> constr, FileDescriptor fdObj, AFSocketFactory<A> factory) throws SocketException {
        return constr.newInstance(fdObj, factory);
    }

    public final void removeCloseable(Closeable closeable) {
        this.closeables.remove(closeable);
    }

    @Override
    public final void connect(SocketAddress endpoint) throws IOException {
        this.connect(endpoint, 0);
    }

    @Override
    @SuppressFBWarnings(value={"EI_EXPOSE_REP"})
    public AFSocketChannel<A> getChannel() {
        return this.channel;
    }

    @FunctionalInterface
    public static interface Constructor<A extends AFSocketAddress> {
        public @NonNull AFSocket<A> newInstance(FileDescriptor var1, AFSocketFactory<A> var2) throws SocketException;
    }
}

