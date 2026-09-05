/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Arrays;
import minecraft.class03874;
import minecraft.class03875;
import minecraft.class03912;

public final class class03904
extends Enum<class03904>
implements class03874 {
    public static final /* enum */ class03904 field_37076 = new class03904();
    private static final /* synthetic */ class03904[] field_37077;

    public static class03904[] values() {
        return (class03904[])field_37077.clone();
    }

    public static class03904 valueOf(String string) {
        return Enum.valueOf(class03904.class, string);
    }

    private static /* synthetic */ class03904[] u() {
        return new class03904[]{field_37076};
    }

    @Override
    public double y() {
        return 0.0;
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        Arrays.fill(dArray, 0.0);
    }

    @Override
    public double N(class03875 class038752) {
        return 0.0;
    }

    @Override
    public double N() {
        return 0.0;
    }

    static {
        field_37077 = class03904.u();
    }
}

