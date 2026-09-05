/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  minecraft.class00405
 *  minecraft.class05197
 *  minecraft.class05232
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Iterator;
import java.util.List;
import minecraft.class00405;
import minecraft.class05197;
import minecraft.class05232;

@FunctionalInterface
public interface class01028 {
    public static final class01028 N = class051972 -> true;

    public boolean accept(class05197 var1);

    public static class01028 y(String string, class00405 class004052, Int2IntFunction int2IntFunction) {
        if (string.isEmpty()) {
            return N;
        }
        return class051972 -> class05232.y((String)string, (class00405)class004052, (class05197)class01028.N(class051972, int2IntFunction));
    }

    public static class01028 y(class01028 class010282, class01028 class010283) {
        return class051972 -> class010282.accept(class051972) && class010283.accept(class051972);
    }

    public static class01028 y(List<class01028> list) {
        return class051972 -> {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (((class01028)iterator.next()).accept(class051972)) continue;
                return false;
            }
            return true;
        };
    }

    public static class01028 y(String string, class00405 class004052) {
        if (string.isEmpty()) {
            return N;
        }
        return class051972 -> class05232.y((String)string, (class00405)class004052, (class05197)class051972);
    }

    public static class01028 N(String string, class00405 class004052, Int2IntFunction int2IntFunction) {
        if (string.isEmpty()) {
            return N;
        }
        return class051972 -> class05232.N((String)string, (class00405)class004052, (class05197)class01028.N(class051972, int2IntFunction));
    }

    public static class01028 N(class01028 ... class01028Array) {
        return class01028.y((List<class01028>)ImmutableList.copyOf((Object[])class01028Array));
    }

    public static class01028 N(class01028 class010282, class01028 class010283) {
        return class01028.y(class010282, class010283);
    }

    public static class01028 N(class01028 class010282) {
        return class010282;
    }

    public static class05197 N(class05197 class051972, Int2IntFunction int2IntFunction) {
        return (n, class004052, n2) -> class051972.accept(n, class004052, ((Integer)int2IntFunction.apply((Object)n2)).intValue());
    }

    public static class01028 N(int n, class00405 class004052) {
        return class051972 -> class051972.accept(0, class004052, n);
    }

    public static class01028 aE_() {
        return N;
    }

    public static class01028 a_(String string, class00405 class004052) {
        if (string.isEmpty()) {
            return N;
        }
        return class051972 -> class05232.N((String)string, (class00405)class004052, (class05197)class051972);
    }

    public static class01028 a_(List<class01028> list) {
        switch (list.size()) {
            case 0: {
                return N;
            }
            case 1: {
                return list.get(0);
            }
            case 2: {
                return class01028.y(list.get(0), list.get(1));
            }
        }
        return class01028.y((List<class01028>)ImmutableList.copyOf(list));
    }
}

