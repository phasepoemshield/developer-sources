/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class03831
 *  minecraft.class04003
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class06244
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class03831;
import minecraft.class04003;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class06244;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07438;

public class class03616
extends class05765<class04003> {
    private static final int y = 15;
    private static final int L = 20;
    private static final double u = 0.5;
    private static final double i = 2.5;
    public static final int N = 40;
    private static final int R = class04995.L((double)34.0);
    private static final int Z = class04995.u((float)60.0f);

    protected void L(class04782 class047822, class04003 class040032, long l) {
        class040032.method_18868().L(class05378.s).ifPresent(class074382 -> class040032.p().N(class074382.method_73189()));
        if (class040032.method_18868().N(class05378.Nx) || class040032.method_18868().N(class05378.NS)) {
            return;
        }
        class040032.method_18868().N(class05378.NS, (Object)class06244.field_17274, (long)(Z - R));
        class040032.method_18868().L(class05378.s).filter(arg_0 -> ((class04003)class040032).L(arg_0)).filter(class074382 -> class040032.method_43259((class07049)class074382, 15.0, 20.0)).ifPresent(class074382 -> {
            class06889 class068892 = class040032.method_73189().i(class040032.method_56072().y(class03831.field_48320, 0, class040032.method_36454()));
            class06889 class068893 = class074382.method_33571().u(class068892);
            class06889 class068894 = class068893.u();
            int n = class04995.N((double)class068893.M()) + 7;
            for (int i = 1; i < n; ++i) {
                class06889 class068895 = class068892.i(class068894.L((double)i));
                class047822.method_65096((class07126)class07107.Q, class068895.M, class068895.B, class068895.Z, 1, 0.0, 0.0, 0.0, 0.0);
            }
            class040032.method_5783(class04909.Is, 3.0f, 1.0f);
            if (class074382.method_64397(class047822, class047822.method_48963().i((class07049)class040032), 10.0f)) {
                double d = 0.5 * (1.0 - class074382.method_45325(class05298.b));
                double d2 = 2.5 * (1.0 - class074382.method_45325(class05298.b));
                class074382.method_5762(class068894.N() * d2, class068894.y() * d, class068894.L() * d2);
            }
        });
    }

    public class03616() {
        super((Map)ImmutableMap.of((Object)class05378.s, (Object)class05367.field_18456, (Object)class05378.NC, (Object)class05367.field_18457, (Object)class05378.NS, (Object)class05367.field_18458, (Object)class05378.Nx, (Object)class05367.field_18458), Z);
    }

    protected void u(class04782 class047822, class04003 class040032, long l) {
        class03616.N((class07438)class040032, 40);
    }

    protected void y(class04782 class047822, class04003 class040032, long l) {
        class040032.method_18868().N(class05378.T, (Object)true, (long)Z);
        class040032.method_18868().N(class05378.Nx, (Object)class06244.field_17274, (long)R);
        class047822.method_8421((class07049)class040032, (byte)62);
        class040032.method_5783(class04909.IT, 3.0f, 1.0f);
    }

    public static void N(class07438 class074382, int n) {
        class074382.method_18868().N(class05378.NC, (Object)class06244.field_17274, (long)n);
    }

    protected boolean N(class04782 class047822, class04003 class040032, long l) {
        return true;
    }

    protected boolean N(class04782 class047822, class04003 class040032) {
        return class040032.method_43259((class07049)class040032.method_18868().L(class05378.s).get(), 15.0, 20.0);
    }
}

