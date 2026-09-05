/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01188
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class02058
 *  minecraft.class02484
 *  minecraft.class04995
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07070
 *  minecraft.class08173
 *  minecraft.class08174
 *  minecraft.class08467
 *  minecraft.class08827
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01188;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class02058;
import minecraft.class02484;
import minecraft.class04995;
import minecraft.class06584;
import minecraft.class06718;
import minecraft.class07050;
import minecraft.class07070;
import minecraft.class08173;
import minecraft.class08174;
import minecraft.class08467;
import minecraft.class08827;
import org.joml.Quaternionfc;

public class class06733 {
    public static <S extends class08827> void N(S s, class01421 class014212) {
        if (s.NX <= 0.0f) {
            return;
        }
        class08174 class081742 = (class08174)s.i().method_58694(class02484.X);
        float f = class081742 != null ? class081742.M() : 0.0f;
        float f2 = 0.125f;
        float f3 = s.NX;
        float f4 = class08173.w((float)class06733.N(f3, 0.05f, 0.2f));
        float f5 = class08173.d((float)class06733.N(f3, 0.4f, 1.0f));
        class014212.N((Quaternionfc)class02058.N.N(70.0f * (f4 - f5)), 0.0f, -0.125f, 0.125f);
        class014212.N(0.0f, f * (f4 - f5), 0.0f);
    }

    private static float N(float f) {
        return 0.4f * (class08173.G((float)class06733.N(f, 1.0f, 3.0f)) - class08173.n((float)class06733.N(f, 3.0f, 10.0f)));
    }

    public static void N(float f, class01421 class014212, float f2, class07070 class070702, class06584 class065842) {
        class08174 class081742 = (class08174)class065842.method_58694(class02484.X);
        if (class081742 == null) {
            return;
        }
        class06718 class067182 = class06718.N(class081742, f2);
        int n = class070702 == class07070.field_6183 ? 1 : -1;
        class014212.N((double)((float)n * (class067182.N() * 0.15f + class067182.u() * -0.05f + class067182.i() * -0.1f + class067182.Z() * 0.005f)), (double)(class067182.N() * -0.075f + class067182.L() * 0.075f + class067182.z() * 0.01f), (double)class067182.y() * 0.05 + (double)class067182.u() * -0.05 + (double)(class067182.Z() * 0.005f));
        class014212.N((Quaternionfc)class02058.y.N(-65.0f * class08173.O((float)class067182.N()) - 35.0f * class067182.R() + 100.0f * class067182.M() + -0.5f * class067182.z()), 0.0f, 0.1f, 0.0f);
        class014212.N((Quaternionfc)class02058.L.N((float)n * (-90.0f * class06733.N(class067182.N(), 0.5f, 0.55f) + 90.0f * class067182.i() + 2.0f * class067182.Z())), (float)n * 0.15f, 0.0f, 0.0f);
        class014212.N(0.0f, -class06733.N(f), 0.0f);
    }

    public static void N(float f, class01421 class014212, int n, class07070 class070702) {
        float f2 = class08173.n((float)class06733.N(f, 0.0f, 0.05f));
        float f3 = class08173.t((float)class06733.N(f, 0.05f, 0.2f));
        float f4 = class08173.d((float)class06733.N(f, 0.4f, 1.0f));
        class014212.N((float)n * 0.1f * (f2 - f3), -0.075f * (f2 - f4), 0.65f * (f2 - f3));
        class014212.N((Quaternionfc)class02058.y.N(-70.0f * (f2 - f4)));
        class014212.N(0.0, 0.0, -0.25 * (double)(f4 - f3));
    }

    static float N(float f, float f2, float f3) {
        return class04995.N((float)class04995.R((float)f, (float)f2, (float)f3), (float)0.0f, (float)1.0f);
    }

    public static <T extends class08467> void N(class01686 class016862, class01686 class016863, boolean bl, class06584 class065842, T t) {
        int n = bl ? 1 : -1;
        class016862.R = -0.1f * (float)n + class016863.R;
        class016862.i = -1.5707964f + class016863.i + 0.8f;
        if (t.g || t.L > 0.0f) {
            class016862.i -= 0.9599311f;
        }
        class016862.R = (float)Math.PI / 180 * Math.clamp((float)(57.295776f * class016862.R), (float)-60.0f, (float)60.0f);
        class016862.i = (float)Math.PI / 180 * Math.clamp((float)(57.295776f * class016862.i), (float)-120.0f, (float)30.0f);
        if (t.R <= 0.0f || t.o && t.B != (bl ? class07050.field_5808 : class07050.field_5810)) {
            return;
        }
        class08174 class081742 = (class08174)class065842.method_58694(class02484.X);
        if (class081742 == null) {
            return;
        }
        class06718 class067182 = class06718.N(class081742, t.R);
        class016862.R += (float)(-n) * class067182.z() * ((float)Math.PI / 180) * class067182.B() * 1.0f;
        class016862.M += (float)(-n) * class067182.Z() * ((float)Math.PI / 180) * class067182.B() * 0.5f;
        class016862.i += (float)Math.PI / 180 * (-40.0f * class067182.y() + 30.0f * class067182.L() + -20.0f * class067182.u() + 20.0f * class067182.R() + 10.0f * class067182.M() + 0.6f * class067182.Z() * class067182.B());
    }

    public static <S extends class08827> void N(S s, class01421 class014212, float f, class07070 class070702, class06584 class065842) {
        class08174 class081742 = (class08174)class065842.method_58694(class02484.X);
        if (class081742 == null || f == 0.0f) {
            return;
        }
        float f2 = class08173.w((float)class06733.N(s.NX, 0.05f, 0.2f));
        float f3 = class08173.d((float)class06733.N(s.NX, 0.4f, 1.0f));
        class06718 class067182 = class06718.N(class081742, f);
        int n = class070702 == class07070.field_6183 ? 1 : -1;
        float f4 = 1.0f - class08173.t((float)(1.0f - class067182.N()));
        float f5 = 0.125f;
        float f6 = class06733.N(s.Ni);
        class014212.N(0.0, (double)(-f6) * 0.4, (double)(-class081742.M() * (f4 - class067182.M()) + f6));
        class014212.N((Quaternionfc)class02058.N.N(70.0f * (class067182.N() - class067182.M()) - 40.0f * (f2 - f3)), 0.0f, -0.03125f, 0.125f);
        class014212.N((Quaternionfc)class02058.u.N((float)(n * 90) * (class067182.N() - class067182.i() + 3.0f * f3 + f2)), 0.0f, 0.0f, 0.125f);
    }

    public static <T extends class08467> void N(class01188<T> class011882, T t) {
        float f = t.NX;
        class07070 class070702 = t.M;
        class011882.z.R -= class011882.Z.R;
        class011882.U.R -= class011882.Z.R;
        class011882.U.i -= class011882.Z.R;
        float f2 = class08173.n((float)class06733.N(f, 0.0f, 0.05f));
        float f3 = class08173.w((float)class06733.N(f, 0.05f, 0.2f));
        float f4 = class08173.d((float)class06733.N(f, 0.4f, 1.0f));
        class011882.N((class07070)class070702).i += (90.0f * f2 - 120.0f * f3 + 30.0f * f4) * ((float)Math.PI / 180);
    }
}

