/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class03246
 *  minecraft.class03259
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class00282;
import minecraft.class00287;
import minecraft.class00299;
import minecraft.class00308;
import minecraft.class00311;
import minecraft.class00319;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class03246;
import minecraft.class03259;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class07536;

public final class class00286
extends Record
implements class00299 {
    private final class00299 base;
    private final class00299 material;
    private final class03556<class03246> pattern;
    public static final MapCodec<class00286> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00299.N.fieldOf("base").forGetter(class00286::y), (App)class00299.N.fieldOf("material").forGetter(class00286::L), (App)class03246.L.fieldOf("pattern").forGetter(class00286::u)).apply(instance, class00286::new));
    public static final class02362<class04247, class00286> u = class02362.N(class00299.y, class00286::y, class00299.y, class00286::L, (class02362)class03246.u, class00286::u, class00286::new);
    public static final class00319<class00286> i = new class00319<class00286>(L, u);

    public class00299 L() {
        return this.material;
    }

    public class00286(class00299 class002992, class00299 class002993, class03556<class03246> class035562) {
        this.base = class002992;
        this.material = class002993;
        this.pattern = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00286.class, "base;material;pattern", "base", "material", "pattern"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00286.class, "base;material;pattern", "base", "material", "pattern"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00286.class, "base;material;pattern", "base", "material", "pattern"}, this);
    }

    public class03556<class03246> u() {
        return this.pattern;
    }

    public class00299 y() {
        return this.base;
    }

    public class00319<class00286> N() {
        return i;
    }

    @Override
    public <T> Stream<T> N(class00311 class003112, class00308<T> class003082) {
        if (class003082 instanceof class00287) {
            class00287 class002872 = (class00287)class003082;
            class01929 class019292 = class003112.L(class00282.y);
            if (class019292 != null) {
                class06069 class060692 = class06069.y((long)System.identityHashCode(this));
                List<class06584> list = this.base.N(class003112);
                if (list.isEmpty()) {
                    return Stream.empty();
                }
                List<class06584> list2 = this.material.N(class003112);
                if (list2.isEmpty()) {
                    return Stream.empty();
                }
                return Stream.generate(() -> {
                    class06584 class065842 = (class06584)class07536.N_77((List)list, (class06069)class060692);
                    class06584 class065843 = (class06584)class07536.N_77((List)list2, (class06069)class060692);
                    return class03259.N((class01929)class019292, (class06584)class065842, (class06584)class065843, this.pattern);
                }).limit(256L).filter(class065842 -> !class065842.R()).limit(16L).map(class002872::y);
            }
        }
        return Stream.empty();
    }
}

