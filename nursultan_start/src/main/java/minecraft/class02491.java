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
import minecraft.class02462;
import minecraft.class02463;
import minecraft.class02478;
import minecraft.class02489;
import minecraft.class02507;
import minecraft.class05033;

public final class class02491
extends Enum<class02491>
implements class05033 {
    public static final /* enum */ class02491 field_49856 = new class02491("replace_all", class02507.L);
    public static final /* enum */ class02491 field_49857 = new class02491("replace_section", class02463.y);
    public static final /* enum */ class02491 field_49858 = new class02491("insert", class02478.y);
    public static final /* enum */ class02491 field_49859 = new class02491("append", class02462.L);
    public static final Codec<class02491> field_49860;
    private final String field_49862;
    final MapCodec<? extends class02489> field_49863;
    private static final /* synthetic */ class02491[] field_49864;

    private class02491(String string2, MapCodec<? extends class02489> mapCodec) {
        this.field_49862 = string2;
        this.field_49863 = mapCodec;
    }

    public static class02491[] values() {
        return (class02491[])field_49864.clone();
    }

    public static class02491 valueOf(String string) {
        return Enum.valueOf(class02491.class, string);
    }

    private static /* synthetic */ class02491[] y() {
        return new class02491[]{field_49856, field_49857, field_49858, field_49859};
    }

    public MapCodec<? extends class02489> N() {
        return this.field_49863;
    }

    public String method_15434() {
        return this.field_49862;
    }

    static {
        field_49864 = class02491.y();
        field_49860 = class05033.N(class02491::values);
    }
}

