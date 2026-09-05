/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01929
 *  minecraft.class07709
 *  minecraft.class08310
 *  minecraft.class08312
 *  minecraft.class08315
 *  minecraft.class08317
 *  minecraft.class08319
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import minecraft.class01929;
import minecraft.class07709;
import minecraft.class08299;
import minecraft.class08310;
import minecraft.class08312;
import minecraft.class08315;
import minecraft.class08317;
import minecraft.class08319;

public class class08296 {
    final class01929 N;
    private final DynamicOps<class07709> L;
    final class08319 y = new class08317(this);
    private final class08310<Object> u = new class08312(this);
    private final class08299 i = new class08315(this);

    public class08299 L() {
        return this.i;
    }

    public class08296(class01929 class019292, DynamicOps<class07709> dynamicOps) {
        this.N = class019292;
        this.L = class019292.N(dynamicOps);
    }

    public <T> class08310<T> i() {
        return this.u;
    }

    public class08319 u() {
        return this.y;
    }

    public class01929 y() {
        return this.N;
    }

    public DynamicOps<class07709> N() {
        return this.L;
    }
}

