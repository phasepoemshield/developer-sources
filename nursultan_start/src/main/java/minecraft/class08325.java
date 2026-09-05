/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class08295
 *  minecraft.class08299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.AbstractIterator;
import java.util.Iterator;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class08295;
import minecraft.class08299;
import minecraft.class08308;
import org.jspecify.annotations.Nullable;

class class08325
extends AbstractIterator<class08299> {
    private int L;
    final /* synthetic */ Iterator N;
    final /* synthetic */ class08295 y;

    class08325(class08295 class082952, Iterator iterator) {
        this.y = class082952;
        this.N = iterator;
    }

    protected @Nullable class08299 computeNext() {
        while (this.N.hasNext()) {
            int n;
            class07709 class077092 = (class07709)this.N.next();
            ++this.L;
            if (class077092 instanceof class07001) {
                class07001 class070012 = (class07001)class077092;
                return class08308.N(this.y.N(n), this.y.N, class070012);
            }
            this.y.N(n, class077092);
        }
        return (class08299)this.endOfData();
    }
}

