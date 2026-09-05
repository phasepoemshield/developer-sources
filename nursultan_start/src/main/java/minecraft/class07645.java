/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class05033
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class05033;
import minecraft.class06069;

public final class class07645
extends Enum<class07645>
implements class05033 {
    public static final /* enum */ class07645 field_6788 = new class07645(0, "normal", false);
    public static final /* enum */ class07645 field_6794 = new class07645(1, "lazy", false);
    public static final /* enum */ class07645 field_6795 = new class07645(2, "worried", false);
    public static final /* enum */ class07645 field_6791 = new class07645(3, "playful", false);
    public static final /* enum */ class07645 field_6792 = new class07645(4, "brown", true);
    public static final /* enum */ class07645 field_6793 = new class07645(5, "weak", true);
    public static final /* enum */ class07645 field_6789 = new class07645(6, "aggressive", false);
    public static final Codec<class07645> field_41673;
    private static final IntFunction<class07645> field_6786;
    private static final int field_30350 = 6;
    private final int field_6785;
    private final String field_6797;
    private final boolean field_6790;
    private static final /* synthetic */ class07645[] field_6796;

    private static /* synthetic */ class07645[] L() {
        return new class07645[]{field_6788, field_6794, field_6795, field_6791, field_6792, field_6793, field_6789};
    }

    private class07645(int n2, String string2, boolean bl) {
        this.field_6785 = n2;
        this.field_6797 = string2;
        this.field_6790 = bl;
    }

    public static class07645[] values() {
        return (class07645[])field_6796.clone();
    }

    public static class07645 valueOf(String string) {
        return Enum.valueOf(class07645.class, string);
    }

    public boolean y() {
        return this.field_6790;
    }

    public static class07645 N(int n) {
        return field_6786.apply(n);
    }

    public static class07645 N(class06069 class060692) {
        int n = class060692.y(16);
        if (n == 0) {
            return field_6794;
        }
        if (n == 1) {
            return field_6795;
        }
        if (n == 2) {
            return field_6791;
        }
        if (n == 4) {
            return field_6789;
        }
        if (n < 9) {
            return field_6793;
        }
        if (n < 11) {
            return field_6792;
        }
        return field_6788;
    }

    static class07645 N(class07645 class076452, class07645 class076453) {
        if (class076452.y()) {
            if (class076452 == class076453) {
                return class076452;
            }
            return field_6788;
        }
        return class076452;
    }

    public int N() {
        return this.field_6785;
    }

    public String method_15434() {
        return this.field_6797;
    }

    static {
        field_6796 = class07645.L();
        field_41673 = class05033.N(class07645::values);
        field_6786 = class02121.N(class07645::N, (Object[])class07645.values(), (class02126)class02126.field_41664);
    }
}

