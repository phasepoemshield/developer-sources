/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class06446;
import minecraft.class06450;
import minecraft.class06474;

public abstract class class06468
extends Enum<class06468> {
    public static final /* enum */ class06468 field_62004 = new class06446("MESSAGE", 0, "");
    public static final /* enum */ class06468 field_62005 = new class06474("COMMAND", 1, "/");
    private final String field_62006;
    private static final /* synthetic */ class06468[] field_62007;

    class06468(String string2) {
        this.field_62006 = string2;
    }

    static {
        field_62007 = class06468.y();
    }

    public static class06468[] values() {
        return (class06468[])field_62007.clone();
    }

    public static class06468 valueOf(String string) {
        return Enum.valueOf(class06468.class, string);
    }

    private static /* synthetic */ class06468[] y() {
        return new class06468[]{field_62004, field_62005};
    }

    public abstract boolean N(class06450 var1);

    public String N() {
        return this.field_62006;
    }
}

