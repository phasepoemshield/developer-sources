/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06541
 */
package minecraft;

import minecraft.class06541;

public final class class01286
extends Enum<class01286> {
    public static final /* enum */ class01286 field_18271 = new class01286(class06541.field_1078);
    public static final /* enum */ class01286 field_18272 = new class01286(class06541.field_1061);
    public static final /* enum */ class01286 field_18273 = new class01286(class06541.field_1078);
    private final class06541 field_18274;
    private static final /* synthetic */ class01286[] field_18275;

    private class01286(class06541 class065412) {
        this.field_18274 = class065412;
    }

    public static class01286[] values() {
        return (class01286[])field_18275.clone();
    }

    public static class01286 valueOf(String string) {
        return Enum.valueOf(class01286.class, string);
    }

    private static /* synthetic */ class01286[] y() {
        return new class01286[]{field_18271, field_18272, field_18273};
    }

    public class06541 N() {
        return this.field_18274;
    }

    static {
        field_18275 = class01286.y();
    }
}

