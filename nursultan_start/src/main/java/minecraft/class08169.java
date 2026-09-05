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
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class06338;

public final class class08169
extends Record {
    private final int maxDurationTicks;
    private final float minSpeed;
    private final float minRelativeSpeed;
    public static final Codec<class08169> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.fieldOf("max_duration_ticks").forGetter(class08169::N), (App)Codec.FLOAT.optionalFieldOf("min_speed", (Object)Float.valueOf(0.0f)).forGetter(class08169::y), (App)Codec.FLOAT.optionalFieldOf("min_relative_speed", (Object)Float.valueOf(0.0f)).forGetter(class08169::L)).apply(instance, class08169::new));
    public static final class02362<ByteBuf, class08169> y = class02362.N((class02362)class02389.B, class08169::N, (class02362)class02389.E, class08169::y, (class02362)class02389.E, class08169::L, class08169::new);

    public float L() {
        return this.minRelativeSpeed;
    }

    public class08169(int n, float f, float f2) {
        this.maxDurationTicks = n;
        this.minSpeed = f;
        this.minRelativeSpeed = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08169.class, "maxDurationTicks;minSpeed;minRelativeSpeed", "maxDurationTicks", "minSpeed", "minRelativeSpeed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08169.class, "maxDurationTicks;minSpeed;minRelativeSpeed", "maxDurationTicks", "minSpeed", "minRelativeSpeed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08169.class, "maxDurationTicks;minSpeed;minRelativeSpeed", "maxDurationTicks", "minSpeed", "minRelativeSpeed"}, this);
    }

    public float y() {
        return this.minSpeed;
    }

    public static Optional<class08169> y(int n, float f) {
        return Optional.of(new class08169(n, 0.0f, f));
    }

    public int N() {
        return this.maxDurationTicks;
    }

    public boolean N(int n, double d, double d2, double d3) {
        return n <= this.maxDurationTicks && d >= (double)this.minSpeed * d3 && d2 >= (double)this.minRelativeSpeed * d3;
    }

    public static Optional<class08169> N(int n, float f) {
        return Optional.of(new class08169(n, f, 0.0f));
    }
}

