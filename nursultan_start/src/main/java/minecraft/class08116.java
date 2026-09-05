/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00891
 *  minecraft.class00960
 *  minecraft.class00985
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02774
 *  minecraft.class03358
 *  minecraft.class04802
 *  minecraft.class04811
 *  minecraft.class06271
 *  minecraft.class06665
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07211
 *  minecraft.class07311
 *  minecraft.class07914
 *  minecraft.class08965
 *  minecraft.class08971
 *  minecraft.class08973
 *  minecraft.class08981
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import minecraft.class00394;
import minecraft.class00891;
import minecraft.class00960;
import minecraft.class00985;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02774;
import minecraft.class03358;
import minecraft.class04802;
import minecraft.class04811;
import minecraft.class06271;
import minecraft.class06665;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07211;
import minecraft.class07311;
import minecraft.class07914;
import minecraft.class08092;
import minecraft.class08141;
import minecraft.class08965;
import minecraft.class08971;
import minecraft.class08973;
import minecraft.class08981;
import org.jspecify.annotations.Nullable;

public class class08116
implements class03358<class08965, class00960> {
    private final Map<class08973, class07914> N = new HashMap<class08973, class07914>();

    public class08116(class04811 class048112) {
        class01140 class011402 = class048112.R();
        this.N.put(class08973.field_61414, new class07914(class011402.N(class04802.Nm)));
        this.N.put(class08973.field_61416, new class07914(class011402.N(class04802.Ns)));
        this.N.put(class08973.field_61415, new class07914(class011402.N(class04802.NT)));
        this.N.put(class08973.field_61417, new class07914(class011402.N(class04802.Nb)));
    }

    public void N(class00960 class009602, class01421 class014212, class01237 class012372, class06959 class069592) {
        class00891 class008912 = class009602.M.i();
        if (class008912 instanceof class08981) {
            class08981 class089812 = (class08981)class008912;
            class014212.N();
            class014212.N(0.5f, 0.0f, 0.5f);
            class008912 = this.N.get(class009602.N);
            class07211 class072112 = class009602.y;
            class07311 class073112 = class06851.M((class01894)class08971.N((class02774)class089812.y()).i());
            class012372.N((class06271)class008912, (Object)class072112, class014212, class073112, class009602.Z, class01384.u, 0, class009602.z);
            class014212.y();
        }
    }

    public class00960 i() {
        return new class00960();
    }

    public void N(class08965 class089652, class00960 class009602, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class089652, (class00985)class009602, f, class068892, class081412);
        class009602.y = (class07211)class089652.w().L((class08092)class08981.y);
        class009602.N = (class08973)class089652.w().L((class08092)class06665.yK);
    }
}

