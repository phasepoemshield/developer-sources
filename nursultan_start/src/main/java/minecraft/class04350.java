/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;
import minecraft.class04352;
import minecraft.class04365;

public final class class04350
extends Enum<class04350>
implements class04352<Double> {
    public static final /* enum */ class04350 field_37875 = new class04350();
    private static final /* synthetic */ class04350[] field_37876;

    public static class04350[] values() {
        return (class04350[])field_37876.clone();
    }

    public static class04350 valueOf(String string) {
        return Enum.valueOf(class04350.class, string);
    }

    @Override
    public Codec<Double> y() {
        return Codec.withAlternative((Codec)Codec.doubleRange((double)0.0, (double)1.0), (Codec)Codec.BOOL, bl -> bl != false ? 1.0 : 0.0);
    }

    @Override
    public double N(Double d) {
        return d;
    }

    @Override
    public Double N(double d) {
        return d;
    }

    private static /* synthetic */ class04350[] N() {
        return new class04350[]{field_37875};
    }

    @Override
    public Optional<Double> u(Double d) {
        return d >= 0.0 && d <= 1.0 ? Optional.of(d) : Optional.empty();
    }

    public <R> class04352<R> N(DoubleFunction<? extends R> doubleFunction, ToDoubleFunction<? super R> toDoubleFunction) {
        return new class04365(this, toDoubleFunction, doubleFunction);
    }

    static {
        field_37876 = class04350.N();
    }
}

