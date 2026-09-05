/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09715
 *  Nursultan.class09741
 *  Nursultan.class09920
 *  Nursultan.class09936
 *  Nursultan.class10021
 *  Nursultan.class10037
 *  Nursultan.class10054
 *  Nursultan.class10066
 */
package Nursultan;

import Nursultan.class09715;
import Nursultan.class09741;
import Nursultan.class09781;
import Nursultan.class09798;
import Nursultan.class09828;
import Nursultan.class09841;
import Nursultan.class09847;
import Nursultan.class09850;
import Nursultan.class09855;
import Nursultan.class09866;
import Nursultan.class09872;
import Nursultan.class09920;
import Nursultan.class09936;
import Nursultan.class10021;
import Nursultan.class10037;
import Nursultan.class10054;
import Nursultan.class10066;
import java.util.Objects;

public final class class09832 {
    private final class09781 N;
    private final class09715 y;
    private final class09872 L;
    private final class10054 u;
    private final class10037 i;
    private final class09920 R;
    private final class09828 M;
    private final class10066 B;
    private final class09855 Z = new class09855(120.0f);
    private class09866 z;
    private float U = Float.NaN;
    private float E = Float.NaN;
    private class10021 W;
    private class09936 m = class09936.N();
    private boolean P;
    private boolean s;
    private boolean T;

    boolean L() {
        return this.s;
    }

    private void L(class10021 class100212, class09850 class098502) {
        if (class098502.N() || !class098502.L()) {
            return;
        }
        class100212.L(8);
    }

    public class09832(class09781 class097812) {
        this(class097812, class09866.N());
    }

    public class09832(class09781 class097812, class09866 class098662) {
        this.N = Objects.requireNonNull(class097812, "context");
        this.y = class09715.N((class09781)class097812);
        this.L = class09872.N(class097812);
        this.u = class10054.N((class09781)class097812);
        this.i = class10037.N((class09781)class097812);
        this.R = class09920.N((class09781)class097812);
        this.M = class09828.N(class097812);
        this.B = class10066.N((class09781)class097812);
        this.N(class098662);
    }

    boolean u() {
        return this.T;
    }

    private boolean y(class10021 class100212, class09850 class098502) {
        if (class098502.N()) {
            return false;
        }
        if (this.P != this.z.i()) {
            return false;
        }
        return !class100212.R(1);
    }

    private void y(class10021 class100212) {
        this.W = class100212;
        this.Z.y();
        this.U = Float.NaN;
        this.E = Float.NaN;
        this.m = class09936.N();
        this.P = false;
    }

    private class09741 y(float f) {
        float f2 = this.Z.y(f);
        if (f2 <= 0.0f) {
            return class09741.N;
        }
        class09741 class097412 = this.y.y(f2);
        boolean bl = this.i.N(f2);
        class09847 class098472 = this.L.N(f2);
        return class09741.N((class097412.N() || class098472.N() || bl ? 1 : 0) != 0, (class097412.y() || bl ? 1 : 0) != 0);
    }

    public class09866 y() {
        return this.z;
    }

    private boolean N(class10021 class100212, float f, float f2, class09850 class098502) {
        if (!class098502.N()) {
            return false;
        }
        boolean bl = this.u.N(class100212, f, f2, this.z.u());
        this.U = f;
        this.E = f2;
        return bl;
    }

    private class09850 N(class10021 class100212, float f, float f2, boolean bl) {
        boolean bl2 = Float.compare(this.U, f) != 0 || Float.compare(this.E, f2) != 0;
        boolean bl3 = class100212.R(2);
        boolean bl4 = bl2 || bl || bl3;
        boolean bl5 = class100212.R(4);
        boolean bl6 = class100212.R(8);
        boolean bl7 = bl5 && !bl3 && !bl2 && !bl;
        return new class09850(bl4, bl7, bl6, bl2);
    }

    private boolean N(class10021 class100212, class09850 class098502) {
        if (!class098502.y()) {
            return false;
        }
        return this.u.N(class100212);
    }

    public class09841 N(class09798 class097982) {
        return new class09841(this.N, class097982);
    }

    public class09781 N() {
        return this.N;
    }

    public void N(class09866 class098662) {
        class09866 class098663;
        this.z = class098663 = class098662 == null ? class09866.N() : class098662;
        this.Z.N(class098663.y());
        this.M.N(class098663.L());
    }

    class09936 N(class09841 class098412, int n, int n2, float f) {
        if (class098412 == null) {
            this.s = false;
            this.T = false;
            return class09936.N();
        }
        float f2 = this.N.u().N();
        float f3 = Math.max(0.0f, (float)n) / f2;
        float f4 = Math.max(0.0f, (float)n2) / f2;
        return this.N(class098412, f3, f4, f);
    }

    class09936 N(class09841 class098412, float f, float f2, float f3) {
        if (class098412 == null) {
            this.s = false;
            this.T = false;
            return class09936.N();
        }
        class10021 class100212 = (class10021)class098412.y();
        float f4 = this.N(f3);
        this.N(class100212);
        class09741 class097412 = this.y(f4);
        boolean bl = class098412.B();
        boolean bl2 = this.B.N(f4);
        this.M.N(class100212);
        boolean bl3 = this.M.y(class100212, f4);
        class09850 class098502 = this.N(class100212, f, f2, class097412.y() || bl);
        boolean bl4 = this.N(class100212, f, f2, class098502);
        boolean bl5 = this.N(class100212, class098502);
        boolean bl6 = bl4 || bl5 || class098502.L() || class098502.u();
        boolean bl7 = class098412.N(f, f2, this.N.u().N(), bl6);
        if (class098502.u()) {
            class100212.u(1);
        }
        this.M.N(class100212);
        if (this.y(class100212, class098502)) {
            this.s = class097412.N() || bl2 || bl3 || bl;
            this.T = bl;
            return this.m;
        }
        if (bl4 || bl5 || bl7 || class098502.L()) {
            this.N.i().N();
        }
        class09936 class099362 = this.R.N(class100212, f, f2, this.z.u(), this.z.i());
        this.L(class100212, class098502);
        this.m = class099362;
        this.P = this.z.i();
        this.s = class097412.N() || bl2 || bl3 || bl;
        this.T = bl4 || bl5 || bl7 || bl;
        return class099362;
    }

    private float N(float f) {
        return Math.max(0.0f, f);
    }

    private void N(class10021 class100212) {
        if (class100212 != this.W) {
            this.y(class100212);
        }
    }
}

