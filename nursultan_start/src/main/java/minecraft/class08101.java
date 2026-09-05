/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  minecraft.class00394
 *  minecraft.class00734
 *  minecraft.class00743
 *  minecraft.class00985
 *  minecraft.class00990
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class03358
 *  minecraft.class03662
 *  minecraft.class04811
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07211
 *  minecraft.class08898
 *  minecraft.class08943
 *  minecraft.class08951
 *  minecraft.class08961
 *  minecraft.class08968
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.HashCommon;
import minecraft.class00394;
import minecraft.class00734;
import minecraft.class00743;
import minecraft.class00985;
import minecraft.class00990;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class03358;
import minecraft.class03662;
import minecraft.class04811;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07211;
import minecraft.class08092;
import minecraft.class08141;
import minecraft.class08898;
import minecraft.class08943;
import minecraft.class08951;
import minecraft.class08961;
import minecraft.class08968;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class08101
implements class03358<class08951, class00990> {
    private static final float N = 0.25f;
    private static final float y = -0.25f;
    private final class08943 L;

    public class08101(class04811 class048112) {
        this.L = class048112.L();
    }

    private void N(class00990 class009902, class08898 class088982, class01421 class014212, class01237 class012372, int n, float f) {
        float f2 = (float)(n - 1) * 0.3125f;
        class06889 class068892 = new class06889((double)f2, class009902.y ? -0.25 : 0.0, -0.25);
        class014212.N();
        class014212.N(0.5f, 0.5f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(f));
        class014212.N(class068892);
        class014212.y(0.25f, 0.25f, 0.25f);
        class00734 class007342 = class088982.M();
        double d = -class007342.y;
        if (!class009902.y) {
            d += -(class007342.i - class007342.y) / 2.0;
        }
        class014212.N(0.0, d, 0.0);
        class088982.N(class014212, class012372, class009902.Z, class01384.u, 0);
        class014212.y();
    }

    public class00990 i() {
        return new class00990();
    }

    public void N(class00990 class009902, class01421 class014212, class01237 class012372, class06959 class069592) {
        class07211 class072112 = (class07211)class009902.M.L((class08092)class08968.L);
        float f = class072112.z().L() ? -class072112.U() : 180.0f;
        for (int i = 0; i < class009902.N.length; ++i) {
            class08898 class088982 = class009902.N[i];
            if (class088982 == null) continue;
            this.N(class009902, class088982, class014212, class012372, i, f);
        }
    }

    public void N(class08951 class089512, class00990 class009902, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class089512, (class00985)class009902, f, class068892, class081412);
        class009902.y = class089512.u();
        class00743 var6 = class089512.N();
        int n = HashCommon.long2int((long)class089512.d().method_10063());
        for (int i = 0; i < var6.size(); ++i) {
            class06584 class065842 = (class06584)var6.get(i);
            if (class065842.R()) continue;
            class08898 class088982 = new class08898();
            this.L.N(class088982, class065842, class03662.field_61988, class089512.method_73183(), (class08961)class089512, n + i);
            class009902.N[i] = class088982;
        }
    }
}

