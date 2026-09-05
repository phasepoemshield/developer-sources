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
 *  minecraft.class08155
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
import minecraft.class08155;

public final class class08186
extends Record {
    private final class08155 type;
    private final int duration;
    public static final class08186 N = new class08186(class08155.field_63399, 6);
    public static final Codec<class08186> y = RecordCodecBuilder.create(instance -> instance.group((App)class08155.field_63401.optionalFieldOf("type", (Object)class08186.N.type).forGetter(class08186::N), (App)class06338.b.optionalFieldOf("duration", (Object)class08186.N.duration).forGetter(class08186::y)).apply(instance, class08186::new));
    public static final class02362<ByteBuf, class08186> L = class02362.N((class02362)class08155.field_63402, class08186::N, (class02362)class02389.B, class08186::y, class08186::new);

    public class08186(class08155 class081552, int n) {
        this.type = class081552;
        this.duration = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08186.class, "type;duration", "type", "duration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08186.class, "type;duration", "type", "duration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08186.class, "type;duration", "type", "duration"}, this);
    }

    public int y() {
        return this.duration;
    }

    public class08155 N() {
        return this.type;
    }
}

