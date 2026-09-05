/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00753
 *  minecraft.class02362
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00753;
import minecraft.class01182;
import minecraft.class01190;
import minecraft.class02362;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07299;

public final class class01155
extends Record
implements class01190 {
    private final class07209 pos;
    public static final MapCodec<class01155> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07209.field_25064.fieldOf("pos").forGetter(class01155::y)).apply(instance, class01155::new));
    public static final class02362<ByteBuf, class01155> y = class02362.N((class02362)class07209.field_48404, class01155::y, class01155::new);

    public class01155(class07209 class072092) {
        this.pos = class072092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01155.class, "pos", "pos"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01155.class, "pos", "pos"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01155.class, "pos", "pos"}, this);
    }

    public class07209 y() {
        return this.pos;
    }

    public class01182<class01155> N() {
        return class01182.N;
    }

    @Override
    public Optional<class06889> N(class07299 class072992) {
        return Optional.of(class06889.y((class00753)this.pos));
    }
}

