/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00953
 *  minecraft.class00985
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class02261
 *  minecraft.class02264
 *  minecraft.class02274
 *  minecraft.class02284
 *  minecraft.class02893
 *  minecraft.class03358
 *  minecraft.class03662
 *  minecraft.class04811
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class08141
 *  minecraft.class08810
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00953;
import minecraft.class00985;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class02261;
import minecraft.class02264;
import minecraft.class02274;
import minecraft.class02284;
import minecraft.class02893;
import minecraft.class03358;
import minecraft.class03662;
import minecraft.class04811;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class08141;
import minecraft.class08810;
import minecraft.class08943;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class02305
implements class03358<class02261, class00953> {
    private final class08943 N;
    private final class06069 y = class06069.u();

    public class02305(class04811 class048112) {
        this.N = class048112.L();
    }

    public void N(class00953 class009532, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class009532.N == null) {
            return;
        }
        class014212.N();
        class014212.N(0.5f, 0.4f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(class009532.y));
        class02893.y((class01421)class014212, (class01237)class012372, (int)class009532.Z, (class08810)class009532.N, (class06069)this.y);
        class014212.y();
    }

    public class00953 i() {
        return new class00953();
    }

    public void N(class02261 class022612, class00953 class009532, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class022612, (class00985)class009532, f, class068892, class081412);
        class06584 class065842 = class022612.L().N();
        if (!class02284.N((class02274)class022612.L()) || class065842.R() || class022612.G() == null) {
            return;
        }
        class009532.N = new class08810();
        this.N.N(class009532.N.y, class065842, class03662.field_4318, class022612.G(), null, 0);
        class009532.N.L = class08810.N((int)class065842.c());
        class009532.N.u = class08810.N((class06584)class065842);
        class02264 class022642 = class022612.u();
        class009532.y = class04995.Z((float)f, (float)class022642.y(), (float)class022642.N());
    }
}

