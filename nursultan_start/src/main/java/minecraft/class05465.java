/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public abstract class class05465
extends class00891 {
    public static final int N = 3;
    public static final class06667 y = class06665.n;

    public static boolean T(class00500 class005002) {
        return class005002.y((class08092)y) && (class005002.N(class01210.C) || class005002.N(class01210.yl)) && (Boolean)class005002.L((class08092)y) != false;
    }

    protected class05465(class01362 class013622) {
        super(class013622);
    }

    protected boolean b(class00500 class005002) {
        return (Boolean)class005002.L((class08092)y) == false;
    }

    protected abstract Iterable<class06889> U(class00500 var1);

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        if (class073072.M() && ((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class05465.N(null, class005002, (class07284)class047822, class072092);
        }
        super.N(class005002, class047822, class072092, class073072, biConsumer);
    }

    private static void N(class07284 class072842, class00500 class005002, class07209 class072092, boolean bl) {
        class072842.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(bl)), 11);
    }

    protected abstract MapCodec<? extends class05465> N();

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        if (!class072992.method_8608() && class080052.method_5809() && this.b(class005002)) {
            class05465.N((class07284)class072992, class005002, class061832.u(), true);
        }
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return;
        }
        this.U(class005002).forEach(class068892 -> class05465.N(class072992, class068892.y((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260()), class060692));
    }

    private static void N(class07299 class072992, class06889 class068892, class06069 class060692) {
        float f = class060692.z();
        if (f < 0.3f) {
            class072992.method_8406((class07126)class07107.NZ, class068892.M, class068892.B, class068892.Z, 0.0, 0.0, 0.0);
            if (f < 0.17f) {
                class072992.method_8486(class068892.M + 0.5, class068892.B + 0.5, class068892.Z + 0.5, class04909.iU, class04911.field_15245, 1.0f + class060692.z(), class060692.z() * 0.7f + 0.3f, false);
            }
        }
        class072992.method_8406((class07126)class07107.Nc, class068892.M, class068892.B, class068892.Z, 0.0, 0.0, 0.0);
    }

    public static void N(@Nullable class08036 class080362, class00500 class005002, class07284 class072842, class07209 class072092) {
        class05465.N(class072842, class005002, class072092, false);
        if (class005002.i() instanceof class05465) {
            ((class05465)class005002.i()).U(class005002).forEach(class068892 -> class072842.method_8406((class07126)class07107.NZ, (double)class072092.method_10263() + class068892.N(), (double)class072092.method_10264() + class068892.y(), (double)class072092.method_10260() + class068892.L(), 0.0, (double)0.1f, 0.0));
        }
        class072842.method_8396(null, class072092, class04909.iW, class04911.field_15245, 1.0f, 1.0f);
        class072842.N((class07049)class080362, (class03556)class01194.L, class072092);
    }
}

