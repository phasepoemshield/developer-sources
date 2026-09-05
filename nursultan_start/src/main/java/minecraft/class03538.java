/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01281
 *  minecraft.class02045
 *  minecraft.class04227
 *  minecraft.class04412
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01281;
import minecraft.class02045;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04412;
import minecraft.class05946;

@Deprecated
public final class class03538
extends Record {
    private final class03556<class04412> otherSet;
    private final int chunkCount;
    public static final Codec<class03538> N = RecordCodecBuilder.create(instance -> instance.group((App)class01281.N((class05946)class04227.yb, (Codec)class04412.N, (boolean)false).fieldOf("other_set").forGetter(class03538::N), (App)Codec.intRange((int)1, (int)16).fieldOf("chunk_count").forGetter(class03538::y)).apply(instance, class03538::new));

    public class03538(class03556<class04412> class035562, int n) {
        this.otherSet = class035562;
        this.chunkCount = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03538.class, "otherSet;chunkCount", "otherSet", "chunkCount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03538.class, "otherSet;chunkCount", "otherSet", "chunkCount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03538.class, "otherSet;chunkCount", "otherSet", "chunkCount"}, this);
    }

    public int y() {
        return this.chunkCount;
    }

    public class03556<class04412> N() {
        return this.otherSet;
    }

    boolean N(class02045 class020452, int n, int n2) {
        return class020452.N(this.otherSet, n, n2, this.chunkCount);
    }
}

