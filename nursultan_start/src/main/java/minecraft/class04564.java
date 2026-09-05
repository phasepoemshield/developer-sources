/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04995
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import minecraft.class04562;
import minecraft.class04567;
import minecraft.class04573;
import minecraft.class04995;

public final class class04564<C, I extends class04573<C>>
extends Record
implements class04562<C, I> {
    private final I coordinate;
    final float[] locations;
    private final List<class04562<C, I>> values;
    private final float[] derivatives;
    private final float minValue;
    private final float maxValue;

    @Override
    public float L() {
        return this.maxValue;
    }

    public float[] M() {
        return this.derivatives;
    }

    public class04564(I i, float[] fArray, List<class04562<C, I>> list, float[] fArray2, float f, float f2) {
        class04564.N(fArray, list, fArray2);
        this.coordinate = i;
        this.locations = fArray;
        this.values = list;
        this.derivatives = fArray2;
        this.minValue = f;
        this.maxValue = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04564.class, "coordinate;locations;values;derivatives;minValue;maxValue", "coordinate", "locations", "values", "derivatives", "minValue", "maxValue"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04564.class, "coordinate;locations;values;derivatives;minValue;maxValue", "coordinate", "locations", "values", "derivatives", "minValue", "maxValue"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04564.class, "coordinate;locations;values;derivatives;minValue;maxValue", "coordinate", "locations", "values", "derivatives", "minValue", "maxValue"}, this);
    }

    public float[] i() {
        return this.locations;
    }

    public I u() {
        return this.coordinate;
    }

    @Override
    public float y() {
        return this.minValue;
    }

    static <C, I extends class04573<C>> class04564<C, I> N(I i, float[] fArray, List<class04562<C, I>> list, float[] fArray2) {
        float f;
        float f2;
        class04564.N(fArray, list, fArray2);
        int n = fArray.length - 1;
        float f3 = Float.POSITIVE_INFINITY;
        float f4 = Float.NEGATIVE_INFINITY;
        float f5 = i.y();
        float f6 = i.L();
        if (f5 < fArray[0]) {
            f2 = class04564.N(f5, fArray, list.get(0).y(), fArray2, 0);
            f = class04564.N(f5, fArray, list.get(0).L(), fArray2, 0);
            f3 = Math.min(f3, Math.min(f2, f));
            f4 = Math.max(f4, Math.max(f2, f));
        }
        if (f6 > fArray[n]) {
            f2 = class04564.N(f6, fArray, list.get(n).y(), fArray2, n);
            f = class04564.N(f6, fArray, list.get(n).L(), fArray2, n);
            f3 = Math.min(f3, Math.min(f2, f));
            f4 = Math.max(f4, Math.max(f2, f));
        }
        for (class04562<C, I> class045622 : list) {
            f3 = Math.min(f3, class045622.y());
            f4 = Math.max(f4, class045622.L());
        }
        for (int j = 0; j < n; ++j) {
            f = fArray[j];
            float f7 = fArray[j + 1] - f;
            class04562<C, I> class045623 = list.get(j);
            class04562<C, I> class045624 = list.get(j + 1);
            float f8 = class045623.y();
            float f9 = class045623.L();
            float f10 = class045624.y();
            float f11 = class045624.L();
            float f12 = fArray2[j];
            float f13 = fArray2[j + 1];
            if (f12 == 0.0f && f13 == 0.0f) continue;
            float f14 = f12 * f7;
            float f15 = f13 * f7;
            float f16 = Math.min(f8, f10);
            float f17 = Math.max(f9, f11);
            float f18 = f14 - f11 + f8;
            float f19 = f14 - f10 + f9;
            float f20 = -f15 + f10 - f9;
            float f21 = -f15 + f11 - f8;
            float f22 = Math.min(f18, f20);
            float f23 = Math.max(f19, f21);
            f3 = Math.min(f3, f16 + 0.25f * f22);
            f4 = Math.max(f4, f17 + 0.25f * f23);
        }
        return new class04564<C, I>(i, fArray, list, fArray2, f3, f4);
    }

    private static float N(float f, float[] fArray, float f2, float[] fArray2, int n) {
        float f3 = fArray2[n];
        if (f3 == 0.0f) {
            return f2;
        }
        return f2 + f3 * (f - fArray[n]);
    }

    @Override
    public String N() {
        return "Spline{coordinate=" + String.valueOf(this.coordinate) + ", locations=" + this.N(this.locations) + ", derivatives=" + this.N(this.derivatives) + ", values=" + this.values.stream().map(class04562::N).collect(Collectors.joining(", ", "[", "]")) + "}";
    }

    private String N(float[] fArray) {
        return "[" + IntStream.range(0, fArray.length).mapToDouble(n -> fArray[n]).mapToObj(d -> String.format(Locale.ROOT, "%.3f", d)).collect(Collectors.joining(", ")) + "]";
    }

    private static int N(float[] fArray, float f) {
        return class04995.N((int)0, (int)fArray.length, n -> f < fArray[n]) - 1;
    }

    @Override
    public class04562<C, I> N_48(class04567<I> class045672) {
        return class04564.N((class04573)class045672.visit(this.coordinate), this.locations, this.R().stream().map(class045622 -> class045622.N_48(class045672)).toList(), this.derivatives);
    }

    @Override
    public float N(C c) {
        float f = this.coordinate.N(c);
        int n = class04564.N(this.locations, f);
        int n2 = this.locations.length - 1;
        if (n < 0) {
            return class04564.N(f, this.locations, this.values.get(0).N(c), this.derivatives, 0);
        }
        if (n == n2) {
            return class04564.N(f, this.locations, this.values.get(n2).N(c), this.derivatives, n2);
        }
        float f2 = this.locations[n];
        float f3 = this.locations[n + 1];
        float f4 = (f - f2) / (f3 - f2);
        class04573 class045732 = this.values.get(n);
        class04573 class045733 = this.values.get(n + 1);
        float f5 = this.derivatives[n];
        float f6 = this.derivatives[n + 1];
        float f7 = class045732.N(c);
        float f8 = class045733.N(c);
        float f9 = f5 * (f3 - f2) - (f8 - f7);
        float f10 = -f6 * (f3 - f2) + (f8 - f7);
        return class04995.B((float)f4, (float)f7, (float)f8) + f4 * (1.0f - f4) * class04995.B((float)f4, (float)f9, (float)f10);
    }

    private static <C, I extends class04573<C>> void N(float[] fArray, List<class04562<C, I>> list, float[] fArray2) {
        if (fArray.length != list.size() || fArray.length != fArray2.length) {
            throw new IllegalArgumentException("All lengths must be equal, got: " + fArray.length + " " + list.size() + " " + fArray2.length);
        }
        if (fArray.length == 0) {
            throw new IllegalArgumentException("Cannot create a multipoint spline with no points");
        }
    }

    public List<class04562<C, I>> R() {
        return this.values;
    }
}

