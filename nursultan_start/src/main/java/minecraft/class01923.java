/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09542
 *  minecraft.class04690
 *  minecraft.class05237
 *  minecraft.class05247
 *  minecraft.class05272
 *  minecraft.class08247
 *  minecraft.class08280
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09542;
import java.util.function.Supplier;
import minecraft.class01907;
import minecraft.class04690;
import minecraft.class05237;
import minecraft.class05247;
import minecraft.class05272;
import minecraft.class08247;
import minecraft.class08280;
import org.jspecify.annotations.Nullable;

public final class class01923
extends Enum<class01923>
implements class05247 {
    public static final /* enum */ class01923 field_37898 = new class01923(() -> class01923.N(5, 8, (n, n2) -> -1));
    public static final /* enum */ class01923 field_37899 = new class01923(() -> {
        int n3 = 5;
        int n4 = 8;
        return class01923.N(5, 8, (n, n2) -> n == 0 || n + 1 == 5 || n2 == 0 || n2 + 1 == 8 ? -1 : 0);
    });
    final class08280 field_37900;
    private static final /* synthetic */ class01923[] field_37901;

    private class01923(Supplier<class08280> supplier) {
        this.field_37900 = supplier.get();
    }

    public static class01923[] values() {
        return (class01923[])field_37901.clone();
    }

    public static class01923 valueOf(String string) {
        return Enum.valueOf(class01923.class, string);
    }

    private static /* synthetic */ class01923[] i() {
        return new class01923[]{field_37898, field_37899};
    }

    private static class08280 N(int n, int n2, class09542 class095422) {
        class08280 class082802 = new class08280(class08247.field_4997, n, n2, false);
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                class082802.y(j, i, class095422.getColor(j, i));
            }
        }
        class082802.M();
        return class082802;
    }

    public @Nullable class05272 N(class04690 class046902) {
        return class046902.N((class05247)this, (class05237)new class01907(this));
    }

    public float getAdvance() {
        return this.field_37900.N() + 1;
    }

    static {
        field_37901 = class01923.i();
    }
}

