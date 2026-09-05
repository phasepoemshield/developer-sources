/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00165
 *  minecraft.class03276
 *  minecraft.class04262
 *  minecraft.class04275
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Function;
import minecraft.class00165;
import minecraft.class02887;
import minecraft.class02896;
import minecraft.class03276;
import minecraft.class04262;
import minecraft.class04275;

class class02888<T, B>
implements class00165<T, B> {
    final /* synthetic */ List N;
    final /* synthetic */ Object y;
    final /* synthetic */ class03276 L;
    final /* synthetic */ class04262 u;
    final /* synthetic */ class02896 i;

    class02888(class02896 class028962, List list, Object object, class03276 class032762, class04262 class042622) {
        this.i = class028962;
        this.N = list;
        this.y = object;
        this.L = class032762;
        this.u = class042622;
    }

    public class04275<T> N(Function<ByteBuf, B> function) {
        return new class02887(this.i.N, this.i.y, this.i.N(function, this.N, this.y), this.L);
    }

    public class04262 N() {
        return this.u;
    }
}

