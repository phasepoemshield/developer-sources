/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02553
 *  minecraft.class05033
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class02553;
import minecraft.class05033;
import minecraft.class06069;

public final class class02538
extends Enum<class02538>
implements class05033 {
    public static final /* enum */ class02538 field_51723 = new class02538("entity_position", (d, d2, f, class060692) -> d);
    public static final /* enum */ class02538 field_51724 = new class02538("in_bounding_box", (d, d2, f, class060692) -> d2 + (class060692.U() - 0.5) * (double)f);
    public static final Codec<class02538> field_51725;
    private final String field_51726;
    private final class02553 field_51727;
    private static final /* synthetic */ class02538[] field_51728;

    private class02538(String string2, class02553 class025532) {
        this.field_51726 = string2;
        this.field_51727 = class025532;
    }

    public static class02538[] values() {
        return (class02538[])field_51728.clone();
    }

    public static class02538 valueOf(String string) {
        return Enum.valueOf(class02538.class, string);
    }

    private static /* synthetic */ class02538[] N() {
        return new class02538[]{field_51723, field_51724};
    }

    public double N(double d, double d2, float f, class06069 class060692) {
        return this.field_51727.getCoordinate(d, d2, f, class060692);
    }

    public String method_15434() {
        return this.field_51726;
    }

    static {
        field_51728 = class02538.N();
        field_51725 = class05033.N(class02538::values);
    }
}

