/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;
import minecraft.class03055;
import minecraft.class05033;

final class class03084
extends Enum<class03084>
implements class05033 {
    public static final /* enum */ class03084 field_39947 = new class03084("pass_through", () -> class03055.i);
    public static final /* enum */ class03084 field_39948 = new class03084("fully_filtered", () -> class03055.R);
    public static final /* enum */ class03084 field_39949 = new class03084("partially_filtered", () -> class03055.M);
    private final String field_40841;
    private final Supplier<MapCodec<class03055>> field_40842;
    private static final /* synthetic */ class03084[] field_39950;

    private class03084(String string2, Supplier<MapCodec<class03055>> supplier) {
        this.field_40841 = string2;
        this.field_40842 = supplier;
    }

    static {
        field_39950 = class03084.i();
    }

    public static class03084[] values() {
        return (class03084[])field_39950.clone();
    }

    public static class03084 valueOf(String string) {
        return Enum.valueOf(class03084.class, string);
    }

    private static /* synthetic */ class03084[] i() {
        return new class03084[]{field_39947, field_39948, field_39949};
    }

    public MapCodec<class03055> N() {
        return this.field_40842.get();
    }

    public String method_15434() {
        return this.field_40841;
    }
}

