/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01157
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class03502
 *  minecraft.class04782
 *  minecraft.class06371
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class01157;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class03502;
import minecraft.class03556;
import minecraft.class03584;
import minecraft.class03592;
import minecraft.class04782;
import minecraft.class06371;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class03563
extends class01157 {
    final /* synthetic */ class03592 u;

    public class03563(class03592 class035922, class07209 class072092) {
        this.u = class035922;
        super((class06371)class035922, class072092);
    }

    private int N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class07211 class072112 = ((class07211)class005002.L(class03584.B)).b();
        return class072992.u(class072092.method_10093(class072112), class072112);
    }

    public boolean N(class04782 class047822, class07209 class072092, class03556<class01194> class035562, @Nullable class01164 class011642) {
        int n = this.N((class07299)class047822, this.y, this.u.w());
        if (n != 0 && class03502.N(class035562) != n) {
            return false;
        }
        return super.N(class047822, class072092, class035562, class011642);
    }

    public int N() {
        return 16;
    }
}

