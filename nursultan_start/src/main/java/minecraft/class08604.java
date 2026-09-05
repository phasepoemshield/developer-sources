/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00299
 *  minecraft.class00302
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02678
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class06338
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00299;
import minecraft.class00302;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02678;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class06338;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;

public final class class08604
extends Record {
    private final class03556<class06581> item;
    private final int count;
    private final class02678 components;
    private static final Codec<class08604> R = RecordCodecBuilder.create(instance -> instance.group((App)class06581.u.fieldOf("id").forGetter(class08604::y), (App)class06338.N((int)1, (int)99).optionalFieldOf("count", (Object)1).forGetter(class08604::L), (App)class02678.y.optionalFieldOf("components", (Object)class02678.N).forGetter(class08604::u)).apply(instance, class08604::new));
    public static final Codec<class08604> N = Codec.withAlternative(R, (Codec)class06581.u, class035562 -> new class08604((class06581)class035562.N())).validate(class08604::N);
    public static final class02362<class04247, class08604> y = class02362.N((class02362)class06581.i, class08604::y, (class02362)class02389.B, class08604::L, (class02362)class02678.L, class08604::u, class08604::new);

    public int L() {
        return this.count;
    }

    public class08604(class06581 class065812) {
        this((class03556<class06581>)class065812.i(), 1, class02678.N);
    }

    public class08604(class03556<class06581> class035562, int n, class02678 class026782) {
        this.item = class035562;
        this.count = n;
        this.components = class026782;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08604.class, "item;count;components", "item", "count", "components"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08604.class, "item;count;components", "item", "count", "components"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08604.class, "item;count;components", "item", "count", "components"}, this);
    }

    public class02678 u() {
        return this.components;
    }

    public boolean y(class06584 class065842) {
        class06584 class065843 = this.N(class065842);
        return class065843.c() == 1 && class06584.L((class06584)class065842, (class06584)class065843);
    }

    public class03556<class06581> y() {
        return this.item;
    }

    private static DataResult<class08604> N(class08604 class086042) {
        return class06584.N((class06584)new class06584(class086042.item, class086042.count, class086042.components)).map(class065842 -> class086042);
    }

    public class00299 N() {
        return new class00302(new class06584(this.item, this.count, this.components));
    }

    public class06584 N(class06584 class065842) {
        class06584 class065843 = class065842.N((class07310)this.item.N(), this.count);
        class065843.y(this.components);
        return class065843;
    }
}

