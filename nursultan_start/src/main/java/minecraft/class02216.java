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
import java.util.function.Function;
import minecraft.class06338;

public final class class02216
extends Record {
    private final int bottom;
    private final int top;
    private static final Codec<class02216> i = RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.lenientOptionalFieldOf("bottom", (Object)0).forGetter(class022162 -> class022162.bottom), (App)class06338.T.lenientOptionalFieldOf("top", (Object)0).forGetter(class022162 -> class022162.top)).apply(instance, class02216::new));
    public static final Codec<class02216> N = Codec.either((Codec)class06338.T, i).xmap(either -> (class02216)((Object)((Object)either.map(class02216::new, Function.identity()))), class022162 -> class022162.N() ? Either.left((Object)class022162.bottom) : Either.right((Object)class022162));
    public static final class02216 y = new class02216(0);

    public int L() {
        return this.top;
    }

    public class02216(int n) {
        this(n, n);
    }

    public class02216(int n, int n2) {
        this.bottom = n;
        this.top = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02216.class, "bottom;top", "bottom", "top"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02216.class, "bottom;top", "bottom", "top"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02216.class, "bottom;top", "bottom", "top"}, this);
    }

    public int y() {
        return this.bottom;
    }

    public boolean N() {
        return this.top == this.bottom;
    }
}

