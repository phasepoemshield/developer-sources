/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04763
 */
package minecraft;

import minecraft.class04763;

public final class class01102
extends Enum<class01102> {
    public static final /* enum */ class01102 field_27289 = new class01102(false, false);
    public static final /* enum */ class01102 field_27290 = new class01102(true, false);
    public static final /* enum */ class01102 field_27291 = new class01102(true, true);
    private final boolean field_27292;
    private final boolean field_27293;
    private static final /* synthetic */ class01102[] field_27294;

    private static /* synthetic */ class01102[] L() {
        return new class01102[]{field_27289, field_27290, field_27291};
    }

    private class01102(boolean bl, boolean bl2) {
        this.field_27292 = bl;
        this.field_27293 = bl2;
    }

    static {
        field_27294 = class01102.L();
    }

    public static class01102[] values() {
        return (class01102[])field_27294.clone();
    }

    public static class01102 valueOf(String string) {
        return Enum.valueOf(class01102.class, string);
    }

    public boolean y() {
        return this.field_27292;
    }

    public static class01102 N(class04763 class047632) {
        if (class047632.N(class04763.field_13877)) {
            return field_27291;
        }
        if (class047632.N(class04763.field_44855)) {
            return field_27290;
        }
        return field_27289;
    }

    public boolean N() {
        return this.field_27293;
    }
}

