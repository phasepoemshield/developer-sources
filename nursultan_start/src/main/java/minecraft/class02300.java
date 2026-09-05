/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class07536
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import minecraft.class07536;

public class class02300 {
    public static final int N = -1;
    private final Object2IntMap<Class<?>> y = (Object2IntMap)class07536.N((Object)new Object2IntOpenHashMap(), object2IntOpenHashMap -> object2IntOpenHashMap.defaultReturnValue(-1));

    public int L(Class<?> clazz) {
        int n = this.N(clazz);
        int n2 = n == -1 ? 0 : n + 1;
        this.y.put(clazz, n2);
        return n2;
    }

    public int y(Class<?> clazz) {
        return this.N(clazz) + 1;
    }

    public int N(Class<?> clazz) {
        int n = this.y.getInt(clazz);
        if (n != -1) {
            return n;
        }
        Class<?> clazz2 = clazz;
        while ((clazz2 = clazz2.getSuperclass()) != Object.class) {
            int n2 = this.y.getInt(clazz2);
            if (n2 == -1) continue;
            return n2;
        }
        return -1;
    }
}

