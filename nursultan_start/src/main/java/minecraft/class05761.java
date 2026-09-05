/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00737
 *  minecraft.class04051
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class06289
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00737;
import minecraft.class04051;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05779;
import minecraft.class06289;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07438;

public class class05761 {
    private static final float N = 0.3f;

    public static class04119<class07438> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.m), (App)class041282.N(class05378.P), (App)class041282.y(class05378.i), (App)class041282.y(class05378.B), (App)class041282.L(class05378.b)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395, class041396) -> (class047822, class074384, l) -> {
            class06289 class062892 = (class06289)class041282.y(class041394);
            class04051 class040512 = (class04051)class041282.y(class041395);
            if (class047822.method_8409().y(100) == 0 && class047822.method_27983() == class062892.N() && class062892.y().method_19769((class00737)class074384.method_73189(), 4.0) && class040512.u(class074382 -> class07078.ye.equals(class074382.method_5864()))) {
                class040512.N((T class074383) -> class07078.ye.equals(class074383.method_5864()) && class074383.method_5858((class07049)class074384) <= 32.0).ifPresent(class074382 -> {
                    class041396.N(class074382);
                    class041393.N((Object)new class05751((class07049)class074382, true));
                    class041392.N((Object)new class05352((class05779)new class05751((class07049)class074382, false), 0.3f, 1));
                });
                return true;
            }
            return false;
        }));
    }
}

