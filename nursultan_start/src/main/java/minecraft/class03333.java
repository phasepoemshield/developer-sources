/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00968
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01761
 *  minecraft.class01781
 *  minecraft.class02058
 *  minecraft.class04811
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07235
 *  minecraft.class07308
 *  minecraft.class08141
 *  minecraft.class08800
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00968;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01761;
import minecraft.class01781;
import minecraft.class02058;
import minecraft.class03358;
import minecraft.class04811;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07235;
import minecraft.class07308;
import minecraft.class08141;
import minecraft.class08800;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class03333
implements class03358<class07235, class00968> {
    private final class01781 N;

    public class03333(class04811 class048112) {
        this.N = class048112.i();
    }

    public static void N(class01421 class014212, class01237 class012372, class08800 class088002, class01781 class017812, float f, float f2, class06959 class069592) {
        class014212.N();
        class014212.N(0.5f, 0.4f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(f));
        class014212.N(0.0f, -0.2f, 0.0f);
        class014212.N((Quaternionfc)class02058.y.N(-30.0f));
        class014212.y(f2, f2, f2);
        class017812.N(class088002, class069592, 0.0, 0.0, 0.0, class014212, class012372);
        class014212.y();
    }

    @Override
    public class00968 i() {
        return new class00968();
    }

    @Override
    public void N(class00968 class009682, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class009682.N != null) {
            class03333.N(class014212, class012372, class009682.N, this.N, class009682.y, class009682.L, class069592);
        }
    }

    @Override
    public void N(class07235 class072352, class00968 class009682, float f, class06889 class068892, @Nullable class08141 class081412) {
        class03358.super.N(class072352, class009682, f, class068892, class081412);
        if (class072352.G() == null) {
            return;
        }
        class07308 class073082 = class072352.L();
        class07049 class070492 = class073082.y(class072352.G(), class072352.d());
        class01761.N((class00968)class009682, (float)f, (class07049)class070492, (class01781)this.N, (double)class073082.y(), (double)class073082.N());
    }
}

