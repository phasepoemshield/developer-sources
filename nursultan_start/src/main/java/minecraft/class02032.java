/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07295
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class02010;
import minecraft.class02014;
import minecraft.class02021;
import minecraft.class02023;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07295;

public class class02032
extends class02023 {
    final float[] Z = new float[class02010.field_58167];

    private static int N(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        int n5 = (int)((float)(n >> 16 & 0xFF) * f + (float)(n2 >> 16 & 0xFF) * f2 + (float)(n3 >> 16 & 0xFF) * f3 + (float)(n4 >> 16 & 0xFF) * f4) & 0xFF;
        int n6 = (int)((float)(n & 0xFF) * f + (float)(n2 & 0xFF) * f2 + (float)(n3 & 0xFF) * f3 + (float)(n4 & 0xFF) * f4) & 0xFF;
        return n5 << 16 | n6;
    }

    private static int N(int n, int n2, int n3, int n4) {
        if (n == 0) {
            n = n4;
        }
        if (n2 == 0) {
            n2 = n4;
        }
        if (n3 == 0) {
            n3 = n4;
        }
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }

    public void N(class07295 class072952, class00500 class005002, class07209 class072092, class07211 class072112, boolean bl) {
        float f;
        int n;
        float f2;
        int n2;
        float f3;
        int n3;
        float f4;
        int n4;
        float f5;
        class00500 class005003;
        boolean bl2;
        class07209 class072093 = this.y ? class072092.method_10093(class072112) : class072092;
        class02014 class020142 = class02014.N(class072112);
        class07218 class072182 = this.N;
        class072182.N((class00753)class072093, class020142.field_4191[0]);
        class00500 class005004 = class072952.method_8320((class07209)class072182);
        int n5 = this.B.N(class005004, class072952, (class07209)class072182);
        float f6 = this.B.y(class005004, class072952, (class07209)class072182);
        class072182.N((class00753)class072093, class020142.field_4191[1]);
        class00500 class005005 = class072952.method_8320((class07209)class072182);
        int n6 = this.B.N(class005005, class072952, (class07209)class072182);
        float f7 = this.B.y(class005005, class072952, (class07209)class072182);
        class072182.N((class00753)class072093, class020142.field_4191[2]);
        class00500 class005006 = class072952.method_8320((class07209)class072182);
        int n7 = this.B.N(class005006, class072952, (class07209)class072182);
        float f8 = this.B.y(class005006, class072952, (class07209)class072182);
        class072182.N((class00753)class072093, class020142.field_4191[3]);
        class00500 class005007 = class072952.method_8320((class07209)class072182);
        int n8 = this.B.N(class005007, class072952, (class07209)class072182);
        float f9 = this.B.y(class005007, class072952, (class07209)class072182);
        class00500 class005008 = class072952.method_8320((class07209)class072182.N((class00753)class072093, class020142.field_4191[0]).N(class072112));
        boolean bl3 = !class005008.U((class07290)class072952, (class07209)class072182) || class005008.z() == 0;
        class00500 class005009 = class072952.method_8320((class07209)class072182.N((class00753)class072093, class020142.field_4191[1]).N(class072112));
        boolean bl4 = !class005009.U((class07290)class072952, (class07209)class072182) || class005009.z() == 0;
        class00500 class0050010 = class072952.method_8320((class07209)class072182.N((class00753)class072093, class020142.field_4191[2]).N(class072112));
        boolean bl5 = !class0050010.U((class07290)class072952, (class07209)class072182) || class0050010.z() == 0;
        class00500 class0050011 = class072952.method_8320((class07209)class072182.N((class00753)class072093, class020142.field_4191[3]).N(class072112));
        boolean bl6 = bl2 = !class0050011.U((class07290)class072952, (class07209)class072182) || class0050011.z() == 0;
        if (bl5 || bl3) {
            class072182.N((class00753)class072093, class020142.field_4191[0]).N(class020142.field_4191[2]);
            class005003 = class072952.method_8320((class07209)class072182);
            f5 = this.B.y(class005003, class072952, (class07209)class072182);
            n4 = this.B.N(class005003, class072952, (class07209)class072182);
        } else {
            f5 = f6;
            n4 = n5;
        }
        if (bl2 || bl3) {
            class072182.N((class00753)class072093, class020142.field_4191[0]).N(class020142.field_4191[3]);
            class005003 = class072952.method_8320((class07209)class072182);
            f4 = this.B.y(class005003, class072952, (class07209)class072182);
            n3 = this.B.N(class005003, class072952, (class07209)class072182);
        } else {
            f4 = f6;
            n3 = n5;
        }
        if (bl5 || bl4) {
            class072182.N((class00753)class072093, class020142.field_4191[1]).N(class020142.field_4191[2]);
            class005003 = class072952.method_8320((class07209)class072182);
            f3 = this.B.y(class005003, class072952, (class07209)class072182);
            n2 = this.B.N(class005003, class072952, (class07209)class072182);
        } else {
            f3 = f6;
            n2 = n5;
        }
        if (bl2 || bl4) {
            class072182.N((class00753)class072093, class020142.field_4191[1]).N(class020142.field_4191[3]);
            class005003 = class072952.method_8320((class07209)class072182);
            f2 = this.B.y(class005003, class072952, (class07209)class072182);
            n = this.B.N(class005003, class072952, (class07209)class072182);
        } else {
            f2 = f6;
            n = n5;
        }
        int n9 = this.B.N(class005002, class072952, class072092);
        class072182.N((class00753)class072092, class072112);
        class00500 class0050012 = class072952.method_8320((class07209)class072182);
        if (this.y || !class0050012.t()) {
            n9 = this.B.N(class0050012, class072952, (class07209)class072182);
        }
        float f10 = this.y ? this.B.y(class072952.method_8320(class072093), class072952, class072093) : this.B.y(class072952.method_8320(class072092), class072952, class072092);
        class02021 class020212 = class02021.N(class072112);
        if (!this.L || !class020142.field_4189) {
            f = (f9 + f6 + f4 + f10) * 0.25f;
            var42_43 = (f8 + f6 + f5 + f10) * 0.25f;
            var43_45 = (f8 + f7 + f3 + f10) * 0.25f;
            var44_46 = (f9 + f7 + f2 + f10) * 0.25f;
            this.i[class020212.field_4203] = class02032.N(n8, n5, n3, n9);
            this.i[class020212.field_4201] = class02032.N(n7, n5, n4, n9);
            this.i[class020212.field_4198] = class02032.N(n7, n6, n2, n9);
            this.i[class020212.field_4209] = class02032.N(n8, n6, n, n9);
            this.u[class020212.field_4203] = f;
            this.u[class020212.field_4201] = var42_43;
            this.u[class020212.field_4198] = var43_45;
            this.u[class020212.field_4209] = var44_46;
        } else {
            f = (f9 + f6 + f4 + f10) * 0.25f;
            var42_43 = (f8 + f6 + f5 + f10) * 0.25f;
            var43_45 = (f8 + f7 + f3 + f10) * 0.25f;
            var44_46 = (f9 + f7 + f2 + f10) * 0.25f;
            float f11 = this.Z[class020142.field_4192[0].field_58168] * this.Z[class020142.field_4192[1].field_58168];
            float f12 = this.Z[class020142.field_4192[2].field_58168] * this.Z[class020142.field_4192[3].field_58168];
            float f13 = this.Z[class020142.field_4192[4].field_58168] * this.Z[class020142.field_4192[5].field_58168];
            float f14 = this.Z[class020142.field_4192[6].field_58168] * this.Z[class020142.field_4192[7].field_58168];
            float f15 = this.Z[class020142.field_4185[0].field_58168] * this.Z[class020142.field_4185[1].field_58168];
            float f16 = this.Z[class020142.field_4185[2].field_58168] * this.Z[class020142.field_4185[3].field_58168];
            float f17 = this.Z[class020142.field_4185[4].field_58168] * this.Z[class020142.field_4185[5].field_58168];
            float f18 = this.Z[class020142.field_4185[6].field_58168] * this.Z[class020142.field_4185[7].field_58168];
            float f19 = this.Z[class020142.field_4180[0].field_58168] * this.Z[class020142.field_4180[1].field_58168];
            float f20 = this.Z[class020142.field_4180[2].field_58168] * this.Z[class020142.field_4180[3].field_58168];
            float f21 = this.Z[class020142.field_4180[4].field_58168] * this.Z[class020142.field_4180[5].field_58168];
            float f22 = this.Z[class020142.field_4180[6].field_58168] * this.Z[class020142.field_4180[7].field_58168];
            float f23 = this.Z[class020142.field_4188[0].field_58168] * this.Z[class020142.field_4188[1].field_58168];
            float f24 = this.Z[class020142.field_4188[2].field_58168] * this.Z[class020142.field_4188[3].field_58168];
            float f25 = this.Z[class020142.field_4188[4].field_58168] * this.Z[class020142.field_4188[5].field_58168];
            float f26 = this.Z[class020142.field_4188[6].field_58168] * this.Z[class020142.field_4188[7].field_58168];
            this.u[class020212.field_4203] = Math.clamp((float)(f * f11 + var42_43 * f12 + var43_45 * f13 + var44_46 * f14), (float)0.0f, (float)1.0f);
            this.u[class020212.field_4201] = Math.clamp((float)(f * f15 + var42_43 * f16 + var43_45 * f17 + var44_46 * f18), (float)0.0f, (float)1.0f);
            this.u[class020212.field_4198] = Math.clamp((float)(f * f19 + var42_43 * f20 + var43_45 * f21 + var44_46 * f22), (float)0.0f, (float)1.0f);
            this.u[class020212.field_4209] = Math.clamp((float)(f * f23 + var42_43 * f24 + var43_45 * f25 + var44_46 * f26), (float)0.0f, (float)1.0f);
            int n10 = class02032.N(n8, n5, n3, n9);
            int n11 = class02032.N(n7, n5, n4, n9);
            int n12 = class02032.N(n7, n6, n2, n9);
            int n13 = class02032.N(n8, n6, n, n9);
            this.i[class020212.field_4203] = class02032.N(n10, n11, n12, n13, f11, f12, f13, f14);
            this.i[class020212.field_4201] = class02032.N(n10, n11, n12, n13, f15, f16, f17, f18);
            this.i[class020212.field_4198] = class02032.N(n10, n11, n12, n13, f19, f20, f21, f22);
            this.i[class020212.field_4209] = class02032.N(n10, n11, n12, n13, f23, f24, f25, f26);
        }
        f = class072952.method_24852(class072112, bl);
        int n14 = 0;
        while (n14 < this.u.length) {
            int n15 = n14++;
            this.u[n15] = this.u[n15] * f;
        }
    }
}

