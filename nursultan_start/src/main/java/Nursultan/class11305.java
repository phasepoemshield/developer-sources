/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11279
 *  Nursultan.class11284
 *  Nursultan.class11921
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  minecraft.class05216
 *  minecraft.class05410
 *  minecraft.class06584
 *  minecraft.class06922
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class07490
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class11279;
import Nursultan.class11284;
import Nursultan.class11921;
import Nursultan.class11929;
import Nursultan.class11938;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import minecraft.class05216;
import minecraft.class05410;
import minecraft.class06584;
import minecraft.class06922;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07490;
import minecraft.class07510;

public class class11305 {
    private static String[] N;

    private static void L() {
    }

    private static boolean L(class07482 class074822, int n2) {
        return IntStream.range(0, n2).noneMatch(n -> class074822.L(n).R());
    }

    public static class11284 L(class06922 class069222, int n, int n2, int n3, int n4) {
        int n5 = class069222.N.method_5439();
        return class11305.N(N[2], n, n2, n3, n4, 25, (Boolean bl) -> class11305.y((class07482)class069222, n5, (boolean)bl));
    }

    public static class11284 L(class07490 class074902, int n, int n2, int n3, int n4) {
        int n5 = class074902.E().method_5439();
        return class11305.N(N[4], n, n2, n3, n4, 0, (Boolean bl) -> class11305.L((class07482)class074902, n5, (boolean)bl));
    }

    private static void L(class07482 class074822, int n, boolean bl) {
        class11305.N(class074822, 0, n, 1, class07510.field_7795, bl, class06937::R);
    }

    private class11305() {
        throw new UnsupportedOperationException(N[7]);
    }

    static {
        class11305.L();
        class11305.y();
        class11305.N();
    }

    private static void y() {
    }

    private static void y(class07482 class074822, int n, boolean bl) {
        class11305.N(class074822, 0, n, 0, class07510.field_7794, bl, class06937::R);
    }

    public static boolean y(class06922 class069222) {
        return class11305.L((class07482)class069222, class069222.N.method_5439());
    }

    private static boolean y(class07482 class074822, int n) {
        for (int i = n; i < n + 36; ++i) {
            class06937 class069372 = class074822.L(i);
            if (!class069372.R() || class11929.y((class06584)class069372.i())) continue;
            return false;
        }
        return true;
    }

    public static class11284 y(class07490 class074902, int n, int n2, int n3, int n4) {
        int n5 = class074902.E().method_5439();
        return class11305.N(N[6], n, n2, n3, n4, 50, (Boolean bl) -> class11305.N((class07482)class074902, n5, (boolean)bl));
    }

    public static class11284 y(class06922 class069222, int n, int n2, int n3, int n4) {
        int n5 = class069222.N.method_5439();
        return class11305.N(N[1], n, n2, n3, n4, 0, (Boolean bl) -> class11305.L((class07482)class069222, n5, (boolean)bl));
    }

    public static boolean y(class07490 class074902) {
        return class11305.y((class07482)class074902, class074902.E().method_5439());
    }

    private static class11284 N(String string, int n, int n2, int n3, int n4, int n5, Consumer<Boolean> consumer) {
        class05216 class052162 = class11921.N((String)string);
        return new class11279(class052162, class053622 -> {}).N(100, 20).y((n - n3) / 2 + n3 + 5, (n2 - n4) / 2 + n5).N((T class053622) -> consumer.accept(true)).y((T class053622) -> consumer.accept(false)).N();
    }

    public static class11284 N(class05410 class054102, int n, int n2) {
        class05216 class052162 = class11921.N((String)N[0]);
        return new class11279(class052162, class053622 -> {}).N(100, 20).y(n / 2 - 50, n2 / 2 - 105).N((T class053622) -> class11305.N(class054102, true)).y((T class053622) -> class11305.N(class054102, false)).N();
    }

    public static boolean N(class07490 class074902) {
        return class11305.L((class07482)class074902, class074902.E().method_5439());
    }

    public static class11284 N(class07490 class074902, int n, int n2, int n3, int n4) {
        int n5 = class074902.E().method_5439();
        return class11305.N(N[5], n, n2, n3, n4, 25, (Boolean bl) -> class11305.y((class07482)class074902, n5, (boolean)bl));
    }

    public static class11284 N(class06922 class069222, int n, int n2, int n3, int n4) {
        int n5 = class069222.N.method_5439();
        return class11305.N(N[3], n, n2, n3, n4, 50, (Boolean bl) -> class11305.N((class07482)class069222, n5, (boolean)bl));
    }

    public static boolean N(class06922 class069222) {
        return class11305.y((class07482)class069222, class069222.N.method_5439());
    }

    private static void N(class05410 class054102, boolean bl) {
        class11305.N(class054102.E(), 0, 46, 1, class07510.field_7795, bl, class06937::R);
    }

    private static void N(class07482 class074822, int n, int n2, int n3, class07510 class075102, boolean bl, Predicate<class06937> predicate) {
        for (int i = n; i < n2; ++i) {
            class06937 class069372 = class074822.L(i);
            if (!predicate.test(class069372)) continue;
            class11938.m().N(class074822.b, i, n3, class075102).y();
            if (bl) break;
        }
    }

    private static void N(class07482 class074822, int n, boolean bl) {
        class11305.N(class074822, n, n + 36, 0, class07510.field_7794, bl, (class06937 class069372) -> class069372.R() && !class11929.y((class06584)class069372.i()));
    }

    private static void N() {
        N = new String[8];
        class11305.N[0] = "inventory.throw-all";
        class11305.N[1] = "inventory.throw-all";
        class11305.N[2] = "inventory.take-all";
        class11305.N[3] = "inventory.put-all";
        class11305.N[4] = "inventory.throw-all";
        class11305.N[5] = "inventory.take-all";
        class11305.N[6] = "inventory.put-all";
        class11305.N[7] = "This is a utility class and cannot be instantiated";
    }
}

