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

public final class class03886
extends Enum<class03886>
implements class03908 {
    public static final /* enum */ class03886 field_36551 = new class03886();
    public static final class03979<class03877> field_37081;
    private static final /* synthetic */ class03886[] field_36552;

    @Override
    public class03979<? extends class03877> L() {
        return field_37081;
    }

    public static class03886[] values() {
        return (class03886[])field_36552.clone();
    }

    public static class03886 valueOf(String string) {
        return Enum.valueOf(class03886.class, string);
    }

    private static /* synthetic */ class03886[] u() {
        return new class03886[]{field_36551};
    }

    @Override
    public double y() {
        return 0.0;
    }

    @Override
    public double N() {
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

    static {
        field_36552 = class03886.u();
        field_37081 = class03979.N(MapCodec.unit((Object)field_36551));
    }
}

