/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01219
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class05235
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07221
 *  minecraft.class07536
 *  minecraft.class07746
 *  minecraft.class08052
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class05235;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07221;
import minecraft.class07536;
import minecraft.class07746;
import minecraft.class08052;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class05083
extends class01219 {
    public static final MapCodec<class05083> N = Codec.FLOAT.fieldOf("mossiness").xmap(class05083::new, class050832 -> Float.valueOf(class050832.R));
    private static final float y = 0.5f;
    private static final float L = 0.5f;
    private static final float u = 0.15f;
    private static final class00500[] i = new class00500[]{class00869.UG.W(), class00869.UO.W()};
    private final float R;

    private @Nullable class00500 L(class00500 class005002, class06069 class060692) {
        if (class060692.z() < this.R) {
            return class00869.PI.s(class005002);
        }
        return null;
    }

    public class05083(float f) {
        this.R = f;
    }

    private @Nullable class00500 y(class06069 class060692) {
        if (class060692.z() < 0.15f) {
            return class00869.TU.W();
        }
        return null;
    }

    private @Nullable class00500 y(class00500 class005002, class06069 class060692) {
        if (class060692.z() < this.R) {
            return class00869.Pb.s(class005002);
        }
        return null;
    }

    protected class05235<?> N() {
        return class05235.U;
    }

    private static class00500 N(class06069 class060692, class00500[] class00500Array) {
        return class00500Array[class060692.y(class00500Array.length)];
    }

    private @Nullable class00500 N(class00500 class005002, class06069 class060692) {
        if (class060692.z() >= 0.5f) {
            return null;
        }
        class00500[] class00500Array = new class00500[]{class00869.Pu.s(class005002), class00869.Pb.W()};
        return this.N(class060692, i, class00500Array);
    }

    private @Nullable class00500 N(class06069 class060692) {
        if (class060692.z() >= 0.5f) {
            return null;
        }
        class00500[] class00500Array = new class00500[]{class00869.Rs.W(), class05083.N(class060692, class00869.RA)};
        class00500[] class00500Array2 = new class00500[]{class00869.RP.W(), class05083.N(class060692, class00869.Pu)};
        return this.N(class060692, class00500Array, class00500Array2);
    }

    public @Nullable class01228 N(class05487 class054872, class07209 class072092, class07209 class072093, class01228 class012282, class01228 class012283, class01233 class012332) {
        class06069 class060692 = class012332.y(class012283.N());
        class00500 class005002 = class012283.y();
        class07209 class072094 = class012283.N();
        class00500 class005003 = null;
        if (class005002.N(class00869.Rm) || class005002.N(class00869.y) || class005002.N(class00869.RT)) {
            class005003 = this.N(class060692);
        } else if (class005002.N(class01210.K)) {
            class005003 = this.N(class005002, class060692);
        } else if (class005002.N(class01210.o)) {
            class005003 = this.y(class005002, class060692);
        } else if (class005002.N(class01210.q)) {
            class005003 = this.L(class005002, class060692);
        } else if (class005002.N(class00869.LV)) {
            class005003 = this.y(class060692);
        }
        if (class005003 != null) {
            return new class01228(class072094, class005003, class012283.L());
        }
        return class012283;
    }

    private static class00500 N(class06069 class060692, class00891 class008912) {
        return (class00500)((class00500)class008912.W().y((class08092)class07746.y, (Comparable)class07221.field_11062.N(class060692))).y((class08092)class07746.L, (Comparable)((class08052)class07536.N((Object[])class08052.values(), (class06069)class060692)));
    }

    private class00500 N(class06069 class060692, class00500[] class00500Array, class00500[] class00500Array2) {
        if (class060692.z() < this.R) {
            return class05083.N(class060692, class00500Array2);
        }
        return class05083.N(class060692, class00500Array);
    }
}

