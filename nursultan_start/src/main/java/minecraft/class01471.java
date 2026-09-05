/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01452
 *  minecraft.class04206
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01452;
import minecraft.class01473;
import minecraft.class04206;
import minecraft.class06069;
import minecraft.class07209;

public abstract class class01471 {
    public static final Codec<class01471> N = class04206.f.T().dispatch(class01471::N, class01473::N);

    protected abstract class01473<?> N();

    public abstract class00500 N(class06069 var1, class07209 var2);

    public static class01452 N(class00500 class005002) {
        return new class01452(class005002);
    }

    public static class01452 N(class00891 class008912) {
        return new class01452(class008912.W());
    }
}

