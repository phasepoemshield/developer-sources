/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class06338;

public final class class08421
extends Record {
    private final int index;
    private final Optional<Integer> time;
    public static final Codec<class08421> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.fieldOf("index").forGetter(class08421::N), (App)class06338.b.optionalFieldOf("time").forGetter(class08421::y)).apply(instance, class08421::new));
    public static final Codec<class08421> y = Codec.either((Codec)class06338.T, N).xmap(either -> (class08421)((Object)((Object)either.map(class08421::new, class084212 -> class084212))), class084212 -> class084212.time.isPresent() ? Either.right((Object)class084212) : Either.left((Object)class084212.index));

    public class08421(int n) {
        this(n, Optional.empty());
    }

    public class08421(int n, Optional<Integer> optional) {
        this.index = n;
        this.time = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08421.class, "index;time", "index", "time"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08421.class, "index;time", "index", "time"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08421.class, "index;time", "index", "time"}, this);
    }

    public Optional<Integer> y() {
        return this.time;
    }

    public int N() {
        return this.index;
    }

    public int N(int n) {
        return this.time.orElse(n);
    }
}

