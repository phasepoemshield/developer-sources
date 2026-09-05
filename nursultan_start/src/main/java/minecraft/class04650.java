/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class09033
 */
package minecraft;

import minecraft.class00040;
import minecraft.class00044;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class09033;

public final class class04650
extends Enum<class04650> {
    public static final /* enum */ class04650 field_2210 = new class04650(class04909.Op);
    public static final /* enum */ class04650 field_2209 = new class04650(class04909.OF);
    private final class04891 field_2211;
    private static final /* synthetic */ class04650[] field_2212;

    private class04650(class04891 class048912) {
        this.field_2211 = class048912;
    }

    static {
        field_2212 = class04650.N();
    }

    public static class04650[] values() {
        return (class04650[])field_2212.clone();
    }

    public static class04650 valueOf(String string) {
        return Enum.valueOf(class04650.class, string);
    }

    private static /* synthetic */ class04650[] N() {
        return new class04650[]{field_2210, field_2209};
    }

    public void N(class09033 class090332) {
        class090332.N((class00044)class00040.N((class04891)this.field_2211, (float)1.0f, (float)1.0f));
    }
}

