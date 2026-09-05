/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00672
 *  minecraft.class01237
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class06069
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07311
 *  minecraft.class08488
 *  minecraft.class08800
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package minecraft;

import minecraft.class00672;
import minecraft.class01237;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class06069;
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07311;
import minecraft.class08488;
import minecraft.class08800;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class02307
extends class04507<class00672, class08488> {
    public class02307(class04832 class048322) {
        super(class048322);
    }

    private class07311 y() {
        return null;
    }

    public void method_3936(class08488 class084882, class01421 class014212, class01237 class012372, class06959 class069592) {
        float[] fArray = new float[8];
        float[] fArray2 = new float[8];
        float f = 0.0f;
        float f2 = 0.0f;
        class06069 class060692 = class06069.y((long)class084882.N);
        for (int i = 7; i >= 0; --i) {
            fArray[i] = f;
            fArray2[i] = f2;
            f += (float)(class060692.y(11) - 5);
            f2 += (float)(class060692.y(11) - 5);
        }
        float f3 = f;
        float f4 = f2;
        class012372.N(class014212, class06851.E(), (class014232, class013912) -> {
            Matrix4f matrix4f = class014232.N();
            for (int i = 0; i < 4; ++i) {
                class06069 class060692 = class06069.y((long)class084882.N);
                for (int j = 0; j < 3; ++j) {
                    int n = 7;
                    int n2 = 0;
                    if (j > 0) {
                        n = 7 - j;
                    }
                    if (j > 0) {
                        n2 = n - 2;
                    }
                    float f3 = fArray[n] - f3;
                    float f4 = fArray2[n] - f4;
                    for (int k = n; k >= n2; --k) {
                        float f5 = f3;
                        float f6 = f4;
                        if (j == 0) {
                            f3 += (float)(class060692.y(11) - 5);
                            f4 += (float)(class060692.y(11) - 5);
                        } else {
                            f3 += (float)(class060692.y(31) - 15);
                            f4 += (float)(class060692.y(31) - 15);
                        }
                        float f7 = 0.5f;
                        float f8 = 0.45f;
                        float f9 = 0.45f;
                        float f10 = 0.5f;
                        float f11 = 0.1f + (float)i * 0.2f;
                        if (j == 0) {
                            f11 *= (float)k * 0.1f + 1.0f;
                        }
                        float f12 = 0.1f + (float)i * 0.2f;
                        if (j == 0) {
                            f12 *= ((float)k - 1.0f) * 0.1f + 1.0f;
                        }
                        class02307.N(matrix4f, class013912, f3, f4, k, f5, f6, 0.45f, 0.45f, 0.5f, f11, f12, false, false, true, false);
                        class02307.N(matrix4f, class013912, f3, f4, k, f5, f6, 0.45f, 0.45f, 0.5f, f11, f12, true, false, true, true);
                        class02307.N(matrix4f, class013912, f3, f4, k, f5, f6, 0.45f, 0.45f, 0.5f, f11, f12, true, true, false, true);
                        class02307.N(matrix4f, class013912, f3, f4, k, f5, f6, 0.45f, 0.45f, 0.5f, f11, f12, false, true, false, false);
                    }
                }
            }
        });
    }

    protected boolean method_62406(class00672 class006722) {
        return false;
    }

    public void method_62354(class00672 class006722, class08488 class084882, float f) {
        super.method_62354((class07049)class006722, (class08800)class084882, f);
        class084882.N = class006722.N;
    }

    public class08488 method_55269() {
        return new class08488();
    }

    private static void N(Matrix4f matrix4f, class01391 class013912, float f, float f2, int n, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        class013912.N((Matrix4fc)matrix4f, f + (bl ? f9 : -f9), (float)(n * 16), f2 + (bl2 ? f9 : -f9)).method_22915(f5, f6, f7, 0.3f);
        class013912.N((Matrix4fc)matrix4f, f3 + (bl ? f8 : -f8), (float)((n + 1) * 16), f4 + (bl2 ? f8 : -f8)).method_22915(f5, f6, f7, 0.3f);
        class013912.N((Matrix4fc)matrix4f, f3 + (bl3 ? f8 : -f8), (float)((n + 1) * 16), f4 + (bl4 ? f8 : -f8)).method_22915(f5, f6, f7, 0.3f);
        class013912.N((Matrix4fc)matrix4f, f + (bl3 ? f9 : -f9), (float)(n * 16), f2 + (bl4 ? f9 : -f9)).method_22915(f5, f6, f7, 0.3f);
    }
}

