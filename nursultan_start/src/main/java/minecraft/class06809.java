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
 *  minecraft.class07684
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
import minecraft.class07684;

public final class class06809
extends Record
implements class07220<class02796> {
    private final class01894 tagId;
    public static final MapCodec<class06809> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("Name").forGetter(class06809::y)).apply(instance, class06809::new));

    public class06809(class01894 class018942) {
        this.tagId = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06809.class, "tagId", "tagId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06809.class, "tagId", "tagId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06809.class, "tagId", "tagId"}, this);
    }

    public class01894 y() {
        return this.tagId;
    }

    public MapCodec<class06809> N() {
        return N;
    }

    public void N(class02796 class027962, class00754<class02796> class007542, long l) {
        class03800 class038002 = class027962.Nr();
        for (class07684 var8 : class038002.y(this.tagId)) {
            class038002.N(var8, class038002.L());
        }
    }
}

