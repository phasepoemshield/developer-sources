/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00145
 *  minecraft.class00381
 *  minecraft.class00638
 *  minecraft.class02362
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class00145;
import minecraft.class00381;
import minecraft.class00638;
import minecraft.class02362;
import minecraft.class02890;
import minecraft.class02897;
import org.jspecify.annotations.Nullable;

final class class02898<T extends class00638, P extends class00381<? super T>, B extends ByteBuf, C>
extends Record {
    final class02897<P> type;
    private final class02362<? super B, P> serializer;
    private final @Nullable class00145<B, P, C> modifier;

    public @Nullable class00145<B, P, C> L() {
        return this.modifier;
    }

    class02898(class02897<P> class028972, class02362<? super B, P> class023622, @Nullable class00145<B, P, C> class001452) {
        this.type = class028972;
        this.serializer = class023622;
        this.modifier = class001452;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02898.class, "type;serializer;modifier", "type", "serializer", "modifier"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02898.class, "type;serializer;modifier", "type", "serializer", "modifier"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02898.class, "type;serializer;modifier", "type", "serializer", "modifier"}, this);
    }

    public class02362<? super B, P> y() {
        return this.serializer;
    }

    public class02897<P> N() {
        return this.type;
    }

    public void N(class02890<ByteBuf, T> class028902, Function<ByteBuf, B> function, C c) {
        class02362 class023622 = this.modifier != null ? this.modifier.apply(this.serializer, c) : this.serializer;
        class02362 class023623 = class023622.y(function);
        class028902.N(this.type, class023623);
    }
}

