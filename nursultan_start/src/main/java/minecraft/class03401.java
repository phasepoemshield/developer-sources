/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03377
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class03377;
import minecraft.class03390;
import minecraft.class03416;

class class03401<T> {
    private final class03416<T> N;
    private final Consumer<T> y;
    private long L = -1L;

    void L() {
        this.N.N();
        this.L = -1L;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class03401(class03377 class033772, class03416 class034162, Consumer consumer) {
        this.N = class034162;
        this.y = consumer;
    }

    void y() {
        class03390 class033902 = this.N.N;
        if (class033902 != null) {
            this.y.accept(class033902.N());
            this.L = class033902.y();
        }
    }

    void N(long l) {
        this.N.N(l);
        this.N();
    }

    void N() {
        class03390 class033902 = this.N.N;
        if (class033902 != null && this.L < class033902.y()) {
            this.y.accept(class033902.N());
            this.L = class033902.y();
        }
    }
}

