/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class04206
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00751;
import minecraft.class04206;

public final class class01624
extends Record {
    private final long timeout;
    private final int flags;
    public static final long N = 0L;
    public static final int y = 1;
    public static final int L = 2;
    public static final int u = 4;
    public static final int i = 8;
    public static final int R = 16;
    public static final class01624 M = class01624.N("player_spawn", 20L, 2);
    public static final class01624 B = class01624.N("spawn_search", 1L, 2);
    public static final class01624 Z = class01624.N("dragon", 0L, 6);
    public static final class01624 z = class01624.N("player_loading", 0L, 2);
    public static final class01624 U = class01624.N("player_simulation", 0L, 12);
    public static final class01624 E = class01624.N("forced", 0L, 15);
    public static final class01624 W = class01624.N("portal", 300L, 15);
    public static final class01624 m = class01624.N("ender_pearl", 40L, 14);
    public static final class01624 P = class01624.N("unknown", 1L, 18);

    public boolean L() {
        return (this.flags & 4) != 0;
    }

    public long M() {
        return this.timeout;
    }

    public class01624(long l, int n) {
        this.timeout = l;
        this.flags = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01624.class, "timeout;flags", "timeout", "flags"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01624.class, "timeout;flags", "timeout", "flags"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01624.class, "timeout;flags", "timeout", "flags"}, this);
    }

    public int B() {
        return this.flags;
    }

    public boolean i() {
        return (this.flags & 0x10) != 0;
    }

    public boolean u() {
        return (this.flags & 8) != 0;
    }

    public boolean y() {
        return (this.flags & 2) != 0;
    }

    public boolean N() {
        return (this.flags & 1) != 0;
    }

    private static class01624 N(String string, long l, int n) {
        return (class01624)((Object)class00751.N((class00751)class04206.NY, (String)string, (Object)((Object)new class01624(l, n))));
    }

    public boolean R() {
        return this.timeout != 0L;
    }
}

