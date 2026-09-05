/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00737
 *  minecraft.class01296
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05368
 *  minecraft.class05378
 *  minecraft.class05456
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07475
 *  minecraft.class08041
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00737;
import minecraft.class01296;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05368;
import minecraft.class05378;
import minecraft.class05456;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07475;
import minecraft.class08041;

public class class04625 {
    public static class04142<class08041> N(float f, int n) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.m)).apply((Applicative)class041282, class041392 -> (class047822, class080412, l) -> {
            if (class047822.method_19500(class080412.method_24515())) {
                return false;
            }
            class05368 class053682 = class047822.method_19494();
            int n2 = class053682.N(class01296.N((class07209)class080412.method_24515()));
            class06889 class068892 = null;
            for (int i = 0; i < 5; ++i) {
                class06889 class068893 = class05456.N((class07475)class080412, (int)15, (int)7, class072092 -> -class053682.N(class01296.N((class07209)class072092)));
                if (class068893 == null) continue;
                int n3 = class053682.N(class01296.N((class07209)class07209.method_49638((class00737)class068893)));
                if (n3 < n2) {
                    class068892 = class068893;
                    break;
                }
                if (n3 != n2) continue;
                class068892 = class068893;
            }
            if (class068892 != null) {
                class041392.N((Object)new class05352(class068892, f, n));
            }
            return true;
        }));
    }
}

