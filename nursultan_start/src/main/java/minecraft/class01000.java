/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01188
 *  minecraft.class01686
 *  minecraft.class02777
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class08118
 *  minecraft.class08467
 */
package minecraft;

import minecraft.class01188;
import minecraft.class01686;
import minecraft.class02777;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class08118;
import minecraft.class08467;

public class class01000
extends class01188<class02777> {
    public class01000(class01686 class016862) {
        super(class016862);
    }

    public void method_2819(class02777 class027772) {
        super.method_2819((class08467)class027772);
        this.M.i = (float)Math.PI / 180 * class027772.f.N();
        this.M.R = (float)Math.PI / 180 * class027772.f.y();
        this.M.M = (float)Math.PI / 180 * class027772.f.L();
        this.Z.i = (float)Math.PI / 180 * class027772.C.N();
        this.Z.R = (float)Math.PI / 180 * class027772.C.y();
        this.Z.M = (float)Math.PI / 180 * class027772.C.L();
        this.U.i = (float)Math.PI / 180 * class027772.S.N();
        this.U.R = (float)Math.PI / 180 * class027772.S.y();
        this.U.M = (float)Math.PI / 180 * class027772.S.L();
        this.z.i = (float)Math.PI / 180 * class027772.Nj.N();
        this.z.R = (float)Math.PI / 180 * class027772.Nj.y();
        this.z.M = (float)Math.PI / 180 * class027772.Nj.L();
        this.W.i = (float)Math.PI / 180 * class027772.Nv.N();
        this.W.R = (float)Math.PI / 180 * class027772.Nv.y();
        this.W.M = (float)Math.PI / 180 * class027772.Nv.L();
        this.E.i = (float)Math.PI / 180 * class027772.Nn.N();
        this.E.R = (float)Math.PI / 180 * class027772.Nn.y();
        this.E.M = (float)Math.PI / 180 * class027772.Nn.L();
    }

    private static class04792 N(class04834 class048342) {
        class04792 class047922 = class01188.N((class04834)class048342, (float)0.0f);
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, class048342), class04838.N((float)0.0f, (float)1.0f, (float)0.0f)).N("hat", class04822.L().N(32, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, class048342.N(0.5f)), class04838.N);
        class048392.N("right_leg", class04822.L().N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(-0.1f)), class04838.N((float)-1.9f, (float)11.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 16).N().N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(-0.1f)), class04838.N((float)1.9f, (float)11.0f, (float)0.0f));
        return class047922;
    }

    public static class08118<class04806> N(class04834 class048342, class04834 class048343) {
        return class01000.N(class01000::N, (class04834)class048342, (class04834)class048343).N((T class047922) -> class04806.N((class04792)class047922, (int)64, (int)32));
    }
}

