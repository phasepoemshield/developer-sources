/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09962
 *  Nursultan.class09975
 *  Nursultan.class09991
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01028
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09962;
import Nursultan.class09975;
import Nursultan.class09991;
import Nursultan.class11630;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01028;

public class class11642 {
    public static Object N_0;

    private class11642() {
    }

    static {
        class11642.N();
        N_0 = class09991.N().N(class09975.ROW).N(class09962.N()).y(class09962.N());
    }

    public static class09798 y(class01028 class010282, int n, class09079 class090792, int n2) {
        return class11642.N(class11642.N(class010282, n, class090792, n2));
    }

    public static List<class09798> y(class00392 class003922, int n, class09079 class090792, int n2) {
        class11630 class116302 = new class11630(n, class090792, n2);
        class003922.N((class004052, string) -> {
            class116302.N(class004052, string);
            return Optional.empty();
        }, class00405.N);
        return class116302.N();
    }

    public static List<class09798> y(class00392 class003922, int n, int n2) {
        return class11642.y(class003922, n, class09079.REGULAR, n2);
    }

    public static class09798 y(class01028 class010282, int n, int n2) {
        return class11642.y(class010282, n, class09079.REGULAR, n2);
    }

    private static class09798 N(List<class09798> list) {
        return class09778.N((class09991)((class09991)N_0), (T class097842) -> class097842.N((Collection)list));
    }

    private static void N() {
    }

    public static class09798 N(class00392 class003922, int n, class09079 class090792, int n2) {
        return class11642.N(class11642.y(class003922, n, class090792, n2));
    }

    public static List<class09798> N(class01028 class010282, int n, int n2) {
        return class11642.N(class010282, n, class09079.REGULAR, n2);
    }

    public static List<class09798> N(class01028 class010282, int n3, class09079 class090792, int n4) {
        class11630 class116302 = new class11630(n3, class090792, n4);
        class010282.accept((n, class004052, n2) -> {
            class116302.N(class004052, n2);
            return true;
        });
        return class116302.N();
    }

    public static class09798 N(class00392 class003922, int n, int n2) {
        return class11642.N(class003922, n, class09079.REGULAR, n2);
    }
}

