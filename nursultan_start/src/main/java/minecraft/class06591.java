/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10622
 *  Nursultan.class10624
 *  minecraft.class01929
 *  minecraft.class02265
 *  minecraft.class07299
 *  minecraft.class07769
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10622;
import Nursultan.class10624;
import minecraft.class01929;
import minecraft.class02265;
import minecraft.class06580;
import minecraft.class07299;
import minecraft.class07769;
import org.jspecify.annotations.Nullable;

public interface class06591 {
    public static final class06591 N = new class06580();

    public boolean L();

    public float y();

    public @Nullable class01929 N();

    public static class06591 N(class01929 class019292) {
        return new class10622(class019292);
    }

    public static class06591 N(@Nullable class07299 class072992) {
        if (class072992 == null) {
            return N;
        }
        return new class10624(class072992);
    }

    public @Nullable class07769 N(class02265 var1);
}

