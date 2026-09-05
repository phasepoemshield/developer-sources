/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class07411
extends Enum<class07411>
implements class05033 {
    public static final /* enum */ class07411 field_62399 = new class07411("integer");
    public static final /* enum */ class07411 field_62400 = new class07411("boolean");
    private final String field_62401;
    private static final /* synthetic */ class07411[] field_62402;

    private class07411(String string2) {
        this.field_62401 = string2;
    }

    public static class07411[] values() {
        return (class07411[])field_62402.clone();
    }

    public static class07411 valueOf(String string) {
        return Enum.valueOf(class07411.class, string);
    }

    private static /* synthetic */ class07411[] N() {
        return new class07411[]{field_62399, field_62400};
    }

    public String method_15434() {
        return this.field_62401;
    }

    static {
        field_62402 = class07411.N();
    }
}

