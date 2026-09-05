/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00638
 *  minecraft.class02362
 *  minecraft.class02880
 *  minecraft.class02895
 *  minecraft.class02897
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00638;
import minecraft.class02362;
import minecraft.class02880;
import minecraft.class02895;
import minecraft.class02897;

public interface class00381<T extends class00638> {
    default public boolean i() {
        return false;
    }

    public static <B extends ByteBuf, T extends class00381<?>> class02362<B, T> N(class02880<B, T> class028802, class02895<B, T> class028952) {
        return class02362.N_34(class028802, class028952);
    }

    default public boolean R() {
        return false;
    }

    public void method_65081(T var1);

    public class02897<? extends class00381<T>> method_65080();
}

