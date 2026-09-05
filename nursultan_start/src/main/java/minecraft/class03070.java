/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07050
 */
package minecraft;

import minecraft.class07050;

final class class03070
extends Enum<class03070> {
    public static final /* enum */ class03070 field_28384 = new class03070(true, true);
    public static final /* enum */ class03070 field_28385 = new class03070(true, false);
    public static final /* enum */ class03070 field_28386 = new class03070(false, true);
    final boolean field_28387;
    final boolean field_28388;
    private static final /* synthetic */ class03070[] field_28389;

    private class03070(boolean bl, boolean bl2) {
        this.field_28387 = bl;
        this.field_28388 = bl2;
    }

    static {
        field_28389 = class03070.N();
    }

    public static class03070[] values() {
        return (class03070[])field_28389.clone();
    }

    public static class03070 valueOf(String string) {
        return Enum.valueOf(class03070.class, string);
    }

    private static /* synthetic */ class03070[] N() {
        return new class03070[]{field_28384, field_28385, field_28386};
    }

    public static class03070 N(class07050 class070502) {
        return class070502 == class07050.field_5808 ? field_28385 : field_28386;
    }
}

