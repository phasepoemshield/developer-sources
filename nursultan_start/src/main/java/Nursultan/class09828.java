/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class10021
 *  Nursultan.class10029
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09781;
import Nursultan.class09794;
import Nursultan.class09830;
import Nursultan.class09831;
import Nursultan.class09833;
import Nursultan.class09846;
import Nursultan.class09859;
import Nursultan.class09871;
import Nursultan.class10021;
import Nursultan.class10029;
import java.util.Objects;

public final class class09828 {
    private final class09794 N;
    private final class09846 y;
    private final class09831 L;
    private class10021 u;
    private class09871 i = class09871.NONE;
    private class10021 R;
    private class09871 M = class09871.NONE;
    private class09859 B;

    public class10029 L(class10021 class100212) {
        if (class100212 == null) {
            return class10029.NORMAL;
        }
        if (class100212 == this.R && this.M == class09871.THUMB) {
            return class10029.ACTIVE;
        }
        if (class100212 == this.u && this.i == class09871.THUMB) {
            return class10029.HOVER;
        }
        return class10029.NORMAL;
    }

    public boolean L() {
        boolean bl = this.M != class09871.NONE || this.B != null;
        this.B = null;
        this.L(null, class09871.NONE);
        return bl;
    }

    public boolean L(class10021 class100212, float f) {
        if (this.B == null) {
            return false;
        }
        if (!this.y(class100212, this.B.N())) {
            this.u();
            return false;
        }
        class09830 class098302 = this.u(this.B.N());
        if (class098302 == null) {
            this.u();
            return true;
        }
        float f2 = f - this.B.L() - this.B.y() - class098302.R();
        this.N(this.B.N(), class098302, f2);
        this.y(this.B.N(), class09871.THUMB);
        return true;
    }

    private void L(class10021 class100212, class09871 class098712) {
        class09871 class098713;
        class09871 class098714 = class098713 = class098712 == null ? class09871.NONE : class098712;
        if (this.R == class100212 && this.M == class098713) {
            return;
        }
        class09828.i(this.R);
        this.R = class100212;
        this.M = class098713;
        class09828.i(this.R);
    }

    private class09828(class09794 class097942) {
        this.N = Objects.requireNonNull(class097942, "uiScalePolicy");
        this.y = new class09846(this.N);
        this.L = new class09831(this.N);
    }

    private static void i(class10021 class100212) {
        if (class100212 != null) {
            class100212.i(1);
        }
    }

    public class09830 u(class10021 class100212) {
        return this.y.N(class100212);
    }

    private void u(class10021 class100212, float f) {
        if (class100212.c().R(f, this.N.N())) {
            class100212.i(8);
        }
    }

    private void u() {
        this.B = null;
        this.L(null, class09871.NONE);
        this.y(null, class09871.NONE);
    }

    private boolean y(class10021 class100212, class10021 class100213) {
        if (class100212 == null || class100213 == null) {
            return false;
        }
        if (!class09828.N(class100212, class100213)) {
            return false;
        }
        return this.u(class100213) != null;
    }

    public class10029 y(class10021 class100212) {
        if (class100212 == null) {
            return class10029.NORMAL;
        }
        if (class100212 == this.R && this.M == class09871.TRACK) {
            return class10029.ACTIVE;
        }
        if (class100212 == this.u && this.i == class09871.TRACK) {
            return class10029.HOVER;
        }
        return class10029.NORMAL;
    }

    private void y(class10021 class100212, class09871 class098712) {
        class09871 class098713;
        class09871 class098714 = class098713 = class098712 == null ? class09871.NONE : class098712;
        if (this.u == class100212 && this.i == class098713) {
            return;
        }
        class09828.i(this.u);
        this.u = class100212;
        this.i = class098713;
        class09828.i(this.u);
    }

    public boolean y(class10021 class100212, float f) {
        return this.L.N(class100212, f);
    }

    public boolean y() {
        return this.B != null;
    }

    public void N(class10021 class100212) {
        if (class100212 == null) {
            this.y(null, class09871.NONE);
            this.L(null, class09871.NONE);
            this.B = null;
            this.L.y();
            return;
        }
        if (this.u != null && !this.y(class100212, this.u)) {
            this.y(null, class09871.NONE);
        }
        if (this.R != null && !this.y(class100212, this.R)) {
            this.L(null, class09871.NONE);
            this.B = null;
        }
        this.L.y(class100212);
    }

    public boolean N(class10021 class100212, float f) {
        return this.N(class100212, (class10021)null, f);
    }

    static boolean N(class10021 class100212, class10021 class100213) {
        for (class10021 class100214 = class100213; class100214 != null; class100214 = class100214.X()) {
            if (class100214 != class100212) continue;
            return true;
        }
        return false;
    }

    public static class09828 N(class09781 class097812) {
        class09781 class097813 = Objects.requireNonNull(class097812, "context");
        return (class09828)class097813.N(class09828.class).orElseGet(() -> {
            class09828 class098282 = new class09828(class097813.u());
            class097813.N(class09828.class, class098282);
            return class098282;
        });
    }

    public void N(class10021 class100212, class09871 class098712) {
        this.y(class100212, class098712 == null ? class09871.NONE : class098712);
    }

    public boolean N(class10021 class100212, class09871 class098712, float f, float f2) {
        if (class100212 == null || class098712 == class09871.NONE) {
            return false;
        }
        class09830 class098302 = this.u(class100212);
        if (class098302 == null) {
            return false;
        }
        float f3 = f - f2;
        this.y(class100212, class098712);
        this.L.N(class100212);
        if (class098712 == class09871.THUMB) {
            this.B = new class09859(class100212, f3 - class098302.z(), f2);
            this.L(class100212, class09871.THUMB);
            return true;
        }
        this.L(class100212, class09871.TRACK);
        float f4 = f3 - class098302.R() - class098302.E() * 0.5f;
        this.N(class100212, class098302, f4);
        return true;
    }

    public void N(class09833 class098332) {
        this.L.N(Objects.requireNonNull(class098332, "options"));
    }

    private void N(class10021 class100212, class09830 class098302, float f) {
        float f2 = class098302.W();
        if (f2 <= 0.0f) {
            this.L.N(class100212);
            this.u(class100212, 0.0f);
            return;
        }
        float f3 = class09693.N((float)f, (float)0.0f, (float)f2);
        float f4 = class100212.c().P();
        float f5 = f3 / f2;
        this.L.N(class100212);
        this.u(class100212, f4 * f5);
    }

    public class09833 N() {
        return this.L.N();
    }

    public boolean N(class10021 class100212, class10021 class100213, float f) {
        return this.L.N(class100212, class100213, f);
    }
}

