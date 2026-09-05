/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02795
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06071
 *  minecraft.class06078
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class07637
 *  minecraft.class07645
 *  minecraft.class08476
 *  minecraft.class08482
 *  minecraft.class08837
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02740;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06071;
import minecraft.class06078;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class07637;
import minecraft.class07645;
import minecraft.class08476;
import minecraft.class08482;
import minecraft.class08837;
import minecraft.class08943;
import org.joml.Quaternionfc;

public class class02707
extends class02795<class07637, class08482, class06071> {
    private static final Map<class07645, class01894> N = Maps.newEnumMap(Map.of(class07645.field_6788, class01894.y((String)"textures/entity/panda/panda.png"), class07645.field_6794, class01894.y((String)"textures/entity/panda/lazy_panda.png"), class07645.field_6795, class01894.y((String)"textures/entity/panda/worried_panda.png"), class07645.field_6791, class01894.y((String)"textures/entity/panda/playful_panda.png"), class07645.field_6792, class01894.y((String)"textures/entity/panda/brown_panda.png"), class07645.field_6793, class01894.y((String)"textures/entity/panda/weak_panda.png"), class07645.field_6789, class01894.y((String)"textures/entity/panda/aggressive_panda.png")));

    public class02707(class04832 class048322) {
        super(class048322, (class06078)new class06071(class048322.N(class04802.LE)), (class06078)new class06071(class048322.N(class04802.LW)), 0.9f);
        this.N(new class02740((class06252<class08482, class06071>)this));
    }

    public class08482 method_55269() {
        return new class08482();
    }

    public void method_62354(class07637 class076372, class08482 class084822, float f) {
        super.method_62354((class07438)class076372, (class08476)class084822, f);
        class08837.N((class07438)class076372, (class08837)class084822, (class08943)this.L);
        class084822.N = class076372.Y();
        class084822.y = class076372.B() > 0;
        class084822.L = class076372.W();
        class084822.u = class076372.t();
        class084822.i = class076372.n();
        class084822.R = class076372.Ng();
        class084822.M = class076372.m();
        class084822.B = class076372.u(f);
        class084822.Z = class076372.i(f);
        class084822.g = class076372.method_6109() ? 0.0f : class076372.R(f);
        class084822.I = class076372.i > 0 ? (float)class076372.i + f : 0.0f;
    }

    protected void y(class08482 class084822, class01421 class014212, float f, float f2) {
        float f3;
        float f4;
        super.y((class08476)class084822, class014212, f, f2);
        if (class084822.I > 0.0f) {
            float f5;
            f4 = class04995.M((float)class084822.I);
            int n = class04995.y((float)class084822.I);
            int n2 = n + 1;
            float f6 = 7.0f;
            float f7 = f5 = class084822.NB ? 0.3f : 0.8f;
            if ((float)n < 8.0f) {
                float f8 = 90.0f * (float)n / 7.0f;
                float f9 = 90.0f * (float)n2 / 7.0f;
                float f10 = this.N(f8, f9, n2, f4, 8.0f);
                class014212.N(0.0f, (f5 + 0.2f) * (f10 / 90.0f), 0.0f);
                class014212.N((Quaternionfc)class02058.y.N(-f10));
            } else if ((float)n < 16.0f) {
                float f11 = ((float)n - 8.0f) / 7.0f;
                float f12 = 90.0f + 90.0f * f11;
                float f13 = 90.0f + 90.0f * ((float)n2 - 8.0f) / 7.0f;
                float f14 = this.N(f12, f13, n2, f4, 16.0f);
                class014212.N(0.0f, f5 + 0.2f + (f5 - 0.2f) * (f14 - 90.0f) / 90.0f, 0.0f);
                class014212.N((Quaternionfc)class02058.y.N(-f14));
            } else if ((float)n < 24.0f) {
                float f15 = ((float)n - 16.0f) / 7.0f;
                float f16 = 180.0f + 90.0f * f15;
                float f17 = 180.0f + 90.0f * ((float)n2 - 16.0f) / 7.0f;
                float f18 = this.N(f16, f17, n2, f4, 24.0f);
                class014212.N(0.0f, f5 + f5 * (270.0f - f18) / 90.0f, 0.0f);
                class014212.N((Quaternionfc)class02058.y.N(-f18));
            } else if (n < 32) {
                float f19 = ((float)n - 24.0f) / 7.0f;
                float f20 = 270.0f + 90.0f * f19;
                float f21 = 270.0f + 90.0f * ((float)n2 - 24.0f) / 7.0f;
                float f22 = this.N(f20, f21, n2, f4, 32.0f);
                class014212.N(0.0f, f5 * ((360.0f - f22) / 90.0f), 0.0f);
                class014212.N((Quaternionfc)class02058.y.N(-f22));
            }
        }
        if ((f4 = class084822.B) > 0.0f) {
            class014212.N(0.0f, 0.8f * f4, 0.0f);
            class014212.N((Quaternionfc)class02058.y.N(class04995.B((float)f4, (float)class084822.h, (float)(class084822.h + 90.0f))));
            class014212.N(0.0f, -1.0f * f4, 0.0f);
            if (class084822.R) {
                float f23 = (float)(Math.cos(class084822.P * 1.25f) * Math.PI * (double)0.05f);
                class014212.N((Quaternionfc)class02058.u.N(f23));
                if (class084822.NB) {
                    class014212.N(0.0f, 0.8f, 0.55f);
                }
            }
        }
        if ((f3 = class084822.Z) > 0.0f) {
            float f24 = class084822.NB ? 0.5f : 1.3f;
            class014212.N(0.0f, f24 * f3, 0.0f);
            class014212.N((Quaternionfc)class02058.y.N(class04995.B((float)f3, (float)class084822.h, (float)(class084822.h + 180.0f))));
        }
    }

    private float N(float f, float f2, int n, float f3, float f4) {
        if ((float)n < f4) {
            return class04995.B((float)f3, (float)f, (float)f2);
        }
        return f;
    }

    public class01894 N(class08482 class084822) {
        return N.getOrDefault(class084822.N, N.get(class07645.field_6788));
    }
}

