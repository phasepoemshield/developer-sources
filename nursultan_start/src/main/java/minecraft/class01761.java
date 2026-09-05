/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00968
 *  minecraft.class00985
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class03333
 *  minecraft.class03358
 *  minecraft.class04479
 *  minecraft.class04485
 *  minecraft.class04512
 *  minecraft.class04811
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08141
 *  minecraft.class08800
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00968;
import minecraft.class00985;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01781;
import minecraft.class03333;
import minecraft.class03358;
import minecraft.class04479;
import minecraft.class04485;
import minecraft.class04512;
import minecraft.class04811;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08141;
import minecraft.class08800;
import org.jspecify.annotations.Nullable;

public class class01761
implements class03358<class04512, class00968> {
    private final class01781 N;

    public class01761(class04811 class048112) {
        this.N = class048112.i();
    }

    public void N(class00968 class009682, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class009682.N != null) {
            class03333.N((class01421)class014212, (class01237)class012372, (class08800)class009682.N, (class01781)this.N, (float)class009682.y, (float)class009682.L, (class06959)class069592);
        }
    }

    public class00968 i() {
        return new class00968();
    }

    static void N(class00968 class009682, float f, @Nullable class07049 class070492, class01781 class017812, double d, double d2) {
        if (class070492 == null) {
            return;
        }
        class009682.N = class017812.y(class070492, f);
        class009682.N.G = class009682.Z;
        class009682.y = (float)class04995.u((double)f, (double)d, (double)d2) * 10.0f;
        class009682.L = 0.53125f;
        float f2 = Math.max(class070492.method_17681(), class070492.method_17682());
        if ((double)f2 > 1.0) {
            class009682.L /= f2;
        }
    }

    public void N(class04512 class045122, class00968 class009682, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class045122, (class00985)class009682, f, class068892, class081412);
        if (class045122.G() == null) {
            return;
        }
        class04485 class044852 = class045122.L();
        class04479 class044792 = class044852.B();
        class07049 class070492 = class044792.N(class044852, class045122.G(), class044852.M());
        class01761.N(class009682, f, class070492, this.N, class044792.R(), class044792.i());
    }
}

