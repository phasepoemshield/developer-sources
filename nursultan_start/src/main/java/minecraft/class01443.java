/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01339
 *  minecraft.class01471
 *  minecraft.class01473
 *  minecraft.class06069
 *  minecraft.class07004
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01339;
import minecraft.class01471;
import minecraft.class01473;
import minecraft.class06069;
import minecraft.class07004;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class08092;

public class class01443
extends class01471 {
    public static final MapCodec<class01443> y = class00500.N.fieldOf("state").xmap(class01339::i, class00891::W).xmap(class01443::new, class014432 -> class014432.L);
    private final class00891 L;

    public class01443(class00891 class008912) {
        this.L = class008912;
    }

    protected class01473<?> N() {
        return class01473.R;
    }

    public class00500 N(class06069 class060692, class07209 class072092) {
        class07185 class071852 = class07185.N((class06069)class060692);
        return (class00500)this.L.W().L((class08092)class07004.L, (Comparable)class071852);
    }
}

