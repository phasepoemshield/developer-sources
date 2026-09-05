/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  minecraft.class00947
 *  minecraft.class03475
 *  minecraft.class06262
 *  minecraft.class08280
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import minecraft.class00947;
import minecraft.class03475;
import minecraft.class05656;
import minecraft.class06262;
import minecraft.class08280;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05658
implements class06262 {
    static final Logger N = LogUtils.getLogger();
    private final class08280 L;
    private final class03475<class05656> u;

    class05658(class08280 class082802, class03475<class05656> class034752) {
        this.L = class082802;
        this.u = class034752;
    }

    public void close() {
        this.L.close();
    }

    public IntSet N() {
        return IntSets.unmodifiable((IntSet)this.u.y());
    }

    public @Nullable class00947 N(int n) {
        return (class00947)this.u.N(n);
    }
}

