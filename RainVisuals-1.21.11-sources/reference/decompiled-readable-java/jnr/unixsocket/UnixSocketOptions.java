/*
 * Decompiled with CFR 0.152.
 */
package jnr.unixsocket;

import java.net.SocketOption;
import jnr.unixsocket.Credentials;

public final class UnixSocketOptions {
    public static final SocketOption<Boolean> SO_PASSCRED;
    public static final SocketOption<Integer> SO_SNDTIMEO;
    public static final SocketOption<Integer> SO_RCVBUF;
    public static final SocketOption<Integer> SO_RCVTIMEO;
    public static final SocketOption<Boolean> SO_KEEPALIVE;
    public static final SocketOption<Integer> SO_SNDBUF;
    public static final SocketOption<Credentials> SO_PEERCRED;

    static {
        SO_SNDBUF = new GenericOption<Integer>("SO_SNDBUF", Integer.class);
        SO_SNDTIMEO = new GenericOption<Integer>("SO_SNDTIMEO", Integer.class);
        SO_RCVBUF = new GenericOption<Integer>("SO_RCVBUF", Integer.class);
        SO_RCVTIMEO = new GenericOption<Integer>("SO_RCVTIMEO", Integer.class);
        SO_KEEPALIVE = new GenericOption<Boolean>("SO_KEEPALIVE", Boolean.class);
        SO_PEERCRED = new GenericOption<Credentials>("SO_PEERCRED", Credentials.class);
        SO_PASSCRED = new GenericOption<Boolean>("SO_PASSCRED", Boolean.class);
    }

    private static class GenericOption<T>
    implements SocketOption<T> {
        private final String name;
        private final Class<T> type;

        @Override
        public Class<T> type() {
            return this.type;
        }

        public String toString() {
            return this.name;
        }

        @Override
        public String name() {
            return this.name;
        }

        GenericOption(String name, Class<T> type) {
            this.name = name;
            this.type = type;
        }
    }
}

