/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class class01491<T> {
    private final T N;
    private long y;

    public T L() {
        return this.N;
    }

    public class01491(T t, long l) {
        this.N = t;
        this.y = l;
    }

    public String toString() {
        return String.valueOf(this.N) + (String)(this.i() ? " (ttl: " + this.y + ")" : "");
    }

    public boolean i() {
        return this.y != Long.MAX_VALUE;
    }

    public boolean u() {
        return this.y <= 0L;
    }

    public long y() {
        return this.y;
    }

    public static <T> class01491<T> N(T t, long l) {
        return new class01491<T>(t, l);
    }

    public static <T> Codec<class01491<T>> N(Codec<T> codec) {
        return RecordCodecBuilder.create(instance -> instance.group((App)codec.fieldOf("value").forGetter(class014912 -> class014912.N), (App)Codec.LONG.lenientOptionalFieldOf("ttl").forGetter(class014912 -> class014912.i() ? Optional.of(class014912.y) : Optional.empty())).apply((Applicative)instance, (object, optional) -> new class01491<Object>(object, optional.orElse(Long.MAX_VALUE))));
    }

    public void N() {
        if (this.i()) {
            --this.y;
        }
    }

    public static <T> class01491<T> N(T t) {
        return new class01491<T>(t, Long.MAX_VALUE);
    }
}

