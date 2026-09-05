/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02121
 *  minecraft.class02126
 */
package minecraft;

import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;

public final class class07156
extends Enum<class07156> {
    public static final /* enum */ class07156 field_7377 = new class07156(0, 0.0, 0.0, 0.0);
    public static final /* enum */ class07156 field_7379 = new class07156(1, 0.7, 0.7, 0.8);
    public static final /* enum */ class07156 field_7380 = new class07156(2, 0.4, 0.3, 0.35);
    public static final /* enum */ class07156 field_7381 = new class07156(3, 0.7, 0.5, 0.2);
    public static final /* enum */ class07156 field_7382 = new class07156(4, 0.3, 0.3, 0.8);
    public static final /* enum */ class07156 field_7378 = new class07156(5, 0.1, 0.1, 0.2);
    private static final IntFunction<class07156> field_41674;
    final int field_7375;
    final double[] field_7374;
    private static final /* synthetic */ class07156[] field_7376;

    private class07156(int n2, double d, double d2, double d3) {
        this.field_7375 = n2;
        this.field_7374 = new double[]{d, d2, d3};
    }

    static {
        field_7376 = class07156.N();
        field_41674 = class02121.N(class071562 -> class071562.field_7375, (Object[])class07156.values(), (class02126)class02126.field_41664);
    }

    public static class07156[] values() {
        return (class07156[])field_7376.clone();
    }

    public static class07156 valueOf(String string) {
        return Enum.valueOf(class07156.class, string);
    }

    public static class07156 N(int n) {
        return field_41674.apply(n);
    }

    private static /* synthetic */ class07156[] N() {
        return new class07156[]{field_7377, field_7379, field_7380, field_7381, field_7382, field_7378};
    }
}

