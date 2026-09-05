/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  minecraft.class07536
 */
package minecraft;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import minecraft.class03810;
import minecraft.class03831;
import minecraft.class06889;
import minecraft.class07536;

public class class03839 {
    private final Map<class03831, List<class06889>> N = new EnumMap<class03831, List<class06889>>(class03831.class);

    class03839() {
    }

    public class03810 N(float f, float f2) {
        Map map = class07536.N_74(class03831.class, class038312 -> {
            List<class06889> list = this.N.get(class038312);
            return list == null ? class038312.N(f, f2) : List.copyOf(list);
        });
        return new class03810(map);
    }

    public class03839 N(class03831 class038313, class06889 class068892) {
        this.N.computeIfAbsent(class038313, class038312 -> new ArrayList(1)).add(class068892);
        return this;
    }

    public class03839 N(class03831 class038312, float f, float f2, float f3) {
        return this.N(class038312, new class06889((double)f, (double)f2, (double)f3));
    }
}

