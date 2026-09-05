/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00737
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05456
 *  minecraft.class06289
 *  minecraft.class06889
 *  minecraft.class07475
 *  org.apache.commons.lang3.mutable.MutableLong
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class00737;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05456;
import minecraft.class06289;
import minecraft.class06889;
import minecraft.class07475;
import org.apache.commons.lang3.mutable.MutableLong;

public class class05767 {
    private static final int N = 180;
    private static final int y = 8;
    private static final int L = 6;

    public static class04119<class07475> N(class05378<class06289> class053782, float f, int n) {
        MutableLong mutableLong = new MutableLong(0L);
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.m), (App)class041282.y(class053782)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074752, l) -> {
            class06289 class062892 = (class06289)class041282.y(class041393);
            if (class047822.method_27983() != class062892.N() || !class062892.y().method_19769((class00737)class074752.method_73189(), (double)n)) {
                return false;
            }
            if (l <= mutableLong.longValue()) {
                return true;
            }
            Optional<class06889> optional = Optional.ofNullable(class05456.N((class07475)class074752, (int)8, (int)6));
            class041392.N(optional.map(class068892 -> new class05352(class068892, f, 1)));
            mutableLong.setValue(l + 180L);
            return true;
        }));
    }
}

