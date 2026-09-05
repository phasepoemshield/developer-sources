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

public final class class00801
extends Enum<class00801>
implements class05033 {
    public static final /* enum */ class00801 field_9384 = new class00801("none");
    public static final /* enum */ class00801 field_9382 = new class00801("rain");
    public static final /* enum */ class00801 field_9383 = new class00801("snow");
    public static final Codec<class00801> field_46251;
    private final String field_46252;
    private static final /* synthetic */ class00801[] field_9386;

    private class00801(String string2) {
        this.field_46252 = string2;
    }

    public static class00801[] values() {
        return (class00801[])field_9386.clone();
    }

    public static class00801 valueOf(String string) {
        return Enum.valueOf(class00801.class, string);
    }

    private static /* synthetic */ class00801[] N() {
        return new class00801[]{field_9384, field_9382, field_9383};
    }

    public String method_15434() {
        return this.field_46252;
    }

    static {
        field_9386 = class00801.N();
        field_46251 = class05033.N(class00801::values);
    }
}

