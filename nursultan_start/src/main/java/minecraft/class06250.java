/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class06250
extends Record {
    final int left;
    final int right;
    public static final MapCodec<class06250> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("left").forGetter(class06250::y), (App)Codec.INT.fieldOf("right").forGetter(class06250::L)).apply(instance, class06250::new));
    public static final Codec<class06250> u = L.codec();

    public int L() {
        return this.right;
    }

    public class06250(int n, int n2) {
        this.left = n;
        this.right = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06250.class, "left;right", "left", "right"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06250.class, "left;right", "left", "right"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06250.class, "left;right", "left", "right"}, this);
    }

    public int y() {
        return this.left;
    }

    public static int y(int n) {
        return (byte)n;
    }

    public static int N(int n) {
        return (byte)(n >> 8);
    }

    public int N() {
        return class06250.N(this.left, this.right);
    }

    public static int N(int n, int n2) {
        return (n & 0xFF) << 8 | n2 & 0xFF;
    }
}

