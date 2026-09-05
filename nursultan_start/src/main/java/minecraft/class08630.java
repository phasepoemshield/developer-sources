/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class08630
extends Enum<class08630>
implements class05033 {
    public static final /* enum */ class08630 field_55831 = new class08630("uprooted");
    public static final /* enum */ class08630 field_55832 = new class08630("dormant");
    public static final /* enum */ class08630 field_55833 = new class08630("awake");
    private final String field_55834;
    private static final /* synthetic */ class08630[] field_55835;

    private class08630(String string2) {
        this.field_55834 = string2;
    }

    public String toString() {
        return this.field_55834;
    }

    public static class08630[] values() {
        return (class08630[])field_55835.clone();
    }

    public static class08630 valueOf(String string) {
        return Enum.valueOf(class08630.class, string);
    }

    private static /* synthetic */ class08630[] N() {
        return new class08630[]{field_55831, field_55832, field_55833};
    }

    public String method_15434() {
        return this.field_55834;
    }

    static {
        field_55835 = class08630.N();
    }
}

