/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02470
 *  minecraft.class02500
 *  minecraft.class02666
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08909
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02470;
import minecraft.class02500;
import minecraft.class02666;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08909;
import org.jspecify.annotations.Nullable;

public final class class08544
extends Record
implements class08909 {
    private final class02470<?> predicate;
    public static final MapCodec<class08544> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02500.N((String)"predicate").forGetter(class08544::y)).apply(instance, class08544::new));

    public class08544(class02470<?> class024702) {
        this.predicate = class024702;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08544.class, "predicate", "predicate"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08544.class, "predicate", "predicate"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08544.class, "predicate", "predicate"}, this);
    }

    public class02470<?> y() {
        return this.predicate;
    }

    public MapCodec<class08544> N() {
        return N;
    }

    public boolean method_65638(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        return this.predicate.y().N((class02666)class065842);
    }
}

