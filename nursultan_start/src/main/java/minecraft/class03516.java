/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00667
 *  minecraft.class00751
 *  minecraft.class01196
 *  minecraft.class01894
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import minecraft.class00667;
import minecraft.class00751;
import minecraft.class01196;
import minecraft.class01894;
import minecraft.class03525;

public final class class03516 {
    public static final class03516 N = new class03516(Map.of());
    final Map<class01894, IntList> y;

    class03516(Map<class01894, IntList> map) {
        this.y = map;
    }

    public int y() {
        return this.y.size();
    }

    public static class03516 y(class00667 class006672) {
        return new class03516(class006672.N_17(class00667::T, class00667::N));
    }

    public boolean N() {
        return this.y.isEmpty();
    }

    public <T> class01196<T> N(class00751<T> class007512) {
        return class03525.N(class007512, this);
    }

    public void N(class00667 class006672) {
        class006672.N(this.y, class00667::N, class00667::N);
    }
}

