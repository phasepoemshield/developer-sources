/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00675
 *  minecraft.class00734
 *  minecraft.class01176
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06105
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07149
 *  minecraft.class07438
 *  minecraft.class08475
 *  minecraft.class08476
 *  minecraft.class08487
 */
package minecraft;

import java.util.Arrays;
import minecraft.class00675;
import minecraft.class00734;
import minecraft.class01176;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02871;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06105;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07149;
import minecraft.class07438;
import minecraft.class08475;
import minecraft.class08476;
import minecraft.class08487;

public class class02889
extends class06105<class07149, class08487> {
    private static final class01894 N = class01894.y((String)"textures/entity/illager/illusioner.png");

    public class02889(class04832 class048322) {
        super(class048322, new class01176(class048322.N(class04802.yo)), 0.5f);
        this.N((class06249)new class02871(this, (class06252)this));
        ((class01176)this.y).y().U = true;
    }

    public class08487 method_55269() {
        return new class08487();
    }

    protected boolean R(class08487 class084872) {
        return true;
    }

    public class01894 N(class08487 class084872) {
        return N;
    }

    public void method_62354(class07149 class071492, class08487 class084872, float f) {
        super.method_62354((class00675)class071492, (class08475)class084872, f);
        class06889[] class06889Array = class071492.u(f);
        class084872.N = Arrays.copyOf(class06889Array, class06889Array.length);
        class084872.S = class071492.n();
    }

    public void method_3936(class08487 class084872, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class084872.v) {
            class06889[] class06889Array = class084872.N;
            for (int i = 0; i < class06889Array.length; ++i) {
                class014212.N();
                class014212.N(class06889Array[i].M + (double)class04995.P((double)((float)i + class084872.P * 0.5f)) * 0.025, class06889Array[i].B + (double)class04995.P((double)((float)i + class084872.P * 0.75f)) * 0.0125, class06889Array[i].Z + (double)class04995.P((double)((float)i + class084872.P * 0.7f)) * 0.025);
                super.method_3936((class08476)class084872, class014212, class012372, class069592);
                class014212.y();
            }
        } else {
            super.method_3936((class08476)class084872, class014212, class012372, class069592);
        }
    }

    protected class00734 y(class07149 class071492) {
        return super.method_62358((class07438)class071492).L(3.0, 0.0, 3.0);
    }
}

