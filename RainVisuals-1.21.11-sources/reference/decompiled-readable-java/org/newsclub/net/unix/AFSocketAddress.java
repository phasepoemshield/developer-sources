/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.Immutable
 *  com.kohlschutter.annotations.compiletime.SuppressFBWarnings
 *  org.eclipse.jdt.annotation.NonNull
 *  org.eclipse.jdt.annotation.Nullable
 */
package org.newsclub.net.unix;

import com.google.errorprone.annotations.Immutable;
import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.newsclub.net.unix.AFAddressFamily;
import org.newsclub.net.unix.AFInetAddress;
import org.newsclub.net.unix.AFServerSocket;
import org.newsclub.net.unix.AFSocket;
import org.newsclub.net.unix.AFSocketAddressFromHostname;
import org.newsclub.net.unix.AFSocketProtocol;
import org.newsclub.net.unix.AFSocketType;
import org.newsclub.net.unix.AFSupplier;
import org.newsclub.net.unix.AFUNIXSocketAddress;
import org.newsclub.net.unix.NativeLibraryLoader;
import org.newsclub.net.unix.NativeUnixSocket;
import org.newsclub.net.unix.SentinelSocketAddress;

@Immutable
public abstract class AFSocketAddress
extends InetSocketAddress {
    static final ThreadLocal<ByteBuffer> SOCKETADDRESS_BUFFER_TL;
    static final AFSocketAddress INTERNAL_DUMMY_CONNECT;
    private static final boolean USE_DESERIALIZATION_FOR_INIT;
    private static final int SOCKADDR_NATIVE_DATA_OFFSET;
    static final AFSocketAddress INTERNAL_DUMMY_BIND;
    private static final int SOCKADDR_NATIVE_FAMILY_OFFSET;
    @SuppressFBWarnings(value={"JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS"})
    private InetAddress inetAddress = null;
    private transient AFAddressFamily<?> addressFamily;
    private static final int SOCKADDR_MAX_LEN;
    private transient ByteBuffer nativeAddress;
    static final AFSocketAddress INTERNAL_DUMMY_DONT_CONNECT;
    private static final Map<AFAddressFamily<?>, Map<Integer, Map<ByteBuffer, AFSocketAddress>>> ADDRESS_CACHE;
    @SuppressFBWarnings(value={"JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS"})
    private byte[] bytes;
    private static final long serialVersionUID = 1L;

    private static void putShortLengthEncodedClassName(ByteBuffer bb, Class<?> klazz) {
        AFSocketAddress.putShortLengthUtf8(bb, "L" + klazz.getName().replace('.', '/') + ";");
    }

    protected static int parseUnsignedInt(String s, int radix) throws NumberFormatException {
        block7: {
            block6: {
                if (s == null || s.isEmpty()) {
                    throw new NumberFormatException("Cannot parse null or empty string");
                }
                int len = s.length();
                if (s.startsWith("-")) {
                    throw new NumberFormatException("Illegal leading minus sign on unsigned string " + s);
                }
                if (len <= 5) break block6;
                if (radix != 10) break block7;
                if (len > 9) break block7;
            }
            return Integer.parseInt(s, radix);
        }
        long ell = Long.parseLong(s, radix);
        if ((ell & 0xFFFFFFFF00000000L) == 0L) {
            return (int)ell;
        }
        throw new NumberFormatException("String value exceeds range of unsigned int: " + s);
    }

    public final AFAddressFamily<?> getAddressFamily() {
        return this.addressFamily;
    }

    public final InetAddress wrapAddress() {
        return AFInetAddress.wrapAddress(this.bytes, this.getAddressFamily());
    }

    protected final InetAddress getInetAddress() {
        return this.getInetAddress(this.getAddressFamily());
    }

    public abstract File getFile() throws FileNotFoundException;

    /*
     * WARNING - void declaration
     */
    static final int unwrapAddressDirectBufferInternal(ByteBuffer socketAddressBuffer, SocketAddress address) throws SocketException {
        void var5_5;
        if (!NativeUnixSocket.isLoaded()) {
            throw new SocketException("Unsupported operation; junixsocket native library is not loaded");
        }
        Objects.requireNonNull(address);
        if (!(address instanceof AFSocketAddress)) {
            AFSupplier<AFUNIXSocketAddress> supp = AFUNIXSocketAddress.supportedAddressSupplier(address);
            SocketAddress socketAddress = supp == null ? null : (address = (SocketAddress)supp.get());
            if (address == null) {
                throw new SocketException("Unsupported address");
            }
        }
        AFSocketAddress socketAddress = (AFSocketAddress)address;
        byte[] addr = socketAddress.getBytes();
        int domain = socketAddress.getAddressFamily().getDomain();
        int len = NativeUnixSocket.bytesToSockAddr(domain, socketAddressBuffer, addr);
        if (len == -1) {
            throw new SocketException("Unsupported domain");
        }
        return (int)var5_5;
    }

    /*
     * WARNING - void declaration
     */
    static final ByteBuffer getNativeAddressDirectBuffer(int limit) {
        void var1_1;
        ByteBuffer direct = SOCKETADDRESS_BUFFER_TL.get();
        direct.position(0);
        direct.limit(limit);
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    static final AFSocketAddress preprocessSocketAddress(Class<? extends AFSocketAddress> supportedAddressClass, SocketAddress endpoint, AFSocketAddressFromHostname<?> afh) throws SocketException {
        void var1_1;
        Objects.requireNonNull(endpoint);
        if (endpoint instanceof SentinelSocketAddress) {
            return (SentinelSocketAddress)endpoint;
        }
        if (!(endpoint instanceof AFSocketAddress)) {
            if (afh != null && endpoint instanceof InetSocketAddress) {
                InetSocketAddress isa = (InetSocketAddress)endpoint;
                String hostname = isa.getHostString();
                if (afh.isHostnameSupported(hostname)) {
                    endpoint = afh.addressFromHost(hostname, isa.getPort());
                }
            }
        }
        Objects.requireNonNull(endpoint);
        if (!supportedAddressClass.isAssignableFrom(endpoint.getClass())) {
            throw new IllegalArgumentException("Can only connect to endpoints of type " + supportedAddressClass.getName() + ", got: " + String.valueOf(endpoint.getClass()) + ": " + String.valueOf(endpoint));
        }
        return (AFSocketAddress)var1_1;
    }

    public final void writeNativeAddressTo(ByteBuffer buf) throws IOException {
        if (this.nativeAddress == null) {
            throw (SocketException)new SocketException("Cannot access native address").initCause(NativeUnixSocket.unsupportedException());
        }
        buf.put(this.nativeAddress);
    }

    protected static final boolean isSupportedAddress(InetAddress addr, AFAddressFamily<?> af) {
        return AFInetAddress.isSupportedAddress(addr, af);
    }

    static final ByteBuffer newSockAddrDirectBuffer(int length) {
        return ByteBuffer.allocateDirect(length);
    }

    /*
     * WARNING - void declaration
     */
    protected static final <A extends AFSocketAddress> @Nullable A getSocketAddress(FileDescriptor fdesc, boolean requestPeerName, int port, AFAddressFamily<A> af) {
        if (!fdesc.valid()) {
            return null;
        }
        byte[] addr = NativeUnixSocket.sockname(af.getDomain(), fdesc, requestPeerName);
        if (addr == null) {
            return null;
        }
        try {
            return AFSocketAddress.unwrap(AFInetAddress.wrapAddress(addr, af), port, af);
        }
        catch (SocketException e) {
            void var5_5;
            throw new IllegalStateException((Throwable)var5_5);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] craftSerializedObject(Class<? extends AFSocketAddress> className, String hostname, int port) {
        void var3_3;
        ByteBuffer bb = ByteBuffer.allocate(768);
        bb.putShort((short)-21267);
        bb.putShort((short)5);
        bb.put((byte)115);
        bb.put((byte)114);
        AFSocketAddress.putShortLengthUtf8(bb, className.getName());
        bb.putLong(1L);
        bb.putInt(33554552);
        bb.put((byte)114);
        AFSocketAddress.putShortLengthUtf8(bb, AFSocketAddress.class.getName());
        bb.putLong(1L);
        bb.putInt(50332251);
        AFSocketAddress.putShortLengthUtf8(bb, "bytes");
        bb.putInt(1946157659);
        bb.putShort((short)16972);
        AFSocketAddress.putShortLengthUtf8(bb, "inetAddress");
        bb.put((byte)116);
        AFSocketAddress.putShortLengthEncodedClassName(bb, InetAddress.class);
        bb.putShort((short)30834);
        AFSocketAddress.putShortLengthUtf8(bb, InetSocketAddress.class.getName());
        bb.putLong(5076001401234631237L);
        bb.putInt(50332489);
        AFSocketAddress.putShortLengthUtf8(bb, "port");
        bb.put((byte)76);
        AFSocketAddress.putShortLengthUtf8(bb, "addr");
        bb.putInt(1895857664);
        bb.putShort((short)844);
        AFSocketAddress.putShortLengthUtf8(bb, "hostname");
        bb.put((byte)116);
        AFSocketAddress.putShortLengthEncodedClassName(bb, String.class);
        bb.putShort((short)30834);
        AFSocketAddress.putShortLengthUtf8(bb, SocketAddress.class.getName());
        bb.putLong(5215720748342549866L);
        bb.putInt(33554552);
        bb.put((byte)112);
        bb.putInt(port);
        bb.putShort((short)28788);
        AFSocketAddress.putShortLengthUtf8(bb, hostname);
        bb.putInt(0x78707077);
        bb.put((byte)11);
        AFSocketAddress.putShortLengthUtf8((ByteBuffer)var3_3, "undefined");
        var3_3.put((byte)120);
        var3_3.flip();
        byte[] byArray = new byte[var3_3.remaining()];
        var3_3.get(byArray);
        return byArray;
    }

    protected static boolean isUseDeserializationForInit() {
        return USE_DESERIALIZATION_FOR_INIT;
    }

    private static void putShortLengthUtf8(ByteBuffer bb, String s) {
        byte[] utf8 = s.getBytes(StandardCharsets.UTF_8);
        bb.putShort((short)utf8.length);
        bb.put(utf8);
    }

    public AFSocket<?> newConnectedSocket() throws IOException {
        AFSocket<?> socket = this.getAddressFamily().newSocket();
        socket.connect(this);
        return socket;
    }

    /*
     * WARNING - void declaration
     */
    static {
        void var0;
        INTERNAL_DUMMY_BIND = new SentinelSocketAddress(0);
        INTERNAL_DUMMY_CONNECT = new SentinelSocketAddress(1);
        INTERNAL_DUMMY_DONT_CONNECT = new SentinelSocketAddress(2);
        SOCKADDR_NATIVE_FAMILY_OFFSET = NativeUnixSocket.isLoaded() ? NativeUnixSocket.sockAddrNativeFamilyOffset() : -1;
        SOCKADDR_NATIVE_DATA_OFFSET = NativeUnixSocket.isLoaded() ? NativeUnixSocket.sockAddrNativeDataOffset() : -1;
        SOCKADDR_MAX_LEN = NativeUnixSocket.isLoaded() ? NativeUnixSocket.sockAddrLength(0) : 256;
        ADDRESS_CACHE = new HashMap();
        SOCKETADDRESS_BUFFER_TL = new ThreadLocal<ByteBuffer>(){

            @Override
            protected ByteBuffer initialValue() {
                return AFSocketAddress.newSockAddrDirectBuffer(AFSocketAddress.access$000());
            }
        };
        String v = System.getProperty("org.newsclub.net.unix.AFSocketAddress.deserialize", "");
        USE_DESERIALIZATION_FOR_INIT = v.isEmpty() ? NativeLibraryLoader.isAndroid() : Boolean.parseBoolean((String)var0);
    }

    static String toUnsignedString(int i) {
        return Long.toString(AFSocketAddress.toUnsignedLong(i));
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        String af = in.readUTF();
        this.addressFamily = "undefined".equals(af) ? null : Objects.requireNonNull(AFAddressFamily.getAddressFamily(af), "address family");
    }

    /*
     * WARNING - void declaration
     */
    public @Nullable String toSocatAddressString(AFSocketType socketType, AFSocketProtocol socketProtocol) throws IOException {
        void var5_5;
        int n;
        block11: {
            block10: {
                if (SOCKADDR_NATIVE_FAMILY_OFFSET == -1) break block10;
                if (SOCKADDR_NATIVE_DATA_OFFSET != -1) break block11;
            }
            return null;
        }
        if (this.nativeAddress == null) {
            throw (SocketException)new SocketException("Cannot access native address").initCause(NativeUnixSocket.unsupportedException());
        }
        if (socketProtocol != null) {
            if (socketProtocol.getId() != 0) {
                throw new IOException("Protocol not (yet) supported");
            }
        }
        int family = this.nativeAddress.get(SOCKADDR_NATIVE_FAMILY_OFFSET) & 0xFF;
        int type = socketType == null ? -1 : NativeUnixSocket.sockTypeToNative(socketType.getId());
        StringBuilder sb = new StringBuilder();
        sb.append(family);
        if (type != -1) {
            sb.append(':');
            sb.append(type);
        }
        if (socketProtocol != null) {
            sb.append(':');
            sb.append(socketProtocol.getId());
        }
        sb.append(":x");
        for (n = this.nativeAddress.limit(); n > 1; --n) {
            if (this.nativeAddress.get(n - 1) != 0) break;
        }
        int pos = SOCKADDR_NATIVE_DATA_OFFSET;
        while (pos < n) {
            void var7_7;
            void var8_8;
            byte b2 = this.nativeAddress.get(pos);
            Object[] objectArray = new Object[1];
            objectArray[0] = (byte)var8_8;
            sb.append(String.format(Locale.ENGLISH, "%02x", objectArray));
            ++var7_7;
        }
        return var5_5.toString();
    }

    AFSocketAddress(Class<SentinelSocketAddress> clazz, int port) {
        super(InetAddress.getLoopbackAddress(), port);
        this.nativeAddress = null;
        this.bytes = new byte[0];
        this.addressFamily = null;
    }

    public AFServerSocket<?> newForceBoundServerSocket() throws IOException {
        AFServerSocket<?> serverSocket = this.getAddressFamily().newServerSocket();
        serverSocket.forceBindAddress(this).bind(this);
        return serverSocket;
    }

    static final ByteBuffer newSockAddrKeyBuffer(int length) {
        return ByteBuffer.allocate(length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static <A extends AFSocketAddress> A newDeserializedAFSocketAddress(int port, byte[] socketAddress, ByteBuffer nativeAddress, AFAddressFamily<A> af, AFSocketAddressConstructor<A> constructor) throws SocketException {
        String hostname = AFInetAddress.createUnresolvedHostname(socketAddress, af);
        if (hostname == null) return constructor.newAFSocketAddress(port, socketAddress, nativeAddress);
        if (hostname.isEmpty()) {
            return constructor.newAFSocketAddress(port, socketAddress, nativeAddress);
        }
        try (ObjectInputStream oin = new ObjectInputStream(new ByteArrayInputStream(AFSocketAddress.craftSerializedObject(af.getSocketAddressClass(), hostname, port >= 0 && port <= 65535 ? port : 0)));){
            AFSocketAddress addr = (AFSocketAddress)oin.readObject();
            AFSocketAddress.initAFSocketAddress(addr, port, socketAddress, nativeAddress, af);
            AFSocketAddress aFSocketAddress = addr;
            return (A)aFSocketAddress;
        }
        catch (SocketException e) {
            throw e;
        }
        catch (IOException | ClassNotFoundException e) {
            throw (SocketException)new SocketException("Unexpected deserialization problem").initCause(e);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static final <A extends AFSocketAddress> A ofInternal(ByteBuffer socketAddressBuffer, AFAddressFamily<A> af) throws SocketException {
        Class<AFSocketAddress> clazz = AFSocketAddress.class;
        synchronized (AFSocketAddress.class) {
            byte[] sockAddrToBytes;
            socketAddressBuffer.rewind();
            Map<Integer, Map<ByteBuffer, AFSocketAddress>> mapPorts = ADDRESS_CACHE.get(af);
            if (mapPorts != null) {
                AFSocketAddress address;
                Map<ByteBuffer, AFSocketAddress> map = mapPorts.get(0);
                if (map != null && (address = map.get(socketAddressBuffer)) != null) {
                    // ** MonitorExit[var2_2] (shouldn't be in output)
                    return (A)address;
                }
            }
            if (!socketAddressBuffer.isDirect()) {
                ByteBuffer buf = AFSocketAddress.getNativeAddressDirectBuffer(Math.min(socketAddressBuffer.limit(), SOCKADDR_MAX_LEN));
                buf.put(socketAddressBuffer);
                socketAddressBuffer = buf;
            }
            if ((sockAddrToBytes = NativeUnixSocket.sockAddrToBytes(af.getDomain(), socketAddressBuffer)) == null) {
                // ** MonitorExit[var2_2] (shouldn't be in output)
                return null;
            }
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return AFSocketAddress.resolveAddress(sockAddrToBytes, 0, af);
        }
    }

    protected final synchronized InetAddress getInetAddress(AFAddressFamily<?> af) {
        if (this.inetAddress == null) {
            this.inetAddress = AFInetAddress.wrapAddress(this.bytes, af);
        }
        return this.inetAddress;
    }

    public AFServerSocket<?> newBoundServerSocket() throws IOException {
        AFServerSocket<?> serverSocket = this.getAddressFamily().newServerSocket();
        serverSocket.bind(this);
        return serverSocket;
    }

    private static long toUnsignedLong(long x) {
        return x & 0xFFFFFFFFL;
    }

    public static AFSocketAddress of(URI u, int overridePort) throws SocketException {
        AFAddressFamily<?> af = AFAddressFamily.getAddressFamily(u);
        if (af == null) {
            throw new SocketException("Cannot resolve AFSocketAddress from URI scheme: " + u.getScheme());
        }
        return af.parseURI(u, overridePort);
    }

    public URI toURI(String scheme, URI template) throws IOException {
        throw new IOException("Unsupported operation");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    protected static final <A extends AFSocketAddress> A resolveAddress(byte[] socketAddress, int port, AFAddressFamily<A> af) throws SocketException {
        if (socketAddress.length == 0) {
            throw new SocketException("Address cannot be empty");
        }
        if (port == -1) {
            port = 0;
        }
        ByteBuffer direct = SOCKETADDRESS_BUFFER_TL.get();
        int limit = NativeUnixSocket.isLoaded() ? NativeUnixSocket.bytesToSockAddr(af.getDomain(), direct, socketAddress) : -1;
        if (limit == -1) {
            return af.getAddressConstructor().newAFSocketAddress(port, socketAddress, null);
        }
        if (limit > SOCKADDR_MAX_LEN) {
            throw new IllegalStateException("Unexpected address length");
        }
        direct.rewind();
        direct.limit(limit);
        Class<AFSocketAddress> clazz = AFSocketAddress.class;
        synchronized (AFSocketAddress.class) {
            void var5_7;
            Map<ByteBuffer, AFSocketAddress> map;
            AFSocketAddress instance;
            Map<Integer, Map<ByteBuffer, AFSocketAddress>> mapPorts = ADDRESS_CACHE.get(af);
            if (mapPorts == null) {
                instance = null;
                mapPorts = new HashMap<Integer, Map<ByteBuffer, AFSocketAddress>>();
                map = new HashMap<ByteBuffer, AFSocketAddress>();
                mapPorts.put(port, map);
                ADDRESS_CACHE.put(af, mapPorts);
            } else {
                map = mapPorts.get(port);
                if (map == null) {
                    instance = null;
                    map = new HashMap<ByteBuffer, AFSocketAddress>();
                    mapPorts.put(port, map);
                } else {
                    instance = map.get(direct);
                }
            }
            if (instance == null) {
                void var9_9;
                void var7_8;
                ByteBuffer key = AFSocketAddress.newSockAddrKeyBuffer(limit);
                key.put(direct);
                key = key.asReadOnlyBuffer();
                instance = af.getAddressConstructor().newAFSocketAddress(port, socketAddress, key);
                var7_8.put(var9_9, instance);
            }
            // ** MonitorExit[var6_5] (shouldn't be in output)
            return var5_7;
        }
    }

    /*
     * WARNING - void declaration
     */
    protected static final InetAddress getInetAddress(FileDescriptor fdesc, boolean peerName, AFAddressFamily<?> af) {
        void var2_2;
        if (!fdesc.valid()) {
            return null;
        }
        byte[] addr = NativeUnixSocket.sockname(af.getDomain(), fdesc, peerName);
        if (addr == null) {
            return null;
        }
        return AFInetAddress.wrapAddress(addr, var2_2);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeUTF(this.addressFamily == null ? "undefined" : this.addressFamily.getJuxString());
    }

    static String toUnsignedString(int i, int radix) {
        return Long.toUnsignedString(AFSocketAddress.toUnsignedLong(i), radix);
    }

    public boolean covers(AFSocketAddress other) {
        return this.equals(other);
    }

    public abstract boolean hasFilename();

    /*
     * WARNING - void declaration
     */
    private static void initAFSocketAddress(AFSocketAddress addr, int port, byte[] socketAddress, ByteBuffer nativeAddress, AFAddressFamily<?> af) throws SocketException {
        void var4_4;
        if (socketAddress.length == 0) {
            throw new SocketException("Illegal address length: " + socketAddress.length);
        }
        addr.nativeAddress = nativeAddress == null ? null : nativeAddress.duplicate().rewind();
        if (port < -1) {
            throw new IllegalArgumentException("port out of range");
        }
        if (port > 65535) {
            if (!NativeUnixSocket.isLoaded()) {
                throw (SocketException)new SocketException("Cannot set SocketAddress port - junixsocket JNI library is not available").initCause(NativeUnixSocket.unsupportedException());
            }
            NativeUnixSocket.setPort1(addr, port);
        }
        addr.bytes = (byte[])socketAddress.clone();
        var0.addressFamily = var4_4;
    }

    protected static final <A extends AFSocketAddress> @NonNull A unwrap(String hostname, int port, AFAddressFamily<A> af) throws SocketException {
        Objects.requireNonNull(hostname);
        return AFSocketAddress.resolveAddress(AFInetAddress.unwrapAddress(hostname, af), port, af);
    }

    /*
     * WARNING - void declaration
     */
    final ByteBuffer getNativeAddressDirectBuffer() throws SocketException {
        void var2_2;
        ByteBuffer address = this.nativeAddress;
        if (address == null) {
            throw (SocketException)new SocketException("Cannot access native address").initCause(NativeUnixSocket.unsupportedException());
        }
        address = address.duplicate();
        ByteBuffer direct = AFSocketAddress.getNativeAddressDirectBuffer(address.limit());
        address.position(0);
        direct.put(address);
        return var2_2;
    }

    protected final byte[] getBytes() {
        return this.bytes;
    }

    @SuppressFBWarnings(value={"CT_CONSTRUCTOR_THROW"})
    protected AFSocketAddress(int port, byte[] socketAddress, ByteBuffer nativeAddress, AFAddressFamily<?> af) throws SocketException {
        super(AFInetAddress.createUnresolvedHostname(socketAddress, af), port >= 0 && port <= 65535 ? port : 0);
        AFSocketAddress.initAFSocketAddress(this, port, socketAddress, nativeAddress, af);
    }

    public static AFSocketAddress of(URI u) throws SocketException {
        return AFSocketAddress.of(u, -1);
    }

    protected static final <A extends AFSocketAddress> @NonNull A unwrap(InetAddress address, int port, AFAddressFamily<A> af) throws SocketException {
        Objects.requireNonNull(address);
        return AFSocketAddress.resolveAddress(AFInetAddress.unwrapAddress(address, af), port, af);
    }

    @FunctionalInterface
    protected static interface AFSocketAddressConstructor<T extends AFSocketAddress> {
        public @NonNull T newAFSocketAddress(int var1, byte[] var2, ByteBuffer var3) throws SocketException;
    }
}

