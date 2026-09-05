/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00392;
import minecraft.class05033;

public final class class08030
extends Enum<class08030>
implements class05033 {
    public static final /* enum */ class08030 field_7559 = new class08030(0, "cape");
    public static final /* enum */ class08030 field_7564 = new class08030(1, "jacket");
    public static final /* enum */ class08030 field_7568 = new class08030(2, "left_sleeve");
    public static final /* enum */ class08030 field_7570 = new class08030(3, "right_sleeve");
    public static final /* enum */ class08030 field_7566 = new class08030(4, "left_pants_leg");
    public static final /* enum */ class08030 field_7565 = new class08030(5, "right_pants_leg");
    public static final /* enum */ class08030 field_7563 = new class08030(6, "hat");
    public static final Codec<class08030> field_62532;
    private final int field_7561;
    private final int field_7560;
    private final String field_7569;
    private final class00392 field_7567;
    private static final /* synthetic */ class08030[] field_7562;

    public String L() {
        return this.field_7569;
    }

    private class08030(int n2, String string2) {
        this.field_7561 = n2;
        this.field_7560 = 1 << n2;
        this.field_7569 = string2;
        this.field_7567 = class00392.L((String)("options.modelPart." + string2));
    }

    public static class08030[] values() {
        return (class08030[])field_7562.clone();
    }

    public static class08030 valueOf(String string) {
        return Enum.valueOf(class08030.class, string);
    }

    private static /* synthetic */ class08030[] i() {
        return new class08030[]{field_7559, field_7564, field_7568, field_7570, field_7566, field_7565, field_7563};
    }

    public class00392 u() {
        return this.field_7567;
    }

    public int y() {
        return this.field_7561;
    }

    public int N() {
        return this.field_7560;
    }

    public String method_15434() {
        return this.field_7569;
    }

    static {
        field_7562 = class08030.i();
        field_62532 = class05033.N(class08030::values);
    }
}

