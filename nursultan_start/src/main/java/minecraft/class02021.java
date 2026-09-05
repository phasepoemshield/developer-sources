/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class07536
 */
package minecraft;

import minecraft.class07211;
import minecraft.class07536;

final class class02021
extends Enum<class02021> {
    public static final /* enum */ class02021 field_4199 = new class02021(0, 1, 2, 3);
    public static final /* enum */ class02021 field_4200 = new class02021(2, 3, 0, 1);
    public static final /* enum */ class02021 field_4204 = new class02021(3, 0, 1, 2);
    public static final /* enum */ class02021 field_4205 = new class02021(0, 1, 2, 3);
    public static final /* enum */ class02021 field_4206 = new class02021(3, 0, 1, 2);
    public static final /* enum */ class02021 field_4207 = new class02021(1, 2, 3, 0);
    final int field_4203;
    final int field_4201;
    final int field_4198;
    final int field_4209;
    private static final class02021[] field_4202;
    private static final /* synthetic */ class02021[] field_4208;

    private class02021(int n2, int n3, int n4, int n5) {
        this.field_4203 = n2;
        this.field_4201 = n3;
        this.field_4198 = n4;
        this.field_4209 = n5;
    }

    static {
        field_4208 = class02021.N();
        field_4202 = (class02021[])class07536.N((Object)new class02021[6], class02021Array -> {
            class02021Array[class07211.field_11033.L()] = field_4199;
            class02021Array[class07211.field_11036.L()] = field_4200;
            class02021Array[class07211.field_11043.L()] = field_4204;
            class02021Array[class07211.field_11035.L()] = field_4205;
            class02021Array[class07211.field_11039.L()] = field_4206;
            class02021Array[class07211.field_11034.L()] = field_4207;
        });
    }

    public static class02021[] values() {
        return (class02021[])field_4208.clone();
    }

    public static class02021 valueOf(String string) {
        return Enum.valueOf(class02021.class, string);
    }

    public static class02021 N(class07211 class072112) {
        return field_4202[class072112.L()];
    }

    private static /* synthetic */ class02021[] N() {
        return new class02021[]{field_4199, field_4200, field_4204, field_4205, field_4206, field_4207};
    }
}

