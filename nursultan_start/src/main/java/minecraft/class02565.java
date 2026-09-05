/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00381
 *  minecraft.class00502
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02406
 *  minecraft.class02724
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00502;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02406;
import minecraft.class02724;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;
import org.jspecify.annotations.Nullable;

public class class02565
implements class00381<class07280> {
    public static final class02362<class04247, class02565> N = class00381.N(class02565::N, class02565::new);
    private static final int y = 0;
    private static final int L = 1;
    private static final int u = 2;
    private static final int i = 3;
    private static final int R = 4;
    private static final int M = 40;
    private static final int B = 40;
    private final int Z;
    private final String z;
    private final Collection<String> U;
    private final Optional<class02406> E;

    public String L() {
        return this.z;
    }

    public Optional<class02406> M() {
        return this.E;
    }

    private class02565(class04247 class042472) {
        this.z = class042472.s();
        this.Z = class042472.readByte();
        this.E = class02565.y(this.Z) ? Optional.of(new class02406(class042472)) : Optional.empty();
        this.U = class02565.N(this.Z) ? class042472.N_16(class00667::s) : ImmutableList.of();
    }

    private class02565(String string, int n, Optional<class02406> optional, Collection<String> collection) {
        this.z = string;
        this.Z = n;
        this.E = optional;
        this.U = ImmutableList.copyOf(collection);
    }

    public Collection<String> u() {
        return this.U;
    }

    public @Nullable class02724 y() {
        return switch (this.Z) {
            case 0 -> class02724.field_29155;
            case 1 -> class02724.field_29156;
            default -> null;
        };
    }

    private static boolean y(int n) {
        return n == 0 || n == 2;
    }

    public static class02565 N(class00502 class005022) {
        return new class02565(class005022.L(), 1, Optional.empty(), (Collection<String>)ImmutableList.of());
    }

    private void N(class04247 class042472) {
        class042472.N(this.z);
        class042472.writeByte(this.Z);
        if (class02565.y(this.Z)) {
            this.E.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.Z)).N(class042472);
        }
        if (class02565.N(this.Z)) {
            class042472.N_12(this.U, class00667::N);
        }
    }

    public static class02565 N(class00502 class005022, boolean bl) {
        return new class02565(class005022.L(), bl ? 0 : 2, Optional.of(new class02406(class005022)), bl ? class005022.B() : ImmutableList.of());
    }

    public @Nullable class02724 N() {
        return switch (this.Z) {
            case 0, 3 -> class02724.field_29155;
            case 4 -> class02724.field_29156;
            default -> null;
        };
    }

    private static boolean N(int n) {
        return n == 0 || n == 3 || n == 4;
    }

    public static class02565 N(class00502 class005022, String string, class02724 class027242) {
        return new class02565(class005022.L(), class027242 == class02724.field_29155 ? 3 : 4, Optional.empty(), (Collection<String>)ImmutableList.of((Object)string));
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class02565> method_65080() {
        return class04248.Nf;
    }
}

