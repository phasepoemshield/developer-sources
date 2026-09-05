/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07078
 */
package minecraft;

import minecraft.class04882;
import minecraft.class07078;

final class class04847
extends Enum<class04847> {
    public static final /* enum */ class04847 field_16631 = new class04847((class07078<? extends class04882>)class07078.yH, new int[]{0, 0, 2, 0, 1, 4, 2, 5});
    public static final /* enum */ class04847 field_16634 = new class04847((class07078<? extends class04882>)class07078.x, new int[]{0, 0, 0, 0, 0, 1, 1, 2});
    public static final /* enum */ class04847 field_16633 = new class04847((class07078<? extends class04882>)class07078.yy, new int[]{0, 4, 3, 3, 4, 4, 4, 2});
    public static final /* enum */ class04847 field_16635 = new class04847((class07078<? extends class04882>)class07078.yp, new int[]{0, 0, 0, 0, 3, 0, 0, 1});
    public static final /* enum */ class04847 field_16630 = new class04847((class07078<? extends class04882>)class07078.yB, new int[]{0, 0, 0, 1, 0, 1, 0, 2});
    static final class04847[] field_16636;
    final class07078<? extends class04882> field_16629;
    final int[] field_16628;
    private static final /* synthetic */ class04847[] field_16632;

    private class04847(class07078<? extends class04882> class070782, int[] nArray) {
        this.field_16629 = class070782;
        this.field_16628 = nArray;
    }

    static {
        field_16632 = class04847.N();
        field_16636 = class04847.values();
    }

    public static class04847[] values() {
        return (class04847[])field_16632.clone();
    }

    public static class04847 valueOf(String string) {
        return Enum.valueOf(class04847.class, string);
    }

    private static /* synthetic */ class04847[] N() {
        return new class04847[]{field_16631, field_16634, field_16633, field_16635, field_16630};
    }
}

