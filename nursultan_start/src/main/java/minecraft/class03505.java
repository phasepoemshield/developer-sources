/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class07536;

public final class class03505
extends Record {
    final float x;
    final float y;
    public static final class03505 L = new class03505(0.0f, 0.0f);
    public static final Codec<class03505> u = Codec.floatRange((float)-512.0f, (float)512.0f).listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)2).map(list -> new class03505(((Float)list.get(0)).floatValue(), ((Float)list.get(1)).floatValue())), class035052 -> List.of(Float.valueOf(class035052.x), Float.valueOf(class035052.y)));

    public class03505(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03505.class, "x;y", "x", "y"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03505.class, "x;y", "x", "y"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03505.class, "x;y", "x", "y"}, this);
    }

    public float y() {
        return this.y;
    }

    public float N() {
        return this.x;
    }
}

