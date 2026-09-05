/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 */
package minecraft;

import minecraft.class00500;
import minecraft.class01013;
import minecraft.class01033;
import minecraft.class01038;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;

public abstract class class01020
extends Enum<class01020> {
    public static final /* enum */ class01020 field_25822 = new class01033("FULL", 0);
    public static final /* enum */ class01020 field_25823 = new class01013("CENTER", 1);
    public static final /* enum */ class01020 field_25824 = new class01038("RIGID", 2);
    private static final /* synthetic */ class01020[] field_25825;

    public static class01020[] values() {
        return (class01020[])field_25825.clone();
    }

    public static class01020 valueOf(String string) {
        return Enum.valueOf(class01020.class, string);
    }

    private static /* synthetic */ class01020[] N() {
        return new class01020[]{field_25822, field_25823, field_25824};
    }

    public abstract boolean N(class00500 var1, class07290 var2, class07209 var3, class07211 var4);

    static {
        field_25825 = class01020.N();
    }
}

