/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class03971
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06851
 *  minecraft.class07438
 *  minecraft.class08282
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02840;
import minecraft.class03971;
import minecraft.class03994;
import minecraft.class04003;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06851;
import minecraft.class07438;
import minecraft.class08282;
import minecraft.class08476;

public class class04013
extends class02840<class04003, class08282, class03994> {
    private static final class01894 N = class01894.y((String)"textures/entity/warden/warden.png");
    private static final class01894 i = class01894.y((String)"textures/entity/warden/warden_bioluminescent_layer.png");
    private static final class01894 R = class01894.y((String)"textures/entity/warden/warden_heart.png");
    private static final class01894 M = class01894.y((String)"textures/entity/warden/warden_pulsating_spots_1.png");
    private static final class01894 B = class01894.y((String)"textures/entity/warden/warden_pulsating_spots_2.png");

    public class04013(class04832 class048322) {
        super(class048322, (class06078)new class03994(class048322.N(class04802.iy)), 0.9f);
        class03994 class039942 = new class03994(class048322.N(class04802.iL));
        class03994 class039943 = new class03994(class048322.N(class04802.iu));
        class03994 class039944 = new class03994(class048322.N(class04802.ii));
        class03994 class039945 = new class03994(class048322.N(class04802.iR));
        this.N((class06249)new class03971((class06252)this, class082822 -> i, (class082822, f) -> 1.0f, (class06078)class039942, class06851::U, false));
        this.N((class06249)new class03971((class06252)this, class082822 -> M, (class082822, f) -> Math.max(0.0f, class04995.P((double)(f * 0.045f)) * 0.25f), (class06078)class039943, class06851::U, false));
        this.N((class06249)new class03971((class06252)this, class082822 -> B, (class082822, f) -> Math.max(0.0f, class04995.P((double)(f * 0.045f + (float)Math.PI)) * 0.25f), (class06078)class039943, class06851::U, false));
        this.N((class06249)new class03971((class06252)this, class082822 -> N, (class082822, f) -> class082822.N, (class06078)class039944, class06851::U, false));
        this.N((class06249)new class03971((class06252)this, class082822 -> R, (class082822, f) -> class082822.y, (class06078)class039945, class06851::U, false));
    }

    public class08282 method_55269() {
        return new class08282();
    }

    public class01894 N(class08282 class082822) {
        return N;
    }

    public void method_62354(class04003 class040032, class08282 class082822, float f) {
        super.method_62354((class07438)class040032, (class08476)class082822, f);
        class082822.N = class040032.u(f);
        class082822.y = class040032.i(f);
        class082822.L.N(class040032.N);
        class082822.u.N(class040032.y);
        class082822.i.N(class040032.L);
        class082822.R.N(class040032.u);
        class082822.M.N(class040032.i);
        class082822.B.N(class040032.R);
    }
}

