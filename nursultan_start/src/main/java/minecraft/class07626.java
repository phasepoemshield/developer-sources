/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class04643
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class08700
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import minecraft.class04643;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class08700;

public class class07626 {
    private final class07079 N;
    private final IntSet y = new IntOpenHashSet();
    private final IntSet L = new IntOpenHashSet();

    public class07626(class07079 class070792) {
        this.N = class070792;
    }

    public void N() {
        this.y.clear();
        this.L.clear();
    }

    public boolean N(class07049 class070492) {
        int n = class070492.method_5628();
        if (this.y.contains(n)) {
            return true;
        }
        if (this.L.contains(n)) {
            return false;
        }
        class04643 class046432 = class08700.N();
        class046432.N("hasLineOfSight");
        boolean bl = this.N.method_6057(class070492);
        class046432.L();
        if (bl) {
            this.y.add(n);
        } else {
            this.L.add(n);
        }
        return bl;
    }
}

