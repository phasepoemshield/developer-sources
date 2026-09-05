/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07075
 *  minecraft.class07079
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00717;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07075;
import minecraft.class07079;
import minecraft.class08299;
import minecraft.class08329;

public interface class04391 {
    public static final String M = "Inventory";

    public class07075 n();

    default public void N(class08329 class083292) {
        this.n().N(class083292.N(M, class06584.y));
    }

    public static void N(class04782 class047822, class07079 class070792, class04391 class043912, class00717 class007172) {
        class06584 class065842 = class007172.N();
        if (class070792.y(class047822, class065842)) {
            class07075 class070752 = class043912.n();
            if (!class070752.L(class065842)) {
                return;
            }
            class070792.method_29499(class007172);
            int n = class065842.c();
            class06584 class065843 = class070752.N(class065842);
            class070792.method_6103((class07049)class007172, n - class065843.c());
            if (class065843.R()) {
                class007172.method_31472();
            } else {
                class065842.i(class065843.c());
            }
        }
    }

    default public void b_(class08299 class082992) {
        class082992.y(M, class06584.y).ifPresent(class083102 -> this.n().N(class083102));
    }
}

