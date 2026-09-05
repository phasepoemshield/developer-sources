/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class07463
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class07463;

public final class class07471
extends Record {
    private final class01894 id;
    private final double amount;
    private final class07463 operation;
    public static final MapCodec<class07471> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("id").forGetter(class07471::N), (App)Codec.DOUBLE.fieldOf("amount").forGetter(class07471::y), (App)class07463.field_45742.fieldOf("operation").forGetter(class07471::L)).apply(instance, class07471::new));
    public static final Codec<class07471> y = N.codec();
    public static final class02362<ByteBuf, class07471> L = class02362.N((class02362)class01894.y, class07471::N, (class02362)class02389.W, class07471::y, (class02362)class07463.field_48326, class07471::L, class07471::new);

    public class07463 L() {
        return this.operation;
    }

    public class07471(class01894 class018942, double d, class07463 class074632) {
        this.id = class018942;
        this.amount = d;
        this.operation = class074632;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07471.class, "id;amount;operation", "id", "amount", "operation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07471.class, "id;amount;operation", "id", "amount", "operation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07471.class, "id;amount;operation", "id", "amount", "operation"}, this);
    }

    public double y() {
        return this.amount;
    }

    public boolean N(class01894 class018942) {
        return class018942.equals((Object)this.id);
    }

    public class01894 N() {
        return this.id;
    }
}

