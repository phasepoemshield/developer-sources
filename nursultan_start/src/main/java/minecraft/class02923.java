/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02465
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class03246
 *  minecraft.class03252
 *  minecraft.class03254
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02465;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class03246;
import minecraft.class03252;
import minecraft.class03254;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class05946;

public final class class02923
extends Record
implements class02465<class03254> {
    private final Optional<class03543<class03252>> material;
    private final Optional<class03543<class03246>> pattern;
    public static final Codec<class02923> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.yw).optionalFieldOf("material").forGetter(class02923::N), (App)class03541.N((class05946)class04227.yk).optionalFieldOf("pattern").forGetter(class02923::L)).apply(instance, class02923::new));

    public Optional<class03543<class03246>> L() {
        return this.pattern;
    }

    public class02923(Optional<class03543<class03252>> optional, Optional<class03543<class03246>> optional2) {
        this.material = optional;
        this.pattern = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02923.class, "material;pattern", "material", "pattern"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02923.class, "material;pattern", "material", "pattern"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02923.class, "material;pattern", "material", "pattern"}, this);
    }

    public class02477<class03254> y() {
        return class02484.Nu;
    }

    public boolean N(class03254 class032542) {
        if (this.material.isPresent() && !this.material.get().N(class032542.N())) {
            return false;
        }
        return !this.pattern.isPresent() || this.pattern.get().N(class032542.y());
    }

    public Optional<class03543<class03252>> N() {
        return this.material;
    }
}

