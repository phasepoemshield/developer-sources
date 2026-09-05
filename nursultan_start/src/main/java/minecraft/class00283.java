/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03767
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class00299;
import minecraft.class00308;
import minecraft.class00311;
import minecraft.class00319;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03767;
import minecraft.class04247;

public final class class00283
extends Record
implements class00299 {
    private final List<class00299> contents;
    public static final MapCodec<class00283> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00299.N.listOf().fieldOf("contents").forGetter(class00283::y)).apply(instance, class00283::new));
    public static final class02362<class04247, class00283> u = class02362.N((class02362)class00299.y.N_33(class02389.N()), class00283::y, class00283::new);
    public static final class00319<class00283> i = new class00319<class00283>(L, u);

    public class00283(List<class00299> list) {
        this.contents = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00283.class, "contents", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00283.class, "contents", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00283.class, "contents", "contents"}, this);
    }

    public List<class00299> y() {
        return this.contents;
    }

    @Override
    public <T> Stream<T> N(class00311 class003112, class00308<T> class003082) {
        return this.contents.stream().flatMap(class002992 -> class002992.N(class003112, class003082));
    }

    @Override
    public boolean N(class03767 class037672) {
        return this.contents.stream().allMatch(class002992 -> class002992.N(class037672));
    }

    public class00319<class00283> N() {
        return i;
    }
}

