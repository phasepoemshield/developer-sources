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

public final class class03371
extends Enum<class03371>
implements class05033 {
    public static final /* enum */ class03371 field_44568 = new class03371("singleplayer");
    public static final /* enum */ class03371 field_44569 = new class03371("multiplayer");
    public static final /* enum */ class03371 field_44570 = new class03371("realms");
    static final Codec<class03371> field_44571;
    private final String field_44572;
    private static final /* synthetic */ class03371[] field_44573;

    private class03371(String string2) {
        this.field_44572 = string2;
    }

    static {
        field_44573 = class03371.N();
        field_44571 = class05033.N(class03371::values);
    }

    public static class03371[] values() {
        return (class03371[])field_44573.clone();
    }

    public static class03371 valueOf(String string) {
        return Enum.valueOf(class03371.class, string);
    }

    private static /* synthetic */ class03371[] N() {
        return new class03371[]{field_44568, field_44569, field_44570};
    }

    public String method_15434() {
        return this.field_44572;
    }
}

