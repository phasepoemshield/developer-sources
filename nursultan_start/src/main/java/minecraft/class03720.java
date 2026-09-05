/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00681
 *  minecraft.class01000
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02242
 *  minecraft.class02245
 *  minecraft.class02294
 *  minecraft.class02562
 *  minecraft.class02758
 *  minecraft.class02777
 *  minecraft.class04256
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class05450
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class07311
 *  minecraft.class07438
 *  minecraft.class08118
 *  minecraft.class08467
 *  minecraft.class08476
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00681;
import minecraft.class01000;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02242;
import minecraft.class02245;
import minecraft.class02294;
import minecraft.class02562;
import minecraft.class02758;
import minecraft.class02777;
import minecraft.class04256;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class05450;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class07311;
import minecraft.class07438;
import minecraft.class08118;
import minecraft.class08467;
import minecraft.class08476;
import minecraft.class08943;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class03720
extends class02294<class00681, class02777, class01000> {
    public static final class01894 N = class01894.y((String)"textures/entity/armorstand/wood.png");
    private final class01000 i = (class01000)this.L();
    private final class01000 R;

    public class03720(class04832 class048322) {
        super(class048322, (class06078)new class05450(class048322.N(class04802.R)), 0.0f);
        this.R = new class05450(class048322.N(class04802.B));
        this.N((class06249)new class02562((class06252)this, class08118.N((class08118)class04802.M, (class01140)class048322.R(), class01000::new), class08118.N((class08118)class04802.Z, (class01140)class048322.R(), class01000::new), class048322.B()));
        this.N((class06249)new class02758((class06252)this));
        this.N((class06249)new class02242((class06252)this, class048322.R(), class048322.B()));
        this.N((class06249)new class02245((class06252)this, class048322.R(), class048322.U()));
    }

    public class02777 method_55269() {
        return new class02777();
    }

    public class01894 N(class02777 class027772) {
        return N;
    }

    public void method_62354(class00681 class006812, class02777 class027772, float f) {
        super.method_62354((class07438)class006812, (class08476)class027772, f);
        class04256.N((class07438)class006812, (class08467)class027772, (float)f, (class08943)this.L);
        class027772.N = class04995.Z((float)f, (float)class006812.field_5982, (float)class006812.method_36454());
        class027772.a = class006812.i();
        class027772.p = class006812.y();
        class027772.F = class006812.L();
        class027772.A = class006812.u();
        class027772.C = class006812.M();
        class027772.f = class006812.R();
        class027772.S = class006812.B();
        class027772.Nj = class006812.Z();
        class027772.Nv = class006812.z();
        class027772.Nn = class006812.U();
        class027772.y = (float)(class006812.method_73183().N() - class006812.l) + f;
    }

    public void method_3936(class02777 class027772, class01421 class014212, class01237 class012372, class06959 class069592) {
        this.y = class027772.p ? this.R : this.i;
        super.method_3936((class08476)class027772, class014212, class012372, class069592);
    }

    protected void y(class02777 class027772, class01421 class014212, float f, float f2) {
        class014212.N((Quaternionfc)class02058.u.N(180.0f - f));
        if (class027772.y < 5.0f) {
            class014212.N((Quaternionfc)class02058.u.N(class04995.m((double)(class027772.y / 1.5f * (float)Math.PI)) * 3.0f));
        }
    }

    protected @Nullable class07311 N(class02777 class027772, boolean bl, boolean bl2, boolean bl3) {
        if (!class027772.a) {
            return super.N((class08476)class027772, bl, bl2, bl3);
        }
        class01894 class018942 = this.N(class027772);
        if (bl2) {
            return class06851.L((class01894)class018942, (boolean)false);
        }
        if (bl) {
            return class06851.N((class01894)class018942, (boolean)false);
        }
        return null;
    }

    protected boolean method_3921(class00681 class006812, double d) {
        return class006812.method_5807();
    }
}

