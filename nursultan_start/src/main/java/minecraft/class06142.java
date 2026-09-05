/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04711
 *  minecraft.class05908
 *  minecraft.class06339
 *  minecraft.class06341
 *  minecraft.class06378
 *  minecraft.class07491
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class04711;
import minecraft.class05908;
import minecraft.class06069;
import minecraft.class06339;
import minecraft.class06341;
import minecraft.class06378;
import minecraft.class07491;

public final class class06142
extends Record
implements class06378 {
    private final class06378 n;
    private final class06378 p;
    public static final MapCodec<class06142> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06339.N.fieldOf("n").forGetter(class06142::L), (App)class06339.N.fieldOf("p").forGetter(class06142::u)).apply(instance, class06142::new));

    public class06378 L() {
        return this.n;
    }

    public class06142(class06378 class063782, class06378 class063783) {
        this.n = class063782;
        this.p = class063783;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06142.class, "n;p", "n", "p"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06142.class, "n;p", "n", "p"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06142.class, "n;p", "n", "p"}, this);
    }

    public class06378 u() {
        return this.p;
    }

    public float y(class05908 class059082) {
        return this.N(class059082);
    }

    public Set<class07491<?>> y() {
        return Sets.union((Set)this.n.y(), (Set)this.p.y());
    }

    public class06341 N() {
        return class06339.u;
    }

    public static class06142 N(int n, float f) {
        return new class06142((class06378)class04711.N((float)n), (class06378)class04711.N((float)f));
    }

    public int N(class05908 class059082) {
        int n = this.n.N(class059082);
        float f = this.p.y(class059082);
        class06069 class060692 = class059082.y();
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (!(class060692.z() < f)) continue;
            ++n2;
        }
        return n2;
    }
}

