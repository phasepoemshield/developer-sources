/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class06510
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class06510;

public class class02754 {
    public static final int N = -1;
    public static final class02754 y = new class02754(List.of(), IntList.of());
    private final List<class06510> L;
    private final IntList u;

    public boolean L() {
        return this.u.isEmpty();
    }

    private class02754(List<class06510> list, IntList intList) {
        this.L = list;
        this.u = intList;
    }

    public List<class06510> y() {
        return this.L;
    }

    public static class02754 y(List<class06510> list) {
        int n = list.size();
        IntArrayList intArrayList = new IntArrayList(n);
        for (int i = 0; i < n; ++i) {
            if (list.get(i).method_65799()) {
                return y;
            }
            intArrayList.add(i);
        }
        return new class02754(list, (IntList)intArrayList);
    }

    public IntList N() {
        return this.u;
    }

    public static class02754 N(class06510 class065102) {
        if (class065102.method_65799()) {
            return y;
        }
        return new class02754(List.of(class065102), IntList.of((int)0));
    }

    public static class02754 N(List<Optional<class06510>> list) {
        int n = list.size();
        ArrayList<class06510> arrayList = new ArrayList<class06510>(n);
        IntArrayList intArrayList = new IntArrayList(n);
        int n2 = 0;
        for (Optional<class06510> optional : list) {
            if (optional.isPresent()) {
                class06510 class065102 = optional.get();
                if (class065102.method_65799()) {
                    return y;
                }
                arrayList.add(class065102);
                intArrayList.add(n2++);
                continue;
            }
            intArrayList.add(-1);
        }
        return new class02754(arrayList, (IntList)intArrayList);
    }
}

