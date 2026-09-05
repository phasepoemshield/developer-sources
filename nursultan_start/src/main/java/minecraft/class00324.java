/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09243
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class03767
 *  minecraft.class04247
 */
package minecraft;

import Nursultan.class09243;
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
import minecraft.class03767;
import minecraft.class04247;

public final class class00324
extends Record
implements class00299 {
    private final class00299 input;
    private final class00299 remainder;
    public static final MapCodec<class00324> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00299.N.fieldOf("input").forGetter(class00324::y), (App)class00299.N.fieldOf("remainder").forGetter(class00324::L)).apply(instance, class00324::new));
    public static final class02362<class04247, class00324> u = class02362.N(class00299.y, class00324::y, class00299.y, class00324::L, class00324::new);
    public static final class00319<class00324> i = new class00319<class00324>(L, u);

    public class00299 L() {
        return this.remainder;
    }

    public class00324(class00299 class002992, class00299 class002993) {
        this.input = class002992;
        this.remainder = class002993;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00324.class, "input;remainder", "input", "remainder"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00324.class, "input;remainder", "input", "remainder"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00324.class, "input;remainder", "input", "remainder"}, this);
    }

    public class00299 y() {
        return this.input;
    }

    @Override
    public boolean N(class03767 class037672) {
        return this.input.N(class037672) && this.remainder.N(class037672);
    }

    public class00319<class00324> N() {
        return i;
    }

    @Override
    public <T> Stream<T> N(class00311 class003112, class00308<T> class003082) {
        if (class003082 instanceof class09243) {
            class09243 class092432 = (class09243)class003082;
            List list = this.remainder.N(class003112, class003082).toList();
            return this.input.N(class003112, class003082).map(object -> class092432.N(object, list));
        }
        return this.input.N(class003112, class003082);
    }
}

