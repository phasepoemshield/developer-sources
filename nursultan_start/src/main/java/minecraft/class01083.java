/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10944
 *  minecraft.class00768
 *  minecraft.class01237
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01583
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02265
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06851
 *  minecraft.class07769
 *  minecraft.class08117
 *  minecraft.class08265
 *  minecraft.class08270
 *  minecraft.class08388
 *  minecraft.class08589
 *  minecraft.class08626
 *  org.joml.Quaternionfc
 */
package minecraft;

import Nursultan.class10944;
import java.util.Objects;
import minecraft.class00768;
import minecraft.class01237;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01583;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02265;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06851;
import minecraft.class07769;
import minecraft.class08117;
import minecraft.class08265;
import minecraft.class08270;
import minecraft.class08388;
import minecraft.class08589;
import minecraft.class08626;
import org.joml.Quaternionfc;

public class class01083 {
    private static final float L = -0.01f;
    private static final float u = -0.001f;
    public static final int N = 128;
    public static final int y = 128;
    private final class08626 i;
    private final class08265 R;

    public class01083(class08117 class081172, class08265 class082652) {
        this.i = class081172.N(class08589.Z);
        this.R = class082652;
    }

    private class10944 N(class00768 class007682) {
        class10944 class109442 = new class10944();
        class109442.N = this.i.N(class007682.N());
        class109442.y = class007682.u();
        class109442.L = class007682.i();
        class109442.u = class007682.R();
        class109442.R = class007682.M().orElse(null);
        class109442.i = class007682.y();
        return class109442;
    }

    public void N(class02265 class022652, class07769 class077692, class08270 class082702) {
        class082702.N = this.R.y(class022652, class077692);
        class082702.y.clear();
        for (class00768 class007682 : class077692.i()) {
            class082702.y.add(this.N(class007682));
        }
    }

    public void N(class08270 class082702, class01421 class014212, class01237 class012372, boolean bl, int n) {
        class012372.N(class014212, class06851.n((class01894)class082702.N), (class01423 class014232, class01391 class013912) -> {
            class013912.N(class014232, 0.0f, 128.0f, -0.01f).method_39415(-1).method_22913(0.0f, 1.0f).method_60803(n);
            class013912.N(class014232, 128.0f, 128.0f, -0.01f).method_39415(-1).method_22913(1.0f, 1.0f).method_60803(n);
            class013912.N(class014232, 128.0f, 0.0f, -0.01f).method_39415(-1).method_22913(1.0f, 0.0f).method_60803(n);
            class013912.N(class014232, 0.0f, 0.0f, -0.01f).method_39415(-1).method_22913(0.0f, 0.0f).method_60803(n);
        });
        int n2 = 0;
        for (class10944 class109442 : class082702.y) {
            if (bl && !class109442.i) continue;
            class014212.N();
            class014212.N((float)class109442.y / 2.0f + 64.0f, (float)class109442.L / 2.0f + 64.0f, -0.02f);
            class014212.N((Quaternionfc)class02058.R.N((float)(class109442.u * 360) / 16.0f));
            class014212.y(4.0f, 4.0f, 3.0f);
            class014212.N(-0.125f, 0.125f, 0.0f);
            class08388 class083882 = class109442.N;
            if (class083882 != null) {
                float f = (float)n2 * -0.001f;
                class012372.N(class014212, class06851.n((class01894)class083882.method_45852()), (class01423 class014232, class01391 class013912) -> {
                    class013912.N(class014232, -1.0f, 1.0f, f).method_39415(-1).method_22913(class083882.method_4594(), class083882.method_4593()).method_60803(n);
                    class013912.N(class014232, 1.0f, 1.0f, f).method_39415(-1).method_22913(class083882.method_4577(), class083882.method_4593()).method_60803(n);
                    class013912.N(class014232, 1.0f, -1.0f, f).method_39415(-1).method_22913(class083882.method_4577(), class083882.method_4575()).method_60803(n);
                    class013912.N(class014232, -1.0f, -1.0f, f).method_39415(-1).method_22913(class083882.method_4594(), class083882.method_4575()).method_60803(n);
                });
                class014212.y();
            }
            if (class109442.R != null) {
                class01590 class015902 = (class01590)class06202.Nq().i_3;
                float f = class015902.N((class05936)class109442.R);
                float f2 = 25.0f / f;
                Objects.requireNonNull(class015902);
                float f3 = class04995.N((float)f2, (float)0.0f, (float)(6.0f / 9.0f));
                class014212.N();
                class014212.N((float)class109442.y / 2.0f + 64.0f - f * f3 / 2.0f, (float)class109442.L / 2.0f + 64.0f + 4.0f, -0.025f);
                class014212.y(f3, f3, -1.0f);
                class014212.N(0.0f, 0.0f, 0.1f);
                class012372.N(1).N(class014212, 0.0f, 0.0f, class109442.R.method_30937(), false, class01583.field_33993, n, -1, Integer.MIN_VALUE, 0);
                class014212.y();
            }
            ++n2;
        }
    }
}

