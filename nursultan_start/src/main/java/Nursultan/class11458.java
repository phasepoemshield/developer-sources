/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01751
 *  minecraft.class05216
 */
package Nursultan;

import Nursultan.class11468;
import Nursultan.class11471;
import Nursultan.class11486;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01751;
import minecraft.class05216;

public class class11458 {
    private static String[] y;

    public static class05216 L(class00392 class003922, Pattern pattern, class00392 class003923) {
        return class11458.N(class003922, (string, bl) -> class11458.N(string, pattern, bl), class003923, true, true);
    }

    public static class05216 L(class00392 class003922, String string, class00392 class003923) {
        return class11458.N(class003922, (string2, bl) -> class11458.y(string2, string, bl), class003923, true, true);
    }

    private class11458() {
        throw new UnsupportedOperationException(y[0]);
    }

    static {
        class11458.y();
        class11458.N();
    }

    public static class05216 u(class00392 class003922, String string, class00392 class003923) {
        return class11458.N(class003922, (string2, bl) -> class11458.y(string2, string, bl), class003923, false, false);
    }

    public static class05216 u(class00392 class003922, Pattern pattern, class00392 class003923) {
        return class11458.N(class003922, (string, bl) -> class11458.N(string, pattern, bl), class003923, true, false);
    }

    private static void y() {
    }

    public static class05216 y(class00392 class003922, String string) {
        return class11458.u(class003922, string, (class00392)class00392.i());
    }

    public static class05216 y(class00392 class003922, Pattern pattern, class00392 class003923) {
        return class11458.N(class003922, (string, bl) -> class11458.N(string, pattern, bl), class003923, false, false);
    }

    public static class05216 y(class00392 class003922, String string, class00392 class003923) {
        return class11458.N(class003922, (string2, bl) -> class11458.y(string2, string, bl), class003923, true, false);
    }

    private static List<class11471> y(String string, String string2, boolean bl) {
        int n;
        ArrayList<class11471> arrayList = new ArrayList<class11471>();
        if (string2.isEmpty()) {
            return arrayList;
        }
        String string3 = string2.toLowerCase(Locale.ROOT);
        String string4 = string.toLowerCase(Locale.ROOT);
        int n2 = 0;
        while ((n = string4.indexOf(string3, n2)) >= 0) {
            int n3 = n + string3.length();
            arrayList.add(new class11471(n, n3));
            if (!bl) break;
            n2 = n3;
        }
        return arrayList;
    }

    public static class05216 y(class00392 class003922, Pattern pattern) {
        return class11458.y(class003922, pattern, (class00392)class00392.i());
    }

    private static List<class11471> N(String string, Pattern pattern, boolean bl) {
        ArrayList<class11471> arrayList = new ArrayList<class11471>();
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            arrayList.add(new class11471(matcher.start(), matcher.end()));
            if (bl) continue;
            break;
        }
        return arrayList;
    }

    private static void N(class05216 class052162, List<class11468> list, int n, int n2) {
        if (n >= n2) {
            return;
        }
        int n3 = 0;
        for (class11468 class114682 : list) {
            int n4;
            int n5 = n3;
            int n6 = n3 + class114682.N().length();
            if (n6 <= n) {
                n3 = n6;
                continue;
            }
            if (n5 >= n2) break;
            int n7 = Math.max(n, n5) - n5;
            if (n7 < (n4 = Math.min(n2, n6) - n5)) {
                class052162.y((class00392)class00392.y((String)class114682.N().substring(n7, n4)).y(class114682.y()));
            }
            n3 = n6;
        }
    }

    private static class00405 N(List<class11468> list, int n) {
        int n2 = 0;
        for (class11468 class114682 : list) {
            int n3 = n2 + class114682.N().length();
            if (n < n3) {
                return class114682.y();
            }
            n2 = n3;
        }
        return class00405.N;
    }

    private static class05216 N(List<class11468> list, int n, List<class11471> list2, class00392 class003922, boolean bl) {
        class05216 class052162 = class00392.i();
        int n2 = 0;
        for (class11471 class114712 : list2) {
            if (class114712.y() > n2) {
                class11458.N(class052162, list, n2, class114712.y());
            }
            if (!class003922.getString().isEmpty()) {
                class05216 class052163 = class003922.L();
                if (bl) {
                    class00405 class004052 = class11458.N(list, class114712.y());
                    class052163.y(class004052);
                    if (!class003922.method_10866().B()) {
                        class052163.L(class003922.method_10866());
                    }
                }
                class052162.y((class00392)class052163);
            }
            n2 = class114712.N();
        }
        if (n2 < n) {
            class11458.N(class052162, list, n2, n);
        }
        return class052162;
    }

    public static class05216 N(class00392 class003922, Pattern pattern, class00392 class003923) {
        return class11458.N(class003922, (string, bl) -> class11458.N(string, pattern, bl), class003923, false, true);
    }

    private static void N() {
        y = new String[1];
        class11458.y[0] = "This is a utility class and cannot be instantiated";
    }

    public static class05216 N(class00392 class003922, String string, class00392 class003923) {
        return class11458.N(class003922, (string2, bl) -> class11458.y(string2, string, bl), class003923, false, true);
    }

    public static class05216 N(class00392 class003922, String string) {
        return class11458.y(class003922, string, (class00392)class00392.i());
    }

    private static class05216 N(class00392 class003922, class11486 class114862, class00392 class003923, boolean bl, boolean bl2) {
        ArrayList<class11468> arrayList = new ArrayList<class11468>();
        class11458.N(class003922, arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        for (class11468 class114682 : arrayList) {
            stringBuilder.append(class114682.N());
        }
        String string = stringBuilder.toString();
        List<class11471> var8 = class114862.collect(string, bl);
        if (var8.isEmpty()) {
            return class003922.L();
        }
        return class11458.N(arrayList, string.length(), var8, class003923, bl2);
    }

    public static class05216 N(class00392 class003922, Pattern pattern) {
        return class11458.u(class003922, pattern, (class00392)class00392.i());
    }

    private static void N(class00392 class003922, List<class11468> list) {
        class01751 class017512;
        Object object2 = class003922.method_10851();
        if (object2 instanceof class01751 && (object2 = (class017512 = (class01751)object2).comp_737()) != null && !((String)object2).isEmpty()) {
            list.add(new class11468((String)object2, class003922.method_10866()));
        }
        for (Object object2 : class003922.method_10855()) {
            class11458.N((class00392)object2, list);
        }
    }
}

