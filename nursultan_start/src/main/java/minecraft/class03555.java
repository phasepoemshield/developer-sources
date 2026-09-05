/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class03532;
import minecraft.class03546;
import minecraft.class05033;

public final class class03555
extends Enum<class03555>
implements class05033 {
    public static final /* enum */ class03555 field_37782 = new class03555("default", class03532::N);
    public static final /* enum */ class03555 field_37783 = new class03555("legacy_type_1", class03532::u);
    public static final /* enum */ class03555 field_37784 = new class03555("legacy_type_2", class03532::L);
    public static final /* enum */ class03555 field_37785 = new class03555("legacy_type_3", class03532::y);
    public static final Codec<class03555> field_37786;
    private final String field_37787;
    private final class03546 field_37788;
    private static final /* synthetic */ class03555[] field_37789;

    private class03555(String string2, class03546 class035462) {
        this.field_37787 = string2;
        this.field_37788 = class035462;
    }

    public static class03555[] values() {
        return (class03555[])field_37789.clone();
    }

    public static class03555 valueOf(String string) {
        return Enum.valueOf(class03555.class, string);
    }

    public boolean N(long l, int n, int n2, int n3, float f) {
        return this.field_37788.shouldGenerate(l, n, n2, n3, f);
    }

    private static /* synthetic */ class03555[] N() {
        return new class03555[]{field_37782, field_37783, field_37784, field_37785};
    }

    public String method_15434() {
        return this.field_37787;
    }

    static {
        field_37789 = class03555.N();
        field_37786 = class05033.N(class03555::values);
    }
}

