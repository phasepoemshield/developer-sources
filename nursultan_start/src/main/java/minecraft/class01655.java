/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class01647;
import minecraft.class01650;
import minecraft.class01664;
import minecraft.class01670;
import minecraft.class05033;

public final class class01655
extends Enum<class01655>
implements class05033 {
    public static final /* enum */ class01655 field_45656 = new class01655("stretch", class01670.L);
    public static final /* enum */ class01655 field_45657 = new class01655("tile", class01647.L);
    public static final /* enum */ class01655 field_45658 = new class01655("nine_slice", class01664.L);
    public static final Codec<class01655> field_45659;
    private final String field_45660;
    private final MapCodec<? extends class01650> field_45661;
    private static final /* synthetic */ class01655[] field_45662;

    private class01655(String string2, MapCodec<? extends class01650> mapCodec) {
        this.field_45660 = string2;
        this.field_45661 = mapCodec;
    }

    public static class01655[] values() {
        return (class01655[])field_45662.clone();
    }

    public static class01655 valueOf(String string) {
        return Enum.valueOf(class01655.class, string);
    }

    private static /* synthetic */ class01655[] y() {
        return new class01655[]{field_45656, field_45657, field_45658};
    }

    public MapCodec<? extends class01650> N() {
        return this.field_45661;
    }

    public String method_15434() {
        return this.field_45660;
    }

    static {
        field_45662 = class01655.y();
        field_45659 = class05033.N(class01655::values);
    }
}

