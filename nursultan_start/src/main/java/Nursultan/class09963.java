/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09992;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class class09963 {
    private class09963() {
    }

    public static List<class09992> N(List<class09992> list) {
        if (list == null || list.isEmpty()) {
            return List.of();
        }
        ArrayList<class09992> arrayList = new ArrayList<class09992>(list.size());
        for (class09992 class099922 : list) {
            if (class099922 == null || class09963.N(arrayList, class099922)) continue;
            arrayList.add(class099922);
        }
        return arrayList.isEmpty() ? List.of() : List.copyOf(arrayList);
    }

    public static boolean N(List<class09992> list, class09992 class099922) {
        Iterator<class09992> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != class099922) continue;
            return true;
        }
        return false;
    }
}

