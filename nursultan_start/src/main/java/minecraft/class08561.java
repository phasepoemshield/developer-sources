/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00780
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00780;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class08568;
import minecraft.class08579;

public final class class08561
extends Record
implements class08568 {
    private final class03543<class00780> requiredBiomes;
    public static final MapCodec<class08561> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.NA).fieldOf("biomes").forGetter(class08561::y)).apply(instance, class08561::new));

    public class08561(class03543<class00780> class035432) {
        this.requiredBiomes = class035432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08561.class, "requiredBiomes", "requiredBiomes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08561.class, "requiredBiomes", "requiredBiomes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08561.class, "requiredBiomes", "requiredBiomes"}, this);
    }

    public class03543<class00780> y() {
        return this.requiredBiomes;
    }

    @Override
    public boolean test(class08579 class085792) {
        return this.requiredBiomes.N(class085792.u());
    }

    public MapCodec<class08561> N() {
        return N;
    }
}

