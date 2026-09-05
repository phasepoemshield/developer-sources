/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class08075
extends Enum<class08075>
implements class05033 {
    public static final /* enum */ class08075 field_12686 = new class08075("up");
    public static final /* enum */ class08075 field_12689 = new class08075("side");
    public static final /* enum */ class08075 field_12687 = new class08075("none");
    private final String field_12685;
    private static final /* synthetic */ class08075[] field_12688;

    private class08075(String string2) {
        this.field_12685 = string2;
    }

    public String toString() {
        return this.method_15434();
    }

    public static class08075[] values() {
        return (class08075[])field_12688.clone();
    }

    public static class08075 valueOf(String string) {
        return Enum.valueOf(class08075.class, string);
    }

    private static /* synthetic */ class08075[] y() {
        return new class08075[]{field_12686, field_12689, field_12687};
    }

    public boolean N() {
        return this != field_12687;
    }

    public String method_15434() {
        return this.field_12685;
    }

    static {
        field_12688 = class08075.y();
    }
}

