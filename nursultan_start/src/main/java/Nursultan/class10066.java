/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09781
 */
package Nursultan;

import Nursultan.class09781;
import Nursultan.class10021;
import Nursultan.class10049;
import java.util.Objects;

public final class class10066 {
    private static final float N = 0.5f;
    private final float y;
    private class10021 L;
    private boolean u = true;
    private float i;

    private boolean L(class10021 class100212) {
        return class10066.u(class100212) && class100212.W() && class100212 == this.L;
    }

    private class10066(class09781 class097812, float f) {
        Objects.requireNonNull(class097812, "context");
        this.y = Math.max(0.05f, f);
    }

    private static boolean u(class10021 class100212) {
        return class100212 != null && class100212.y() == class10049.INPUT;
    }

    public boolean y(class10021 class100212) {
        if (!class10066.u(class100212) || !class100212.W()) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        return this.L == class100212 && this.u;
    }

    public static class10066 N(class09781 class097812) {
        return (class10066)class097812.N(class10066.class).orElseGet(() -> {
            class10066 class100662 = new class10066(class097812, 0.5f);
            class097812.N(class10066.class, (Object)class100662);
            return class100662;
        });
    }

    public boolean N(float f) {
        if (!this.N()) {
            return false;
        }
        float f2 = Math.max(0.0f, f);
        if (f2 <= 0.0f) {
            return false;
        }
        this.i += f2;
        int n = (int)(this.i / this.y);
        if (n <= 0) {
            return false;
        }
        this.i -= (float)n * this.y;
        if ((n & 1) == 0) {
            return false;
        }
        this.u = !this.u;
        this.L.i(1);
        return true;
    }

    public void N(class10021 class100212, class10021 class100213) {
        class10021 class100214;
        class10021 class100215;
        class10021 class100216 = class100215 = class10066.u(class100213) ? class100213 : null;
        if (this.L == class100215) {
            this.N(class100215);
            return;
        }
        class10021 class100217 = this.L != null ? this.L : (class100214 = class10066.u(class100212) ? class100212 : null);
        if (class100214 != null) {
            class100214.i(1);
        }
        this.L = class100215;
        this.u = true;
        this.i = 0.0f;
        if (this.L != null) {
            this.L.i(1);
        }
    }

    private boolean N() {
        if (!this.L(this.L)) {
            if (this.L != null) {
                this.L.i(1);
            }
            this.L = null;
            this.u = true;
            this.i = 0.0f;
            return false;
        }
        return true;
    }

    public boolean N(class10021 class100212) {
        if (!this.L(class100212)) {
            return false;
        }
        this.i = 0.0f;
        if (this.u) {
            return false;
        }
        this.u = true;
        this.L.i(1);
        return true;
    }
}

