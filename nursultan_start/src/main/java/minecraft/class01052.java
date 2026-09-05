/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import minecraft.class01076;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07536;

class class01052
extends CacheLoader<Long, List<class01076>> {
    class01052() {
    }

    public List<class01076> load(Long l) {
        IntArrayList intArrayList = class07536.N((IntStream)IntStream.range(0, 10), (class06069)class06069.y((long)l));
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < 10; ++i) {
            int n = class04995.N((double)(42.0 * Math.cos(2.0 * (-Math.PI + 0.3141592653589793 * (double)i))));
            int n2 = class04995.N((double)(42.0 * Math.sin(2.0 * (-Math.PI + 0.3141592653589793 * (double)i))));
            int n3 = intArrayList.get(i);
            int n4 = 2 + n3 / 3;
            int n5 = 76 + n3 * 3;
            boolean bl = n3 == 1 || n3 == 2;
            arrayList.add(new class01076(n, n2, n4, n5, bl));
        }
        return arrayList;
    }
}

