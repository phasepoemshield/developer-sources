/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import minecraft.class04613;
import minecraft.class04638;

public class class04591 {
    private class04591() {
    }

    private static List<class04613> N(String string, List<class04638> list) {
        return class04591.N(class04591.N(string), list);
    }

    private static List<class04613> N(List<String> list, List<class04638> list2) {
        int n = 0;
        ArrayList arrayList = Lists.newArrayList();
        for (String string : list) {
            ArrayList arrayList2 = Lists.newArrayList();
            for (String string2 : class04591.N(string, "%link")) {
                if ("%link".equals(string2)) {
                    arrayList2.add(list2.get(n++));
                    continue;
                }
                arrayList2.add(class04638.N(string2));
            }
            arrayList.add(new class04613(arrayList2));
        }
        return arrayList;
    }

    public static List<String> N(String string, String string2) {
        int n;
        if (string2.isEmpty()) {
            throw new IllegalArgumentException("Delimiter cannot be the empty string");
        }
        ArrayList arrayList = Lists.newArrayList();
        int n2 = 0;
        while ((n = string.indexOf(string2, n2)) != -1) {
            if (n > n2) {
                arrayList.add(string.substring(n2, n));
            }
            arrayList.add(string2);
            n2 = n + string2.length();
        }
        if (n2 < string.length()) {
            arrayList.add(string.substring(n2));
        }
        return arrayList;
    }

    public static List<class04613> N(String string, class04638 ... class04638Array) {
        return class04591.N(string, Arrays.asList(class04638Array));
    }

    protected static List<String> N(String string) {
        return Arrays.asList(string.split("\\n"));
    }
}

