/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import minecraft.class00686;
import minecraft.class00689;
import minecraft.class00690;
import minecraft.class00694;
import minecraft.class00697;
import minecraft.class00699;
import minecraft.class00705;
import minecraft.class00706;
import minecraft.class00707;
import minecraft.class00708;
import minecraft.class00713;
import minecraft.class00715;
import minecraft.class00716;

public class class00702<T extends class00699> {
    private static class00702<?>[] E = new class00702[0];
    public static final class00702<class00697> N = class00702.N(class00697.class, "HoldingPattern");
    public static final class00702<class00686> y = class00702.N(class00686.class, "StrafePlayer");
    public static final class00702<class00715> L = class00702.N(class00715.class, "LandingApproach");
    public static final class00702<class00705> u = class00702.N(class00705.class, "Landing");
    public static final class00702<class00694> i = class00702.N(class00694.class, "Takeoff");
    public static final class00702<class00706> R = class00702.N(class00706.class, "SittingFlaming");
    public static final class00702<class00716> M = class00702.N(class00716.class, "SittingScanning");
    public static final class00702<class00707> B = class00702.N(class00707.class, "SittingAttacking");
    public static final class00702<class00708> Z = class00702.N(class00708.class, "ChargingPlayer");
    public static final class00702<class00713> z = class00702.N(class00713.class, "Dying");
    public static final class00702<class00689> U = class00702.N(class00689.class, "Hover");
    private final Class<? extends class00699> W;
    private final int m;
    private final String P;

    public static int L() {
        return E.length;
    }

    private class00702(int n, Class<? extends class00699> clazz, String string) {
        this.m = n;
        this.W = clazz;
        this.P = string;
    }

    public String toString() {
        return this.P + " (#" + this.m + ")";
    }

    public int y() {
        return this.m;
    }

    public class00699 N(class00690 class006902) {
        try {
            Constructor<class00699> var2 = this.N();
            return var2.newInstance(new Object[]{class006902});
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }

    private static <T extends class00699> class00702<T> N(Class<T> clazz, String string) {
        class00702<T> class007022 = new class00702<T>(E.length, clazz, string);
        E = Arrays.copyOf(E, E.length + 1);
        class00702.E[class007022.y()] = class007022;
        return class007022;
    }

    protected Constructor<? extends class00699> N() throws NoSuchMethodException {
        return this.W.getConstructor(class00690.class);
    }

    public static class00702<?> N(int n) {
        if (n < 0 || n >= E.length) {
            return N;
        }
        return E[n];
    }
}

