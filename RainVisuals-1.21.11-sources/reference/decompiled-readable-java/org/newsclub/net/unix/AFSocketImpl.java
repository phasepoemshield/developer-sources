/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.eclipse.jdt.annotation.NonNull
 *  org.eclipse.jdt.annotation.Nullable
 */
package org.newsclub.net.unix;

import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.newsclub.net.unix.AFAddressFamily;
import org.newsclub.net.unix.AFInputStream;
import org.newsclub.net.unix.AFOutputStream;
import org.newsclub.net.unix.AFSocket;
import org.newsclub.net.unix.AFSocketAddress;
import org.newsclub.net.unix.AFSocketCapability;
import org.newsclub.net.unix.AFSocketCore;
import org.newsclub.net.unix.AFSocketImplExtensions;
import org.newsclub.net.unix.AFSocketOption;
import org.newsclub.net.unix.AFSocketType;
import org.newsclub.net.unix.AncillaryDataSupport;
import org.newsclub.net.unix.InvalidArgumentSocketException;
import org.newsclub.net.unix.NativeUnixSocket;
import org.newsclub.net.unix.SocketClosedException;
import org.newsclub.net.unix.SocketImplShim;
import org.newsclub.net.unix.SocketOptionsMapper;

public abstract class AFSocketImpl<A extends AFSocketAddress>
extends SocketImplShim {
    private final AFAddressFamily<A> addressFamily;
    private final AtomicBoolean connected;
    private volatile boolean closedInputStream = false;
    private final AtomicInteger socketTimeout;
    private boolean reuseAddr = true;
    private final AFInputStream in;
    private static final int SHUTDOWN_RD_WR = 3;
    private final AFOutputStream out;
    final AncillaryDataSupport ancillaryDataSupport = new AncillaryDataSupport();
    private int shutdownState = 0;
    private final AtomicBoolean bound = new AtomicBoolean(false);
    private final AFSocketStreamCore core;
    private AFSocketImplExtensions<A> implExtensions = null;
    private Boolean createType = null;
    private volatile boolean closedOutputStream = false;

    final void setAncillaryReceiveBufferSize(int size) {
        this.ancillaryDataSupport.setAncillaryReceiveBufferSize(size);
    }

    private static boolean checkWriteInterruptedException(int bytesTransferred) throws InterruptedIOException {
        if (Thread.interrupted()) {
            InterruptedIOException ex = new InterruptedIOException("Thread interrupted during write");
            ex.bytesTransferred = bytesTransferred;
            Thread.currentThread().interrupt();
            throw ex;
        }
        return true;
    }

    @Override
    public void setOption(int optID, Object value) throws SocketException {
        this.setOption0(optID, value);
    }

    @Override
    protected Set<SocketOption<?>> supportedOptions() {
        return SocketOptionsMapper.SUPPORTED_SOCKET_OPTIONS;
    }

    private Object getOption0(int optID) throws SocketException {
        if (this.isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (optID == 4) {
            return this.reuseAddr;
        }
        FileDescriptor fdesc = this.core.validFdOrException();
        return AFSocketImpl.getOptionDefault(fdesc, optID, this.socketTimeout, this.addressFamily);
    }

    private static int expectInteger(Object value) throws SocketException {
        if (value == null) {
            throw (SocketException)new SocketException("Value must not be null").initCause(new NullPointerException());
        }
        try {
            return (Integer)value;
        }
        catch (ClassCastException e) {
            throw (SocketException)new SocketException("Unsupported value: " + String.valueOf(value)).initCause(e);
        }
    }

    @Override
    protected final boolean supportsUrgentData() {
        return false;
    }

    final boolean isBound() {
        if (this.bound.get()) {
            return true;
        }
        if (this.isClosed()) {
            return false;
        }
        if (this.core.isConnected(true)) {
            this.bound.set(true);
            return true;
        }
        return false;
    }

    @Override
    protected final AFOutputStream getOutputStream() throws IOException {
        if (!this.isClosed() && !this.isBound()) {
            throw new SocketClosedException("Not connected/not bound");
        }
        this.core.validFdOrException();
        return this.out;
    }

    final int getLocalPort1() {
        return this.localport;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected <T> void setOption(SocketOption<T> name, T value) throws IOException {
        if (name instanceof AFSocketOption) {
            this.getCore().setOption((AFSocketOption)name, value);
            return;
        }
        Integer optionId = SocketOptionsMapper.resolve(name);
        if (optionId == null) {
            super.setOption(name, value);
        } else {
            void var2_2;
            this.setOption(optionId, (Object)var2_2);
        }
    }

    final SocketAddress receive(ByteBuffer dst) throws IOException {
        return this.core.receive(dst);
    }

    static final Object getOptionDefault(FileDescriptor fdesc, int optID, AtomicInteger acceptTimeout, AFAddressFamily<?> af) throws SocketException {
        try {
            switch (optID) {
                case 8: {
                    try {
                        return NativeUnixSocket.getSocketOptionInt(fdesc, optID) != 0;
                    }
                    catch (SocketException e) {
                        return false;
                    }
                }
                case 1: {
                    return NativeUnixSocket.getSocketOptionInt(fdesc, optID) != 0;
                }
                case 4102: {
                    int v = Math.max(NativeUnixSocket.getSocketOptionInt(fdesc, 4101), NativeUnixSocket.getSocketOptionInt(fdesc, 4102));
                    if (v == -1) {
                        return 0;
                    }
                    return Math.max(acceptTimeout == null ? 0 : acceptTimeout.get(), v);
                }
                case 128: 
                case 4097: 
                case 4098: {
                    return NativeUnixSocket.getSocketOptionInt(fdesc, optID);
                }
                case 3: {
                    return 0;
                }
                case 15: {
                    return AFSocketAddress.getInetAddress(fdesc, false, af);
                }
                case 4: {
                    return false;
                }
            }
            throw new SocketException("Unsupported option: " + optID);
        }
        catch (SocketException e) {
            throw e;
        }
        catch (Exception e) {
            throw (SocketException)new SocketException("Could not get option").initCause(e);
        }
    }

    final void ensureAncillaryReceiveBufferSize(int minSize) {
        this.ancillaryDataSupport.ensureAncillaryReceiveBufferSize(minSize);
    }

    final void setSocketAddress(AFSocketAddress socketAddress) {
        if (socketAddress == null) {
            this.core.socketAddress = null;
            this.address = null;
            this.localport = -1;
        } else {
            this.core.socketAddress = socketAddress;
            this.address = socketAddress.getAddress();
            if (this.localport <= 0) {
                this.localport = socketAddress.getPort();
            }
        }
    }

    final boolean isConnected() {
        if (this.connected.get()) {
            return true;
        }
        if (this.isClosed()) {
            return false;
        }
        if (this.core.isConnected(false)) {
            this.connected.set(true);
            return true;
        }
        return false;
    }

    @Override
    public final String toString() {
        return super.toString() + "[fd=" + String.valueOf(this.fd) + "; addr=" + String.valueOf(this.core.socketAddress) + "; connected=" + String.valueOf(this.connected) + "; bound=" + String.valueOf(this.bound) + "]";
    }

    final void bind(SocketAddress addr, int options) throws IOException {
        if (addr == null) {
            throw new IllegalArgumentException("Cannot bind to null address");
        }
        if (!(addr instanceof AFSocketAddress)) {
            throw new SocketException("Cannot bind to this type of address: " + String.valueOf(addr.getClass()));
        }
        this.bound.set(true);
        if (addr == AFSocketAddress.INTERNAL_DUMMY_BIND) {
            this.core.inode.set(0L);
            return;
        }
        AFSocketAddress socketAddress = (AFSocketAddress)addr;
        this.setSocketAddress(socketAddress);
        ByteBuffer ab = socketAddress.getNativeAddressDirectBuffer();
        this.core.inode.set(NativeUnixSocket.bind(ab, ab.limit(), this.fd, options));
        this.core.validFdOrException();
    }

    @Override
    protected final void listen(int backlog) throws IOException {
        FileDescriptor fdesc = this.core.validFdOrException();
        if (backlog <= 0) {
            backlog = 50;
        }
        NativeUnixSocket.listen(fdesc, backlog);
    }

    @Override
    protected final void shutdownOutput() throws IOException {
        FileDescriptor fdesc = this.core.validFd();
        if (fdesc != null) {
            NativeUnixSocket.shutdown(fdesc, 1);
            this.shutdownState |= 4;
            if (this.shutdownState == 3) {
                NativeUnixSocket.shutdown(fdesc, 2);
                this.shutdownState = 0;
            }
        }
    }

    protected final void setOptionLenient(int optID, Object value) throws SocketException {
        try {
            this.setOption0(optID, value);
        }
        catch (SocketException e) {
            switch (optID) {
                case 1: {
                    return;
                }
            }
            throw e;
        }
    }

    final int read(ByteBuffer dst, ByteBuffer socketAddressBuffer) throws IOException {
        return this.core.read(dst, socketAddressBuffer, 0);
    }

    protected final AFOutputStream newOutputStream() {
        return new AFOutputStreamImpl();
    }

    protected final Object getOptionLenient(int optID) throws SocketException {
        try {
            return this.getOption0(optID);
        }
        catch (SocketException e) {
            switch (optID) {
                case 1: 
                case 8: {
                    return false;
                }
            }
            throw e;
        }
    }

    @Override
    protected final FileDescriptor getFileDescriptor() {
        return this.core.fd;
    }

    @Override
    protected final void accept(SocketImpl socket) throws IOException {
        this.accept0(socket);
    }

    final void updatePorts(int local, int remote) {
        this.localport = local;
        if (remote >= 0) {
            this.port = remote;
        }
    }

    final @Nullable A getLocalSocketAddress() {
        return AFSocketAddress.getSocketAddress(this.getFileDescriptor(), false, this.localport, this.addressFamily);
    }

    @Override
    protected final void connect(InetAddress address, int port) throws IOException {
        throw new SocketException("Cannot bind to this type of address: " + String.valueOf(InetAddress.class));
    }

    protected final AFInputStream newInputStream() {
        return new AFInputStreamImpl();
    }

    private static int expectBoolean(Object value) throws SocketException {
        if (value == null) {
            throw (SocketException)new SocketException("Value must not be null").initCause(new NullPointerException());
        }
        try {
            return ((Boolean)value).booleanValue() ? 1 : 0;
        }
        catch (ClassCastException e) {
            throw (SocketException)new SocketException("Unsupported value: " + String.valueOf(value)).initCause(e);
        }
    }

    private void checkClose() throws IOException {
        if (this.closedInputStream && this.closedOutputStream) {
            this.close();
        }
    }

    @Override
    protected final void close() throws IOException {
        this.shutdown();
        this.core.runCleaner();
    }

    final @Nullable A getRemoteSocketAddress() {
        return AFSocketAddress.getSocketAddress(this.getFileDescriptor(), true, this.port, this.addressFamily);
    }

    final AFAddressFamily<A> getAddressFamily() {
        return this.addressFamily;
    }

    @Override
    public Object getOption(int optID) throws SocketException {
        return this.getOption0(optID);
    }

    @Override
    protected <T> T getOption(SocketOption<T> name) throws IOException {
        if (name instanceof AFSocketOption) {
            return this.getCore().getOption((AFSocketOption)name);
        }
        Integer optionId = SocketOptionsMapper.resolve(name);
        if (optionId == null) {
            return super.getOption(name);
        }
        return (T)this.getOption(optionId);
    }

    final FileDescriptor getFD() {
        return this.fd;
    }

    @Override
    protected final void create(boolean stream) throws IOException {
        if (this.isClosed()) {
            throw new SocketException("Already closed");
        }
        if (this.fd.valid()) {
            if (this.createType != null) {
                if (this.createType != stream) {
                    throw new IllegalStateException("Already created with different mode");
                }
            } else {
                this.createType = stream;
            }
            return;
        }
        this.createType = stream;
        this.createSocket(this.fd, stream ? AFSocketType.SOCK_STREAM : AFSocketType.SOCK_DGRAM);
    }

    /*
     * WARNING - void declaration
     */
    final boolean connect0(SocketAddress addr, int connectTimeout) throws IOException {
        void var5_5;
        if (addr == AFSocketAddress.INTERNAL_DUMMY_CONNECT) {
            this.connected.set(true);
            return true;
        }
        if (addr == AFSocketAddress.INTERNAL_DUMMY_DONT_CONNECT) {
            return false;
        }
        if (!(addr instanceof AFSocketAddress)) {
            throw new SocketException("Cannot connect to this type of address: " + String.valueOf(addr.getClass()));
        }
        AFSocketAddress socketAddress = (AFSocketAddress)addr;
        ByteBuffer ab = socketAddress.getNativeAddressDirectBuffer();
        boolean success = false;
        boolean ignoreSpuriousTimeout = true;
        while (true) {
            try {
                success = NativeUnixSocket.connect(ab, ab.limit(), this.fd, -1L);
            }
            catch (SocketTimeoutException e) {
                void var7_7;
                if (ignoreSpuriousTimeout) {
                    Object o = this.getOption(4102);
                    if (o instanceof Integer) {
                        if ((Integer)o == 0) {
                            ignoreSpuriousTimeout = false;
                            continue;
                        }
                    } else if (o == null) {
                        ignoreSpuriousTimeout = false;
                        continue;
                    }
                }
                throw var7_7;
                if (!Thread.interrupted()) continue;
            }
            break;
        }
        if (success) {
            this.setSocketAddress(socketAddress);
            this.connected.set(true);
        }
        this.core.validFdOrException();
        return (boolean)var5_5;
    }

    final int getAncillaryReceiveBufferSize() {
        return this.ancillaryDataSupport.getAncillaryReceiveBufferSize();
    }

    @Override
    protected final AFInputStream getInputStream() throws IOException {
        if (!this.isConnected() && !this.isBound()) {
            throw new SocketClosedException("Not connected/not bound");
        }
        this.core.validFdOrException();
        return this.in;
    }

    protected final synchronized AFSocketImplExtensions<A> getImplExtensions() {
        if (this.implExtensions == null) {
            this.implExtensions = this.addressFamily.initImplExtensions(this.ancillaryDataSupport);
        }
        return this.implExtensions;
    }

    @Override
    protected final void bind(InetAddress host, int port) throws IOException {
    }

    static final void setOptionDefault(FileDescriptor fdesc, int optID, Object value, AtomicInteger acceptTimeout) throws SocketException {
        try {
            switch (optID) {
                case 128: {
                    if (value instanceof Boolean) {
                        boolean b2 = (Boolean)value;
                        if (b2) {
                            throw new SocketException("Only accepting Boolean.FALSE here");
                        }
                        NativeUnixSocket.setSocketOptionInt(fdesc, optID, -1);
                        return;
                    }
                    NativeUnixSocket.setSocketOptionInt(fdesc, optID, AFSocketImpl.expectInteger(value));
                    return;
                }
                case 4102: {
                    int timeout = AFSocketImpl.expectInteger(value);
                    try {
                        NativeUnixSocket.setSocketOptionInt(fdesc, 4101, timeout);
                    }
                    catch (InvalidArgumentSocketException invalidArgumentSocketException) {
                        // empty catch block
                    }
                    try {
                        NativeUnixSocket.setSocketOptionInt(fdesc, 4102, timeout);
                    }
                    catch (InvalidArgumentSocketException invalidArgumentSocketException) {
                        // empty catch block
                    }
                    if (acceptTimeout != null) {
                        acceptTimeout.set(timeout);
                    }
                    return;
                }
                case 4097: 
                case 4098: {
                    NativeUnixSocket.setSocketOptionInt(fdesc, optID, AFSocketImpl.expectInteger(value));
                    return;
                }
                case 8: {
                    try {
                        NativeUnixSocket.setSocketOptionInt(fdesc, optID, AFSocketImpl.expectBoolean(value));
                    }
                    catch (SocketException timeout) {
                        // empty catch block
                    }
                    return;
                }
                case 1: {
                    NativeUnixSocket.setSocketOptionInt(fdesc, optID, AFSocketImpl.expectBoolean(value));
                    return;
                }
                case 3: {
                    return;
                }
                case 4: {
                    return;
                }
            }
            throw new SocketException("Unsupported option: " + optID);
        }
        catch (SocketException e) {
            throw e;
        }
        catch (Exception e) {
            throw (SocketException)new SocketException("Error while setting option").initCause(e);
        }
    }

    protected AFSocketImpl(AFAddressFamily<@NonNull A> addressFamily, FileDescriptor fdObj) {
        this.connected = new AtomicBoolean(false);
        this.socketTimeout = new AtomicInteger(0);
        this.addressFamily = addressFamily;
        this.address = InetAddress.getLoopbackAddress();
        this.core = new AFSocketStreamCore(this, fdObj, this.ancillaryDataSupport, addressFamily);
        this.fd = this.core.fd;
        this.in = this.newInputStream();
        this.out = this.newOutputStream();
    }

    AncillaryDataSupport getAncillaryDataSupport() {
        return this.ancillaryDataSupport;
    }

    boolean isClosed() {
        return this.core.isClosed();
    }

    final AFSocketCore getCore() {
        return this.core;
    }

    @Override
    protected final InetAddress getInetAddress() {
        @Nullable A rsa = this.getRemoteSocketAddress();
        if (rsa == null) {
            return InetAddress.getLoopbackAddress();
        }
        return ((AFSocketAddress)rsa).getInetAddress();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     */
    final boolean accept0(SocketImpl socket) throws IOException {
        AFSocketImpl si;
        AFSocketAddress socketAddress;
        block43: {
            FileDescriptor fdesc = this.core.validFdOrException();
            if (this.isClosed()) {
                throw new SocketException("Socket is closed");
            }
            if (!this.isBound()) {
                throw new SocketException("Socket is not bound");
            }
            socketAddress = this.core.socketAddress;
            A boundSocketAddress = this.getLocalSocketAddress();
            if (boundSocketAddress != null) {
                this.core.socketAddress = socketAddress = boundSocketAddress;
            }
            if (socketAddress == null) {
                throw new SocketException("Socket is not bound");
            }
            si = (AFSocketImpl)socket;
            this.core.incPendingAccepts();
            try {
                SocketException caught;
                block40: {
                    boolean bl;
                    block41: {
                        block42: {
                            ByteBuffer ab = socketAddress.getNativeAddressDirectBuffer();
                            caught = null;
                            if (NativeUnixSocket.accept(ab, ab.limit(), fdesc, si.fd, this.core.inode.get(), this.socketTimeout.get())) break block40;
                            bl = false;
                            if (this.isBound() && !this.isClosed()) break block41;
                            if (!this.getCore().isShutdownOnClose()) break block42;
                            try {
                                NativeUnixSocket.shutdown(si.fd, 2);
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                        }
                        try {
                            NativeUnixSocket.close(si.fd);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        if (caught != null) {
                            throw caught;
                        }
                        throw new SocketClosedException("Socket is closed");
                    }
                    if (caught != null) {
                        throw caught;
                    }
                    return bl;
                }
                if (!this.isBound() || this.isClosed()) {
                    if (this.getCore().isShutdownOnClose()) {
                        try {
                            NativeUnixSocket.shutdown(si.fd, 2);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                    try {
                        NativeUnixSocket.close(si.fd);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (caught != null) {
                        throw caught;
                    }
                    throw new SocketClosedException("Socket is closed");
                }
                if (caught != null) {
                    throw caught;
                }
                break block43;
                catch (SocketException socketException) {
                    block44: {
                        block45: {
                            try {
                                caught = socketException;
                                if (this.isBound() && !this.isClosed()) break block44;
                                if (!this.getCore().isShutdownOnClose()) break block45;
                            }
                            catch (Throwable throwable) {
                                if (!this.isBound() || this.isClosed()) {
                                    if (this.getCore().isShutdownOnClose()) {
                                        try {
                                            NativeUnixSocket.shutdown(si.fd, 2);
                                        }
                                        catch (Exception exception) {
                                            // empty catch block
                                        }
                                    }
                                    try {
                                        NativeUnixSocket.close(si.fd);
                                    }
                                    catch (Exception exception) {
                                        // empty catch block
                                    }
                                    if (caught != null) {
                                        throw caught;
                                    }
                                    throw new SocketClosedException("Socket is closed");
                                }
                                if (caught != null) {
                                    void var7_7;
                                    throw var7_7;
                                }
                                throw throwable;
                            }
                            try {
                                NativeUnixSocket.shutdown(si.fd, 2);
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                        }
                        try {
                            NativeUnixSocket.close(si.fd);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        if (caught != null) {
                            throw caught;
                        }
                        throw new SocketClosedException("Socket is closed");
                    }
                    if (caught != null) {
                        throw caught;
                    }
                }
            }
            finally {
                this.core.decPendingAccepts();
            }
        }
        si.setSocketAddress(socketAddress);
        si.connected.set(true);
        return true;
    }

    final int write(ByteBuffer src) throws IOException {
        return this.core.write(src);
    }

    @Override
    protected final int available() throws IOException {
        FileDescriptor fdesc = this.core.validFdOrException();
        return NativeUnixSocket.available(fdesc, this.core.getThreadLocalDirectByteBuffer(0));
    }

    private void setOption0(int optID, Object value) throws SocketException {
        if (this.isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (optID == 4) {
            this.reuseAddr = AFSocketImpl.expectBoolean(value) != 0;
            return;
        }
        FileDescriptor fdesc = this.core.validFdOrException();
        AFSocketImpl.setOptionDefault(fdesc, optID, value, this.socketTimeout);
    }

    @Override
    protected final void shutdownInput() throws IOException {
        FileDescriptor fdesc = this.core.validFd();
        if (fdesc != null) {
            NativeUnixSocket.shutdown(fdesc, 0);
            this.shutdownState |= 1;
            if (this.shutdownState == 3) {
                NativeUnixSocket.shutdown(fdesc, 2);
                this.shutdownState = 0;
            }
        }
    }

    final int getRemotePort() {
        return this.port;
    }

    @Override
    protected final void connect(String host, int port) throws IOException {
        throw new SocketException("Cannot bind to this type of address: " + String.valueOf(InetAddress.class));
    }

    @Override
    protected final void sendUrgentData(int data) throws IOException {
        throw new UnsupportedOperationException();
    }

    final int send(ByteBuffer src, SocketAddress target) throws IOException {
        return this.core.write(src, target, 0);
    }

    @Override
    protected final void connect(SocketAddress addr, int connectTimeout) throws IOException {
        this.connect0(addr, connectTimeout);
    }

    final void createSocket(FileDescriptor fdTarget, AFSocketType type) throws IOException {
        NativeUnixSocket.createSocket(fdTarget, this.addressFamily.getDomain(), type.getId());
    }

    protected final void shutdown() throws IOException {
        FileDescriptor fdesc = this.core.validFd();
        if (fdesc != null) {
            NativeUnixSocket.shutdown(fdesc, 2);
            this.shutdownState = 0;
        }
    }

    private final class AFOutputStreamImpl
    extends AFOutputStream {
        private volatile boolean streamClosed = false;
        private final int opt = AFSocketImpl.access$200((AFSocketImpl)AFSocketImpl.this).isBlocking() ? 0 : 4;

        @Override
        public void write(int oneByte) throws IOException {
            int written;
            FileDescriptor fdesc = AFSocketImpl.access$200((AFSocketImpl)AFSocketImpl.this).validFdOrException();
            do {
                written = NativeUnixSocket.write(fdesc, null, oneByte, 1, this.opt, AFSocketImpl.this.ancillaryDataSupport);
            } while (written == 0 && AFSocketImpl.access$600((int)0));
        }

        @Override
        public synchronized void close() throws IOException {
            if (this.streamClosed) {
                return;
            }
            this.streamClosed = true;
            FileDescriptor fdesc = AFSocketImpl.access$200((AFSocketImpl)AFSocketImpl.this).validFd();
            if (fdesc != null && AFSocketImpl.this.getCore().isShutdownOnClose()) {
                NativeUnixSocket.shutdown(fdesc, 1);
            }
            AFSocketImpl.access$702((AFSocketImpl)AFSocketImpl.this, (boolean)true);
            AFSocketImpl.access$500((AFSocketImpl)AFSocketImpl.this);
        }

        private AFOutputStreamImpl() {
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public void write(byte[] buf, int off, int len) throws IOException {
            void var5_5;
            int written;
            block9: {
                block8: {
                    if (this.streamClosed) {
                        throw new SocketException("This OutputStream has already been closed.");
                    }
                    if (len < 0) break block8;
                    if (off < 0) break block8;
                    if (len <= buf.length - off) break block9;
                }
                throw new IndexOutOfBoundsException();
            }
            FileDescriptor fdesc = AFSocketImpl.access$200((AFSocketImpl)AFSocketImpl.this).validFdOrException();
            if (len == 0 && !AFSocket.supports(AFSocketCapability.CAPABILITY_ZERO_LENGTH_SEND)) {
                return;
            }
            int writtenTotal = 0;
            do {
                void var6_6;
                if ((written = NativeUnixSocket.write(fdesc, buf, off, len, this.opt, AFSocketImpl.this.ancillaryDataSupport)) < 0) {
                    if (len == 0) {
                        return;
                    }
                    throw new IOException("Unspecific error while writing");
                }
                off += var6_6;
                writtenTotal += var6_6;
            } while ((len -= written) > 0 && AFSocketImpl.access$600((int)var5_5));
        }

        @Override
        public FileDescriptor getFileDescriptor() throws IOException {
            return AFSocketImpl.this.getFD();
        }
    }

    static final class AFSocketStreamCore
    extends AFSocketCore {
        void createSocket(FileDescriptor fdTarget, AFSocketType type) throws IOException {
            NativeUnixSocket.createSocket(fdTarget, this.addressFamily().getDomain(), type.getId());
        }

        @Override
        protected void unblockAccepts() {
            block16: {
                block15: {
                    if (this.socketAddress == null || this.socketAddress.getBytes() == null) break block15;
                    if (this.inode.get() >= 0L) break block16;
                }
                return;
            }
            while (this.hasPendingAccepts()) {
                try {
                    FileDescriptor tmpFd = new FileDescriptor();
                    try {
                        this.createSocket(tmpFd, AFSocketType.SOCK_STREAM);
                        ByteBuffer ab = this.socketAddress.getNativeAddressDirectBuffer();
                        NativeUnixSocket.connect(ab, ab.limit(), tmpFd, this.inode.get());
                    }
                    catch (IOException iOException) {
                        return;
                    }
                    if (this.isShutdownOnClose()) {
                        try {
                            NativeUnixSocket.shutdown(tmpFd, 2);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                    try {
                        NativeUnixSocket.close(tmpFd);
                    }
                    catch (Exception exception) {}
                }
                catch (RuntimeException runtimeException) {
                    // empty catch block
                }
                try {
                    Thread.sleep(5L);
                }
                catch (InterruptedException interruptedException) {}
            }
        }

        AFSocketStreamCore(AFSocketImpl<?> observed, FileDescriptor fd, AncillaryDataSupport ancillaryDataSupport, AFAddressFamily<?> af) {
            super(observed, fd, ancillaryDataSupport, af, false);
        }
    }

    private final class AFInputStreamImpl
    extends AFInputStream {
        private final int opt;
        private volatile boolean streamClosed = false;
        private final AtomicBoolean eofReached = new AtomicBoolean(false);

        @Override
        public int available() throws IOException {
            if (this.streamClosed) {
                throw new SocketClosedException("This InputStream has already been closed.");
            }
            return AFSocketImpl.this.available();
        }

        @Override
        public synchronized void close() throws IOException {
            this.streamClosed = true;
            FileDescriptor fdesc = AFSocketImpl.access$200((AFSocketImpl)AFSocketImpl.this).validFd();
            if (fdesc != null && AFSocketImpl.this.getCore().isShutdownOnClose()) {
                NativeUnixSocket.shutdown(fdesc, 0);
            }
            AFSocketImpl.access$402((AFSocketImpl)AFSocketImpl.this, (boolean)true);
            AFSocketImpl.access$500((AFSocketImpl)AFSocketImpl.this);
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public int read() throws IOException {
            void var2_2;
            FileDescriptor fdesc = AFSocketImpl.access$200((AFSocketImpl)AFSocketImpl.this).validFdOrException();
            if (this.eofReached.get()) {
                return -1;
            }
            int byteRead = NativeUnixSocket.read(fdesc, null, 0, 1, this.opt, AFSocketImpl.this.ancillaryDataSupport, AFSocketImpl.access$300((AFSocketImpl)AFSocketImpl.this).get());
            if (byteRead < 0) {
                this.eofReached.set(true);
                return -1;
            }
            return (int)var2_2;
        }

        private AFInputStreamImpl() {
            this.opt = AFSocketImpl.access$200((AFSocketImpl)AFSocketImpl.this).isBlocking() ? 0 : 4;
        }

        @Override
        public FileDescriptor getFileDescriptor() throws IOException {
            return AFSocketImpl.this.getFD();
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public int read(byte[] buf, int off, int len) throws IOException {
            FileDescriptor fdesc;
            block9: {
                block8: {
                    if (this.streamClosed) {
                        throw new SocketClosedException("This InputStream has already been closed.");
                    }
                    if (this.eofReached.get()) {
                        return -1;
                    }
                    fdesc = AFSocketImpl.access$200((AFSocketImpl)AFSocketImpl.this).validFdOrException();
                    if (len == 0) {
                        return 0;
                    }
                    if (off < 0) break block8;
                    if (len < 0) break block8;
                    if (len <= buf.length - off) break block9;
                }
                throw new IndexOutOfBoundsException();
            }
            try {
                return NativeUnixSocket.read(fdesc, buf, off, len, this.opt, AFSocketImpl.this.ancillaryDataSupport, AFSocketImpl.access$300((AFSocketImpl)AFSocketImpl.this).get());
            }
            catch (EOFException e) {
                void var5_5;
                this.eofReached.set(true);
                throw var5_5;
            }
        }
    }
}

