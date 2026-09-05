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
 *  Nursultan.class11165
 *  Nursultan.class11859
 *  Nursultan.class11882
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class09189;
import Nursultan.class09198;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09991;
import Nursultan.class11165;
import Nursultan.class11859;
import Nursultan.class11882;
import Nursultan.class11938;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class class09212 {
    public static Object N_0;
    public static Object N_1;

    private static void L() {
    }

    private class09212() {
    }

    static {
        class09212.L();
        class09212.y();
        N_0 = new class09212()::N;
    }

    private static List<List<Map.Entry<class11165, List<class11882>>>> i() {
        EnumMap enumMap = new EnumMap(class11165.class);
        class11938.n().L().forEach(class118822 -> enumMap.computeIfAbsent(class118822.i(), class111652 -> new ArrayList()).add(class118822));
        ArrayList<List<Map.Entry<class11165, List<class11882>>>> arrayList = new ArrayList<List<Map.Entry<class11165, List<class11882>>>>(2);
        arrayList.add(new ArrayList());
        arrayList.add(new ArrayList());
        int[] nArray = new int[2];
        for (class11165 class111652 : class11165.values()) {
            List list = (List)enumMap.get(class111652);
            if (list == null || list.isEmpty()) continue;
            int n = nArray[0] <= nArray[1] ? 0 : 1;
            ((List)arrayList.get(n)).add(Map.entry(class111652, list));
            int n2 = n;
            nArray[n2] = nArray[n2] + (class09189.N(list.size()) + 20);
        }
        return arrayList;
    }

    private static void y() {
    }

    private class09798 N(Void void_, class09809 class098092) {
        List<List<Map.Entry<class11165, List<class11882>>>> var3 = class09212.N();
        return class09778.N((class09991)((class09991)class09198.N_0), (T class097843) -> {
            class097843.N_3((class09991)class09198.N_1, class097842 -> class09212.N(class097842, (List)var3.get(0), class098092));
            class097843.N_3((class09991)class09198.N_1, class097842 -> class09212.N(class097842, (List)var3.get(1), class098092));
        });
    }

    private static List<List<Map.Entry<class11165, List<class11882>>>> N() {
        if ((List)N_1 == null) {
            N_1 = class09212.i();
        }
        return (List)N_1;
    }

    private static void N(class09784 class097842, List<Map.Entry<class11165, List<class11882>>> list, class09809 class098092) {
        for (Map.Entry<class11165, List<class11882>> entry : list) {
            class11165 class111652 = entry.getKey();
            List<class11882> list2 = entry.getValue();
            class09785 class097852 = class098092.y("nursultan:autoBuyExpanded:" + class111652.name(), (Object)true);
            class097842.y(class098092.N("autoBuy" + class111652.name(), (class09788)class09189.y_0, (Object)new class11859(class097852, class111652, list2)));
        }
    }
}

