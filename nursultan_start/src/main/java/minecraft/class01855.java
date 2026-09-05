/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class02060
 *  minecraft.class02072
 *  minecraft.class02102
 */
package minecraft;

import minecraft.class02060;
import minecraft.class02072;
import minecraft.class02102;

public final class class01855
extends Enum<class01855> {
    public static final /* enum */ class01855 field_45403 = new class01855();
    public static final /* enum */ class01855 field_45404 = new class01855();
    private static final /* synthetic */ class01855[] field_45405;

    static {
        field_45405 = class01855.N();
    }

    public static class01855[] values() {
        return (class01855[])field_45405.clone();
    }

    public static class01855 valueOf(String string) {
        return Enum.valueOf(class01855.class, string);
    }

    void N(class02060 class020602, int n) {
        switch (this.ordinal()) {
            case 0: {
                class020602.N(n);
                break;
            }
            case 1: {
                class020602.y(n);
            }
        }
    }

    private static /* synthetic */ class01855[] N() {
        return new class01855[]{field_45403, field_45404};
    }

    public <T extends class02102> T N(class02060 class020602, T t, int n, class02072 class020722) {
        return (T)(switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class020602.N(t, 0, n, class020722);
            case 1 -> class020602.N(t, n, 0, class020722);
        });
    }
}

