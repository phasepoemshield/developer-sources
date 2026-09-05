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

public final class class05679
extends Enum<class05679>
implements class05033 {
    public static final /* enum */ class05679 field_61599 = new class05679("default", "debug.options.profile.default");
    public static final /* enum */ class05679 field_61600 = new class05679("performance", "debug.options.profile.performance");
    public static final class05031<class05679> field_61601;
    private final String field_61602;
    private final String field_61603;
    private static final /* synthetic */ class05679[] field_61604;

    private class05679(String string2, String string3) {
        this.field_61602 = string2;
        this.field_61603 = string3;
    }

    public static class05679[] values() {
        return (class05679[])field_61604.clone();
    }

    public static class05679 valueOf(String string) {
        return Enum.valueOf(class05679.class, string);
    }

    private static /* synthetic */ class05679[] y() {
        return new class05679[]{field_61599, field_61600};
    }

    public String N() {
        return this.field_61603;
    }

    public String method_15434() {
        return this.field_61602;
    }

    static {
        field_61604 = class05679.y();
        field_61601 = class05033.N(class05679::values);
    }
}

