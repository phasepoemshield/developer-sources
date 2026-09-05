/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00160
 *  minecraft.class03276
 *  minecraft.class04262
 *  minecraft.class04275
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Function;
import minecraft.class00160;
import minecraft.class02887;
import minecraft.class02896;
import minecraft.class03276;
import minecraft.class04262;
import minecraft.class04275;

class class02882<T, B, C>
implements class00160<T, B, C> {
    final /* synthetic */ List N;
    final /* synthetic */ class03276 y;
    final /* synthetic */ class04262 L;
    final /* synthetic */ class02896 u;

    class02882(class02896 class028962, List list, class03276 class032762, class04262 class042622) {
        this.u = class028962;
        this.N = list;
        this.y = class032762;
        this.L = class042622;
    }

    public class04275<T> N(Function<ByteBuf, B> function, C c) {
        return new class02887(this.u.N, this.u.y, this.u.N(function, this.N, c), this.y);
    }

    public class04262 N() {
        return this.L;
    }
}

