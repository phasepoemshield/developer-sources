/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class03865;
import minecraft.class03883;
import minecraft.class03979;
import minecraft.class05033;

final class class03891
extends Enum<class03891>
implements class05033 {
    public static final /* enum */ class03891 field_36555 = new class03891("abs");
    public static final /* enum */ class03891 field_36556 = new class03891("square");
    public static final /* enum */ class03891 field_36557 = new class03891("cube");
    public static final /* enum */ class03891 field_36558 = new class03891("half_negative");
    public static final /* enum */ class03891 field_36559 = new class03891("quarter_negative");
    public static final /* enum */ class03891 field_61470 = new class03891("invert");
    public static final /* enum */ class03891 field_36560 = new class03891("squeeze");
    private final String field_37086;
    final class03979<class03883> field_37087 = class03865.N(class038772 -> class03883.N(this, class038772), class03883::az_);
    private static final /* synthetic */ class03891[] field_36561;

    private class03891(String string2) {
        this.field_37086 = string2;
    }

    public static class03891[] values() {
        return (class03891[])field_36561.clone();
    }

    public static class03891 valueOf(String string) {
        return Enum.valueOf(class03891.class, string);
    }

    private static /* synthetic */ class03891[] N() {
        return new class03891[]{field_36555, field_36556, field_36557, field_36558, field_36559, field_61470, field_36560};
    }

    public String method_15434() {
        return this.field_37086;
    }

    static {
        field_36561 = class03891.N();
    }
}

