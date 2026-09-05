/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00754
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class03800
 *  minecraft.class07220
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00754;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class03800;
import minecraft.class07220;

public final class class06779
extends Record
implements class07220<class02796> {
    private final class01894 functionId;
    public static final MapCodec<class06779> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("Name").forGetter(class06779::y)).apply(instance, class06779::new));

    public class06779(class01894 class018942) {
        this.functionId = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06779.class, "functionId", "functionId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06779.class, "functionId", "functionId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06779.class, "functionId", "functionId"}, this);
    }

    public class01894 y() {
        return this.functionId;
    }

    public MapCodec<class06779> N() {
        return N;
    }

    public void N(class02796 class027962, class00754<class02796> class007542, long l) {
        class03800 class038002 = class027962.Nr();
        class038002.N(this.functionId).ifPresent(class076842 -> class038002.N(class076842, class038002.L()));
    }
}

