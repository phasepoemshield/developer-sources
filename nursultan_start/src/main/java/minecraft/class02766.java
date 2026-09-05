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
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class06338;

public final class class02766
extends Record {
    private final int value;
    public static final Codec<class02766> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.b.fieldOf("value").forGetter(class02766::N)).apply(instance, class02766::new));
    public static final class02362<ByteBuf, class02766> y = class02362.N((class02362)class02389.B, class02766::N, class02766::new);

    public class02766(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Enchantment value must be positive, but was " + n);
        }
        this.value = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02766.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02766.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02766.class, "value", "value"}, this);
    }

    public int N() {
        return this.value;
    }
}

