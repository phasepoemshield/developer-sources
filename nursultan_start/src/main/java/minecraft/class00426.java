/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05163
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05163;

public final class class00426
extends Record {
    private final class05163 boundingBox;
    private final boolean isStart;
    public static final class02362<ByteBuf, class00426> N = class02362.N((class02362)class05163.y, class00426::N, (class02362)class02389.y, class00426::y, class00426::new);

    public class00426(class05163 class051632, boolean bl) {
        this.boundingBox = class051632;
        this.isStart = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00426.class, "boundingBox;isStart", "boundingBox", "isStart"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00426.class, "boundingBox;isStart", "boundingBox", "isStart"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00426.class, "boundingBox;isStart", "boundingBox", "isStart"}, this);
    }

    public boolean y() {
        return this.isStart;
    }

    public class05163 N() {
        return this.boundingBox;
    }
}

