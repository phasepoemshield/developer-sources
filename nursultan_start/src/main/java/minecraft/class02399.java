/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00750
 *  minecraft.class01657
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00750;
import minecraft.class01657;
import minecraft.class02362;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class05946;

class class02399<T>
implements class02362<class04247, class03556<T>> {
    private static final int L = 0;
    final /* synthetic */ class05946 N;
    final /* synthetic */ class02362 y;

    class02399(class05946 class059462, class02362 class023622) {
        this.N = class059462;
        this.y = class023622;
    }

    private class00750<class03556<T>> y(class04247 class042472) {
        return class042472.J().L(this.N).v();
    }

    public void encode(class04247 class042472, class03556<T> class035562) {
        switch (class035562.R()) {
            case field_36446: {
                int n = this.y(class042472).L(class035562);
                class01657.N((ByteBuf)class042472, (int)(n + 1));
                break;
            }
            case field_36447: {
                class01657.N((ByteBuf)class042472, (int)0);
                this.y.encode(class042472, class035562.N());
            }
        }
    }

    public class03556<T> decode(class04247 class042472) {
        int n = class01657.N((ByteBuf)class042472);
        if (n == 0) {
            return class03556.N((Object)this.y.decode(class042472));
        }
        return (class03556)this.y(class042472).y(n - 1);
    }
}

