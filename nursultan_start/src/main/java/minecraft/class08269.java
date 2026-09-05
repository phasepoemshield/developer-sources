/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class08269
extends Record {
    private final boolean elements;
    private final boolean tags;
    private final boolean stable;
    public static final MapCodec<class08269> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.fieldOf("elements").forGetter(class08269::N), (App)Codec.BOOL.fieldOf("tags").forGetter(class08269::y), (App)Codec.BOOL.fieldOf("stable").forGetter(class08269::L)).apply(instance, class08269::new));
    public static final Codec<class08269> y = N.codec();

    public boolean L() {
        return this.stable;
    }

    class08269(boolean bl, boolean bl2, boolean bl3) {
        this.elements = bl;
        this.tags = bl2;
        this.stable = bl3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08269.class, "elements;tags;stable", "elements", "tags", "stable"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08269.class, "elements;tags;stable", "elements", "tags", "stable"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08269.class, "elements;tags;stable", "elements", "tags", "stable"}, this);
    }

    public boolean y() {
        return this.tags;
    }

    public boolean N() {
        return this.elements;
    }
}

