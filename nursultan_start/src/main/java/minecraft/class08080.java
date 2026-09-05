/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class08080
extends Enum<class08080>
implements class05033 {
    public static final /* enum */ class08080 field_12665 = new class08080("north_south");
    public static final /* enum */ class08080 field_12674 = new class08080("east_west");
    public static final /* enum */ class08080 field_12667 = new class08080("ascending_east");
    public static final /* enum */ class08080 field_12666 = new class08080("ascending_west");
    public static final /* enum */ class08080 field_12670 = new class08080("ascending_north");
    public static final /* enum */ class08080 field_12668 = new class08080("ascending_south");
    public static final /* enum */ class08080 field_12664 = new class08080("south_east");
    public static final /* enum */ class08080 field_12671 = new class08080("south_west");
    public static final /* enum */ class08080 field_12672 = new class08080("north_west");
    public static final /* enum */ class08080 field_12663 = new class08080("north_east");
    private final String field_12669;
    private static final /* synthetic */ class08080[] field_12673;

    private static /* synthetic */ class08080[] L() {
        return new class08080[]{field_12665, field_12674, field_12667, field_12666, field_12670, field_12668, field_12664, field_12671, field_12672, field_12663};
    }

    private class08080(String string2) {
        this.field_12669 = string2;
    }

    public String toString() {
        return this.field_12669;
    }

    public static class08080[] values() {
        return (class08080[])field_12673.clone();
    }

    public static class08080 valueOf(String string) {
        return Enum.valueOf(class08080.class, string);
    }

    public boolean y() {
        return this == field_12670 || this == field_12667 || this == field_12668 || this == field_12666;
    }

    public String N() {
        return this.field_12669;
    }

    public String method_15434() {
        return this.field_12669;
    }

    static {
        field_12673 = class08080.L();
    }
}

