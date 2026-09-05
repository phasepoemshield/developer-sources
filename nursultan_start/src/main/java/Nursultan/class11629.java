/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09798
 *  Nursultan.class09860
 *  Nursultan.class09865
 *  Nursultan.class09867
 *  Nursultan.class09969
 *  Nursultan.class09973
 *  Nursultan.class09991
 *  Nursultan.class10003
 */
package Nursultan;

import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09798;
import Nursultan.class09860;
import Nursultan.class09865;
import Nursultan.class09867;
import Nursultan.class09969;
import Nursultan.class09973;
import Nursultan.class09991;
import Nursultan.class10003;
import java.util.function.Consumer;

public class class11629 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;

    private static void L() {
        N_0 = 500;
        N_1 = 1000;
        N_2 = 1001;
        N_3 = 2000;
        N_4 = 2001;
        N_5 = 256;
    }

    private class11629() {
    }

    static {
        class11629.y();
        class11629.L();
    }

    private static void y() {
    }

    public static class09991 N() {
        return class09991.N().N(class09969.FLOATING).u(0.0f, 0.0f);
    }

    private static void N(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static class09798 N(String string, int n, Runnable runnable) {
        return class09778.N((class09991)class09991.N().N(class09969.FIXED).R().N(n), (T class097842) -> ((class09784)((class09784)((class09784)class097842.N(string)).N(class09867.CLICK, class098602 -> {
            class11629.N(runnable);
            class098602.T();
        })).N(class09867.POINTER_DOWN, class09860::T)).N(class09867.KEY_DOWN, class098602 -> {
            class09865 class098652;
            if (class098602 instanceof class09865 && (class098652 = (class09865)class098602).y() && class098652.N() == 256) {
                class11629.N(runnable);
                class098602.T();
            }
        }));
    }

    public static class09798 N(class09991 class099912, Consumer<class09784> consumer) {
        return class09778.N((class09991)class099912, (T class097842) -> {
            class11629.N(class097842);
            consumer.accept((class09784)class097842);
        });
    }

    public static class09991 N(String string, float f, int n) {
        return class09991.N().N(class09969.FIXED).N(string).N(class10003.BOTTOM, f).L(class09973.START).i().N(n);
    }

    private static void N(class09784 class097842) {
        class097842.N(class09867.CLICK, class09860::T);
        class097842.N(class09867.POINTER_DOWN, class09860::T);
    }
}

