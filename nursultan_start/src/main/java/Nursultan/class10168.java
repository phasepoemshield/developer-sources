/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class03253
 *  minecraft.class03257
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00381;
import minecraft.class03253;
import minecraft.class03257;
import org.jspecify.annotations.Nullable;

public class class10168<T>
implements class03257 {
    private final List<class00381<? super T>> y = new ArrayList<class00381<? super T>>();
    final /* synthetic */ class03253 N;

    public class10168(class03253 class032532) {
        this.N = class032532;
    }

    public @Nullable class00381<?> N(class00381<?> class003812) {
        if (class003812 == this.N.L) {
            return (class00381)this.N.u.apply(this.y);
        }
        class00381<?> class003813 = class003812;
        if (this.y.size() >= 4096) {
            throw new IllegalStateException("Too many packets in a bundle");
        }
        this.y.add(class003813);
        return null;
    }
}

