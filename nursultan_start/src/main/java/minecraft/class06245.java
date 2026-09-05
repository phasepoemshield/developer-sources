/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00985
 *  minecraft.class00996
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02413
 *  minecraft.class02445
 *  minecraft.class03358
 *  minecraft.class04802
 *  minecraft.class04811
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class06112
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07311
 *  minecraft.class08097
 *  minecraft.class08141
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00985;
import minecraft.class00996;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02413;
import minecraft.class02445;
import minecraft.class03358;
import minecraft.class04802;
import minecraft.class04811;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class06112;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07311;
import minecraft.class08097;
import minecraft.class08141;
import org.jspecify.annotations.Nullable;

public class class06245
implements class03358<class06112, class00996> {
    public static final class05913 N = class05911.P.N("bell/bell_body");
    private final class08097 y;
    private final class02445 L;

    public class06245(class04811 class048112) {
        this.y = class048112.B();
        this.L = new class02445(class048112.N(class04802.d));
    }

    public class00996 i() {
        return new class00996();
    }

    public void N(class00996 class009962, class01421 class014212, class01237 class012372, class06959 class069592) {
        class02413 class024132 = new class02413(class009962.y, class009962.N);
        this.L.method_2819(class024132);
        class07311 class073112 = N.N(class06851::u);
        class012372.N((class06271)this.L, (Object)class024132, class014212, class073112, class009962.Z, class01384.u, -1, this.y.N(N), 0, class009962.z);
    }

    public void N(class06112 class061122, class00996 class009962, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class061122, (class00985)class009962, f, class068892, class081412);
        class009962.y = (float)class061122.N + f;
        class009962.N = class061122.y ? class061122.L : null;
    }
}

