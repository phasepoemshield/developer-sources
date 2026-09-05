/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01478
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04025
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class04336
 *  minecraft.class05946
 *  minecraft.class06225
 *  minecraft.class06386
 *  minecraft.class06391
 *  minecraft.class07211
 */
package minecraft;

import java.util.List;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01478;
import minecraft.class01894;
import minecraft.class03149;
import minecraft.class03155;
import minecraft.class03156;
import minecraft.class03157;
import minecraft.class03161;
import minecraft.class03168;
import minecraft.class03170;
import minecraft.class03177;
import minecraft.class03192;
import minecraft.class03193;
import minecraft.class03238;
import minecraft.class03556;
import minecraft.class04025;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class05946;
import minecraft.class06225;
import minecraft.class06386;
import minecraft.class06391;
import minecraft.class07211;

public class class03188 {
    public static class05946<class03238<?, ?>> N(String string) {
        return class05946.N((class05946)class04227.Nh, (class01894)class01894.y((String)string));
    }

    public static <FC extends class06386, F extends class06391<FC>> class01478 N(F f, FC FC) {
        return class03188.N(f, FC, List.of(), 96);
    }

    public static <FC extends class06386, F extends class06391<FC>> class01478 N(F f, FC FC, List<class00891> list) {
        return class03188.N(f, FC, list, 96);
    }

    public static void N(class04116<class03238<?, ?>> class041162, class05946<class03238<?, ?>> class059462, class06391<class06225> class063912) {
        class03188.N(class041162, class059462, class063912, class06386.R);
    }

    public static <FC extends class06386, F extends class06391<FC>> void N(class04116<class03238<?, ?>> class041162, class05946<class03238<?, ?>> class059462, F f, FC FC) {
        class041162.N(class059462, new class03238<FC, F>(f, FC));
    }

    public static void N(class04116<class03238<?, ?>> class041162) {
        class03157.N(class041162);
        class03192.N(class041162);
        class03155.N(class041162);
        class03177.N(class041162);
        class03161.N(class041162);
        class03156.N(class041162);
        class03149.N(class041162);
        class03168.N(class041162);
        class03193.N(class041162);
    }

    private static class04025 N(List<class00891> list) {
        class04025 class040252 = !list.isEmpty() ? class04025.N((class04025)class04025.L, (class04025)class04025.N((class00753)class07211.field_11033.E(), list)) : class04025.L;
        return class040252;
    }

    public static class01478 N(int n, class03556<class04336> class035562) {
        return new class01478(n, 7, 3, class035562);
    }

    public static <FC extends class06386, F extends class06391<FC>> class01478 N(F f, FC FC, List<class00891> list, int n) {
        return class03188.N(n, class03170.N(f, FC, class03188.N(list)));
    }
}

