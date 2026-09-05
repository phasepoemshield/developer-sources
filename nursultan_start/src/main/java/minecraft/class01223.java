/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package minecraft;

import minecraft.class01894;

final class class01223
extends Enum<class01223> {
    public static final /* enum */ class01223 field_2137 = new class01223(class01894.y((String)"widget/locked_button"));
    public static final /* enum */ class01223 field_2138 = new class01223(class01894.y((String)"widget/locked_button_highlighted"));
    public static final /* enum */ class01223 field_2139 = new class01223(class01894.y((String)"widget/locked_button_disabled"));
    public static final /* enum */ class01223 field_2132 = new class01223(class01894.y((String)"widget/unlocked_button"));
    public static final /* enum */ class01223 field_2133 = new class01223(class01894.y((String)"widget/unlocked_button_highlighted"));
    public static final /* enum */ class01223 field_2140 = new class01223(class01894.y((String)"widget/unlocked_button_disabled"));
    final class01894 field_45362;
    private static final /* synthetic */ class01223[] field_2136;

    private class01223(class01894 class018942) {
        this.field_45362 = class018942;
    }

    static {
        field_2136 = class01223.N();
    }

    public static class01223[] values() {
        return (class01223[])field_2136.clone();
    }

    public static class01223 valueOf(String string) {
        return Enum.valueOf(class01223.class, string);
    }

    private static /* synthetic */ class01223[] N() {
        return new class01223[]{field_2137, field_2138, field_2139, field_2132, field_2133, field_2140};
    }
}

