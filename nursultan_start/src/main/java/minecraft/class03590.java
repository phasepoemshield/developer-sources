/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00667
 *  minecraft.class07321
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00667;
import minecraft.class07321;

public final class class03590
extends Record {
    private final class07321 pos;
    private final byte[] buffer;

    public byte[] L() {
        return this.buffer;
    }

    public class03590(class00570 class005702) {
        this(class005702.R(), new byte[class03590.N(class005702)]);
        class03590.N(new class00667(this.u()), class005702);
    }

    public class03590(class07321 class073212, byte[] byArray) {
        this.pos = class073212;
        this.buffer = byArray;
    }

    public class03590(class00667 class006672) {
        this(class006672.R(), class006672.N(0x200000));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03590.class, "pos;buffer", "pos", "buffer"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03590.class, "pos;buffer", "pos", "buffer"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03590.class, "pos;buffer", "pos", "buffer"}, this);
    }

    private ByteBuf u() {
        ByteBuf byteBuf = Unpooled.wrappedBuffer((byte[])this.buffer);
        byteBuf.writerIndex(0);
        return byteBuf;
    }

    public class07321 y() {
        return this.pos;
    }

    public static void N(class00667 class006672, class00570 class005702) {
        class00554[] class00554Array = class005702.u();
        int n = class00554Array.length;
        for (int i = 0; i < n; ++i) {
            class00554Array[i].Z().y(class006672);
        }
        if (class006672.writerIndex() != class006672.capacity()) {
            throw new IllegalStateException("Didn't fill biome buffer: expected " + class006672.capacity() + " bytes, got " + class006672.writerIndex());
        }
    }

    private static int N(class00570 class005702) {
        int n = 0;
        for (class00554 class005542 : class005702.u()) {
            n += class005542.Z().y();
        }
        return n;
    }

    public void N(class00667 class006672) {
        class006672.N(this.pos);
        class006672.N(this.buffer);
    }

    public class00667 N() {
        return new class00667(Unpooled.wrappedBuffer((byte[])this.buffer));
    }
}

