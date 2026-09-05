/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02525
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02525;
import minecraft.class02546;
import minecraft.class02560;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07438;

public final class class02559
extends Record
implements class02560 {
    private final class03543<class07084> toApply;
    private final class02546 minDuration;
    private final class02546 maxDuration;
    private final class02546 minAmplifier;
    private final class02546 maxAmplifier;
    public static final MapCodec<class02559> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.Ni).fieldOf("to_apply").forGetter(class02559::y), (App)class02546.y.fieldOf("min_duration").forGetter(class02559::L), (App)class02546.y.fieldOf("max_duration").forGetter(class02559::u), (App)class02546.y.fieldOf("min_amplifier").forGetter(class02559::i), (App)class02546.y.fieldOf("max_amplifier").forGetter(class02559::R)).apply(instance, class02559::new));

    public class02546 L() {
        return this.minDuration;
    }

    public class02559(class03543<class07084> class035432, class02546 class025462, class02546 class025463, class02546 class025464, class02546 class025465) {
        this.toApply = class035432;
        this.minDuration = class025462;
        this.maxDuration = class025463;
        this.minAmplifier = class025464;
        this.maxAmplifier = class025465;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02559.class, "toApply;minDuration;maxDuration;minAmplifier;maxAmplifier", "toApply", "minDuration", "maxDuration", "minAmplifier", "maxAmplifier"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02559.class, "toApply;minDuration;maxDuration;minAmplifier;maxAmplifier", "toApply", "minDuration", "maxDuration", "minAmplifier", "maxAmplifier"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02559.class, "toApply;minDuration;maxDuration;minAmplifier;maxAmplifier", "toApply", "minDuration", "maxDuration", "minAmplifier", "maxAmplifier"}, this);
    }

    public class02546 i() {
        return this.minAmplifier;
    }

    public class02546 u() {
        return this.maxDuration;
    }

    public class03543<class07084> y() {
        return this.toApply;
    }

    @Override
    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        class07438 class074382;
        class06069 class060692;
        Optional optional;
        if (class070492 instanceof class07438 && (optional = this.toApply.N(class060692 = (class074382 = (class07438)class070492).method_59922())).isPresent()) {
            int n2 = Math.round(class04995.y((class06069)class060692, (float)this.minDuration.N(n), (float)this.maxDuration.N(n)) * 20.0f);
            int n3 = Math.max(0, Math.round(class04995.y((class06069)class060692, (float)this.minAmplifier.N(n), (float)this.maxAmplifier.N(n))));
            class074382.method_6092(new class07055((class03556)optional.get(), n2, n3));
        }
    }

    public MapCodec<class02559> N() {
        return N;
    }

    public class02546 R() {
        return this.maxAmplifier;
    }
}

