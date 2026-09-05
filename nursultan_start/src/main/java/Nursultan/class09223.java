/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09991
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11106
 *  Nursultan.class11292
 *  Nursultan.class11838
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class09186;
import Nursultan.class09187;
import Nursultan.class09198;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09991;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11106;
import Nursultan.class11292;
import Nursultan.class11838;
import Nursultan.class11938;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class class09223 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    private static void L() {
    }

    private class09223() {
    }

    static {
        class09223.L();
        class09223.u();
        N_0 = new class09223()::N;
        N_1 = new EnumMap(class11072.class);
        N_2 = new HashMap();
    }

    private static void u() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
    }

    private static void N(class09784 class097842, List<Map.Entry<class11106, List<class11067>>> list, class09809 class098092, class11072 class110722) {
        for (Map.Entry<class11106, List<class11067>> entry : list) {
            class11106 class111062 = entry.getKey();
            List<class11067> list2 = entry.getValue();
            String string = class111062.N().N();
            String string2 = string + "expanded" + class110722.N().N();
            class09785 class097852 = class098092.y("nursultan:subcategoryExpanded:" + string2, () -> {
                Boolean bl = ((class11292)class11938.M().N(class11292.class)).y(string2);
                return bl != null ? bl : true;
            });
            ((Map)N_2).put(string2, class097852);
            class097842.y(class098092.N(string, (class09788)class09187.N_0, (Object)new class11838(class097852, class111062, list2)));
        }
    }

    private class09798 N(class11072 class110722, class09809 class098092) {
        List list = (List)((Map)N_1).computeIfAbsent(class110722, class09223::N);
        return class09778.N((class09991)((class09991)class09198.N_0), (T class097843) -> {
            class097843.N_3((class09991)class09198.N_1, class097842 -> class09223.N(class097842, (List)list.get(0), class098092, class110722));
            class097843.N_3((class09991)class09198.N_1, class097842 -> class09223.N(class097842, (List)list.get(1), class098092, class110722));
        });
    }

    public static Map<String, class09785<Boolean>> N() {
        return (Map)N_2;
    }

    private static List<List<Map.Entry<class11106, List<class11067>>>> N(class11072 class110722) {
        Map map = (Map)class11938.u().a().filter(class110672 -> class110672.M() == class110722).collect(Collectors.groupingBy(class11067::z, () -> new EnumMap(class11106.class), Collectors.toList()));
        return class09186.N(class110722, map, 20);
    }
}

