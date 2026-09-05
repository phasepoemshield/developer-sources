/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class03791
 *  minecraft.class03926
 *  minecraft.class04469
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.Set;
import minecraft.class03791;
import minecraft.class03926;
import minecraft.class04469;

class class02033 {
    private final Set<class04469> y;
    private class03926 L;
    private boolean u = true;
    private int i;
    final /* synthetic */ class03791 N;

    class02033(class03791 class037912, class03926 class039262) {
        this.N = class037912;
        this.y = new ObjectOpenHashSet((Collection)class039262.W().u().y());
        this.L = class039262;
    }

    boolean N(class03926 class039262) {
        if (class039262.equals((Object)this.L)) {
            return false;
        }
        boolean bl = this.y.remove(class039262.E());
        if (this.u && this.L.M().equals(class039262.M())) {
            if (this.L.U().N(class039262.U())) {
                bl = true;
                this.L = class039262;
            } else {
                this.u = false;
            }
        }
        if (bl) {
            ++this.i;
        }
        return bl;
    }

    boolean N() {
        return this.i >= this.N.N || !this.u && this.y.isEmpty();
    }
}

