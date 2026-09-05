/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 *  minecraft.class08467
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class08467;

public class class04805
extends class06078<class08467> {
    public static final class02415 N = class02415.N((float)0.5f);
    private final class01686 y;
    private final class01686 L;

    public class04805(class01686 class016862) {
        super(class016862);
        this.L = class016862.y("left_wing");
        this.y = class016862.y("right_wing");
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04834 class048342 = new class04834(1.0f);
        class048392.N("left_wing", class04822.L().N(22, 0).N(-10.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, class048342), class04838.N((float)5.0f, (float)0.0f, (float)0.0f, (float)0.2617994f, (float)0.0f, (float)-0.2617994f));
        class048392.N("right_wing", class04822.L().N(22, 0).N().N(0.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, class048342), class04838.N((float)-5.0f, (float)0.0f, (float)0.0f, (float)0.2617994f, (float)0.0f, (float)0.2617994f));
        return class04806.N(class047922, 64, 32);
    }

    public void method_2819(class08467 class084672) {
        super.method_2819((Object)class084672);
        this.L.L = class084672.Z ? 3.0f : 0.0f;
        this.L.i = class084672.q;
        this.L.M = class084672.V;
        this.L.R = class084672.K;
        this.y.R = -this.L.R;
        this.y.L = this.L.L;
        this.y.i = this.L.i;
        this.y.M = -this.L.M;
    }
}

