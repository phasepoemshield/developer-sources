/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03391
 *  minecraft.class03412
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;
import minecraft.class03047;
import minecraft.class03391;
import minecraft.class03412;
import minecraft.class05033;

public final class class03075
extends Enum<class03075>
implements class05033 {
    public static final /* enum */ class03075 field_40804 = new class03075("player", () -> class03412.N);
    public static final /* enum */ class03075 field_40805 = new class03075("system", () -> class03391.N);
    private final String field_40806;
    private final Supplier<MapCodec<? extends class03047>> field_40807;
    private static final /* synthetic */ class03075[] field_40808;

    private class03075(String string2, Supplier<MapCodec<? extends class03047>> supplier) {
        this.field_40806 = string2;
        this.field_40807 = supplier;
    }

    static {
        field_40808 = class03075.u();
    }

    public static class03075[] values() {
        return (class03075[])field_40808.clone();
    }

    public static class03075 valueOf(String string) {
        return Enum.valueOf(class03075.class, string);
    }

    private static /* synthetic */ class03075[] u() {
        return new class03075[]{field_40804, field_40805};
    }

    public MapCodec<? extends class03047> N() {
        return this.field_40807.get();
    }

    public String method_15434() {
        return this.field_40806;
    }
}

