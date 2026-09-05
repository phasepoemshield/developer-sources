/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00381
 *  minecraft.class00423
 *  minecraft.class00638
 *  minecraft.class02362
 *  minecraft.class02381
 *  minecraft.class02396
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00381;
import minecraft.class00423;
import minecraft.class00638;
import minecraft.class02362;
import minecraft.class02381;
import minecraft.class02396;
import minecraft.class02897;

public class class02890<B extends ByteBuf, L extends class00638> {
    private final class02396<B, class00381<? super L>, class02897<? extends class00381<? super L>>> N = class02381.N(class00381::method_65080);
    private final class00423 y;

    public class02890(class00423 class004232) {
        this.y = class004232;
    }

    public <T extends class00381<? super L>> class02890<B, L> N(class02897<T> class028972, class02362<? super B, T> class023622) {
        if (class028972.N() != this.y) {
            throw new IllegalArgumentException("Invalid packet flow for packet " + String.valueOf(class028972) + ", expected " + this.y.name());
        }
        this.N.N(class028972, class023622);
        return this;
    }

    public class02362<B, class00381<? super L>> N() {
        return this.N.N();
    }
}

