/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11510;
import java.util.ArrayList;
import java.util.List;

public abstract class class11526 {
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;

    static {
        class11526.i();
    }

    private static void i() {
        y_0 = 200;
        y_1 = 100;
        y_2 = 50;
        y_3 = 20;
        y_4 = 5;
        y_5 = 0;
    }

    public List<String> N(List<String> list, String string) {
        ArrayList<String> arrayList = new ArrayList<String>(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(string);
        return arrayList;
    }

    public int N(String string, String string2, int n) {
        int n2;
        int n3;
        int n4 = string.length();
        if (Math.abs(n4 - (n3 = string2.length())) > n) {
            return n + 1;
        }
        if (n4 == 0) {
            return n3;
        }
        if (n3 == 0) {
            return n4;
        }
        int[][] nArray = new int[n4 + 1][n3 + 1];
        for (n2 = 0; n2 <= n4; ++n2) {
            nArray[n2][0] = n2;
        }
        for (n2 = 0; n2 <= n3; ++n2) {
            nArray[0][n2] = n2;
        }
        for (n2 = 1; n2 <= n4; ++n2) {
            int n5 = Integer.MAX_VALUE;
            for (int i = 1; i <= n3; ++i) {
                int n6 = string.charAt(n2 - 1) == string2.charAt(i - 1) ? 0 : 1;
                int n7 = Math.min(Math.min(nArray[n2 - 1][i] + 1, nArray[n2][i - 1] + 1), nArray[n2 - 1][i - 1] + n6);
                if (n2 > 1 && i > 1 && string.charAt(n2 - 1) == string2.charAt(i - 2) && string.charAt(n2 - 2) == string2.charAt(i - 1)) {
                    n7 = Math.min(n7, nArray[n2 - 2][i - 2] + 1);
                }
                nArray[n2][i] = n7;
                if (n7 >= n5) continue;
                n5 = n7;
            }
            if (n5 <= n) continue;
            return n + 1;
        }
        return nArray[n4][n3];
    }

    public int N(String string, String string2) {
        if (string == null) {
            return 0;
        }
        String string3 = string.toLowerCase();
        if (string3.equals(string2)) {
            return 200;
        }
        if (string3.startsWith(string2)) {
            return 100;
        }
        if (string3.contains(string2)) {
            return 50;
        }
        int n = this.N(string2.length());
        if (n == 0) {
            return 0;
        }
        int n2 = this.N(string3, string2, n);
        if (n2 > n) {
            return 0;
        }
        return 20 - (n2 - 1) * 5;
    }

    public abstract void N(String var1, int var2, List<class11510> var3);

    public int N(int n) {
        if (n <= 3) {
            return 0;
        }
        if (n <= 6) {
            return 1;
        }
        return 2;
    }
}

