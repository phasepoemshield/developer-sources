/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01640
 *  minecraft.class01894
 *  minecraft.class01991
 *  minecraft.class02002
 *  minecraft.class03266
 *  minecraft.class04214
 *  minecraft.class04224
 *  minecraft.class08280
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import minecraft.class01640;
import minecraft.class01894;
import minecraft.class01991;
import minecraft.class02002;
import minecraft.class03266;
import minecraft.class04214;
import minecraft.class04224;
import minecraft.class08280;
import org.jspecify.annotations.Nullable;

final class class03261
extends Record
implements class04214 {
    private final class04224 baseImage;
    private final Supplier<IntUnaryOperator> palette;
    private final class01894 permutationLocation;

    public Supplier<IntUnaryOperator> L() {
        return this.palette;
    }

    class03261(class04224 class042242, Supplier<IntUnaryOperator> supplier, class01894 class018942) {
        this.baseImage = class042242;
        this.palette = supplier;
        this.permutationLocation = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03261.class, "baseImage;palette;permutationLocation", "baseImage", "palette", "permutationLocation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03261.class, "baseImage;palette;permutationLocation", "baseImage", "palette", "permutationLocation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03261.class, "baseImage;palette;permutationLocation", "baseImage", "palette", "permutationLocation"}, this);
    }

    public class01894 u() {
        return this.permutationLocation;
    }

    public class04224 y() {
        return this.baseImage;
    }

    public void N() {
        this.baseImage.y();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public @Nullable class01991 method_52853(class01640 class016402) {
        try {
            class08280 class082802 = this.baseImage.N().N(this.palette.get());
            class01991 class019912 = new class01991(this.permutationLocation, new class02002(class082802.N(), class082802.y()), class082802);
            return class019912;
        }
        catch (IOException | IllegalArgumentException exception) {
            class03266.y.error("unable to apply palette to {}", (Object)this.permutationLocation, (Object)exception);
            class01991 class019913 = null;
            return class019913;
        }
        finally {
            this.baseImage.y();
        }
    }
}

