/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03487
 *  minecraft.class03492
 *  minecraft.class04360
 *  minecraft.class05033
 *  minecraft.class05638
 *  minecraft.class06238
 *  minecraft.class06270
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class03487;
import minecraft.class03492;
import minecraft.class04360;
import minecraft.class05033;
import minecraft.class05638;
import minecraft.class06238;
import minecraft.class06270;

public final class class05855
extends Enum<class05855>
implements class05033 {
    public static final /* enum */ class05855 field_2312 = new class05855("bitmap", (MapCodec<? extends class06270>)class05638.N);
    public static final /* enum */ class05855 field_2317 = new class05855("ttf", (MapCodec<? extends class06270>)class03492.N);
    public static final /* enum */ class05855 field_37904 = new class05855("space", (MapCodec<? extends class06270>)class04360.N);
    public static final /* enum */ class05855 field_2313 = new class05855("unihex", (MapCodec<? extends class06270>)class06238.N);
    public static final /* enum */ class05855 field_44761 = new class05855("reference", (MapCodec<? extends class06270>)class03487.N);
    public static final Codec<class05855> field_44802;
    private final String field_2314;
    private final MapCodec<? extends class06270> field_44803;
    private static final /* synthetic */ class05855[] field_2316;

    private class05855(String string2, MapCodec<? extends class06270> mapCodec) {
        this.field_2314 = string2;
        this.field_44803 = mapCodec;
    }

    public static class05855[] values() {
        return (class05855[])field_2316.clone();
    }

    public static class05855 valueOf(String string) {
        return Enum.valueOf(class05855.class, string);
    }

    private static /* synthetic */ class05855[] y() {
        return new class05855[]{field_2312, field_2317, field_37904, field_2313, field_44761};
    }

    public MapCodec<? extends class06270> N() {
        return this.field_44803;
    }

    public String method_15434() {
        return this.field_2314;
    }

    static {
        field_2316 = class05855.y();
        field_44802 = class05033.N(class05855::values);
    }
}

