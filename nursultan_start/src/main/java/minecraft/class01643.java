/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.OptionalInt;
import minecraft.class06338;

public final class class01643
extends Record {
    private final int left;
    private final int top;
    private final int right;
    private final int bottom;
    private static final Codec<class01643> R = class06338.b.flatComapMap(n -> new class01643((int)n, (int)n, (int)n, (int)n), class016432 -> {
        OptionalInt optionalInt = class016432.i();
        if (optionalInt.isPresent()) {
            return DataResult.success((Object)optionalInt.getAsInt());
        }
        return DataResult.error(() -> "Border has different side sizes");
    });
    private static final Codec<class01643> M = RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.fieldOf("left").forGetter(class01643::N), (App)class06338.T.fieldOf("top").forGetter(class01643::y), (App)class06338.T.fieldOf("right").forGetter(class01643::L), (App)class06338.T.fieldOf("bottom").forGetter(class01643::u)).apply(instance, class01643::new));
    static final Codec<class01643> N = Codec.either(R, M).xmap(Either::unwrap, class016432 -> {
        if (class016432.i().isPresent()) {
            return Either.left((Object)class016432);
        }
        return Either.right((Object)class016432);
    });

    public int L() {
        return this.right;
    }

    public class01643(int n, int n2, int n3, int n4) {
        this.left = n;
        this.top = n2;
        this.right = n3;
        this.bottom = n4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01643.class, "left;top;right;bottom", "left", "top", "right", "bottom"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01643.class, "left;top;right;bottom", "left", "top", "right", "bottom"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01643.class, "left;top;right;bottom", "left", "top", "right", "bottom"}, this);
    }

    private OptionalInt i() {
        if (this.N() == this.y() && this.y() == this.L() && this.L() == this.u()) {
            return OptionalInt.of(this.N());
        }
        return OptionalInt.empty();
    }

    public int u() {
        return this.bottom;
    }

    public int y() {
        return this.top;
    }

    public int N() {
        return this.left;
    }
}

