/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;

public final class class02087
extends Enum<class02087>
implements class05033 {
    public static final /* enum */ class02087 field_41490 = new class02087("realm");
    public static final /* enum */ class02087 field_41491 = new class02087("local");
    public static final /* enum */ class02087 field_41492 = new class02087("server");
    public static final Codec<class02087> field_41493;
    private final String field_41494;
    private static final /* synthetic */ class02087[] field_41495;

    private class02087(String string2) {
        this.field_41494 = string2;
    }

    public static class02087[] values() {
        return (class02087[])field_41495.clone();
    }

    public static class02087 valueOf(String string) {
        return Enum.valueOf(class02087.class, string);
    }

    private static /* synthetic */ class02087[] N() {
        return new class02087[]{field_41490, field_41491, field_41492};
    }

    public String method_15434() {
        return this.field_41494;
    }

    static {
        field_41495 = class02087.N();
        field_41493 = class05033.N(class02087::values);
    }
}

