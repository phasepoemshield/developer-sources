/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06665
 *  minecraft.class07111
 *  minecraft.class07211
 *  minecraft.class08064
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06665;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07211;
import minecraft.class08064;

public abstract class class07101
extends class00891 {
    public static final class08064<class07211> R = class06665.f;

    public class07101(class01362 class013622) {
        super(class013622);
    }

    protected abstract MapCodec<? extends class07101> N();

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(R)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(R, (Comparable)class069932.N((class07211)class005002.L(R)));
    }
}

