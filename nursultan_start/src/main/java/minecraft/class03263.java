/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.text2speech.Narrator
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02088
 *  minecraft.class02091
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04654
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05336
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06279
 *  minecraft.class06366
 *  minecraft.class06478
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.text2speech.Narrator;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02088;
import minecraft.class02091;
import minecraft.class02102;
import minecraft.class03240;
import minecraft.class03686;
import minecraft.class04654;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05336;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06279;
import minecraft.class06366;
import minecraft.class06478;
import minecraft.class07536;

public class class03263
extends class05096 {
    private static final class00392 N = class00392.L((String)"accessibility.onboarding.screen.title");
    private static final class00392 y = class00392.L((String)"accessibility.onboarding.screen.narrator");
    private static final int L = 4;
    private static final int u = 16;
    private static final float i = 1000.0f;
    private static final int R = 374;
    private final class02088 M;
    private final class05630 B;
    private final boolean Z;
    private boolean z;
    private float U;
    private final Runnable E;
    private final class03686 W = new class03686((class05096)this, this.N(), 33);
    private float m;
    private boolean P = true;
    private float s;

    public class03263(class05630 class056302, Runnable runnable) {
        super(N);
        this.B = class056302;
        this.E = runnable;
        this.M = new class02088(true);
        this.Z = class06202.Nq().NT().N();
    }

    private void y() {
        if (!this.z && this.Z) {
            if (this.U < 40.0f) {
                this.U += 1.0f;
            } else if (this.field_22787.y()) {
                Narrator.getNarrator().say(y.getString(), true, ((class05630)this.field_22787.i_7).N(class04911.field_15246));
                this.z = true;
            }
        }
    }

    private void N(boolean bl, Runnable runnable) {
        if (bl) {
            this.B.NH();
        }
        Narrator.getNarrator().clear();
        runnable.run();
    }

    private void N(class05096 class050962) {
        this.N(false, () -> this.field_22787.N(class050962));
    }

    private int N() {
        return 90;
    }

    public void method_25426() {
        class01885 class018852 = (class01885)this.W.L((class02102)class01885.u());
        class018852.L().y().N(4);
        class018852.N((class02102)class02091.N((class00392)this.field_22785, (class01590)this.field_22793).N(374).N(), class020722 -> class020722.N(8));
        class06478 class064782 = this.B.NV().method_57701(this.B);
        if (class064782 instanceof class06366) {
            class06366 class063662;
            this.field_52252 = class063662 = (class06366)class064782;
            this.field_52252.field_22763 = this.Z;
            class018852.N((class02102)this.field_52252);
        }
        class018852.N((class02102)class03240.y(150, class053622 -> this.N((class05096)new class05336((class05096)this, (class05630)this.field_22787.i_7)), false));
        class018852.N((class02102)class03240.N(150, class053622 -> this.N((class05096)new class06279((class05096)this, (class05630)this.field_22787.i_7, this.field_22787.X())), false));
        this.W.y((class02102)class05362.method_46430((class00392)class05220.z, class053622 -> this.method_25419()).N());
        this.W.method_48206(arg_0 -> ((class03263)this).method_37063(arg_0));
        this.method_48640();
    }

    protected void method_56131() {
        if (this.Z && this.field_52252 != null) {
            this.method_48265((class04654)this.field_52252);
        } else {
            super.method_56131();
        }
    }

    public void method_48640() {
        this.W.N();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        float f2;
        float f3;
        super.method_25394(class010542, n, n2, f);
        this.y();
        if (this.m == 0.0f && this.P) {
            this.m = class07536.L();
        }
        if (this.m > 0.0f) {
            f3 = ((float)class07536.L() - this.m) / 2000.0f;
            f2 = 1.0f;
            if (f3 >= 1.0f) {
                this.P = false;
                this.m = 0.0f;
            } else {
                f3 = class04995.N((float)f3, (float)0.0f, (float)1.0f);
                f2 = class04995.y((float)f3, (float)0.5f, (float)1.0f, (float)0.0f, (float)1.0f);
            }
            this.method_71536(f2);
        }
        if (this.s > 0.0f) {
            f3 = 1.0f - ((float)class07536.L() - this.s) / 1000.0f;
            f2 = 0.0f;
            if (f3 <= 0.0f) {
                this.s = 0.0f;
                this.N(true, this.E);
            } else {
                f3 = class04995.N((float)f3, (float)0.0f, (float)1.0f);
                f2 = class04995.y((float)f3, (float)0.5f, (float)1.0f, (float)0.0f, (float)1.0f);
            }
            this.method_71536(f2);
        }
        this.M.N(class010542, this.field_22789, 1.0f);
    }

    public void method_25419() {
        if (this.s == 0.0f) {
            this.s = class07536.L();
        }
    }

    protected boolean method_72798() {
        return false;
    }
}

