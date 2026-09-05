/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class09962
 *  Nursultan.class09970
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09980
 *  Nursultan.class09981
 *  Nursultan.class09982
 *  Nursultan.class09983
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09962;
import Nursultan.class09970;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09980;
import Nursultan.class09981;
import Nursultan.class09982;
import Nursultan.class09983;
import Nursultan.class10009;
import Nursultan.class10019;
import Nursultan.class10021;
import Nursultan.class10024;
import Nursultan.class10036;
import Nursultan.class10061;

final class class10048 {
    static final float N = 0.01f;
    static final int y = 1000;

    static float L(class09980 class099802, class10036 class100362) {
        return class100362 == class10036.WIDTH ? class099802.U().N() : class099802.U().y();
    }

    static float L(class09980 class099802) {
        return class099802.P() == class09981.OUTSIDE ? class10048.y(class099802) * 2.0f : 0.0f;
    }

    static float L(float f, float f2) {
        return class09693.N((float)f, (float)f2);
    }

    static float L(class09980 class099802, class10036 class100362, float f) {
        class09962 class099622 = class10048.y(class099802, class100362);
        float f2 = class10048.y(class099802, class100362, f);
        return class10048.N(class099802, class100362, class099622.L(f2));
    }

    static float M(class09980 class099802, class10036 class100362, float f) {
        class09962 class099622 = class10048.y(class099802, class100362);
        float f2 = class10048.y(class099802, class100362, f);
        float f3 = switch (class10024.L[class099622.u().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> 0.0f;
            case 2 -> class099622.M();
            case 3, 4 -> class099622.L(Math.max(f2, class099622.i()));
        };
        return class10048.N(class099802, class100362, f3);
    }

    private class10048() {
    }

    static float i(class09980 class099802, class10036 class100362) {
        float f = class10048.u(class099802);
        return switch (class10024.N[class100362.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> class099802.U().L() + f;
            case 2 -> class099802.U().i() + f;
        };
    }

    static float i(class09980 class099802, class10036 class100362, float f) {
        float f2 = class10048.y(class099802, class100362).i(f);
        float f3 = class10048.N(class099802, class100362, f2);
        return class09693.N((float)f, (float)0.0f, (float)f3);
    }

    static float u(class09980 class099802) {
        return class099802.P() == class09981.OUTSIDE ? class10048.y(class099802) : 0.0f;
    }

    static float u(class09980 class099802, class10036 class100362, float f) {
        class09962 class099622 = class10048.y(class099802, class100362);
        float f2 = class10048.y(class099802, class100362, f);
        return class10048.N(class099802, class100362, class10048.y(class099622.R(), f2));
    }

    static float u(class09980 class099802, class10036 class100362) {
        return class10048.L(class099802, class100362) + class10048.L(class099802);
    }

    static float y(class09980 class099802, class10036 class100362, float f) {
        float f2 = class099802.z() == class09983.CONTENT_BOX ? class10048.u(class099802, class100362) : 0.0f;
        return Math.max(0.0f, f - f2);
    }

    static float y(class09973 class099732, float f) {
        return class10048.N(class099732, f);
    }

    static float y(float f, float f2) {
        if (Float.isInfinite(f)) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(f2, f);
    }

    static class09962 y(class09980 class099802, class10036 class100362) {
        return class100362 == class10036.WIDTH ? class099802.Q() : class099802.O();
    }

    static float y(class09980 class099802) {
        return Math.max(0.0f, class099802.m());
    }

    static boolean N(float f, float f2) {
        return Math.abs(f - f2) < 0.01f;
    }

    static boolean N(class10009 class100092) {
        return class100092.y();
    }

    static boolean N(class09980 class099802, class10036 class100362) {
        return class099802.M() == class09975.ROW && class100362 == class10036.WIDTH || class099802.M() == class09975.COLUMN && class100362 == class10036.HEIGHT;
    }

    static boolean N(class09962 class099622) {
        return class099622.u() == class09982.FIT || class099622.u() == class09982.GROW;
    }

    static float N(int n, float f) {
        if (n <= 1) {
            return 0.0f;
        }
        return (float)(n - 1) * Math.max(0.0f, f);
    }

    static float N(int n, class10009 class100092, float f) {
        if (n <= 1) {
            return 0.0f;
        }
        if (class10048.N(class100092)) {
            return Math.max(0.0f, f) / (float)(n - 1);
        }
        return class100092.u();
    }

    static float N(int n, class10009 class100092) {
        if (n <= 1 || class10048.N(class100092)) {
            return 0.0f;
        }
        return class10048.N(n, class100092.u());
    }

    static float N(class10061 class100612, class09980 class099802, class10036 class100362) {
        float f = class100612.L(class100362);
        float f2 = class10048.u(class099802, class100362);
        float f3 = class100362 == class10036.WIDTH ? class10048.N(class099802) : 0.0f;
        return Math.max(0.0f, f - f2 - f3);
    }

    static float N(class09980 class099802) {
        return class099802.y() && class099802.k() == class09970.CLASSIC ? class099802.Y().N() : 0.0f;
    }

    static float N(class09980 class099802, class10036 class100362, float f) {
        float f2 = class099802.z() == class09983.CONTENT_BOX ? class10048.u(class099802, class100362) : 0.0f;
        return Math.max(0.0f, f + f2);
    }

    static boolean N(class10021 class100212) {
        return class10019.y(class100212);
    }

    static float N(class09973 class099732, float f) {
        float f2 = Math.max(0.0f, f);
        return switch (class10024.y[class099732.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> 0.0f;
            case 2 -> f2 * 0.5f;
            case 3 -> f2;
        };
    }

    static float R(class09980 class099802, class10036 class100362, float f) {
        class09962 class099622 = class10048.y(class099802, class100362);
        if (class099622.u() == class09982.PERCENT) {
            return class099622.u(f);
        }
        float f2 = class10048.y(class099802, class100362, f);
        return class10048.N(class099802, class100362, class099622.u(f2));
    }

    static float R(class09980 class099802, class10036 class100362) {
        return class10048.N(class099802, class100362, 0.0f);
    }
}

