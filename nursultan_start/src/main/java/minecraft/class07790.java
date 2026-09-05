/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class02362
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class07769;

public final class class07790
extends Record {
    private final int startX;
    private final int startY;
    private final int width;
    private final int height;
    private final byte[] mapColors;
    public static final class02362<ByteBuf, Optional<class07790>> N = class02362.N(class07790::N, class07790::N);

    public int L() {
        return this.width;
    }

    public class07790(int n, int n2, int n3, int n4, byte[] byArray) {
        this.startX = n;
        this.startY = n2;
        this.width = n3;
        this.height = n4;
        this.mapColors = byArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07790.class, "startX;startY;width;height;mapColors", "startX", "startY", "width", "height", "mapColors"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07790.class, "startX;startY;width;height;mapColors", "startX", "startY", "width", "height", "mapColors"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07790.class, "startX;startY;width;height;mapColors", "startX", "startY", "width", "height", "mapColors"}, this);
    }

    public byte[] i() {
        return this.mapColors;
    }

    public int u() {
        return this.height;
    }

    public int y() {
        return this.startY;
    }

    public void N(class07769 class077692) {
        for (int i = 0; i < this.width; ++i) {
            for (int j = 0; j < this.height; ++j) {
                class077692.y(this.startX + i, this.startY + j, this.mapColors[i + j * this.width]);
            }
        }
    }

    private static Optional<class07790> N(ByteBuf byteBuf) {
        short s = byteBuf.readUnsignedByte();
        if (s > 0) {
            short s2 = byteBuf.readUnsignedByte();
            short s3 = byteBuf.readUnsignedByte();
            short s4 = byteBuf.readUnsignedByte();
            byte[] byArray = class00667.N((ByteBuf)byteBuf);
            return Optional.of(new class07790(s3, s4, s, s2, byArray));
        }
        return Optional.empty();
    }

    public int N() {
        return this.startX;
    }

    private static void N(ByteBuf byteBuf, Optional<class07790> optional) {
        if (optional.isPresent()) {
            class07790 class077902 = optional.get();
            byteBuf.writeByte(class077902.width);
            byteBuf.writeByte(class077902.height);
            byteBuf.writeByte(class077902.startX);
            byteBuf.writeByte(class077902.startY);
            class00667.N((ByteBuf)byteBuf, (byte[])class077902.mapColors);
        } else {
            byteBuf.writeByte(0);
        }
    }
}

