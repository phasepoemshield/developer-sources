/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10285
 *  com.google.common.base.Preconditions
 *  minecraft.class01146
 *  minecraft.class03875
 *  minecraft.class03877
 *  minecraft.class04860
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class07209
 *  minecraft.class07836
 *  net.fabricmc.fabric.impl.biome.MultiNoiseSamplerHooks
 */
package minecraft;

import Nursultan.class10285;
import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Objects;
import minecraft.class01146;
import minecraft.class03216;
import minecraft.class03229;
import minecraft.class03231;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class04860;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class07209;
import minecraft.class07836;
import net.fabricmc.fabric.impl.biome.MultiNoiseSamplerHooks;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class03222
implements MultiNoiseSamplerHooks {
    private class03877 temperature;
    private class03877 humidity;
    private class03877 continentalness;
    private class03877 erosion;
    private class03877 depth;
    private class03877 weirdness;
    private List<class03229> spawnTarget;
    private Long B = null;
    private class04860 Z = null;

    public class03877 L() {
        return this.humidity;
    }

    public class03877 M() {
        return this.weirdness;
    }

    public class03222(class03877 class038772, class03877 class038773, class03877 class038774, class03877 class038775, class03877 class038776, class03877 class038777, List<class03229> list) {
        this.temperature = class038772;
        this.humidity = class038773;
        this.continentalness = class038774;
        this.erosion = class038775;
        this.depth = class038776;
        this.weirdness = class038777;
        this.spawnTarget = list;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class03222 && Objects.equals(this.temperature, ((class03222)object).temperature) && Objects.equals(this.humidity, ((class03222)object).humidity) && Objects.equals(this.continentalness, ((class03222)object).continentalness) && Objects.equals(this.erosion, ((class03222)object).erosion) && Objects.equals(this.depth, ((class03222)object).depth) && Objects.equals(this.weirdness, ((class03222)object).weirdness) && Objects.equals(this.spawnTarget, ((class03222)object).spawnTarget);
    }

    public final String toString() {
        return "class03222[temperature=" + Objects.toString(this.temperature) + ", humidity=" + Objects.toString(this.humidity) + ", continentalness=" + Objects.toString(this.continentalness) + ", erosion=" + Objects.toString(this.erosion) + ", depth=" + Objects.toString(this.depth) + ", weirdness=" + Objects.toString(this.weirdness) + ", spawnTarget=" + Objects.toString(this.spawnTarget) + "]";
    }

    public final int hashCode() {
        return ((((((0 * 31 + Objects.hashCode(this.temperature)) * 31 + Objects.hashCode(this.humidity)) * 31 + Objects.hashCode(this.continentalness)) * 31 + Objects.hashCode(this.erosion)) * 31 + Objects.hashCode(this.depth)) * 31 + Objects.hashCode(this.weirdness)) * 31 + Objects.hashCode(this.spawnTarget);
    }

    public List<class03229> B() {
        return this.spawnTarget;
    }

    public class03877 i() {
        return this.erosion;
    }

    public class03877 u() {
        return this.continentalness;
    }

    public class03877 y() {
        return this.temperature;
    }

    public class03231 N(int n, int n2, int n3) {
        int n4 = class01146.L((int)n);
        int n5 = class01146.L((int)n2);
        int n6 = class01146.L((int)n3);
        class10285 class102852 = new class10285(n4, n5, n6);
        return class03216.N((float)this.temperature.N((class03875)class102852), (float)this.humidity.N((class03875)class102852), (float)this.continentalness.N((class03875)class102852), (float)this.erosion.N((class03875)class102852), (float)this.depth.N((class03875)class102852), (float)this.weirdness.N((class03875)class102852));
    }

    public class07209 N() {
        if (this.spawnTarget.isEmpty()) {
            return class07209.field_10980;
        }
        return class03216.N(this.spawnTarget, this);
    }

    public class03877 R() {
        return this.depth;
    }

    public long fabric_getSeed() {
        return this.B;
    }

    public class04860 fabric_getEndBiomesSampler() {
        if (this.Z == null) {
            Preconditions.checkState((this.B != null ? 1 : 0) != 0, (Object)"MultiNoiseSampler doesn't have a seed set, created using different method?");
            this.Z = new class04860((class06069)new class07836((class06069)new class06075(this.B.longValue())));
        }
        return this.Z;
    }

    public void fabric_setSeed(long l) {
        this.B = l;
    }
}

