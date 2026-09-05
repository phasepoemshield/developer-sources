/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09778
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09991
 *  Nursultan.class10945
 *  Nursultan.class11727
 *  Nursultan.class11757
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class09198;
import Nursultan.class09250;
import Nursultan.class09778;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09991;
import Nursultan.class10945;
import Nursultan.class11727;
import Nursultan.class11757;
import Nursultan.class11938;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class class09191 {
    private static String[] u;
    public static Object N_0;

    private class09191() {
    }

    static {
        class09191.N();
        class09191.y();
        N_0 = new class09191()::N;
    }

    private static void y() {
    }

    private static void N() {
        u = new String[1];
        class09191.u[0] = "accountsRevision";
    }

    private class09798 N(Void void_, class09809 class098092) {
        class10945 class109452 = class11938.s();
        class098092.L(u[0], () -> ((class10945)class109452).N());
        List var4 = class109452.u().stream().sorted(Comparator.comparingInt(class092502 -> class092502.y() ? 0 : 1).thenComparing(Comparator.comparingLong(class09250::M).reversed())).toList();
        class11727.N(var4.stream().map(class09250::R).collect(Collectors.toSet()));
        return class09778.N((class09991)((class09991)class09198.N_0), class097843 -> class097843.N_3((class09991)class09198.N_2, class097842 -> {
            for (class09250 class092502 : var4) {
                class097842.y(class098092.N("account:" + String.valueOf(class092502.R()), (class09788)class11727.B_1, (Object)new class11757(class092502)));
            }
        }));
    }
}

