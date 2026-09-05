/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02741
 *  minecraft.class02904
 *  minecraft.class03729
 *  minecraft.class04056
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07313
 */
package minecraft;

import java.util.List;
import minecraft.class02741;
import minecraft.class02904;
import minecraft.class03729;
import minecraft.class04056;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07313;
import minecraft.class07476;

class class07503
implements class04056<class07313> {
    final /* synthetic */ List N;
    final /* synthetic */ class04782 y;
    final /* synthetic */ class07476 L;

    class07503(class07476 class074762, List list, class04782 class047822) {
        this.L = class074762;
        this.N = list;
        this.y = class047822;
    }

    public boolean N(class03729<class07313> class037292) {
        return ((class07313)class037292.y()).method_8115(new class02904(this.L.R.method_5438(0)), (class07299)this.y);
    }

    public void N() {
        this.N.forEach(class069372 -> class069372.i(class06584.E));
    }

    public void N(class02741 class027412) {
        this.L.N(class027412);
    }
}

