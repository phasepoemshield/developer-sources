/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11539
 */
package Nursultan;

import Nursultan.class11489;
import Nursultan.class11508;
import Nursultan.class11510;
import Nursultan.class11513;
import Nursultan.class11526;
import Nursultan.class11539;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class class11503 {
    private static String[] u;
    public static Object N_0;

    private class11503() {
        throw new UnsupportedOperationException(u[0]);
    }

    static {
        class11503.N();
        class11503.u();
        class11539 class115392 = new class11539();
        class11508 class115082 = new class11508();
        class11513 class115132 = new class11513();
        N_0 = List.of(class115392, class115082, class115132, new class11489());
    }

    private static void u() {
    }

    public static List<class11510> N(String string, int n) {
        if (n == 0 || string == null || string.isBlank()) {
            return List.of();
        }
        String string2 = string.trim().toLowerCase();
        ArrayList<class11510> arrayList = new ArrayList<class11510>();
        Iterator iterator = ((List)N_0).iterator();
        while (iterator.hasNext()) {
            ((class11526)iterator.next()).N(string2, n, arrayList);
        }
        arrayList.sort(Comparator.comparingInt(class11510::L).reversed());
        return arrayList;
    }

    private static void N() {
        u = new String[1];
        class11503.u[0] = "This is a utility class and cannot be instantiated";
    }
}

