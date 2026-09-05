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
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class04247
 *  minecraft.class06581
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;
import minecraft.class00287;
import minecraft.class00299;
import minecraft.class00308;
import minecraft.class00311;
import minecraft.class00319;
import minecraft.class02362;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04247;
import minecraft.class06581;

public final class class00330
extends Record
implements class00299 {
    private final class03556<class06581> item;
    public static final MapCodec<class00330> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06581.u.fieldOf("item").forGetter(class00330::y)).apply(instance, class00330::new));
    public static final class02362<class04247, class00330> u = class02362.N((class02362)class06581.i, class00330::y, class00330::new);
    public static final class00319<class00330> i = new class00319<class00330>(L, u);

    public class00330(class06581 class065812) {
        this((class03556<class06581>)class065812.i());
    }

    public class00330(class03556<class06581> class035562) {
        this.item = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00330.class, "item", "item"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00330.class, "item", "item"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00330.class, "item", "item"}, this);
    }

    public class03556<class06581> y() {
        return this.item;
    }

    @Override
    public <T> Stream<T> N(class00311 class003112, class00308<T> class003082) {
        if (class003082 instanceof class00287) {
            return Stream.of(((class00287)class003082).N(this.item));
        }
        return Stream.empty();
    }

    public class00319<class00330> N() {
        return i;
    }

    @Override
    public boolean N(class03767 class037672) {
        return ((class06581)this.item.N()).N(class037672);
    }
}

