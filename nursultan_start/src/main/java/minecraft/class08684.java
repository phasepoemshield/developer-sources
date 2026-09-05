/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class03088
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 *  minecraft.class06379
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02415;
import minecraft.class03088;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class06379;
import minecraft.class08670;
import minecraft.class08800;

public class class08684
extends class06078<class08670> {
    public static final class02415 N = class02415.N((float)0.2375f);
    private static final float y = 0.9375f;
    private final class01686[] L = new class01686[9];
    private final class01686 u;

    public class08684(class01686 class016862) {
        super(class016862);
        this.u = class016862.y("body");
        for (int i = 0; i < this.L.length; ++i) {
            this.L[i] = this.u.y(class03088.N((int)i));
        }
    }

    public static class04806 N(boolean bl, class04834 class048342) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("body", class04822.L().N(0, 0).N(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f, class048342), class04838.N((float)0.0f, (float)16.0f, (float)0.0f));
        if (bl) {
            class048392.N("inner_body", class04822.L().N(0, 32).N(-8.0f, -16.0f, -8.0f, 16.0f, 16.0f, 16.0f, class048342.N(-0.5f)), class04838.N((float)0.0f, (float)8.0f, (float)0.0f));
        }
        class048392.N(class03088.N((int)0), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, class048342), class04838.N((float)-3.75f, (float)7.0f, (float)-5.0f));
        class048392.N(class03088.N((int)1), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f, class048342), class04838.N((float)1.25f, (float)7.0f, (float)-5.0f));
        class048392.N(class03088.N((int)2), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 4.0f, 2.0f, class048342), class04838.N((float)6.25f, (float)7.0f, (float)-5.0f));
        class048392.N(class03088.N((int)3), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, class048342), class04838.N((float)-6.25f, (float)7.0f, (float)0.0f));
        class048392.N(class03088.N((int)4), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, class048342), class04838.N((float)-1.25f, (float)7.0f, (float)0.0f));
        class048392.N(class03088.N((int)5), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f, class048342), class04838.N((float)3.75f, (float)7.0f, (float)0.0f));
        class048392.N(class03088.N((int)6), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, class048342), class04838.N((float)-3.75f, (float)7.0f, (float)5.0f));
        class048392.N(class03088.N((int)7), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, class048342), class04838.N((float)1.25f, (float)7.0f, (float)5.0f));
        class048392.N(class03088.N((int)8), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 5.0f, 2.0f, class048342), class04838.N((float)6.25f, (float)7.0f, (float)5.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64).N(class02415.N((float)4.0f));
    }

    public void method_2819(class08670 class086702) {
        super.method_2819((Object)class086702);
        if (!class086702.N.R()) {
            this.u.B = 0.9375f;
            this.u.Z = 0.9375f;
            this.u.z = 0.9375f;
        }
        class06379.N((class08800)class086702, (class01686[])this.L);
    }
}

