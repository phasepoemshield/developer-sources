/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class08083
extends Enum<class08083>
implements class05033 {
    public static final /* enum */ class08083 field_12637 = new class08083("normal");
    public static final /* enum */ class08083 field_12634 = new class08083("sticky");
    private final String field_12635;
    private static final /* synthetic */ class08083[] field_12636;

    private class08083(String string2) {
        this.field_12635 = string2;
    }

    public String toString() {
        return this.field_12635;
    }

    public static class08083[] values() {
        return (class08083[])field_12636.clone();
    }

    public static class08083 valueOf(String string) {
        return Enum.valueOf(class08083.class, string);
    }

    private static /* synthetic */ class08083[] N() {
        return new class08083[]{field_12637, field_12634};
    }

    public String method_15434() {
        return this.field_12635;
    }

    static {
        field_12636 = class08083.N();
    }
}

