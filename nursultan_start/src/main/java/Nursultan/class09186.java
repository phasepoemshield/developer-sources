/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11106
 */
package Nursultan;

import Nursultan.class09187;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11106;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

public class class09186 {
    public static Object N_0;

    private class09186() {
    }

    static {
        class09186.N();
        class09186.u();
    }

    private static void u() {
        N_0 = 2;
    }

    public static List<List<Map.Entry<class11106, List<class11067>>>> N(class11072 class110722, Map<class11106, List<class11067>> map, int n) {
        List<Map.Entry<class11106, List<class11067>>> var3 = class09186.N(class110722, map);
        ArrayList<List<Map.Entry<class11106, List<class11067>>>> arrayList = new ArrayList<List<Map.Entry<class11106, List<class11067>>>>(2);
        for (int i = 0; i < 2; ++i) {
            arrayList.add(new ArrayList());
        }
        int[] nArray = class09186.N(var3);
        int n2 = class09186.N(nArray, n);
        for (int i = 0; i < var3.size(); ++i) {
            ((List)arrayList.get(class09186.N(n2, i))).add(var3.get(i));
        }
        return arrayList;
    }

    private static List<Map.Entry<class11106, List<class11067>>> N(class11072 class110722, Map<class11106, List<class11067>> map) {
        ArrayList<Map.Entry<class11106, List<class11067>>> arrayList = new ArrayList<Map.Entry<class11106, List<class11067>>>(map.size());
        EnumSet<class11106> var3 = EnumSet.noneOf(class11106.class);
        for (class11106 class111062 : class110722.y()) {
            List<class11067> list = map.get(class111062);
            if (list == null) continue;
            arrayList.add(Map.entry(class111062, list));
            var3.add(class111062);
        }
        map.entrySet().stream().filter(entry -> !var3.contains(entry.getKey())).sorted(Map.Entry.comparingByKey()).forEach(arrayList::add);
        return arrayList;
    }

    private static int N(int[] nArray, int n) {
        int n2 = nArray.length;
        int n3 = 1 << n2;
        int n4 = 0;
        int n5 = Integer.MAX_VALUE;
        int n6 = Integer.MAX_VALUE;
        int n7 = Integer.MAX_VALUE;
        for (int i = 0; i < n3; i += 2) {
            int n8 = class09186.N(nArray, n, i, 0);
            int n9 = class09186.N(nArray, n, i, 1);
            int n10 = Math.max(n8, n9);
            int n11 = Math.abs(n8 - n9);
            int n12 = class09186.N(nArray.length, i, 1);
            if (n10 >= n5 && (n10 != n5 || n11 >= n6) && (n10 != n5 || n11 != n6 || n12 >= n7)) continue;
            n5 = n10;
            n6 = n11;
            n7 = n12;
            n4 = i;
        }
        return n4;
    }

    private static int N(int n, int n2, int n3) {
        int n4 = 0;
        for (int i = 0; i < n; ++i) {
            if (class09186.N(n2, i) != n3) continue;
            ++n4;
        }
        return n4;
    }

    private static void N() {
    }

    private static int N(int n, int n2) {
        return (n & 1 << n2) == 0 ? 0 : 1;
    }

    private static int N(int[] nArray, int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < nArray.length; ++i) {
            if (class09186.N(n2, i) != n3) continue;
            if (n5 > 0) {
                n4 += n;
            }
            n4 += nArray[i];
            ++n5;
        }
        return n4;
    }

    private static int[] N(List<Map.Entry<class11106, List<class11067>>> list) {
        int[] nArray = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            nArray[i] = class09187.N(list.get(i).getValue().size());
        }
        return nArray;
    }
}

