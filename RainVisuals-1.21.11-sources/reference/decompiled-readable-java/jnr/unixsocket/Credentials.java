/*
 * Decompiled with CFR 0.152.
 */
package jnr.unixsocket;

import jnr.constants.platform.SocketLevel;
import jnr.constants.platform.SocketOption;
import jnr.unixsocket.Native;
import jnr.unixsocket.Ucred;

public final class Credentials {
    private final Ucred ucred;

    static Credentials getCredentials(int fd) {
        Ucred c = new Ucred();
        int error = Native.getsockopt(fd, SocketLevel.SOL_SOCKET, SocketOption.SO_PEERCRED, c);
        if (error != 0) {
            throw new UnsupportedOperationException(Native.getLastErrorString());
        }
        return new Credentials(c);
    }

    Credentials(Ucred ucred) {
        this.ucred = ucred;
    }

    public int getPid() {
        return this.ucred.getPidField().intValue();
    }

    public int getGid() {
        return this.ucred.getGidField().intValue();
    }

    public String toString() {
        Object[] objectArray = new Object[3];
        objectArray[0] = this.getUid();
        objectArray[1] = this.getGid();
        objectArray[2] = this.getPid();
        return String.format("[uid=%d gid=%d pid=%d]", objectArray);
    }

    public int getUid() {
        return this.ucred.getUidField().intValue();
    }
}

