/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10019
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09794;
import Nursultan.class09828;
import Nursultan.class09833;
import Nursultan.class09861;
import Nursultan.class10019;
import Nursultan.class10021;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

final class class09831 {
    private static final float N = 28.0f;
    private final class09794 y;
    private final Map<class10021, class09861> L = new IdentityHashMap<class10021, class09861>();
    private class09833 u = class09833.N();

    private static boolean L(class10021 class100212, float f) {
        if (class100212 == null || !class100212.o().y() || class100212.c().P() <= 0.0f) {
            return false;
        }
        float f2 = class100212.c().m();
        float f3 = class100212.c().P();
        return f > 0.0f && f2 > 0.0f || f < 0.0f && f2 < f3;
    }

    class09831(class09794 class097942) {
        this.y = Objects.requireNonNull(class097942, "uiScalePolicy");
    }

    void y() {
        this.L.clear();
    }

    void y(class10021 class100212) {
        if (this.L.isEmpty()) {
            return;
        }
        this.L.keySet().removeIf(class100213 -> !class09831.N(class100212, class100213));
    }

    private boolean y(class10021 class100212, float f) {
        float f2 = class100212.c().m() - f * 28.0f;
        if (!class100212.c().R(f2, this.y.N())) {
            return false;
        }
        class100212.i(8);
        return true;
    }

    private static boolean N(class10021 class100212, class10021 class100213) {
        if (class100212 == null || class100213 == null) {
            return false;
        }
        return class09828.N(class100212, class100213) && class100213.o().y() && class100213.c().P() > 0.0f;
    }

    private static float N(float f, float f2, float f3) {
        if (f2 <= 0.0f || f3 <= 0.0f) {
            return f;
        }
        return f * (float)Math.exp(-f2 * f3);
    }

    void N(class09833 class098332) {
        this.u = Objects.requireNonNull(class098332, "nextOptions");
        if (!this.u.L()) {
            this.y();
        }
    }

    class09833 N() {
        return this.u;
    }

    void N(class10021 class100212) {
        if (class100212 != null) {
            this.L.remove(class100212);
        }
    }

    private void N(class10021 class100213, float f, float f2) {
        this.L.computeIfAbsent(class100213, class100212 -> new class09861()).y(-f * f2);
    }

    boolean N(class10021 class100212, float f) {
        if (class100212 == null || this.L.isEmpty()) {
            return false;
        }
        if (!this.u.L()) {
            this.y();
            return false;
        }
        boolean bl = false;
        float f2 = Math.max(0.0f, f);
        Iterator<Map.Entry<class10021, class09861>> var5 = this.L.entrySet().iterator();
        while (var5.hasNext()) {
            float f3;
            Map.Entry<class10021, class09861> entry = var5.next();
            class10021 class100213 = entry.getKey();
            class09861 class098612 = entry.getValue();
            if (!class09831.N(class100212, class100213)) {
                var5.remove();
                continue;
            }
            if (f2 <= 0.0f) continue;
            float f4 = class100213.c().P();
            float f5 = class100213.c().m() + class098612.N() * f2;
            if (class100213.c().R(f5, this.y.N())) {
                class100213.i(8);
                bl = true;
            }
            if ((f3 = class100213.c().m()) <= 0.0f && class098612.N() < 0.0f || f3 >= f4 && class098612.N() > 0.0f) {
                var5.remove();
                continue;
            }
            float f6 = class09831.N(class098612.N(), this.u.i(), f2);
            if (Math.abs(f6) <= this.u.R()) {
                var5.remove();
                continue;
            }
            class098612.N(f6);
        }
        return bl;
    }

    boolean N(class10021 class100212, class10021 class100213, float f) {
        if (class100212 == null || f == 0.0f) {
            return false;
        }
        if (class100213 != null && !class09828.N(class100213, class100212)) {
            return false;
        }
        for (class10021 class100214 = class100212; class100214 != null; class100214 = class100214.X()) {
            if (!class09831.L(class100214, f)) {
                if (class100214 != class100213 && !class10019.N((class10021)class100214)) continue;
                break;
            }
            if (!this.u.L()) {
                return this.y(class100214, f);
            }
            this.N(class100214, f, this.u.u());
            return true;
        }
        return false;
    }
}

