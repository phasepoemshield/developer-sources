/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class03865;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03897;
import minecraft.class03979;
import minecraft.class05033;

public final class class03909
extends Enum<class03909>
implements class05033 {
    public static final /* enum */ class03909 field_36562 = new class03909("interpolated");
    public static final /* enum */ class03909 field_36563 = new class03909("flat_cache");
    public static final /* enum */ class03909 field_36564 = new class03909("cache_2d");
    public static final /* enum */ class03909 field_36565 = new class03909("cache_once");
    public static final /* enum */ class03909 field_36566 = new class03909("cache_all_in_cell");
    private final String field_37088;
    final class03979<class03894> field_37089 = class03865.N(class038772 -> new class03897(this, (class03877)class038772), class03894::u);
    private static final /* synthetic */ class03909[] field_36567;

    private class03909(String string2) {
        this.field_37088 = string2;
    }

    public static class03909[] values() {
        return (class03909[])field_36567.clone();
    }

    public static class03909 valueOf(String string) {
        return Enum.valueOf(class03909.class, string);
    }

    private static /* synthetic */ class03909[] N() {
        return new class03909[]{field_36562, field_36563, field_36564, field_36565, field_36566};
    }

    public String method_15434() {
        return this.field_37088;
    }

    static {
        field_36567 = class03909.N();
    }
}

