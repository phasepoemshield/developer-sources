/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;

public final class class00609
extends Enum<class00609>
implements class05033 {
    public static final /* enum */ class00609 field_63771 = new class00609("override");
    public static final /* enum */ class00609 field_63772 = new class00609("alpha_blend");
    public static final /* enum */ class00609 field_63773 = new class00609("add");
    public static final /* enum */ class00609 field_63774 = new class00609("subtract");
    public static final /* enum */ class00609 field_63775 = new class00609("multiply");
    public static final /* enum */ class00609 field_64353 = new class00609("blend_to_gray");
    public static final /* enum */ class00609 field_63776 = new class00609("minimum");
    public static final /* enum */ class00609 field_63777 = new class00609("maximum");
    public static final /* enum */ class00609 field_63778 = new class00609("and");
    public static final /* enum */ class00609 field_63779 = new class00609("nand");
    public static final /* enum */ class00609 field_63780 = new class00609("or");
    public static final /* enum */ class00609 field_63781 = new class00609("nor");
    public static final /* enum */ class00609 field_63782 = new class00609("xor");
    public static final /* enum */ class00609 field_63783 = new class00609("xnor");
    public static final Codec<class00609> field_63784;
    private final String field_63785;
    private static final /* synthetic */ class00609[] field_63786;

    private class00609(String string2) {
        this.field_63785 = string2;
    }

    public static class00609[] values() {
        return (class00609[])field_63786.clone();
    }

    public static class00609 valueOf(String string) {
        return Enum.valueOf(class00609.class, string);
    }

    private static /* synthetic */ class00609[] N() {
        return new class00609[]{field_63771, field_63772, field_63773, field_63774, field_63775, field_64353, field_63776, field_63777, field_63778, field_63779, field_63780, field_63781, field_63782, field_63783};
    }

    public String method_15434() {
        return this.field_63785;
    }

    static {
        field_63786 = class00609.N();
        field_63784 = class05033.N(class00609::values);
    }
}

