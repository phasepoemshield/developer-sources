/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;

public final class class03896
extends Enum<class03896> {
    public static final /* enum */ class03896 field_33603 = new class03896(class00869.jN.W(), class00869.nI.W(), class00869.L.W(), 0, 50);
    public static final /* enum */ class03896 field_33604 = new class03896(class00869.f.W(), class00869.ng.W(), class00869.bw.W(), -60, -8);
    final class00500 field_33605;
    final class00500 field_33668;
    final class00500 field_33606;
    public final int field_33607;
    public final int field_33608;
    private static final /* synthetic */ class03896[] field_33609;

    private class03896(class00500 class005002, class00500 class005003, class00500 class005004, int n2, int n3) {
        this.field_33605 = class005002;
        this.field_33668 = class005003;
        this.field_33606 = class005004;
        this.field_33607 = n2;
        this.field_33608 = n3;
    }

    public static class03896[] values() {
        return (class03896[])field_33609.clone();
    }

    public static class03896 valueOf(String string) {
        return Enum.valueOf(class03896.class, string);
    }

    private static /* synthetic */ class03896[] N() {
        return new class03896[]{field_33603, field_33604};
    }

    static {
        field_33609 = class03896.N();
    }
}

