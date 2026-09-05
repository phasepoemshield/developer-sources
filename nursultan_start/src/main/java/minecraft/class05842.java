/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00973
 *  minecraft.class00985
 *  minecraft.class01127
 *  minecraft.class01138
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class03358
 *  minecraft.class03369
 *  minecraft.class04802
 *  minecraft.class04811
 *  minecraft.class06119
 *  minecraft.class06127
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07211
 *  minecraft.class08092
 *  minecraft.class08097
 *  minecraft.class08141
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00973;
import minecraft.class00985;
import minecraft.class01127;
import minecraft.class01138;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class03358;
import minecraft.class03369;
import minecraft.class04802;
import minecraft.class04811;
import minecraft.class06119;
import minecraft.class06127;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07211;
import minecraft.class08092;
import minecraft.class08097;
import minecraft.class08141;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class05842
implements class03358<class06119, class00973> {
    private final class08097 N;
    private final class01127 y;
    private final class01138 L = new class01138(0.0f, 0.1f, 0.9f, 1.2f);

    public class05842(class04811 class048112) {
        this.N = class048112.B();
        this.y = new class01127(class048112.N(class04802.J));
    }

    public void N(class00973 class009732, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (!class009732.N) {
            return;
        }
        class014212.N();
        class014212.N(0.5f, 1.0625f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(-class009732.y));
        class014212.N((Quaternionfc)class02058.R.N(67.5f));
        class014212.N(0.0f, -0.125f, 0.0f);
        class012372.N((class06271)this.y, (Object)this.L, class014212, class03369.N.N(class06851::u), class009732.Z, class01384.u, -1, this.N.N(class03369.N), 0, class009732.z);
        class014212.y();
    }

    public class00973 i() {
        return new class00973();
    }

    public void N(class06119 class061192, class00973 class009732, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class061192, (class00985)class009732, f, class068892, class081412);
        class009732.N = (Boolean)class061192.w().L((class08092)class06127.u);
        class009732.y = ((class07211)class061192.w().L((class08092)class06127.y)).R().U();
    }
}

