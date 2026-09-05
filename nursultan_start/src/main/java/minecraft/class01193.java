/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class01193
extends Enum<class01193>
implements class05033 {
    public static final /* enum */ class01193 field_28121 = new class01193("inactive");
    public static final /* enum */ class01193 field_28122 = new class01193("active");
    public static final /* enum */ class01193 field_44631 = new class01193("cooldown");
    private final String field_28124;
    private static final /* synthetic */ class01193[] field_28125;

    private class01193(String string2) {
        this.field_28124 = string2;
    }

    public String toString() {
        return this.field_28124;
    }

    public static class01193[] values() {
        return (class01193[])field_28125.clone();
    }

    public static class01193 valueOf(String string) {
        return Enum.valueOf(class01193.class, string);
    }

    private static /* synthetic */ class01193[] N() {
        return new class01193[]{field_28121, field_28122, field_44631};
    }

    public String method_15434() {
        return this.field_28124;
    }

    static {
        field_28125 = class01193.N();
    }
}

