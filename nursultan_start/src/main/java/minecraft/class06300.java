/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00737
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class07475
 *  org.apache.commons.lang3.mutable.MutableLong
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00737;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class06289;
import minecraft.class07475;
import org.apache.commons.lang3.mutable.MutableLong;

public class class06300 {
    public static class04142<class07475> N(class05378<class06289> class053782, float f, int n, int n2) {
        MutableLong mutableLong = new MutableLong(0L);
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.m), (App)class041282.y(class053782)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074752, l) -> {
            class06289 class062892 = (class06289)((Object)((Object)((Object)((Object)class041282.y(class041393)))));
            if (class047822.method_27983() != class062892.N() || !class062892.y().method_19769((class00737)class074752.method_73189(), (double)n2)) {
                return false;
            }
            if (l <= mutableLong.longValue()) {
                return true;
            }
            class041392.N((Object)new class05352(class062892.y(), f, n));
            mutableLong.setValue(l + 80L);
            return true;
        }));
    }
}

