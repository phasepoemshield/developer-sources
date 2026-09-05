/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;

public final class class00452
extends Record {
    private final int priority;
    private final boolean isRunning;
    private final String name;
    public static final class02362<ByteBuf, class00452> N = class02362.N((class02362)class02389.B, class00452::N, (class02362)class02389.y, class00452::y, (class02362)class02389.y((int)255), class00452::L, class00452::new);

    public String L() {
        return this.name;
    }

    public class00452(int n, boolean bl, String string) {
        this.priority = n;
        this.isRunning = bl;
        this.name = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00452.class, "priority;isRunning;name", "priority", "isRunning", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00452.class, "priority;isRunning;name", "priority", "isRunning", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00452.class, "priority;isRunning;name", "priority", "isRunning", "name"}, this);
    }

    public boolean y() {
        return this.isRunning;
    }

    public int N() {
        return this.priority;
    }
}

