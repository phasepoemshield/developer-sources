/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00750
 *  minecraft.class01657
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import minecraft.class00750;
import minecraft.class01657;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class05946;

class class02401<R>
implements class02362<class04247, R> {
    final /* synthetic */ Function N;
    final /* synthetic */ class05946 y;

    class02401(Function function, class05946 class059462) {
        this.N = function;
        this.y = class059462;
    }

    private class00750<R> y(class04247 class042472) {
        return (class00750)this.N.apply(class042472.J().L(this.y));
    }

    public void encode(class04247 class042472, R r) {
        int n = this.y(class042472).L(r);
        class01657.N((ByteBuf)class042472, (int)n);
    }

    public R decode(class04247 class042472) {
        int n = class01657.N((ByteBuf)class042472);
        return (R)this.y(class042472).y(n);
    }
}

