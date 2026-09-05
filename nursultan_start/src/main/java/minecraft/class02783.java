/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01383
 *  minecraft.class01639
 *  minecraft.class01857
 *  minecraft.class01886
 *  minecraft.class02566
 *  minecraft.class03063
 *  minecraft.class03345
 *  minecraft.class04995
 *  minecraft.class05731
 *  minecraft.class06134
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07211
 *  org.joml.Vector4f
 */
package minecraft;

import minecraft.class00457;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01383;
import minecraft.class01639;
import minecraft.class01857;
import minecraft.class01886;
import minecraft.class02566;
import minecraft.class03063;
import minecraft.class03345;
import minecraft.class04995;
import minecraft.class05731;
import minecraft.class06134;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07211;
import org.joml.Vector4f;

public class class02783
implements class01857 {
    public static final class07211[] N = class07211.values();
    private final class06202 y;

    public class02783(class06202 class062022) {
        this.y = class062022;
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class01886 class018862;
        class03063 class030632 = (class03063)this.y.B_2;
        boolean bl = ((class05731)this.y.L_0).y(class06134.w);
        boolean bl2 = ((class05731)this.y.L_0).y(class06134.H);
        if (bl || bl2) {
            class018862 = class030632.n();
            for (Vector4f[] vector4fArray : class030632.v()) {
                int n;
                class01639 class016392 = class018862.y((class03345)vector4fArray);
                if (class016392 == null) continue;
                class07209 class072092 = vector4fArray.R();
                if (bl) {
                    n = class016392.L == 0 ? 0 : class04995.M((float)((float)class016392.L / 50.0f), (float)0.9f, (float)0.9f);
                    for (int i = 0; i < N.length; ++i) {
                        if (!class016392.N(i)) continue;
                        class07211 class072112 = N[i];
                        class06724.N((class06889)class06889.N((class00753)class072092, (double)8.0, (double)8.0, (double)8.0), (class06889)class06889.N((class00753)class072092, (double)(8 - 16 * class072112.P()), (double)(8 - 16 * class072112.s()), (double)(8 - 16 * class072112.T())), (int)class02566.M((int)n));
                    }
                }
                if (!bl2 || !vector4fArray.u().N()) continue;
                n = 0;
                for (class07211 class072113 : N) {
                    int n2 = N.length;
                    for (int i = 0; i < n2; ++i) {
                        class07211 class072114 = N[i];
                        if (vector4fArray.u().N(class072113, class072114)) continue;
                        ++n;
                        class06724.N((class06889)class06889.N((class00753)class072092, (double)(8 + 8 * class072113.P()), (double)(8 + 8 * class072113.s()), (double)(8 + 8 * class072113.T())), (class06889)class06889.N((class00753)class072092, (double)(8 + 8 * class072114.P()), (double)(8 + 8 * class072114.s()), (double)(8 + 8 * class072114.T())), (int)class02566.y((int)255, (int)255, (int)0, (int)0));
                    }
                }
                if (n <= 0) continue;
                float f2 = 0.5f;
                float f3 = 0.2f;
                class06724.N((class00734)vector4fArray.L().B(0.5), (class06747)class06747.y((int)class02566.N((float)0.2f, (float)0.9f, (float)0.9f, (float)0.0f)));
            }
        }
        if ((class018862 = class030632.t()) != null) {
            Vector4f[] vector4fArray;
            class06889 class068892 = new class06889(class018862.method_62343(), class018862.method_62344(), class018862.method_62345());
            vector4fArray = class018862.method_62342();
            this.N(class068892, vector4fArray, 0, 1, 2, 3, 0, 1, 1);
            this.N(class068892, vector4fArray, 4, 5, 6, 7, 1, 0, 0);
            this.N(class068892, vector4fArray, 0, 1, 5, 4, 1, 1, 0);
            this.N(class068892, vector4fArray, 2, 3, 7, 6, 0, 0, 1);
            this.N(class068892, vector4fArray, 0, 4, 7, 3, 0, 1, 0);
            this.N(class068892, vector4fArray, 1, 5, 6, 2, 1, 0, 1);
            this.N(class068892, vector4fArray[0], vector4fArray[1]);
            this.N(class068892, vector4fArray[1], vector4fArray[2]);
            this.N(class068892, vector4fArray[2], vector4fArray[3]);
            this.N(class068892, vector4fArray[3], vector4fArray[0]);
            this.N(class068892, vector4fArray[4], vector4fArray[5]);
            this.N(class068892, vector4fArray[5], vector4fArray[6]);
            this.N(class068892, vector4fArray[6], vector4fArray[7]);
            this.N(class068892, vector4fArray[7], vector4fArray[4]);
            this.N(class068892, vector4fArray[0], vector4fArray[4]);
            this.N(class068892, vector4fArray[1], vector4fArray[5]);
            this.N(class068892, vector4fArray[2], vector4fArray[6]);
            this.N(class068892, vector4fArray[3], vector4fArray[7]);
        }
    }

    private void N(class06889 class068892, Vector4f[] vector4fArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        float f = 0.25f;
        class06724.N((class06889)new class06889((double)vector4fArray[n].x(), (double)vector4fArray[n].y(), (double)vector4fArray[n].z()).i(class068892), (class06889)new class06889((double)vector4fArray[n2].x(), (double)vector4fArray[n2].y(), (double)vector4fArray[n2].z()).i(class068892), (class06889)new class06889((double)vector4fArray[n3].x(), (double)vector4fArray[n3].y(), (double)vector4fArray[n3].z()).i(class068892), (class06889)new class06889((double)vector4fArray[n4].x(), (double)vector4fArray[n4].y(), (double)vector4fArray[n4].z()).i(class068892), (class06747)class06747.y((int)class02566.N((float)0.25f, (float)n5, (float)n6, (float)n7)));
    }

    private void N(class06889 class068892, Vector4f vector4f, Vector4f vector4f2) {
        class06724.N((class06889)new class06889(class068892.M + (double)vector4f.x, class068892.B + (double)vector4f.y, class068892.Z + (double)vector4f.z), (class06889)new class06889(class068892.M + (double)vector4f2.x, class068892.B + (double)vector4f2.y, class068892.Z + (double)vector4f2.z), (int)-16777216);
    }
}

