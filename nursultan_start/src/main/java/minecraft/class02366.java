/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00751
 *  minecraft.class01657
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class01657;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class05946;

class class02366<T>
implements class02362<class04247, class03543<T>> {
    private static final int y = -1;
    private final class02362<class04247, class03556<T>> L;
    final /* synthetic */ class05946 N;

    class02366(class05946 class059462) {
        this.N = class059462;
        this.L = class02389.y(this.N);
    }

    public class03543<T> decode(class04247 class042472) {
        int n = class01657.N((ByteBuf)class042472) - 1;
        if (n == -1) {
            class00751 class007512 = class042472.J().L(this.N);
            return (class03543)class007512.N(class03530.N((class05946)this.N, (class01894)((class01894)class01894.y.decode(class042472)))).orElseThrow();
        }
        ArrayList<class03556> arrayList = new ArrayList<class03556>(Math.min(n, 65536));
        for (int i = 0; i < n; ++i) {
            arrayList.add((class03556)this.L.decode(class042472));
        }
        return class03543.N(arrayList);
    }

    public void encode(class04247 class042472, class03543<T> class035432) {
        Optional optional = class035432.i();
        if (optional.isPresent()) {
            class01657.N((ByteBuf)class042472, (int)0);
            class01894.y.encode(class042472, ((class03530)optional.get()).y());
        } else {
            class01657.N((ByteBuf)class042472, (int)(class035432.y() + 1));
            for (class03556 class035562 : class035432) {
                this.L.encode(class042472, class035562);
            }
        }
    }
}

