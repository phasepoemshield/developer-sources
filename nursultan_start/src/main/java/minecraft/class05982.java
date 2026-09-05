/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00379
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class06025
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07796
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;
import minecraft.class00379;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01362;
import minecraft.class06025;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07796;

public abstract class class05982<E extends class00394>
extends class07796 {
    protected final Supplier<class00404<? extends E>> B;

    protected class05982(class01362 class013622, Supplier<class00404<? extends E>> supplier) {
        super(class013622);
        this.B = supplier;
    }

    protected abstract MapCodec<? extends class05982<E>> N();

    public abstract class06025<? extends class00379> N(class00500 var1, class07299 var2, class07209 var3, boolean var4);
}

