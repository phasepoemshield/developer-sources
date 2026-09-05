/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01312
 *  minecraft.class03847
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05475
 *  minecraft.class05765
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07475
 */
package minecraft;

import java.util.Map;
import minecraft.class01312;
import minecraft.class03847;
import minecraft.class04508;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05475;
import minecraft.class05765;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07475;

public class class04518
extends class05765<class04508> {
    public class04518() {
        super(Map.of(class05378.s, class05367.field_18456, class05378.m, class05367.field_18457, class05378.yR, class05367.field_18457, class05378.yM, class05367.field_18457));
    }

    private static class06889 N(class04508 class045082, class07438 class074382) {
        class06889 class068892 = class074382.method_73189().u(class045082.method_73189());
        double d = class068892.M() - class04995.u((double)class045082.method_59922().U(), (double)8.0, (double)4.0);
        class06889 class068893 = class068892.u().u(d, d, d);
        return class045082.method_73189().i(class068893);
    }

    protected boolean N(class04782 class047822, class04508 class045082) {
        return class045082.method_24828() && !class045082.method_5799() && class045082.method_18376() == class01312.field_18076;
    }

    protected void u(class04782 class047822, class04508 class045082, long l) {
        class06889 class068892;
        class07438 class074382 = class045082.method_18868().L(class05378.s).orElse(null);
        if (class074382 == null) {
            return;
        }
        boolean bl = class045082.y(class074382.method_73189());
        class06889 class068893 = null;
        if (bl && (class068892 = class05475.N((class07475)class045082, (int)5, (int)5, (class06889)class074382.method_73189())) != null && class03847.N((class04508)class045082, (class06889)class068892) && class074382.method_5649(class068892.M, class068892.B, class068892.Z) > class074382.method_5858((class07049)class045082)) {
            class068893 = class068892;
        }
        if (class068893 == null) {
            class068893 = class045082.method_59922().Z() ? class03847.N((class07438)class074382, (class06069)class045082.method_59922()) : class04518.N(class045082, class074382);
        }
        class045082.method_18868().N(class05378.m, (Object)new class05352(class07209.method_49638(class068893), 0.6f, 1));
    }
}

