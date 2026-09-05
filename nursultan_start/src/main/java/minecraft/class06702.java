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

public final class class06702
extends Enum<class06702>
implements class05033 {
    public static final /* enum */ class06702 field_5795 = new class06702("progress");
    public static final /* enum */ class06702 field_5796 = new class06702("notched_6");
    public static final /* enum */ class06702 field_5791 = new class06702("notched_10");
    public static final /* enum */ class06702 field_5793 = new class06702("notched_12");
    public static final /* enum */ class06702 field_5790 = new class06702("notched_20");
    public static final Codec<class06702> field_56629;
    private final String field_5794;
    private static final /* synthetic */ class06702[] field_5792;

    private class06702(String string2) {
        this.field_5794 = string2;
    }

    static {
        field_5792 = class06702.y();
        field_56629 = class05033.N(class06702::values);
    }

    public static class06702[] values() {
        return (class06702[])field_5792.clone();
    }

    public static class06702 valueOf(String string) {
        return Enum.valueOf(class06702.class, string);
    }

    private static /* synthetic */ class06702[] y() {
        return new class06702[]{field_5795, field_5796, field_5791, field_5793, field_5790};
    }

    public String N() {
        return this.field_5794;
    }

    public String method_15434() {
        return this.field_5794;
    }
}

