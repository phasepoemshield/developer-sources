/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class08061
extends Enum<class08061>
implements class05033 {
    public static final /* enum */ class08061 field_12710 = new class08061("straight");
    public static final /* enum */ class08061 field_12712 = new class08061("inner_left");
    public static final /* enum */ class08061 field_12713 = new class08061("inner_right");
    public static final /* enum */ class08061 field_12708 = new class08061("outer_left");
    public static final /* enum */ class08061 field_12709 = new class08061("outer_right");
    private final String field_12714;
    private static final /* synthetic */ class08061[] field_12711;

    private class08061(String string2) {
        this.field_12714 = string2;
    }

    public String toString() {
        return this.field_12714;
    }

    public static class08061[] values() {
        return (class08061[])field_12711.clone();
    }

    public static class08061 valueOf(String string) {
        return Enum.valueOf(class08061.class, string);
    }

    private static /* synthetic */ class08061[] N() {
        return new class08061[]{field_12710, field_12712, field_12713, field_12708, field_12709};
    }

    public String method_15434() {
        return this.field_12714;
    }

    static {
        field_12711 = class08061.N();
    }
}

