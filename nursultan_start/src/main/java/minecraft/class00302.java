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
 *  minecraft.class03767
 *  minecraft.class04247
 *  minecraft.class06584
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
import minecraft.class03767;
import minecraft.class04247;
import minecraft.class06584;

public final class class00302
extends Record
implements class00299 {
    private final class06584 stack;
    public static final MapCodec<class00302> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06584.u.fieldOf("item").forGetter(class00302::y)).apply(instance, class00302::new));
    public static final class02362<class04247, class00302> u = class02362.N((class02362)class06584.z, class00302::y, class00302::new);
    public static final class00319<class00302> i = new class00319<class00302>(L, u);

    public class00302(class06584 class065842) {
        this.stack = class065842;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof class00302)) return false;
        class00302 class003022 = (class00302)object;
        if (!class06584.N((class06584)this.stack, (class06584)class003022.stack)) return false;
        return true;
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00302.class, "stack", "stack"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00302.class, "stack", "stack"}, this);
    }

    public class06584 y() {
        return this.stack;
    }

    @Override
    public <T> Stream<T> N(class00311 class003112, class00308<T> class003082) {
        if (class003082 instanceof class00287) {
            return Stream.of(((class00287)class003082).y(this.stack));
        }
        return Stream.empty();
    }

    public class00319<class00302> N() {
        return i;
    }

    @Override
    public boolean N(class03767 class037672) {
        return this.stack.B().N(class037672);
    }
}

