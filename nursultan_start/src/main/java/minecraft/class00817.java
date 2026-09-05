/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01392
 *  minecraft.class01393
 *  minecraft.class01415
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class04748
 *  minecraft.class04782
 *  minecraft.class05847
 *  minecraft.class05946
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00780;
import minecraft.class00848;
import minecraft.class01392;
import minecraft.class01393;
import minecraft.class01415;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class04748;
import minecraft.class04782;
import minecraft.class05847;
import minecraft.class05946;
import minecraft.class07209;
import minecraft.class07299;

public final class class00817
extends Record {
    private final Optional<class00848> position;
    private final Optional<class03543<class00780>> biomes;
    private final Optional<class03543<class04748>> structures;
    private final Optional<class05946<class07299>> dimension;
    private final Optional<Boolean> smokey;
    private final Optional<class01393> light;
    private final Optional<class01392> block;
    private final Optional<class01415> fluid;
    private final Optional<Boolean> canSeeSky;
    public static final Codec<class00817> N = RecordCodecBuilder.create(instance -> instance.group((App)class00848.N.optionalFieldOf("position").forGetter(class00817::N), (App)class03541.N((class05946)class04227.NA).optionalFieldOf("biomes").forGetter(class00817::y), (App)class03541.N((class05946)class04227.yj).optionalFieldOf("structures").forGetter(class00817::L), (App)class05946.N((class05946)class04227.yg).optionalFieldOf("dimension").forGetter(class00817::u), (App)Codec.BOOL.optionalFieldOf("smokey").forGetter(class00817::i), (App)class01393.N.optionalFieldOf("light").forGetter(class00817::R), (App)class01392.N.optionalFieldOf("block").forGetter(class00817::M), (App)class01415.N.optionalFieldOf("fluid").forGetter(class00817::B), (App)Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(class00817::Z)).apply(instance, class00817::new));

    public Optional<class03543<class04748>> L() {
        return this.structures;
    }

    public Optional<class01392> M() {
        return this.block;
    }

    public class00817(Optional<class00848> optional, Optional<class03543<class00780>> optional2, Optional<class03543<class04748>> optional3, Optional<class05946<class07299>> optional4, Optional<Boolean> optional5, Optional<class01393> optional6, Optional<class01392> optional7, Optional<class01415> optional8, Optional<Boolean> optional9) {
        this.position = optional;
        this.biomes = optional2;
        this.structures = optional3;
        this.dimension = optional4;
        this.smokey = optional5;
        this.light = optional6;
        this.block = optional7;
        this.fluid = optional8;
        this.canSeeSky = optional9;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00817.class, "position;biomes;structures;dimension;smokey;light;block;fluid;canSeeSky", "position", "biomes", "structures", "dimension", "smokey", "light", "block", "fluid", "canSeeSky"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00817.class, "position;biomes;structures;dimension;smokey;light;block;fluid;canSeeSky", "position", "biomes", "structures", "dimension", "smokey", "light", "block", "fluid", "canSeeSky"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00817.class, "position;biomes;structures;dimension;smokey;light;block;fluid;canSeeSky", "position", "biomes", "structures", "dimension", "smokey", "light", "block", "fluid", "canSeeSky"}, this);
    }

    public Optional<class01415> B() {
        return this.fluid;
    }

    public Optional<Boolean> Z() {
        return this.canSeeSky;
    }

    public Optional<Boolean> i() {
        return this.smokey;
    }

    public Optional<class05946<class07299>> u() {
        return this.dimension;
    }

    public Optional<class03543<class00780>> y() {
        return this.biomes;
    }

    public Optional<class00848> N() {
        return this.position;
    }

    public boolean N(class04782 class047822, double d, double d2, double d3) {
        if (this.position.isPresent() && !this.position.get().N(d, d2, d3)) {
            return false;
        }
        if (this.dimension.isPresent() && this.dimension.get() != class047822.method_27983()) {
            return false;
        }
        class07209 class072092 = class07209.method_49637((double)d, (double)d2, (double)d3);
        boolean bl = class047822.method_8477(class072092);
        if (!(!this.biomes.isPresent() || bl && this.biomes.get().N(class047822.i(class072092)))) {
            return false;
        }
        if (!(!this.structures.isPresent() || bl && class047822.method_27056().N(class072092, this.structures.get()).y())) {
            return false;
        }
        if (this.smokey.isPresent() && (!bl || this.smokey.get() != class05847.N((class07299)class047822, (class07209)class072092))) {
            return false;
        }
        if (this.light.isPresent() && !this.light.get().N(class047822, class072092)) {
            return false;
        }
        if (this.block.isPresent() && !this.block.get().N(class047822, class072092)) {
            return false;
        }
        if (this.fluid.isPresent() && !this.fluid.get().N(class047822, class072092)) {
            return false;
        }
        return !this.canSeeSky.isPresent() || this.canSeeSky.get().booleanValue() == class047822.N_17(class072092);
    }

    public Optional<class01393> R() {
        return this.light;
    }
}

