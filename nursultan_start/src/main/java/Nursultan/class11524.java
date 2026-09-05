/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12002
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11494;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11517;
import Nursultan.class11523;
import Nursultan.class11525;
import Nursultan.class11527;
import Nursultan.class11532;
import Nursultan.class11533;
import Nursultan.class11535;
import Nursultan.class12002;
import Nursultan.class12018;
import java.util.Arrays;
import java.util.regex.Pattern;

public class class11524 {
    private class11524() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    @SafeVarargs
    public static <T extends class11535> class11523<T> y(class11512 class115122, String string, T ... TArray) {
        class11523<T> class115232 = new class11523<T>(class115122.N_7(string), Arrays.asList(TArray));
        return (class11523)class115122.N(class115232);
    }

    public static class11515 N(class11512 class115122, String string, int n) {
        class11515 class115152 = new class11515(class115122.N_7(string), n);
        return (class11515)class115122.N(class115152);
    }

    public static class11533 N(class11512 class115122, String string, String string2, Pattern pattern) {
        class12018 class120182 = class115122.N_7(string);
        class11533 class115332 = new class11533(class120182, string2, class120182.N("place-holder").N(), pattern);
        return (class11533)class115122.N(class115332);
    }

    public static class11525 N(class11512 class115122, String string, class11494 class114942, class11494 class114943, float f) {
        class11525 class115252 = new class11525(class115122.N_7(string), class114942, class114943, f);
        return (class11525)class115122.N(class115252);
    }

    public static class11504 N(class11512 class115122, String string, float f, float f2, float f3, float f4) {
        class11504 class115042 = new class11504(class115122.N_7(string), f, f2, f3, f4);
        return (class11504)class115122.N(class115042);
    }

    public static class11527 N(class11512 class115122, String string, class12002 class120022) {
        class11527 class115272 = new class11527(class115122.N_7(string), class120022);
        return (class11527)class115122.N(class115272);
    }

    @SafeVarargs
    public static <T extends class11535> class11517<T> N(class11512 class115122, String string, T ... TArray) {
        class11517<T> class115172 = new class11517<T>(class115122.N_7(string), Arrays.asList(TArray));
        return (class11517)class115122.N(class115172);
    }

    public static class11532 N(class11512 class115122, String string, Runnable runnable) {
        class11532 class115322 = new class11532(class115122.N_7(string), runnable);
        return (class11532)class115122.N(class115322);
    }

    public static class11507 N(class11512 class115122, String string, boolean bl) {
        class11507 class115072 = new class11507(class115122.N_7(string), bl);
        return (class11507)class115122.N(class115072);
    }
}

