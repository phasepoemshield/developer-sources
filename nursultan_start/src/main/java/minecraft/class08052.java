/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class08052
extends Enum<class08052>
implements class05033 {
    public static final /* enum */ class08052 field_12619 = new class08052("top");
    public static final /* enum */ class08052 field_12617 = new class08052("bottom");
    private final String field_12616;
    private static final /* synthetic */ class08052[] field_12618;

    private class08052(String string2) {
        this.field_12616 = string2;
    }

    public String toString() {
        return this.field_12616;
    }

    public static class08052[] values() {
        return (class08052[])field_12618.clone();
    }

    public static class08052 valueOf(String string) {
        return Enum.valueOf(class08052.class, string);
    }

    private static /* synthetic */ class08052[] N() {
        return new class08052[]{field_12619, field_12617};
    }

    public String method_15434() {
        return this.field_12616;
    }

    static {
        field_12618 = class08052.N();
    }
}

