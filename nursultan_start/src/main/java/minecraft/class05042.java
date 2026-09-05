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
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05946
 *  minecraft.class06289
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class07209;
import minecraft.class07299;

public final class class05042
extends Record {
    private final class06289 globalPos;
    private final float yaw;
    private final float pitch;
    public static final class05042 N = new class05042(class06289.N((class05946)class07299.field_25179, (class07209)class07209.field_10980), 0.0f, 0.0f);
    public static final MapCodec<class05042> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06289.N.forGetter(class05042::L), (App)Codec.floatRange((float)-180.0f, (float)180.0f).fieldOf("yaw").forGetter(class05042::u), (App)Codec.floatRange((float)-90.0f, (float)90.0f).fieldOf("pitch").forGetter(class05042::i)).apply(instance, class05042::new));
    public static final Codec<class05042> L = y.codec();
    public static final class02362<ByteBuf, class05042> u = class02362.N((class02362)class06289.L, class05042::L, (class02362)class02389.E, class05042::u, (class02362)class02389.E, class05042::i, class05042::new);

    public class06289 L() {
        return this.globalPos;
    }

    public class05042(class06289 class062892, float f, float f2) {
        this.globalPos = class062892;
        this.yaw = f;
        this.pitch = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05042.class, "globalPos;yaw;pitch", "globalPos", "yaw", "pitch"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05042.class, "globalPos;yaw;pitch", "globalPos", "yaw", "pitch"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05042.class, "globalPos;yaw;pitch", "globalPos", "yaw", "pitch"}, this);
    }

    public float i() {
        return this.pitch;
    }

    public float u() {
        return this.yaw;
    }

    public class07209 y() {
        return this.globalPos.y();
    }

    public static class05042 N(class05946<class07299> class059462, class07209 class072092, float f, float f2) {
        return new class05042(class06289.N(class059462, (class07209)class072092.method_10062()), class04995.R(f), class04995.N(f2, -90.0f, 90.0f));
    }

    public class05946<class07299> N() {
        return this.globalPos.N();
    }
}

