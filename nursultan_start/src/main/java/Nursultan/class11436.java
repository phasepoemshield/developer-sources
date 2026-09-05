/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;

public class class11436
extends Record {
    public long reconnectAfterMs;
    public String path;
    public String host;
    public boolean sslEnabled;
    public int port;

    public URI L() {
        return URI.create((this.sslEnabled ? "wss" : "ws") + "://" + this.host + ":" + this.port + this.path);
    }

    public String M() {
        return this.host;
    }

    public class11436(String string, int n, String string2, boolean bl, long l) {
        this.host = string;
        this.port = n;
        this.path = string2;
        this.sslEnabled = bl;
        this.reconnectAfterMs = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11436.class, "host;port;path;sslEnabled;reconnectAfterMs", "host", "port", "path", "sslEnabled", "reconnectAfterMs"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11436.class, "host;port;path;sslEnabled;reconnectAfterMs", "host", "port", "path", "sslEnabled", "reconnectAfterMs"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11436.class, "host;port;path;sslEnabled;reconnectAfterMs", "host", "port", "path", "sslEnabled", "reconnectAfterMs"}, this);
    }

    public boolean i() {
        return this.sslEnabled;
    }

    public long u() {
        return this.reconnectAfterMs;
    }

    public int y() {
        return this.port;
    }

    public String N() {
        return this.path;
    }

    public static class11436 R() {
        return new class11436("socket.nursultan.fun", 443, "/ws", true, 5000L);
    }
}

