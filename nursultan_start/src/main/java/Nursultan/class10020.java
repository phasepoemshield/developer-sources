/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09962
 *  Nursultan.class09980
 *  Nursultan.class09982
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09962;
import Nursultan.class09980;
import Nursultan.class09982;
import Nursultan.class10019;
import Nursultan.class10021;
import Nursultan.class10036;
import Nursultan.class10038;
import Nursultan.class10040;
import Nursultan.class10048;
import Nursultan.class10052;
import Nursultan.class10061;
import java.util.ArrayList;

final class class10020 {
    private final class10052 N;
    private final class10040 y;
    private final ArrayList<class10021> L = new ArrayList();
    private final ArrayList<class10021> u = new ArrayList();
    private final ArrayList<class10021> i = new ArrayList();

    private void L(class10021 class100212, class10036 class100362, float f) {
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (class10048.N(class100213)) continue;
            class10061 class100612 = this.N.N(class100213);
            class09980 class099802 = class100213.o();
            class09962 class099622 = class10048.y(class099802, class100362);
            float f2 = class10019.N(class100213) ? (class100362 == class10036.WIDTH ? this.N.y() : this.N.L()) : f;
            class100612.N(class100362, switch (class10038.N[class099622.u().ordinal()]) {
                default -> throw new MatchException(null, null);
                case 2 -> this.N(class099802, class100362, f2);
                case 3 -> class10048.L(class099802, class100362, f2);
                case 1 -> class10048.N(class099802, class100362, class099622.M());
                case 4 -> class10048.L(class099802, class100362, class100612.u(class100362));
            });
            this.y(class100213, class100362);
        }
    }

    class10020(class10052 class100522) {
        this.N = class100522;
        this.y = new class10040(class100522);
    }

    private void y(class10021 class100212, class10036 class100362) {
        class10061 class100612 = this.N.N(class100212);
        class100612.y(class100362, class100612.L(class100362));
        class100612.N(class100362, this.N.N(class100212, class100362, class100612.L(class100362)));
        class100612.i(class100362);
    }

    private void y(class10021 class100212, class10036 class100362, float f) {
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (!class10048.N(class100213)) continue;
            class10061 class100612 = this.N.N(class100213);
            class09980 class099802 = class100213.o();
            class09962 class099622 = class10048.y(class099802, class100362);
            float f2 = switch (class10038.N[class099622.u().ordinal()]) {
                default -> throw new MatchException(null, null);
                case 2 -> class10048.i(class099802, class100362, f);
                case 3 -> class10048.L(class099802, class100362, f);
                case 1 -> Math.min(class10048.N(class099802, class100362, class099622.M()), f);
                case 4 -> class10048.L(class099802, class100362, Math.min(class100612.u(class100362), f));
            };
            class100612.N(class100362, Math.max(class100612.N(class100362), f2));
            this.y(class100213, class100362);
        }
    }

    private float N(class09980 class099802, class10036 class100362, float f) {
        float f2 = Math.max(0.0f, f - class10048.R(class099802, class100362));
        float f3 = class10048.y(class099802, class100362).i(f2);
        return class10048.N(class099802, class100362, f3);
    }

    private static boolean N(class09980 class099802, class10036 class100362) {
        return class100362 == class10036.HEIGHT && class099802.y();
    }

    void N(class10021 class100212, class10036 class100362, float f) {
        class10061 class100612 = this.N.N(class100212);
        class09980 class099802 = class100212.o();
        class09962 class099622 = class10048.y(class099802, class100362);
        float f2 = class100612.u(class100362);
        class100612.N(class100362, switch (class10038.N[class099622.u().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> class10048.N(class099802, class100362, class099622.M());
            case 2 -> class10048.i(class099802, class100362, f);
            case 3 -> class10048.L(class099802, class100362, f);
            case 4 -> class10048.R(class099802, class100362, f2);
        });
        class100612.y(class100362, class100612.L(class100362));
        this.y(class100212, class100362);
    }

    void N(class10021 class100212, class10036 class100362) {
        this.N(class100212, class100362, false);
    }

    private void N(class10021 class100212, class10036 class100362, boolean bl) {
        if (class100362 == class10036.WIDTH) {
            ++this.N.i().L;
        } else {
            ++this.N.i().u;
        }
        class09980 class099802 = class100212.o();
        float f = class10048.N(this.N.N(class100212), class099802, class100362);
        if (class10048.N(class099802, class100362)) {
            this.N(class100212, class099802, class100362, f, bl);
        } else {
            this.y(class100212, class100362, f);
        }
        this.L(class100212, class100362, f);
        boolean bl2 = bl || class10020.N(class099802, class100362);
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            this.N(class100213, class100362, bl2);
        }
    }

    private void N(class10021 class100212, class09980 class099802, class10036 class100362, float f, boolean bl) {
        float f2;
        Object object;
        ArrayList<class10021> var6 = this.L;
        ArrayList<class10021> var7 = this.u;
        ArrayList<class10021> var8 = this.i;
        var6.clear();
        var7.clear();
        var8.clear();
        int n = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (!class10048.N(class100213)) continue;
            ++n;
            class10061 class100612 = this.N.N(class100213);
            class09980 class099803 = class100213.o();
            object = class10048.y(class099803, class100362);
            if (object.u() == class09982.PERCENT) {
                var8.add(class100213);
                f4 += object.M();
                f5 += class10048.R(class099803, class100362);
            } else {
                f3 += class100612.L(class100362);
            }
            if (object.u() != class09982.FIXED) {
                var6.add(class100213);
            }
            if (object.u() != class09982.GROW) continue;
            var7.add(class100213);
        }
        if (n == 0) {
            return;
        }
        f3 += class10048.N(n, class099802.E());
        if (!var8.isEmpty()) {
            float f6 = Math.max(0.0f, f - f3);
            float f7 = Math.max(0.0f, f6 - f5);
            float f8 = f4 > 100.01f ? f4 : 100.0f;
            for (int i = 0; i < var8.size(); ++i) {
                object = var8.get(i);
                class10061 class100613 = this.N.N((class10021)object);
                class09980 class099804 = ((class10021)object).o();
                class09962 class099622 = class10048.y(class099804, class100362);
                float f9 = f7 * class099622.M() / f8;
                class100613.N(class100362, class10048.N(class099804, class100362, f9));
                f3 += class100613.L(class100362);
            }
        }
        if ((f2 = f - f3) < -0.01f) {
            if (bl || class10020.N(class099802, class100362)) {
                return;
            }
            if (!var6.isEmpty()) {
                this.y.N(var6, class100362, f2);
            }
            return;
        }
        if (f2 > 0.01f && !var7.isEmpty()) {
            this.y.y(var7, class100362, f2);
        }
    }
}

