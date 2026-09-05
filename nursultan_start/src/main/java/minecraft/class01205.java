/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class04907
 *  minecraft.class04922
 *  minecraft.class08036
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import minecraft.class04907;
import minecraft.class04922;
import minecraft.class08036;

public class class01205 {
    protected final Object2IntMap<class04907<?>> N = Object2IntMaps.synchronize((Object2IntMap)new Object2IntOpenHashMap());

    public class01205() {
        this.N.defaultReturnValue(0);
    }

    public void y(class08036 class080362, class04907<?> class049072, int n) {
        int n2 = (int)Math.min((long)this.N(class049072) + (long)n, Integer.MAX_VALUE);
        this.N(class080362, class049072, n2);
    }

    public <T> int N(class04922<T> class049222, T t) {
        return class049222.N(t) ? this.N(class049222.y(t)) : 0;
    }

    public int N(class04907<?> class049072) {
        return this.N.getInt(class049072);
    }

    public void N(class08036 class080362, class04907<?> class049072, int n) {
        this.N.put(class049072, n);
    }
}

