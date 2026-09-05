/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07009
 *  minecraft.class07019
 *  minecraft.class07037
 *  minecraft.class08884
 */
package minecraft;

import java.util.Optional;
import minecraft.class07009;
import minecraft.class07019;
import minecraft.class07037;
import minecraft.class07720;
import minecraft.class07729;
import minecraft.class07730;
import minecraft.class08884;

public sealed interface class07737
extends class08884
permits class07037, class07730, class07720, class07729, class07009, class07019 {
    public long M();

    default public Optional<Number> P() {
        return Optional.of(this.W());
    }

    default public Optional<Short> T() {
        return Optional.of(this.Z());
    }

    public int B();

    public short Z();

    default public Optional<Integer> b() {
        return Optional.of(this.B());
    }

    default public Optional<Byte> s() {
        return Optional.of(this.z());
    }

    default public Optional<Double> n() {
        return Optional.of(this.U());
    }

    default public Optional<Boolean> t() {
        return Optional.of(this.z() != 0);
    }

    default public Optional<Float> v() {
        return Optional.of(Float.valueOf(this.E()));
    }

    default public Optional<Long> j() {
        return Optional.of(this.M());
    }

    public double U();

    public byte z();

    public float E();

    public Number W();
}

