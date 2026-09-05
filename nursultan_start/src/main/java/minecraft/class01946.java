/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01226
 *  minecraft.class01929
 *  minecraft.class02903
 *  minecraft.class03490
 *  minecraft.class03762
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06584
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class01226;
import minecraft.class01929;
import minecraft.class01958;
import minecraft.class02903;
import minecraft.class03490;
import minecraft.class03762;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06584;
import minecraft.class07299;

public class class01946
extends class06520 {
    private static class06584 L(class02903 class029032) {
        return class029032.N(1, 0);
    }

    public class01946(class03762 class037622) {
        super(class037622);
    }

    private static class06584 i(class02903 class029032) {
        return class029032.N(2, 1);
    }

    private static class06584 u(class02903 class029032) {
        return class029032.N(0, 1);
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        return class01958.N(new class03490(class01946.L(class029032).B(), class01946.u(class029032).B(), class01946.i(class029032).B(), class01946.R(class029032).B()));
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        if (class029032.R() != 3 || class029032.M() != 3 || class029032.i() != 4) {
            return false;
        }
        return class01946.L(class029032).N(class01226.yr) && class01946.u(class029032).N(class01226.yr) && class01946.i(class029032).N(class01226.yr) && class01946.R(class029032).N(class01226.yr);
    }

    public class06514<class01946> method_8119() {
        return class06514.G;
    }

    private static class06584 R(class02903 class029032) {
        return class029032.N(1, 2);
    }
}

