/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04573
 */
package minecraft;

import java.util.function.Function;
import minecraft.class04573;

class class03208<C2>
implements class04573<C2> {
    final /* synthetic */ class04573 N;
    final /* synthetic */ Function L;

    public float L() {
        return this.N.L();
    }

    class03208(class04573 class045732, class04573 class045733, Function function) {
        this.N = class045733;
        this.L = function;
    }

    public float y() {
        return this.N.y();
    }

    public float N(C2 C2) {
        return this.N.N(this.L.apply(C2));
    }
}

