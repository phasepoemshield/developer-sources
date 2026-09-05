/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02143
 *  minecraft.class04507
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07311
 *  minecraft.class08002
 *  minecraft.class08458
 *  minecraft.class08800
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02143;
import minecraft.class04507;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07311;
import minecraft.class08002;
import minecraft.class08458;
import minecraft.class08800;
import org.joml.Quaternionfc;

public class class02337
extends class04507<class08002, class08458> {
    private static final class01894 N = class01894.y((String)"textures/entity/shulker/spark.png");
    private static final class07311 y = class06851.z((class01894)N);
    private final class02143 L;

    public class02337(class04832 class048322) {
        super(class048322);
        this.L = new class02143(class048322.N(class04802.uM));
    }

    protected int method_24087(class08002 class080022, class07209 class072092) {
        return 15;
    }

    public void method_62354(class08002 class080022, class08458 class084582, float f) {
        super.method_62354((class07049)class080022, (class08800)class084582, f);
        class084582.y = class080022.method_61415(f);
        class084582.N = class080022.method_61414(f);
    }

    public class08458 method_55269() {
        return new class08458();
    }

    public void method_3936(class08458 class084582, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        float f = class084582.P;
        class014212.N(0.0f, 0.15f, 0.0f);
        class014212.N((Quaternionfc)class02058.u.N(class04995.m((double)(f * 0.1f)) * 180.0f));
        class014212.N((Quaternionfc)class02058.y.N(class04995.P((double)(f * 0.1f)) * 180.0f));
        class014212.N((Quaternionfc)class02058.R.N(class04995.m((double)(f * 0.15f)) * 360.0f));
        class014212.y(-0.5f, -0.5f, 0.5f);
        class012372.N((class06271)this.L, (Object)class084582, class014212, this.L.method_23500(N), class084582.G, class01384.u, class084582.l, null);
        class014212.y(1.5f, 1.5f, 1.5f);
        class012372.N(1).N((class06271)this.L, (Object)class084582, class014212, y, class084582.G, class01384.u, 0x26FFFFFF, null, class084582.l, null);
        class014212.y();
        super.method_3936((class08800)class084582, class014212, class012372, class069592);
    }
}

