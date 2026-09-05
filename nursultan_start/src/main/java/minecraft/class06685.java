/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  minecraft.class06541
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;
import minecraft.class06541;

public final class class06685
extends Enum<class06685>
implements class05033 {
    public static final /* enum */ class06685 field_5788 = new class06685("pink", class06541.field_1061);
    public static final /* enum */ class06685 field_5780 = new class06685("blue", class06541.field_1078);
    public static final /* enum */ class06685 field_5784 = new class06685("red", class06541.field_1079);
    public static final /* enum */ class06685 field_5785 = new class06685("green", class06541.field_1060);
    public static final /* enum */ class06685 field_5782 = new class06685("yellow", class06541.field_1054);
    public static final /* enum */ class06685 field_5783 = new class06685("purple", class06541.field_1058);
    public static final /* enum */ class06685 field_5786 = new class06685("white", class06541.field_1068);
    public static final Codec<class06685> field_56628;
    private final String field_5781;
    private final class06541 field_5787;
    private static final /* synthetic */ class06685[] field_5789;

    private static /* synthetic */ class06685[] L() {
        return new class06685[]{field_5788, field_5780, field_5784, field_5785, field_5782, field_5783, field_5786};
    }

    private class06685(String string2, class06541 class065412) {
        this.field_5781 = string2;
        this.field_5787 = class065412;
    }

    static {
        field_5789 = class06685.L();
        field_56628 = class05033.N(class06685::values);
    }

    public static class06685[] values() {
        return (class06685[])field_5789.clone();
    }

    public static class06685 valueOf(String string) {
        return Enum.valueOf(class06685.class, string);
    }

    public String y() {
        return this.field_5781;
    }

    public class06541 N() {
        return this.field_5787;
    }

    public String method_15434() {
        return this.field_5781;
    }
}

