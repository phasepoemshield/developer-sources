/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class08394;

public final class class06090
extends Enum<class06090> {
    public static final /* enum */ class06090 field_2230 = new class06090(class01894.y((String)"toast/movement_keys"));
    public static final /* enum */ class06090 field_2237 = new class06090(class01894.y((String)"toast/mouse"));
    public static final /* enum */ class06090 field_2235 = new class06090(class01894.y((String)"toast/tree"));
    public static final /* enum */ class06090 field_2233 = new class06090(class01894.y((String)"toast/recipe_book"));
    public static final /* enum */ class06090 field_2236 = new class06090(class01894.y((String)"toast/wooden_planks"));
    public static final /* enum */ class06090 field_26848 = new class06090(class01894.y((String)"toast/social_interactions"));
    public static final /* enum */ class06090 field_28782 = new class06090(class01894.y((String)"toast/right_click"));
    private final class01894 field_45398;
    private static final /* synthetic */ class06090[] field_2234;

    private class06090(class01894 class018942) {
        this.field_45398 = class018942;
    }

    static {
        field_2234 = class06090.N();
    }

    public static class06090[] values() {
        return (class06090[])field_2234.clone();
    }

    public static class06090 valueOf(String string) {
        return Enum.valueOf(class06090.class, string);
    }

    private static /* synthetic */ class06090[] N() {
        return new class06090[]{field_2230, field_2237, field_2235, field_2233, field_2236, field_26848, field_28782};
    }

    public void N(class01054 class010542, int n, int n2) {
        class010542.N(class08394.Na, this.field_45398, n, n2, 20, 20);
    }
}

