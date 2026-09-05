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
 *  minecraft.class07376
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class06338;
import minecraft.class07376;

public final class class01031
extends Record {
    private final int horizontal;
    private final int vertical;
    private static final Codec<Integer> u = Codec.intRange((int)1, (int)128);
    private static final Codec<class01031> i = RecordCodecBuilder.create(instance -> instance.group((App)u.fieldOf("horizontal").forGetter(class01031::N), (App)class06338.N((int)1, (int)class07376.L).optionalFieldOf("vertical", (Object)class07376.L).forGetter(class01031::y)).apply(instance, class01031::new));
    public static final Codec<class01031> N = Codec.either(i, u).xmap(either -> (class01031)((Object)((Object)either.map(Function.identity(), class01031::new))), class010312 -> class010312.horizontal == class010312.vertical ? Either.right((Object)class010312.horizontal) : Either.left((Object)class010312));

    public class01031(int n) {
        this(n, n);
    }

    public class01031(int n, int n2) {
        this.horizontal = n;
        this.vertical = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01031.class, "horizontal;vertical", "horizontal", "vertical"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01031.class, "horizontal;vertical", "horizontal", "vertical"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01031.class, "horizontal;vertical", "horizontal", "vertical"}, this);
    }

    public int y() {
        return this.vertical;
    }

    public int N() {
        return this.horizontal;
    }
}

