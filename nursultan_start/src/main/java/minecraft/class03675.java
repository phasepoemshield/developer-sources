/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06338;

public final class class03675
extends Record {
    private final int block;
    private final int sky;
    public static final Codec<Integer> N = class06338.N((int)0, (int)15);
    public static final Codec<class03675> y = RecordCodecBuilder.create(instance -> instance.group((App)N.fieldOf("block").forGetter(class03675::y), (App)N.fieldOf("sky").forGetter(class03675::L)).apply(instance, class03675::new));
    public static final class03675 L = new class03675(15, 15);

    public static class03675 L(int n) {
        return new class03675(class03675.N(n), class03675.y(n));
    }

    public int L() {
        return this.sky;
    }

    public class03675(int n, int n2) {
        this.block = n;
        this.sky = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03675.class, "block;sky", "block", "sky"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03675.class, "block;sky", "block", "sky"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03675.class, "block;sky", "block", "sky"}, this);
    }

    public static int y(int n) {
        return n >> 20 & 0xFFFF;
    }

    public int y() {
        return this.block;
    }

    public int N() {
        return class03675.N(this.block, this.sky);
    }

    public static int N(int n, int n2) {
        return n << 4 | n2 << 20;
    }

    public static int N(int n) {
        return n >> 4 & 0xFFFF;
    }
}

