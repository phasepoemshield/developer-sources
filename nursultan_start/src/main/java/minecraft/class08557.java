/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04995
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04995;
import minecraft.class06338;

public final class class08557
extends Record {
    private final float threshold;
    private final float base;
    private final float factor;
    public static final Codec<class08557> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.n.fieldOf("threshold").forGetter(class08557::N), (App)Codec.FLOAT.fieldOf("base").forGetter(class08557::y), (App)Codec.FLOAT.fieldOf("factor").forGetter(class08557::L)).apply(instance, class08557::new));
    public static final class02362<ByteBuf, class08557> y = class02362.N((class02362)class02389.E, class08557::N, (class02362)class02389.E, class08557::y, (class02362)class02389.E, class08557::L, class08557::new);
    public static final class08557 L = new class08557(1.0f, 0.0f, 1.0f);

    public float L() {
        return this.factor;
    }

    public class08557(float f, float f2, float f3) {
        this.threshold = f;
        this.base = f2;
        this.factor = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08557.class, "threshold;base;factor", "threshold", "base", "factor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08557.class, "threshold;base;factor", "threshold", "base", "factor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08557.class, "threshold;base;factor", "threshold", "base", "factor"}, this);
    }

    public float y() {
        return this.base;
    }

    public int N(float f) {
        if (f < this.threshold) {
            return 0;
        }
        return class04995.y((float)(this.base + this.factor * f));
    }

    public float N() {
        return this.threshold;
    }
}

