/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01028
 *  minecraft.class01590
 */
package minecraft;

import minecraft.class00930;
import minecraft.class00936;
import minecraft.class00946;
import minecraft.class01028;
import minecraft.class01590;

public abstract class class00937
extends Enum<class00937> {
    public static final /* enum */ class00937 field_62009 = new class00930("LEFT", 0);
    public static final /* enum */ class00937 field_62010 = new class00946("CENTER", 1);
    public static final /* enum */ class00937 field_62011 = new class00936("RIGHT", 2);
    private static final /* synthetic */ class00937[] field_62012;

    public static class00937[] values() {
        return (class00937[])field_62012.clone();
    }

    public static class00937 valueOf(String string) {
        return Enum.valueOf(class00937.class, string);
    }

    public abstract int N(int var1, int var2);

    private static /* synthetic */ class00937[] N() {
        return new class00937[]{field_62009, field_62010, field_62011};
    }

    public int N(int n, class01590 class015902, class01028 class010282) {
        return this.N(n, class015902.N(class010282));
    }

    static {
        field_62012 = class00937.N();
    }
}

