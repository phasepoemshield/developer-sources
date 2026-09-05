/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00737
 *  minecraft.class03556
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class04206
 *  minecraft.class05369
 *  minecraft.class05378
 *  minecraft.class06289
 *  minecraft.class07049
 *  minecraft.class08041
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class00737;
import minecraft.class03556;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class04206;
import minecraft.class05369;
import minecraft.class05378;
import minecraft.class05672;
import minecraft.class06289;
import minecraft.class07049;
import minecraft.class08041;

public class class05760 {
    public static class04142<class08041> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.u), (App)class041282.N(class05378.L)).apply((Applicative)class041282, (class041392, class041393) -> (class047823, class080412, l) -> {
            class06289 class062892 = (class06289)class041282.y(class041392);
            if (!class062892.y().method_19769((class00737)class080412.method_73189(), 2.0) && !class080412.E()) {
                return false;
            }
            class041392.y();
            class041393.N((Object)class062892);
            class047823.method_8421((class07049)class080412, (byte)14);
            if (!class080412.t().y().N(class05672.y)) {
                return true;
            }
            Optional.ofNullable(class047823.method_8503().N(class062892.N())).flatMap(class047822 -> class047822.method_19494().L(class062892.y())).flatMap(class035562 -> class04206.d.z().filter(class035292 -> ((class05672)((Object)((Object)((Object)((Object)((Object)((Object)class035292.N()))))))).y().test((class03556<class05369>)class035562)).findFirst()).ifPresent(class035292 -> {
                class080412.N(class080412.t().y((class03556<class05672>)class035292));
                class080412.L(class047823);
            });
            return true;
        }));
    }
}

