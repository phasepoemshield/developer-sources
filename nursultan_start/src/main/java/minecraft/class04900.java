/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class06338;

public final class class04900
extends Enum<class04900> {
    public static final /* enum */ class04900 field_15288 = new class04900();
    public static final /* enum */ class04900 field_15290 = new class04900();
    public static final /* enum */ class04900 field_15289 = new class04900();
    public static final /* enum */ class04900 field_15291 = new class04900();
    @Deprecated
    public static final Codec<class04900> field_56683;
    private static final /* synthetic */ class04900[] field_15292;

    static {
        field_15292 = class04900.N();
        field_56683 = class06338.L(class04900::valueOf);
    }

    public static class04900[] values() {
        return (class04900[])field_15292.clone();
    }

    public static class04900 valueOf(String string) {
        return Enum.valueOf(class04900.class, string);
    }

    private static /* synthetic */ class04900[] N() {
        return new class04900[]{field_15288, field_15290, field_15289, field_15291};
    }
}

