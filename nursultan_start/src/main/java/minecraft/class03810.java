/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class03831;
import minecraft.class03839;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class03810 {
    private final Map<class03831, List<class06889>> N;

    public class06889 L(class03831 class038312, int n, float f) {
        List<class06889> list = this.N.get((Object)class038312);
        if (list.isEmpty()) {
            throw new IllegalStateException("Had no attachment points of type: " + String.valueOf((Object)class038312));
        }
        return class03810.N(list.get(class04995.N((int)n, (int)0, (int)(list.size() - 1))), f);
    }

    class03810(Map<class03831, List<class06889>> map) {
        this.N = map;
    }

    public class06889 y(class03831 class038312, int n, float f) {
        class06889 class068892 = this.N(class038312, n, f);
        if (class068892 == null) {
            throw new IllegalStateException("Had no attachment point of type: " + String.valueOf((Object)class038312) + " for index: " + n);
        }
        return class068892;
    }

    public class06889 N(class03831 class038312) {
        List<class06889> list = this.N.get((Object)class038312);
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException("No attachment points of type: PASSENGER");
        }
        class06889 class068892 = class06889.L;
        for (class06889 class068893 : list) {
            class068892 = class068892.i(class068893);
        }
        return class068892.L((double)(1.0f / (float)list.size()));
    }

    public static class03810 N(float f, float f2) {
        return class03810.N().N(f, f2);
    }

    private static class06889 N(class06889 class068892, float f) {
        return class068892.y(-f * ((float)Math.PI / 180));
    }

    public static class03839 N() {
        return new class03839();
    }

    public @Nullable class06889 N(class03831 class038312, int n, float f) {
        List<class06889> list = this.N.get((Object)class038312);
        if (n < 0 || n >= list.size()) {
            return null;
        }
        return class03810.N(list.get(n), f);
    }

    public class03810 N(float f, float f2, float f3) {
        return new class03810(class07536.N_74(class03831.class, class038312 -> {
            ArrayList<class06889> arrayList = new ArrayList<class06889>();
            for (class06889 class068892 : this.N.get(class038312)) {
                arrayList.add(class068892.u((double)f, (double)f2, (double)f3));
            }
            return arrayList;
        }));
    }
}

