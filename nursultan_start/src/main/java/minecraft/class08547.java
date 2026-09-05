/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class04748
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class04748;
import minecraft.class05946;
import minecraft.class08568;
import minecraft.class08579;

public final class class08547
extends Record
implements class08568 {
    private final class03543<class04748> requiredStructures;
    public static final MapCodec<class08547> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.yj).fieldOf("structures").forGetter(class08547::y)).apply(instance, class08547::new));

    public class08547(class03543<class04748> class035432) {
        this.requiredStructures = class035432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08547.class, "requiredStructures", "requiredStructures"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08547.class, "requiredStructures", "requiredStructures"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08547.class, "requiredStructures", "requiredStructures"}, this);
    }

    public class03543<class04748> y() {
        return this.requiredStructures;
    }

    @Override
    public boolean test(class08579 class085792) {
        return class085792.y().method_8410().method_27056().N(class085792.N(), this.requiredStructures).y();
    }

    public MapCodec<class08547> N() {
        return N;
    }
}

