/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class05005
 *  minecraft.class06851
 *  minecraft.class08660
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package minecraft;

import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class05005;
import minecraft.class06851;
import minecraft.class08660;
import minecraft.class08672;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class08674
extends class08672<class08660> {
    public class08674(class01422 class014222) {
        super(class014222);
    }

    @Override
    protected String y() {
        return "profiler chart";
    }

    @Override
    protected float N(int n, int n2) {
        return (float)n / 2.0f;
    }

    @Override
    protected void N(class08660 class086602, class01421 class014212) {
        double d = 0.0;
        class014212.N(0.0f, -5.0f, 0.0f);
        Matrix4f matrix4f = class014212.L().N();
        for (class05005 class050052 : class086602.y()) {
            float f;
            float f2;
            float f3;
            int n;
            int n2 = class04995.N((double)(class050052.N / 4.0)) + 1;
            class01391 class013912 = this.N.method_73477(class06851.l());
            int n3 = class02566.M((int)class050052.N());
            int n4 = class02566.N((int)n3, (int)-8355712);
            class013912.N((Matrix4fc)matrix4f, 0.0f, 0.0f, 0.0f).method_39415(n3);
            for (n = n2; n >= 0; --n) {
                f3 = (float)((d + class050052.N * (double)n / (double)n2) * 6.2831854820251465 / 100.0);
                f2 = class04995.m((double)f3) * 105.0f;
                f = class04995.P((double)f3) * 105.0f * 0.5f;
                class013912.N((Matrix4fc)matrix4f, f2, f, 0.0f).method_39415(n3);
            }
            class013912 = this.N.method_73477(class06851.G());
            for (n = n2; n > 0; --n) {
                f3 = (float)((d + class050052.N * (double)n / (double)n2) * 6.2831854820251465 / 100.0);
                f2 = class04995.m((double)f3) * 105.0f;
                f = class04995.P((double)f3) * 105.0f * 0.5f;
                float f4 = (float)((d + class050052.N * (double)(n - 1) / (double)n2) * 6.2831854820251465 / 100.0);
                float f5 = class04995.m((double)f4) * 105.0f;
                float f6 = class04995.P((double)f4) * 105.0f * 0.5f;
                if ((f + f6) / 2.0f < 0.0f) continue;
                class013912.N((Matrix4fc)matrix4f, f2, f, 0.0f).method_39415(n4);
                class013912.N((Matrix4fc)matrix4f, f2, f + 10.0f, 0.0f).method_39415(n4);
                class013912.N((Matrix4fc)matrix4f, f5, f6 + 10.0f, 0.0f).method_39415(n4);
                class013912.N((Matrix4fc)matrix4f, f5, f6, 0.0f).method_39415(n4);
            }
            d += class050052.N;
        }
    }

    @Override
    public Class<class08660> N() {
        return class08660.class;
    }
}

