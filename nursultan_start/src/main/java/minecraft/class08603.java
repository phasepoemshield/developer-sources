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

public final class class08603
extends Enum<class08603>
implements class05033 {
    public static final /* enum */ class08603 field_55688 = new class08603("normal");
    public static final /* enum */ class08603 field_55689 = new class08603("cold");
    public static final Codec<class08603> field_55690;
    private final String field_55694;
    private static final /* synthetic */ class08603[] field_55695;

    private class08603(String string2) {
        this.field_55694 = string2;
    }

    public static class08603[] values() {
        return (class08603[])field_55695.clone();
    }

    public static class08603 valueOf(String string) {
        return Enum.valueOf(class08603.class, string);
    }

    private static /* synthetic */ class08603[] N() {
        return new class08603[]{field_55688, field_55689};
    }

    public String method_15434() {
        return this.field_55694;
    }

    static {
        field_55695 = class08603.N();
        field_55690 = class05033.N(class08603::values);
    }
}

