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

public final class class06040
extends Enum<class06040>
implements class05033 {
    public static final /* enum */ class06040 field_28922 = new class06040("none");
    public static final /* enum */ class06040 field_28923 = new class06040("bury");
    public static final /* enum */ class06040 field_38431 = new class06040("beard_thin");
    public static final /* enum */ class06040 field_38432 = new class06040("beard_box");
    public static final /* enum */ class06040 field_51413 = new class06040("encapsulate");
    public static final Codec<class06040> field_38433;
    private final String field_38434;
    private static final /* synthetic */ class06040[] field_28925;

    private class06040(String string2) {
        this.field_38434 = string2;
    }

    public static class06040[] values() {
        return (class06040[])field_28925.clone();
    }

    public static class06040 valueOf(String string) {
        return Enum.valueOf(class06040.class, string);
    }

    private static /* synthetic */ class06040[] N() {
        return new class06040[]{field_28922, field_28923, field_38431, field_38432, field_51413};
    }

    public String method_15434() {
        return this.field_38434;
    }

    static {
        field_28925 = class06040.N();
        field_38433 = class05033.N(class06040::values);
    }
}

