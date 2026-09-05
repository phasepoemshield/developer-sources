/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class08054
extends Enum<class08054>
implements class05033 {
    public static final /* enum */ class08054 field_12679 = new class08054("top");
    public static final /* enum */ class08054 field_12681 = new class08054("bottom");
    public static final /* enum */ class08054 field_12682 = new class08054("double");
    private final String field_12678;
    private static final /* synthetic */ class08054[] field_12680;

    private class08054(String string2) {
        this.field_12678 = string2;
    }

    public String toString() {
        return this.field_12678;
    }

    public static class08054[] values() {
        return (class08054[])field_12680.clone();
    }

    public static class08054 valueOf(String string) {
        return Enum.valueOf(class08054.class, string);
    }

    private static /* synthetic */ class08054[] N() {
        return new class08054[]{field_12679, field_12681, field_12682};
    }

    public String method_15434() {
        return this.field_12678;
    }

    static {
        field_12680 = class08054.N();
    }
}

