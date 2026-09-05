/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00693
 *  minecraft.class00698
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class03063
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07311
 *  minecraft.class08388
 *  minecraft.class08449
 *  minecraft.class08589
 *  minecraft.class08626
 *  minecraft.class08800
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00693;
import minecraft.class00698;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class03063;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07311;
import minecraft.class08388;
import minecraft.class08449;
import minecraft.class08589;
import minecraft.class08626;
import minecraft.class08800;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02814
extends class04507<class00698, class08449> {
    private static final class01894 N = class01894.y((String)"back");
    private final class08626 y;

    public class02814(class04832 class048322) {
        super(class048322);
        this.y = class048322.N(class08589.z);
    }

    public void N(class08449 class084492, class01421 class014212, class01237 class012372, class06959 class069592, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().renderSettings.painting) {
            callbackInfo.cancel();
        }
    }

    private void N(class01423 class014232, class01391 class013912, float f, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4) {
        class013912.N(class014232, f, f2, f5).method_39415(-1).method_22913(f3, f4).method_22922(class01384.u).method_60803(n4).y(class014232, (float)n, (float)n2, (float)n3);
    }

    public class08449 method_55269() {
        return new class08449();
    }

    public void method_3936(class08449 class084492, class01421 class014212, class01237 class012372, class06959 class069592) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class084492, class014212, class012372, class069592, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class00693 class006932 = class084492.y;
        if (class006932 == null) {
            return;
        }
        class014212.N();
        class014212.N((Quaternionfc)class02058.u.N((float)(180 - class084492.N.u() * 90)));
        class08388 class083882 = this.y.N(class006932.u());
        class08388 class083883 = this.y.N(N);
        this.N(class014212, class012372, class06851.i((class01894)class083883.method_45852()), class084492.L, class006932.y(), class006932.L(), class083882, class083883);
        class014212.y();
        super.method_3936((class08800)class084492, class014212, class012372, class069592);
    }

    public void method_62354(class00698 class006982, class08449 class084492, float f) {
        super.method_62354((class07049)class006982, (class08800)class084492, f);
        class07211 class072112 = class006982.method_5735();
        class00693 class006932 = (class00693)class006982.R().N();
        class084492.N = class072112;
        class084492.y = class006932;
        int n = class006932.y();
        int n2 = class006932.L();
        if (class084492.L.length != n * n2) {
            class084492.L = new int[n * n2];
        }
        float f2 = (float)(-n) / 2.0f;
        float f3 = (float)(-n2) / 2.0f;
        class07299 class072992 = class006982.method_73183();
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                float f4 = (float)j + f2 + 0.5f;
                float f5 = (float)i + f3 + 0.5f;
                int n3 = class006982.method_31477();
                int n4 = class04995.N((double)(class006982.method_23318() + (double)f5));
                int n5 = class006982.method_31479();
                switch (class072112) {
                    case field_11043: {
                        n3 = class04995.N((double)(class006982.method_23317() + (double)f4));
                        break;
                    }
                    case field_11039: {
                        n5 = class04995.N((double)(class006982.method_23321() - (double)f4));
                        break;
                    }
                    case field_11035: {
                        n3 = class04995.N((double)(class006982.method_23317() - (double)f4));
                        break;
                    }
                    case field_11034: {
                        n5 = class04995.N((double)(class006982.method_23321() + (double)f4));
                    }
                }
                class084492.L[j + i * n] = class03063.N((class07295)class072992, (class07209)new class07209(n3, n4, n5));
            }
        }
    }

    private void N(class01421 class014212, class01237 class012372, class07311 class073112, int[] nArray, int n, int n2, class08388 class083882, class08388 class083883) {
        class012372.N(class014212, class073112, (class014232, class013912) -> {
            float f = (float)(-n) / 2.0f;
            float f2 = (float)(-n2) / 2.0f;
            float f3 = 0.03125f;
            float f4 = class083883.method_4594();
            float f5 = class083883.method_4577();
            float f6 = class083883.method_4593();
            float f7 = class083883.method_4575();
            float f8 = class083883.method_4594();
            float f9 = class083883.method_4577();
            float f10 = class083883.method_4593();
            float f11 = class083883.method_4570(0.0625f);
            float f12 = class083883.method_4594();
            float f13 = class083883.method_4580(0.0625f);
            float f14 = class083883.method_4593();
            float f15 = class083883.method_4575();
            double d = 1.0 / (double)n;
            double d2 = 1.0 / (double)n2;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n2; ++j) {
                    float f16 = f + (float)(i + 1);
                    float f17 = f + (float)i;
                    float f18 = f2 + (float)(j + 1);
                    float f19 = f2 + (float)j;
                    int n3 = nArray[i + j * n];
                    float f20 = class083882.method_4580((float)(d * (double)(n - i)));
                    float f21 = class083882.method_4580((float)(d * (double)(n - (i + 1))));
                    float f22 = class083882.method_4570((float)(d2 * (double)(n2 - j)));
                    float f23 = class083882.method_4570((float)(d2 * (double)(n2 - (j + 1))));
                    this.N(class014232, class013912, f16, f19, f21, f22, -0.03125f, 0, 0, -1, n3);
                    this.N(class014232, class013912, f17, f19, f20, f22, -0.03125f, 0, 0, -1, n3);
                    this.N(class014232, class013912, f17, f18, f20, f23, -0.03125f, 0, 0, -1, n3);
                    this.N(class014232, class013912, f16, f18, f21, f23, -0.03125f, 0, 0, -1, n3);
                    this.N(class014232, class013912, f16, f18, f5, f6, 0.03125f, 0, 0, 1, n3);
                    this.N(class014232, class013912, f17, f18, f4, f6, 0.03125f, 0, 0, 1, n3);
                    this.N(class014232, class013912, f17, f19, f4, f7, 0.03125f, 0, 0, 1, n3);
                    this.N(class014232, class013912, f16, f19, f5, f7, 0.03125f, 0, 0, 1, n3);
                    this.N(class014232, class013912, f16, f18, f8, f10, -0.03125f, 0, 1, 0, n3);
                    this.N(class014232, class013912, f17, f18, f9, f10, -0.03125f, 0, 1, 0, n3);
                    this.N(class014232, class013912, f17, f18, f9, f11, 0.03125f, 0, 1, 0, n3);
                    this.N(class014232, class013912, f16, f18, f8, f11, 0.03125f, 0, 1, 0, n3);
                    this.N(class014232, class013912, f16, f19, f8, f10, 0.03125f, 0, -1, 0, n3);
                    this.N(class014232, class013912, f17, f19, f9, f10, 0.03125f, 0, -1, 0, n3);
                    this.N(class014232, class013912, f17, f19, f9, f11, -0.03125f, 0, -1, 0, n3);
                    this.N(class014232, class013912, f16, f19, f8, f11, -0.03125f, 0, -1, 0, n3);
                    this.N(class014232, class013912, f16, f18, f13, f14, 0.03125f, -1, 0, 0, n3);
                    this.N(class014232, class013912, f16, f19, f13, f15, 0.03125f, -1, 0, 0, n3);
                    this.N(class014232, class013912, f16, f19, f12, f15, -0.03125f, -1, 0, 0, n3);
                    this.N(class014232, class013912, f16, f18, f12, f14, -0.03125f, -1, 0, 0, n3);
                    this.N(class014232, class013912, f17, f18, f13, f14, -0.03125f, 1, 0, 0, n3);
                    this.N(class014232, class013912, f17, f19, f13, f15, -0.03125f, 1, 0, 0, n3);
                    this.N(class014232, class013912, f17, f19, f12, f15, 0.03125f, 1, 0, 0, n3);
                    this.N(class014232, class013912, f17, f18, f12, f14, 0.03125f, 1, 0, 0, n3);
                }
            }
        });
    }
}

