/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01424
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class04836
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07023
 *  minecraft.class08884
 */
package minecraft;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Optional;
import minecraft.class01424;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class04836;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07023;
import minecraft.class07741;
import minecraft.class08884;

public sealed interface class07709
permits class07001, class07023, class08884, class06997 {
    public static final int u = 8;
    public static final int i = 12;
    public static final int R = 4;
    public static final int M = 28;
    public static final byte B = 0;
    public static final byte Z = 1;
    public static final byte z = 2;
    public static final byte U = 3;
    public static final byte E = 4;
    public static final byte W = 5;
    public static final byte m = 6;
    public static final byte P = 7;
    public static final byte s = 8;
    public static final byte T = 9;
    public static final byte b = 10;
    public static final byte j = 11;
    public static final byte v = 12;
    public static final int n = 512;

    public byte L();

    default public Optional<Number> P() {
        return Optional.empty();
    }

    default public Optional<Short> T() {
        return this.P().map(Number::shortValue);
    }

    public String toString();

    default public Optional<Integer> b() {
        return this.P().map(Number::intValue);
    }

    default public Optional<Byte> s() {
        return this.P().map(Number::byteValue);
    }

    default public Optional<Double> n() {
        return this.P().map(Number::doubleValue);
    }

    default public Optional<Boolean> t() {
        return this.s().map(by -> by != 0);
    }

    default public Optional<Float> v() {
        return this.P().map(Number::floatValue);
    }

    default public Optional<Long> j() {
        return this.P().map(Number::longValue);
    }

    public class01424<?> u();

    public int y();

    default public void y(class03175 class031752) {
        if (class031752.y(this.u()) == class03154.field_36253) {
            this.N(class031752);
        }
    }

    public class07709 N();

    public void N(class04836 var1);

    public class03154 N(class03175 var1);

    public void N(DataOutput var1) throws IOException;

    default public Optional<byte[]> R() {
        return Optional.empty();
    }

    default public Optional<int[]> ai_() {
        return Optional.empty();
    }

    default public Optional<class07001> ak_() {
        return Optional.empty();
    }

    default public Optional<class07741> al_() {
        return Optional.empty();
    }

    default public Optional<long[]> aj_() {
        return Optional.empty();
    }

    default public Optional<String> ah_() {
        return Optional.empty();
    }
}

