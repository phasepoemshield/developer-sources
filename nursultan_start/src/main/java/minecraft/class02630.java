/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class02893
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08800
 *  minecraft.class08810
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class02626;
import minecraft.class02893;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08800;
import minecraft.class08810;
import minecraft.class08943;
import org.joml.Quaternionfc;

public class class02630
extends class04507<class02626, class08810> {
    private static final float N = 40.0f;
    private static final int y = 50;
    private final class08943 L;
    private final class06069 u = class06069.u();

    protected class02630(class04832 class048322) {
        super(class048322);
        this.L = class048322.y();
    }

    public void method_3936(class08810 class088102, class01421 class014212, class01237 class012372, class06959 class069592) {
        float f;
        if (class088102.y.i()) {
            return;
        }
        class014212.N();
        if (class088102.P <= 50.0f) {
            f = Math.min(class088102.P, 50.0f) / 50.0f;
            class014212.y(f, f, f);
        }
        f = class04995.R((float)(class088102.P * 40.0f));
        class014212.N((Quaternionfc)class02058.u.N(f));
        class02893.N((class01421)class014212, (class01237)class012372, (int)0xF000F0, (class08810)class088102, (class06069)this.u);
        class014212.y();
    }

    public void method_62354(class02626 class026262, class08810 class088102, float f) {
        super.method_62354((class07049)class026262, (class08800)class088102, f);
        class06584 class065842 = class026262.y();
        class088102.N((class07049)class026262, class065842, this.L);
    }

    public class08810 method_55269() {
        return new class08810();
    }
}

