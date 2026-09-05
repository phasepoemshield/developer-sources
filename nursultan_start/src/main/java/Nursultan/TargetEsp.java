/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class10992
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11374
 *  Nursultan.class11434
 *  Nursultan.class11441
 *  Nursultan.class11453
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11807
 *  Nursultan.class11938
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class10992;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11374;
import Nursultan.class11434;
import Nursultan.class11441;
import Nursultan.class11453;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11807;
import Nursultan.class11938;
import minecraft.class07438;

@class11080(L="TargetEsp", y=class11072.VISUAL, N=class11106.WORLD)
public class TargetEsp
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public boolean L_init;

    public static void L(class07438 class074382) {
        TargetEsp.N(class074382, 1);
    }

    public class07438 P() {
        this.b();
        return (class07438)this.L_1;
    }

    public class07438 T() {
        this.b();
        return (class07438)this.L_0;
    }

    public TargetEsp() {
        this.b();
        this.L_4 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11807[]{new class11441(this, "square", false), new class11434(this, "jello", false), new class11453(this, "scan", true)});
        this.L_5 = class11524.N((class11512)this, (String)"color", (int)-11104513);
        class11938.L().N(class10992.class, class109922 -> {
            this.b();
            if ((Integer)this.L_2 < class11938.j().y() - (Integer)this.L_3) {
                class07438 class074382 = (class07438)this.L_1;
                this.y(null);
                if (class074382 != null) {
                    class11938.L().L((Object)class11374.N((class07438)class074382, null));
                }
            }
        });
    }

    private void b() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_2 = 0;
            this.L_3 = 0;
        }
    }

    public boolean s() {
        this.b();
        return (class07438)this.L_0 != null;
    }

    public boolean m() {
        this.b();
        return (class07438)this.L_1 != null;
    }

    public void y(class07438 class074382) {
        this.b();
        this.L_1 = class074382;
    }

    public void y(int n) {
        this.b();
        this.L_2 = n;
    }

    public void N(class07438 class074382) {
        this.b();
        this.L_0 = class074382;
    }

    public void N(int n) {
        this.b();
        this.L_3 = n;
    }

    public static void N(class07438 class074382, int n) {
        TargetEsp targetEsp = class11938.u().r();
        class07438 class074383 = (class07438)targetEsp.L_1;
        targetEsp.y(class074382);
        if (class074382 != null) {
            targetEsp.N(class074382);
        }
        targetEsp.y(class11938.j().y());
        targetEsp.N(n);
        if (class074383 != class074382) {
            class11938.L().L((Object)class11374.N((class07438)class074383, (class07438)class074382));
        }
    }

    @class11782
    public void N(class10996 class109962) {
        this.b();
        if (this.s()) {
            ((class11807)((class11517)this.L_4).i()).y((Object)class109962);
        }
    }

    @class11782
    public void N(class09321 class093212) {
        this.b();
        if (this.s()) {
            ((class11807)((class11517)this.L_4).i()).y((Object)class093212);
        }
    }
}

