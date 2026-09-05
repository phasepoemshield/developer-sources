/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00335
 *  minecraft.class00363
 *  minecraft.class00372
 *  minecraft.class01894
 *  minecraft.class02477
 *  minecraft.class06572
 *  minecraft.class06842
 *  minecraft.class07299
 *  minecraft.class08092
 *  minecraft.class08351
 *  minecraft.class08378
 *  minecraft.class08904
 *  minecraft.class08909
 *  minecraft.class08912
 *  minecraft.class08914
 *  minecraft.class08920
 *  minecraft.class08922
 *  minecraft.class08927
 *  minecraft.class08932
 *  minecraft.class08938
 *  minecraft.class08940
 */
package minecraft;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import minecraft.class00335;
import minecraft.class00363;
import minecraft.class00372;
import minecraft.class01894;
import minecraft.class02477;
import minecraft.class06572;
import minecraft.class06842;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08351;
import minecraft.class08378;
import minecraft.class08834;
import minecraft.class08843;
import minecraft.class08845;
import minecraft.class08895;
import minecraft.class08902;
import minecraft.class08904;
import minecraft.class08909;
import minecraft.class08912;
import minecraft.class08914;
import minecraft.class08920;
import minecraft.class08922;
import minecraft.class08927;
import minecraft.class08932;
import minecraft.class08938;
import minecraft.class08940;

public class class08825 {
    public static class08895 y(class08895 class088952, class08895 class088953) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd", Locale.ROOT);
        List list = class06842.y.stream().map(dateTimeFormatter::format).toList();
        return class08825.N(class08351.N((String)"MM-dd", (String)"", Optional.empty()), class088953, List.of(class08825.N(list, class088952)));
    }

    public static <T> class08895 N(class00372<T> class003722, List<class08940<T>> list) {
        return new class08932(new class08938(class003722, list), Optional.empty());
    }

    @SafeVarargs
    public static <T> class08895 N(class00372<T> class003722, class08940<T> ... class08940Array) {
        return class08825.N(class003722, List.of(class08940Array));
    }

    public static <T> class08895 N(class00372<T> class003722, class08895 class088952, List<class08940<T>> list) {
        return new class08932(new class08938(class003722, list), Optional.of(class088952));
    }

    @SafeVarargs
    public static <T> class08895 N(class00372<T> class003722, class08895 class088952, class08940<T> ... class08940Array) {
        return class08825.N(class003722, class088952, List.of(class08940Array));
    }

    public static <T> class08940<T> N(List<T> list, class08895 class088952) {
        return new class08940(list, class088952);
    }

    public static <T> class08940<T> N(T t, class08895 class088952) {
        return new class08940(List.of(t), class088952);
    }

    public static <T extends Comparable<T>> class08895 N(class08092<T> class080922, class08895 class088952, Map<T, class08895> map) {
        List list = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(entry -> {
            String string = class080922.y((Comparable)entry.getKey());
            return new class08940(List.of(string), (class08895)entry.getValue());
        }).toList();
        return class08825.N(new class00363(class080922.R()), class088952, list);
    }

    public static class08895 N(class08895 class088952, class08895 class088953) {
        return class08825.N(new class08378(), class088953, new class08940[]{class08825.N(class07299.field_25179, class088952)});
    }

    public static class08909 N(class02477<?> class024772) {
        return new class08902(class024772, false);
    }

    public static class08909 N() {
        return new class08914();
    }

    public static class08912 N(class08895 class088952, float f) {
        return new class08912(f, class088952);
    }

    public static class08895 N(class01894 class018942, class00335 class003352) {
        return new class08922(class018942, class003352);
    }

    public static class08895 N(class08895 ... class08895Array) {
        return new class08904(List.of(class08895Array));
    }

    public static class08843 N(int n) {
        return new class08834(n);
    }

    public static class08895 N(class01894 class018942, class08843 ... class08843Array) {
        return new class08845(class018942, List.of(class08843Array));
    }

    public static class08895 N(class01894 class018942) {
        return new class08845(class018942, List.of());
    }

    public static class08895 N(class08909 class089092, class08895 class088952, class08895 class088953) {
        return new class08927(class089092, class088952, class088953);
    }

    public static class08895 N(class06572 class065722, float f, List<class08912> list) {
        return new class08920(class065722, f, list, Optional.empty());
    }

    public static class08895 N(class06572 class065722, List<class08912> list) {
        return new class08920(class065722, 1.0f, list, Optional.empty());
    }

    public static class08895 N(class06572 class065722, class08895 class088952, List<class08912> list) {
        return new class08920(class065722, 1.0f, list, Optional.of(class088952));
    }

    public static class08895 N(class06572 class065722, float f, class08895 class088952, class08912 ... class08912Array) {
        return new class08920(class065722, f, List.of(class08912Array), Optional.of(class088952));
    }

    public static class08895 N(class06572 class065722, class08895 class088952, class08912 ... class08912Array) {
        return new class08920(class065722, 1.0f, List.of(class08912Array), Optional.of(class088952));
    }
}

