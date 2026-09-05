/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class01224
 *  minecraft.class04890
 *  minecraft.class05034
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01224;
import minecraft.class04890;
import minecraft.class05034;
import minecraft.class05145;
import minecraft.class05155;
import minecraft.class05159;
import minecraft.class05161;
import minecraft.class05163;
import minecraft.class05174;
import minecraft.class05180;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;

public class class05160 {
    private static final int M = 8;
    static final class05159 N = new class05145();
    static final List<class05034<class06993, class07209>> y = Lists.newArrayList((Object[])new class05034[]{new class05034((Object)class06993.field_11467, (Object)new class07209(1, -1, 0)), new class05034((Object)class06993.field_11463, (Object)new class07209(6, -1, 1)), new class05034((Object)class06993.field_11465, (Object)new class07209(0, -1, 5)), new class05034((Object)class06993.field_11464, (Object)new class07209(5, -1, 6))});
    static final class05159 L = new class05161();
    static final class05159 u = new class05174();
    static final List<class05034<class06993, class07209>> i = Lists.newArrayList((Object[])new class05034[]{new class05034((Object)class06993.field_11467, (Object)new class07209(4, -1, 0)), new class05034((Object)class06993.field_11463, (Object)new class07209(12, -1, 4)), new class05034((Object)class06993.field_11465, (Object)new class07209(0, -1, 8)), new class05034((Object)class06993.field_11464, (Object)new class07209(8, -1, 12))});
    static final class05159 R = new class05155();

    static class05180 N(List<class04890> list, class05180 class051802) {
        list.add((class04890)class051802);
        return class051802;
    }

    static boolean N(class01224 class012242, class05159 class051592, int n, class05180 class051802, class07209 class072092, List<class04890> list, class06069 class060692) {
        if (n > 8) {
            return false;
        }
        ArrayList arrayList = Lists.newArrayList();
        if (class051592.N(class012242, n, class051802, class072092, arrayList, class060692)) {
            boolean bl = false;
            int n2 = class060692.M();
            for (class04890 class048902 : arrayList) {
                class048902.y(n2);
                class04890 class048903 = class04890.N(list, (class05163)class048902.L());
                if (class048903 == null || class048903.u() == class051802.u()) continue;
                bl = true;
                break;
            }
            if (!bl) {
                list.addAll(arrayList);
                return true;
            }
        }
        return false;
    }

    static class05180 N(class01224 class012242, class05180 class051802, class07209 class072092, String string, class06993 class069932, boolean bl) {
        class05180 class051803 = new class05180(class012242, string, class051802.z(), class069932, bl);
        class07209 class072093 = class051802.Z().N(class051802.U(), class072092, class051803.U(), class07209.field_10980);
        class051803.N(class072093.method_10263(), class072093.method_10264(), class072093.method_10260());
        return class051803;
    }

    public static void N(class01224 class012242, class07209 class072092, class06993 class069932, List<class04890> list, class06069 class060692) {
        R.N();
        N.N();
        u.N();
        L.N();
        class05180 class051802 = class05160.N(list, new class05180(class012242, "base_floor", class072092, class069932, true));
        class051802 = class05160.N(list, class05160.N(class012242, class051802, new class07209(-1, 0, -1), "second_floor_1", class069932, false));
        class051802 = class05160.N(list, class05160.N(class012242, class051802, new class07209(-1, 4, -1), "third_floor_1", class069932, false));
        class051802 = class05160.N(list, class05160.N(class012242, class051802, new class07209(-1, 8, -1), "third_roof", class069932, true));
        class05160.N(class012242, L, 1, class051802, null, list, class060692);
    }
}

