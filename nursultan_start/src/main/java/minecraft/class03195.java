/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import minecraft.class03216;
import minecraft.class06338;
import org.jspecify.annotations.Nullable;

public final class class03195
extends Record {
    private final long min;
    private final long max;
    public static final Codec<class03195> N = class06338.N((Codec)Codec.floatRange((float)-2.0f, (float)2.0f), (String)"min", (String)"max", (f, f2) -> {
        if (f.compareTo((Float)f2) > 0) {
            return DataResult.error(() -> "Cannon construct interval, min > max (" + f + " > " + f2 + ")");
        }
        return DataResult.success((Object)((Object)new class03195(class03216.N(f.floatValue()), class03216.N(f2.floatValue()))));
    }, class031952 -> Float.valueOf(class03216.N(class031952.N())), class031952 -> Float.valueOf(class03216.N(class031952.y())));

    private static /* synthetic */ Float L(class03195 class031952) {
        return Float.valueOf(class03216.N(class031952.y()));
    }

    public class03195(long l, long l2) {
        this.min = l;
        this.max = l2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03195.class, "min;max", "min", "max"}, this, object);
    }

    public String toString() {
        return this.min == this.max ? String.format(Locale.ROOT, "%d", this.min) : String.format(Locale.ROOT, "[%d-%d]", this.min, this.max);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03195.class, "min;max", "min", "max"}, this);
    }

    private static /* synthetic */ Float u(class03195 class031952) {
        return Float.valueOf(class03216.N(class031952.N()));
    }

    public class03195 y(@Nullable class03195 class031952) {
        return class031952 == null ? this : new class03195(Math.min(this.min, class031952.N()), Math.max(this.max, class031952.y()));
    }

    public long y() {
        return this.max;
    }

    public static class03195 N(float f) {
        return class03195.N(f, f);
    }

    public static class03195 N(class03195 class031952, class03195 class031953) {
        if (class031952.N() > class031953.y()) {
            throw new IllegalArgumentException("min > max: " + String.valueOf((Object)class031952) + " " + String.valueOf((Object)class031953));
        }
        return new class03195(class031952.N(), class031953.y());
    }

    public long N(long l) {
        long l2 = l - this.max;
        long l3 = this.min - l;
        if (l2 > 0L) {
            return l2;
        }
        return Math.max(l3, 0L);
    }

    public long N(class03195 class031952) {
        long l = class031952.N() - this.max;
        long l2 = this.min - class031952.y();
        if (l > 0L) {
            return l;
        }
        return Math.max(l2, 0L);
    }

    public static class03195 N(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("min > max: " + f + " " + f2);
        }
        return new class03195(class03216.N(f), class03216.N(f2));
    }

    public long N() {
        return this.min;
    }
}

