/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09715
 *  Nursultan.class09728
 *  Nursultan.class09736
 *  Nursultan.class09743
 *  Nursultan.class09781
 *  Nursultan.class09782
 *  Nursultan.class09815
 *  Nursultan.class09962
 *  Nursultan.class09980
 *  Nursultan.class09982
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09715;
import Nursultan.class09728;
import Nursultan.class09736;
import Nursultan.class09743;
import Nursultan.class09781;
import Nursultan.class09782;
import Nursultan.class09815;
import Nursultan.class09962;
import Nursultan.class09980;
import Nursultan.class09982;
import Nursultan.class10021;
import Nursultan.class10023;
import Nursultan.class10036;
import Nursultan.class10039;
import Nursultan.class10044;
import Nursultan.class10048;
import java.util.ArrayDeque;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public final class class10037 {
    private static final float N = 0.001f;
    private final class09715 y;
    private final Map<class10021, class10044> L = new IdentityHashMap<class10021, class10044>();

    private class10037(class09715 class097152) {
        this.y = Objects.requireNonNull(class097152, "animationManager");
    }

    private static boolean y(class09962 class099622, class09962 class099623) {
        if (class099622 == null || class099623 == null || class099622.u() != class099623.u()) {
            return false;
        }
        return switch (class099622.u()) {
            default -> throw new MatchException(null, null);
            case class09982.FIXED, class09982.PERCENT -> {
                if (Float.isFinite(class099622.M()) && Float.isFinite(class099623.M())) {
                    yield true;
                }
                yield false;
            }
            case class09982.FIT, class09982.GROW -> Float.isFinite(class099622.i()) && Float.isFinite(class099622.R()) && Float.isFinite(class099623.i()) && Float.isFinite(class099623.R());
        };
    }

    private float y(class10021 class100212, class10036 class100362, float f) {
        return this.N(class100212, class100362, f, false);
    }

    private static class09743 y(class09980 class099802, class10036 class100362) {
        return class099802.A().N(class10037.N(class100362));
    }

    private static class10023 N(class10044 class100442, class10036 class100362) {
        return class100362 == class10036.WIDTH ? class100442.N : class100442.y;
    }

    private static boolean N(class09743 class097432) {
        if (class097432 == null || !class097432.u()) {
            return false;
        }
        if (class097432 instanceof class09728) {
            return true;
        }
        if (class097432 instanceof class09815) {
            return ((class09815)class097432).N(class09782.FLOAT);
        }
        return false;
    }

    private static class09736 N(class10036 class100362) {
        return class100362 == class10036.WIDTH ? class09736.WIDTH : class09736.HEIGHT;
    }

    public boolean N(float f) {
        if (f <= 0.0f || this.L.isEmpty()) {
            return false;
        }
        boolean bl = false;
        for (Map.Entry<class10021, class10044> entry : this.L.entrySet()) {
            class10021 class100212 = entry.getKey();
            class10044 class100442 = entry.getValue();
            bl |= this.N(class100212, class100442.N, f);
            bl |= this.N(class100212, class100442.y, f);
        }
        return bl;
    }

    private static boolean N(float f, float f2) {
        return Math.abs(f - f2) <= 0.001f;
    }

    public static class10037 N(class09781 class097812) {
        class09781 class097813 = Objects.requireNonNull(class097812, "context");
        return (class10037)class097813.N(class10037.class).orElseGet(() -> {
            class10037 class100372 = new class10037(class09715.N((class09781)class097813));
            class097813.N(class10037.class, (Object)class100372);
            return class100372;
        });
    }

    private static boolean N(class09962 class099622, class09962 class099623) {
        if (class099622 == null || class099623 == null || class099622.u() != class099623.u() || Objects.equals(class099622, class099623)) {
            return false;
        }
        return switch (class099623.u()) {
            case class09982.FIT, class09982.GROW -> {
                if (!class10037.y(class099622, class099623)) {
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }

    private boolean N(class10021 class100212, class10023 class100232, float f) {
        if (class100232.i == null) {
            return false;
        }
        boolean bl = class100232.i.N(f);
        class100232.L = class100232.i.y();
        if (class100232.i.N()) {
            class100232.L = class100232.u;
            class100232.i = null;
            bl = true;
        }
        if (bl) {
            class100212.i(2);
        }
        return bl;
    }

    private float N(class10021 class100212, class10036 class100362, float f, boolean bl) {
        class10044 class100442 = this.L.get(class100212);
        if (class100442 == null) {
            return f;
        }
        class10023 class100232 = class10037.N(class100442, class100362);
        class100232.N = true;
        class100232.y = class10048.y(class100212.o(), class100362);
        class100232.L = f;
        class100232.u = f;
        class100232.i = null;
        class100232.R = bl;
        return f;
    }

    private static boolean N(class09980 class099802, class10036 class100362) {
        class09962 class099622 = class10048.y(class099802, class100362);
        return class099622.u() == class09982.FIT || class099622.u() == class09982.GROW;
    }

    float N(class10021 class100213, class10036 class100362, float f) {
        if (class100213 == null) {
            return f;
        }
        class09980 class099802 = class100213.o();
        if (!class10037.N(class099802, class100362)) {
            return this.y(class100213, class100362, f);
        }
        class09743 class097432 = class10037.y(class099802, class100362);
        if (!class10037.N(class097432)) {
            return this.y(class100213, class100362, f);
        }
        class10023 class100232 = class10037.N((class10044)this.L.computeIfAbsent(class100213, class100212 -> new class10044()), class100362);
        class09962 class099622 = class10048.y(class099802, class100362);
        if (!class100232.N) {
            class100232.N = true;
            class100232.y = class099622;
            class100232.L = f;
            class100232.u = f;
            return f;
        }
        class09962 class099623 = class100232.y;
        boolean bl = class10037.N(class099623, class099622);
        boolean bl2 = class10037.N(class099623, class099622, class100232.u, f);
        boolean bl3 = this.y.L(class100213);
        boolean bl4 = !bl && bl2 && (bl3 || class100232.R);
        class100232.R = bl3;
        if (bl4) {
            return this.N(class100213, class100362, f, bl3);
        }
        boolean bl5 = class100232.i != null || bl || bl2;
        class100232.y = class099622;
        if (!bl5) {
            return this.N(class100213, class100362, f, bl3);
        }
        if (class10037.N(class100232.u, f) && class100232.i == null) {
            class100232.L = f;
            return f;
        }
        if (class100232.i != null) {
            if (!class10037.N(class100232.u, f)) {
                class100232.i = class10039.N(class10037.N(class100362), class097432, class100232.L, f);
                class100232.u = f;
            }
            return class100232.L;
        }
        if (class10037.N(class100232.L, f)) {
            class100232.u = f;
            return f;
        }
        class100232.i = class10039.N(class10037.N(class100362), class097432, class100232.L, f);
        class100232.u = f;
        return class100232.L;
    }

    private static boolean N(class09962 class099622, class09962 class099623, float f, float f2) {
        if (class099623 == null || !Objects.equals(class099622, class099623) || class10037.N(f, f2)) {
            return false;
        }
        return class099623.u() == class09982.FIT || class099623.u() == class09982.GROW;
    }

    public void N(class10021 class100212) {
        if (class100212 == null) {
            return;
        }
        ArrayDeque<class10021> arrayDeque = new ArrayDeque<class10021>();
        arrayDeque.push(class100212);
        while (!arrayDeque.isEmpty()) {
            class10021 class100213 = (class10021)arrayDeque.pop();
            this.L.remove(class100213);
            for (int i = 0; i < class100213.u(); ++i) {
                arrayDeque.push(class100213.N(i));
            }
        }
    }
}

