/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03908;
import minecraft.class03912;
import minecraft.class03979;

public final class class03884
extends Enum<class03884>
implements class03908 {
    public static final /* enum */ class03884 field_36549 = new class03884();
    public static final class03979<class03877> field_37079;
    private static final /* synthetic */ class03884[] field_36550;

    @Override
    public class03979<? extends class03877> L() {
        return field_37079;
    }

    public static class03884[] values() {
        return (class03884[])field_36550.clone();
    }

    public static class03884 valueOf(String string) {
        return Enum.valueOf(class03884.class, string);
    }

    private static /* synthetic */ class03884[] u() {
        return new class03884[]{field_36549};
    }

    @Override
    public double y() {
        return 1.0;
    }

    @Override
    public double N() {
        return 1.0;
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        Arrays.fill(dArray, 1.0);
    }

    @Override
    public double N(class03875 class038752) {
        return 1.0;
    }

    static {
        field_36550 = class03884.u();
        field_37079 = class03979.N(MapCodec.unit((Object)field_36549));
    }
}

