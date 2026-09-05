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
import java.util.List;
import minecraft.class00426;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05163;

public final class class00431
extends Record {
    private final class05163 boundingBox;
    private final List<class00426> pieces;
    public static final class02362<ByteBuf, class00431> N = class02362.N((class02362)class05163.y, class00431::N, (class02362)class00426.N.N_33(class02389.N()), class00431::y, class00431::new);

    public class00431(class05163 class051632, List<class00426> list) {
        this.boundingBox = class051632;
        this.pieces = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00431.class, "boundingBox;pieces", "boundingBox", "pieces"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00431.class, "boundingBox;pieces", "boundingBox", "pieces"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00431.class, "boundingBox;pieces", "boundingBox", "pieces"}, this);
    }

    public List<class00426> y() {
        return this.pieces;
    }

    public class05163 N() {
        return this.boundingBox;
    }
}

