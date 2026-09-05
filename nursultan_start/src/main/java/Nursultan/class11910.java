/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11796
 *  Nursultan.class11797
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class00518
 *  minecraft.class01056
 *  minecraft.class01683
 *  minecraft.class01890
 *  minecraft.class03448
 *  minecraft.class03458
 *  minecraft.class04453
 *  minecraft.class04568
 *  minecraft.class06202
 *  minecraft.class06683
 */
package Nursultan;

import Nursultan.class11796;
import Nursultan.class11797;
import Nursultan.class11825;
import Nursultan.class11920;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class00518;
import minecraft.class01056;
import minecraft.class01683;
import minecraft.class01890;
import minecraft.class03448;
import minecraft.class03458;
import minecraft.class04453;
import minecraft.class04568;
import minecraft.class06202;
import minecraft.class06683;

public class class11910 {
    private static String[] i;
    private static String[] B;
    private static String[] b;
    private static String[] j;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;

    public static String L() {
        if ((class03448)((class06202)class11910.N_4).T_3 == null || (class04453)((class06202)class11910.N_4).T_4 == null) {
            return i[2];
        }
        class04568 class045682 = ((class06202)N_4).yN();
        if (class045682 == null) {
            return i[3];
        }
        String string = class045682.y.split(B[0])[0];
        if (string.matches(B[1])) {
            return string.toLowerCase();
        }
        String[] stringArray = string.split(B[2]);
        if (stringArray.length >= 2) {
            return stringArray[stringArray.length - 2].toLowerCase();
        }
        return b[0];
    }

    public static int M() {
        class00518 class005182 = class11910.R();
        if (class005182 == null) {
            return -1;
        }
        Matcher matcher = ((Pattern)N_2).matcher(class005182.i().getString());
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(2));
        }
        return -1;
    }

    private class11910() {
        throw new UnsupportedOperationException(b[1]);
    }

    static {
        class11910.z();
        class11910.Z();
        N_0 = Pattern.compile(b[2]);
        N_2 = Pattern.compile(b[3], 64);
        N_4 = class06202.Nq();
    }

    public static boolean B() {
        if ((class04453)((class06202)class11910.N_4).T_4 == null || ((class04453)((class06202)class11910.N_4).T_4).method_5476() == null) {
            return false;
        }
        return class11910.N(new String[]{j[1]});
    }

    private static void Z() {
        N_1 = b[4];
        N_3 = b[5];
        N_5 = b[6];
    }

    public static boolean i() {
        if ((class04453)((class06202)class11910.N_4).T_4 == null || ((class04453)((class06202)class11910.N_4).T_4).method_5476() == null) {
            return false;
        }
        if (!class11910.y(j[2])) {
            return false;
        }
        return ((class04453)((class06202)class11910.N_4).T_4).method_5476().getString().contains(j[3]);
    }

    private static void z() {
        j = new String[5];
        class11910.j[0] = "/";
        class11910.j[1] = "\u043d\u0430\u0448 \u0441\u0430\u0439\u0442: reallyworld.ru";
        class11910.j[2] = "\u26a1";
        class11910.j[3] = "\u26a1";
        class11910.j[4] = "\u041c\u043e\u043d\u0435\u0442:";
        i = new String[4];
        class11910.i[0] = "[,.]";
        class11910.i[1] = "";
        class11910.i[2] = "localhost";
        class11910.i[3] = "localhost";
        B = new String[3];
        class11910.B[0] = ":";
        class11910.B[1] = "\\d{1,3}(\\.\\d{1,3}){3}";
        class11910.B[2] = "\\.";
        b = new String[7];
        class11910.b[0] = "localhost";
        class11910.b[1] = "This is a utility class and cannot be instantiated";
        class11910.b[2] = ":\\s*(\\d+)";
        class11910.b[3] = "(?i).*?(\u0430\u043d\u0430\u0440\u0445\u0438\u044f)-(\\d+)";
        class11910.b[4] = "\\d{1,3}(\\.\\d{1,3}){3}";
        class11910.b[5] = "localhost";
        class11910.b[6] = "\u26a1";
    }

    public static int u() {
        class01683 class016832 = ((class06202)N_4).NE();
        if ((class04453)((class06202)class11910.N_4).T_4 == null || (class03448)((class06202)class11910.N_4).T_3 == null || class016832 == null) {
            return 0;
        }
        class03458 class034582 = class016832.N(((class04453)((class06202)class11910.N_4).T_4).method_7334().id());
        return class034582 != null ? class034582.R() : 0;
    }

    public static boolean y(String ... stringArray) {
        if (stringArray.length == 0) {
            return false;
        }
        class00518 class005182 = class11910.R();
        if (class005182 == null) {
            return false;
        }
        for (String string : stringArray) {
            if (!class005182.i().getString().trim().toLowerCase().contains(string.toLowerCase())) continue;
            return true;
        }
        return false;
    }

    public static Optional<Long> y() {
        if (!class11910.i()) {
            return Optional.empty();
        }
        for (class00502 class005022 : ((class03448)((class06202)class11910.N_4).T_3).method_8428().i()) {
            Matcher matcher;
            if (!class005022.R().getString().contains(j[4]) || !(matcher = ((Pattern)N_0).matcher(class005022.R().getString().replaceAll(i[0], i[1]))).find()) continue;
            return Optional.of(Long.parseLong(matcher.group(1)));
        }
        return Optional.empty();
    }

    public static boolean N(String ... stringArray) {
        if (stringArray.length == 0) {
            return false;
        }
        class00392 class003922 = ((class01056)((class06202)class11910.N_4).i_6).Z().y;
        if (class003922 == null) {
            return false;
        }
        for (String string : stringArray) {
            if (!class003922.getString().trim().toLowerCase().contains(string.toLowerCase())) continue;
            return true;
        }
        return false;
    }

    public static void N(String string) {
        if (string.startsWith(j[0])) {
            ((class06202)N_4).NE().u(string.substring(1));
            return;
        }
        ((class06202)N_4).NE().L(string);
    }

    public static class11920 N() {
        return (class11920)((Object)((class11796)((class11825)((class04453)((class06202)class11910.N_4).T_4)).dataManager()).N().N());
    }

    public static void N(class00381<?> class003812) {
        ((class11797)((class06202)N_4).NE().M()).sendPacketSilent(class003812);
    }

    public static class00518 R() {
        int n;
        if ((class04453)((class06202)class11910.N_4).T_4 == null || (class03448)((class06202)class11910.N_4).T_3 == null) {
            return null;
        }
        class06683 class066832 = ((class03448)((class06202)class11910.N_4).T_3).method_8428();
        class00518 class005182 = null;
        class00502 class005022 = class066832.y(((class04453)((class06202)class11910.N_4).T_4).method_5820());
        if (class005022 != null && (n = class005022.P().y()) >= 0) {
            class005182 = class066832.N(class01890.values()[3 + n]);
        }
        return class005182 != null ? class005182 : class066832.N(class01890.values()[1]);
    }
}

