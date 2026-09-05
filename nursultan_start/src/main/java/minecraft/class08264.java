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

final class class08264
extends Enum<class08264>
implements class05033 {
    public static final /* enum */ class08264 field_53708 = new class08264("structure");
    public static final /* enum */ class08264 field_53709 = new class08264("mcfunction");
    public static final Codec<class08264> field_53710;
    private final String field_53711;
    private static final /* synthetic */ class08264[] field_53712;

    private class08264(String string2) {
        this.field_53711 = string2;
    }

    static {
        field_53712 = class08264.N();
        field_53710 = class05033.N(class08264::values);
    }

    public static class08264[] values() {
        return (class08264[])field_53712.clone();
    }

    public static class08264 valueOf(String string) {
        return Enum.valueOf(class08264.class, string);
    }

    private static /* synthetic */ class08264[] N() {
        return new class08264[]{field_53708, field_53709};
    }

    public String method_15434() {
        return this.field_53711;
    }
}

