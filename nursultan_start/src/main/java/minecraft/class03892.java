/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class03865;
import minecraft.class03871;
import minecraft.class03979;
import minecraft.class05033;

public final class class03892
extends Enum<class03892>
implements class05033 {
    public static final /* enum */ class03892 field_36544 = new class03892("add");
    public static final /* enum */ class03892 field_36545 = new class03892("mul");
    public static final /* enum */ class03892 field_36546 = new class03892("min");
    public static final /* enum */ class03892 field_36547 = new class03892("max");
    final class03979<class03871> field_37111 = class03865.N((class038772, class038773) -> class03871.N(this, class038772, class038773), class03871::i, class03871::W);
    private final String field_37112;
    private static final /* synthetic */ class03892[] field_36548;

    private class03892(String string2) {
        this.field_37112 = string2;
    }

    public static class03892[] values() {
        return (class03892[])field_36548.clone();
    }

    public static class03892 valueOf(String string) {
        return Enum.valueOf(class03892.class, string);
    }

    private static /* synthetic */ class03892[] N() {
        return new class03892[]{field_36544, field_36545, field_36546, field_36547};
    }

    public String method_15434() {
        return this.field_37112;
    }

    static {
        field_36548 = class03892.N();
    }
}

