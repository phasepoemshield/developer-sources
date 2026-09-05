/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class06337
extends Enum<class06337>
implements class05033 {
    public static final /* enum */ class06337 field_28064 = new class06337("tip_merge");
    public static final /* enum */ class06337 field_28065 = new class06337("tip");
    public static final /* enum */ class06337 field_28066 = new class06337("frustum");
    public static final /* enum */ class06337 field_28067 = new class06337("middle");
    public static final /* enum */ class06337 field_28068 = new class06337("base");
    private final String field_28069;
    private static final /* synthetic */ class06337[] field_28070;

    private class06337(String string2) {
        this.field_28069 = string2;
    }

    public String toString() {
        return this.field_28069;
    }

    public static class06337[] values() {
        return (class06337[])field_28070.clone();
    }

    public static class06337 valueOf(String string) {
        return Enum.valueOf(class06337.class, string);
    }

    private static /* synthetic */ class06337[] N() {
        return new class06337[]{field_28064, field_28065, field_28066, field_28067, field_28068};
    }

    public String method_15434() {
        return this.field_28069;
    }

    static {
        field_28070 = class06337.N();
    }
}

