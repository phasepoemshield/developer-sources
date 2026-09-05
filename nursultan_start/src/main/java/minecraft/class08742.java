/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class00549
 *  minecraft.class04745
 *  minecraft.class04751
 *  minecraft.class04782
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00549;
import minecraft.class04745;
import minecraft.class04751;
import minecraft.class04782;

public class class08742 {
    private final List<class04745> N = new ArrayList<class04745>();
    private int y;

    public int L() {
        return this.y;
    }

    private static /* synthetic */ void y(LongSet longSet, class04745 class047452) {
        longSet.add(class047452.b().y());
    }

    public int y() {
        this.N.removeIf(class047452 -> class047452.n() == class00549.m);
        return this.N.size();
    }

    private /* synthetic */ void N(LongSet longSet, class04745 class047452) {
        if (!longSet.contains(class047452.b().y())) {
            this.N.add(class047452);
            ++this.y;
        }
    }

    public int N() {
        return this.y - this.y();
    }

    public void N(class04782 class047822, Runnable runnable) {
        class04751 class047512 = class047822.method_14178();
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        class047512.Z();
        class047512.L.N(class00549.m).forEach(arg_0 -> class08742.y((LongSet)longOpenHashSet, arg_0));
        runnable.run();
        class047512.Z();
        class047512.L.N(class00549.m).forEach(arg_0 -> this.N((LongSet)longOpenHashSet, arg_0));
    }
}

