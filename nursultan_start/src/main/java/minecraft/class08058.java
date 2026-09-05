/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class08058
extends Enum<class08058>
implements class05033 {
    public static final /* enum */ class08058 field_12588 = new class08058();
    public static final /* enum */ class08058 field_12586 = new class08058();
    private static final /* synthetic */ class08058[] field_12587;

    public String toString() {
        return this.method_15434();
    }

    public static class08058[] values() {
        return (class08058[])field_12587.clone();
    }

    public static class08058 valueOf(String string) {
        return Enum.valueOf(class08058.class, string);
    }

    private static /* synthetic */ class08058[] N() {
        return new class08058[]{field_12588, field_12586};
    }

    public String method_15434() {
        return this == field_12588 ? "left" : "right";
    }

    static {
        field_12587 = class08058.N();
    }
}

