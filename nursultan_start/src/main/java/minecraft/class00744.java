/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00722
 *  minecraft.class02362
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00722;
import minecraft.class02362;
import minecraft.class07536;

public final class class00744
extends Record {
    final float x;
    final float y;
    final float z;
    public static final Codec<class00744> u = Codec.FLOAT.listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)3).map(list -> new class00744(((Float)list.get(0)).floatValue(), ((Float)list.get(1)).floatValue(), ((Float)list.get(2)).floatValue())), class007442 -> List.of(Float.valueOf(class007442.N()), Float.valueOf(class007442.y()), Float.valueOf(class007442.L())));
    public static final class02362<ByteBuf, class00744> i = new class00722();

    public float L() {
        return this.z;
    }

    public class00744(float f, float f2, float f3) {
        f = Float.isInfinite(f) || Float.isNaN(f) ? 0.0f : f % 360.0f;
        f2 = Float.isInfinite(f2) || Float.isNaN(f2) ? 0.0f : f2 % 360.0f;
        f3 = Float.isInfinite(f3) || Float.isNaN(f3) ? 0.0f : f3 % 360.0f;
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00744.class, "x;y;z", "x", "y", "z"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00744.class, "x;y;z", "x", "y", "z"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00744.class, "x;y;z", "x", "y", "z"}, this);
    }

    public float y() {
        return this.y;
    }

    public float N() {
        return this.x;
    }
}

