/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00642
 *  minecraft.class02570
 *  minecraft.class07806
 *  minecraft.class07832
 *  minecraft.class07839
 *  minecraft.class07846
 *  minecraft.class07848
 *  minecraft.class07854
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00642;
import minecraft.class02570;
import minecraft.class07806;
import minecraft.class07832;
import minecraft.class07839;
import minecraft.class07846;
import minecraft.class07848;
import minecraft.class07854;

public class class01606
implements class07854 {
    private static final class00392 N = class00392.L((String)"multiplayer.status.request_handled");
    private final class07806 y;
    private final class00642 L;
    private boolean u;

    public void method_12697(class07839 class078392) {
        this.L.method_10743((class00381)new class07832(class078392.N()));
        this.L.method_10747(N);
    }

    public class01606(class07806 class078062, class00642 class006422) {
        this.y = class078062;
        this.L = class006422;
    }

    public void N(class07848 class078482) {
        if (this.u) {
            this.L.method_10747(N);
            return;
        }
        this.u = true;
        this.L.method_10743((class00381)new class07846(this.y));
    }

    public boolean method_48106() {
        return this.L.method_10758();
    }

    public void method_10839(class02570 class025702) {
    }
}

