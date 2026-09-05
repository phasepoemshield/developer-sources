/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05031
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05031;
import minecraft.class05033;

public final class class06276
extends Enum<class06276>
implements class05033 {
    public static final /* enum */ class06276 field_61593 = new class06276("alwaysOn");
    public static final /* enum */ class06276 field_61594 = new class06276("inOverlay");
    public static final /* enum */ class06276 field_61595 = new class06276("never");
    public static final class05031<class06276> field_61596;
    private final String field_61597;
    private static final /* synthetic */ class06276[] field_61598;

    private class06276(String string2) {
        this.field_61597 = string2;
    }

    public static class06276[] values() {
        return (class06276[])field_61598.clone();
    }

    public static class06276 valueOf(String string) {
        return Enum.valueOf(class06276.class, string);
    }

    private static /* synthetic */ class06276[] N() {
        return new class06276[]{field_61593, field_61594, field_61595};
    }

    public String method_15434() {
        return this.field_61597;
    }

    static {
        field_61598 = class06276.N();
        field_61596 = class05033.N(class06276::values);
    }
}

