/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import org.newsclub.net.unix.AFAddressFamily;

class AFInetAddress {
    private static final byte[] LOCAL_AF;
    private static final char PREFIX = '[';
    private static final String MARKER_HEX_ENCODING = "%%";
    static final String INETADDR_SUFFIX = ".junixsocket";

    AFInetAddress() {
    }

    /*
     * WARNING - void declaration
     */
    static final String createUnresolvedHostname(byte[] socketAddress, AFAddressFamily<?> af) {
        void var1_1;
        void var2_2;
        StringBuilder sb;
        block6: {
            String str;
            block5: {
                sb = new StringBuilder(1 + socketAddress.length + INETADDR_SUFFIX.length() + 8);
                sb.append('[');
                try {
                    sb.append(URLEncoder.encode(new String(socketAddress, StandardCharsets.ISO_8859_1), StandardCharsets.ISO_8859_1.toString()));
                }
                catch (UnsupportedEncodingException e) {
                    throw new IllegalStateException(e);
                }
                sb.append('.');
                sb.append(af.getJuxString());
                sb.append(INETADDR_SUFFIX);
                str = sb.toString();
                if (str.length() < 64) break block5;
                if (str.getBytes(StandardCharsets.UTF_8).length > 255) break block6;
            }
            return str;
        }
        sb.setLength(0);
        sb.append('[');
        sb.append(MARKER_HEX_ENCODING);
        int i = 0;
        int n = socketAddress.length;
        while (i < n) {
            void var4_5;
            Object[] objectArray = new Object[1];
            objectArray[0] = socketAddress[i];
            sb.append(String.format(Locale.ENGLISH, "%02x", objectArray));
            ++var4_5;
        }
        sb.append('.');
        var2_2.append(var1_1.getJuxString());
        var2_2.append(INETADDR_SUFFIX);
        return var2_2.toString();
    }

    static final InetAddress wrapAddress(byte[] socketAddress, AFAddressFamily<?> af) {
        block7: {
            block6: {
                Objects.requireNonNull(af);
                if (socketAddress == null) break block6;
                if (socketAddress.length != 0) break block7;
            }
            return null;
        }
        String hostname = AFInetAddress.createUnresolvedHostname(socketAddress, af);
        byte[] bytes = hostname.getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 255) {
            throw new IllegalStateException("junixsocket address is too long to wrap as InetAddress");
        }
        try {
            return InetAddress.getByAddress(hostname, LOCAL_AF);
        }
        catch (UnknownHostException e) {
            throw new IllegalStateException(e);
        }
    }

    static final byte[] unwrapAddress(InetAddress addr, AFAddressFamily<?> af) throws SocketException {
        Objects.requireNonNull(addr);
        if (!AFInetAddress.isSupportedAddress(addr, af)) {
            throw new SocketException("Unsupported address");
        }
        String hostname = addr.getHostName();
        try {
            return AFInetAddress.unwrapAddress(hostname, af);
        }
        catch (IllegalArgumentException e) {
            throw (SocketException)new SocketException("Unsupported address").initCause(e);
        }
    }

    /*
     * WARNING - void declaration
     */
    static final byte[] unwrapAddress(String hostname, AFAddressFamily<?> af) throws SocketException {
        Objects.requireNonNull(hostname);
        if (!hostname.endsWith(INETADDR_SUFFIX)) {
            throw new SocketException("Unsupported address");
        }
        int end = hostname.length() - INETADDR_SUFFIX.length();
        int domDot = -1;
        for (int i = end + -1; i >= 0; --i) {
            char c = hostname.charAt(i);
            if (c != '.') continue;
            domDot = i;
            break;
        }
        String juxString = hostname.substring(domDot + 1, end);
        if (AFAddressFamily.getAddressFamily(juxString) != af) {
            throw new SocketException("Incompatible address");
        }
        String encodedHostname = hostname.substring(1, domDot);
        if (encodedHostname.startsWith(MARKER_HEX_ENCODING)) {
            void var8_10;
            int len = encodedHostname.length();
            if ((len & 1) == 1) {
                throw new IllegalStateException("Length of hex-encoded wrapping must be even");
            }
            byte[] unwrapped = new byte[(len - 2) / 2];
            int i = 2;
            int n = encodedHostname.length();
            int o = 0;
            while (i < n) {
                void var11_13;
                void var12_14;
                int v = Integer.parseInt(encodedHostname.substring(i, i + 2), 16);
                unwrapped[o] = (byte)(var12_14 & 0xFF);
                var9_11 += 2;
                ++var11_13;
            }
            return var8_10;
        }
        try {
            return URLDecoder.decode(encodedHostname, StandardCharsets.ISO_8859_1.toString()).getBytes(StandardCharsets.ISO_8859_1);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalStateException(unsupportedEncodingException);
        }
    }

    static boolean isSupportedAddress(InetAddress addr, AFAddressFamily<?> af) {
        if (addr instanceof Inet4Address && addr.isLoopbackAddress()) {
            String hostname = addr.getHostName();
            return hostname.endsWith(af.getJuxInetAddressSuffix());
        }
        return false;
    }

    static {
        byte[] byArray = new byte[4];
        byArray[0] = 127;
        byArray[1] = 0;
        byArray[2] = 0;
        byArray[3] = -81;
        LOCAL_AF = byArray;
    }
}

