/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class09781
 *  Nursultan.class09838
 *  Nursultan.class09868
 *  Nursultan.class09973
 *  Nursultan.class09980
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09781;
import Nursultan.class09838;
import Nursultan.class09868;
import Nursultan.class09973;
import Nursultan.class09980;
import Nursultan.class10021;
import Nursultan.class10067;
import java.util.Objects;

final class class10033 {
    private static final float N = 1.0f;
    private final class09781 y;

    class10033(class09781 class097812) {
        this.y = Objects.requireNonNull(class097812, "context");
    }

    private float N(String string, float f, class09838 class098382) {
        return this.y.y().N(string, f, class098382);
    }

    private float N(class09980 class099802, String string, float f, float f2) {
        float f3 = this.N(string, class099802.c(), class099802.X());
        float f4 = Math.max(0.0f, f2 - f3);
        class09973 class099732 = class099802.B();
        return f + (switch (class099732) {
            default -> throw new MatchException(null, null);
            case class09973.START -> 0.0f;
            case class09973.CENTER -> f4 * 0.5f;
            case class09973.END -> f4;
        });
    }

    float N(class10021 class100212, int n, float f) {
        String string = class100212.B();
        class09980 class099802 = class100212.o();
        float f2 = Math.max(0.0f, class100212.c().B());
        if (f2 <= 0.0f || string.isEmpty()) {
            return 0.0f;
        }
        float f3 = this.N(string, class099802.c(), class099802.X());
        float f4 = Math.max(0.0f, f3 - f2);
        int n2 = class10067.N(string, n);
        float f5 = this.N(string.substring(0, n2), class099802.c(), class099802.X());
        float f6 = Math.max(0.0f, f);
        float f7 = f6 + Math.max(0.0f, f2 - 1.0f);
        if (f5 < f6) {
            f6 = f5;
        } else if (f5 > f7) {
            f6 = f5 - Math.max(0.0f, f2 - 1.0f);
        }
        return class09693.N((float)f6, (float)0.0f, (float)f4);
    }

    int N(class10021 class100212, float f, float f2) {
        String string = class100212.B();
        class09980 class099802 = class100212.o();
        float f3 = this.N(class099802, string, class100212.c().R(), class100212.c().B());
        float f4 = f - f3 + Math.max(0.0f, f2);
        if (f4 <= 0.0f || string.isEmpty()) {
            return 0;
        }
        class09868 class098682 = this.y.y();
        float f5 = class099802.c();
        class09838 class098382 = class099802.X();
        float f6 = 0.0f;
        int n = -1;
        int n2 = 0;
        while (n2 < string.length()) {
            float f7;
            int n3 = string.codePointAt(n2);
            int n4 = n2 + Character.charCount(n3);
            if (n >= 0) {
                f6 += class098682.N(n, n3, f5, class098382);
            }
            if (f4 < f6 + (f7 = class098682.N(n3, f5, class098382)) * 0.5f) {
                return n2;
            }
            if (f4 < (f6 += f7)) {
                return n4;
            }
            n = n3;
            n2 = n4;
        }
        return string.length();
    }
}

