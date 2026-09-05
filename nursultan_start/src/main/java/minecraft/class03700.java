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

public final class class03700
extends Enum<class03700>
implements class05033 {
    public static final /* enum */ class03700 field_42361 = new class03700("default");
    public static final /* enum */ class03700 field_42362 = new class03700("fall_variants");
    public static final /* enum */ class03700 field_42363 = new class03700("intentional_game_design");
    public static final Codec<class03700> field_42364;
    private final String field_42365;
    private static final /* synthetic */ class03700[] field_42366;

    private class03700(String string2) {
        this.field_42365 = string2;
    }

    public static class03700[] values() {
        return (class03700[])field_42366.clone();
    }

    public static class03700 valueOf(String string) {
        return Enum.valueOf(class03700.class, string);
    }

    private static /* synthetic */ class03700[] N() {
        return new class03700[]{field_42361, field_42362, field_42363};
    }

    public String method_15434() {
        return this.field_42365;
    }

    static {
        field_42366 = class03700.N();
        field_42364 = class05033.N(class03700::values);
    }
}

