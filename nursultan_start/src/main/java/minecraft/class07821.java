/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04193
 *  minecraft.class04286
 *  minecraft.class07825
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04193;
import minecraft.class04286;
import minecraft.class07825;

public final class class07821
extends Record
implements class00381<class07825> {
    private final int protocolVersion;
    private final String hostName;
    private final int port;
    private final class04193 intention;
    public static final class02362<class00667, class07821> N = class00381.N(class07821::N, class07821::new);
    private static final int R = 255;

    public int L() {
        return this.port;
    }

    @Deprecated
    public class07821(int n, String string, int n2, class04193 class041932) {
        this.protocolVersion = n;
        this.hostName = string;
        this.port = n2;
        this.intention = class041932;
    }

    private class07821(class00667 class006672) {
        this(class006672.E(), class006672.u(255), class006672.readUnsignedShort(), class04193.N((int)class006672.E()));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07821.class, "protocolVersion;hostName;port;intention", "protocolVersion", "hostName", "port", "intention"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07821.class, "protocolVersion;hostName;port;intention", "protocolVersion", "hostName", "port", "intention"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07821.class, "protocolVersion;hostName;port;intention", "protocolVersion", "hostName", "port", "intention"}, this);
    }

    public class04193 u() {
        return this.intention;
    }

    public String y() {
        return this.hostName;
    }

    private void N(class00667 class006672) {
        class006672.L(this.protocolVersion);
        class006672.N(this.hostName);
        class006672.writeShort(this.port);
        class006672.L(this.intention.N());
    }

    public void method_65081(class07825 class078252) {
        class078252.N(this);
    }

    public int N() {
        return this.protocolVersion;
    }

    public boolean R() {
        return true;
    }

    public class02897<class07821> method_65080() {
        return class04286.N;
    }
}

