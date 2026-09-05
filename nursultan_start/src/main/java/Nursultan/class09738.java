/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09780
 *  Nursultan.class09815
 *  Nursultan.class09962
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09666;
import Nursultan.class09712;
import Nursultan.class09728;
import Nursultan.class09733;
import Nursultan.class09736;
import Nursultan.class09743;
import Nursultan.class09753;
import Nursultan.class09759;
import Nursultan.class09780;
import Nursultan.class09815;
import Nursultan.class09962;
import java.util.Objects;

public final class class09738 {
    private final class09736 N;
    private final class09743 y;
    private final int L;
    private final int u;
    private final float i;
    private final float R;
    private final class09962 M;
    private final class09962 B;
    private final class09666 Z;
    private final class09666 z;
    private final class09733 U;
    private final class09780 E;
    private class09753 W;
    private float m;

    public float L() {
        if (this.U == class09733.RUNTIME_VALUE) {
            return this.u().y();
        }
        return class09712.N(this.i, this.R, this.y());
    }

    int M() {
        return this.u;
    }

    private class09738(class09736 class097362, class09743 class097432, int n, int n2, float f, float f2, class09962 class099622, class09962 class099623, class09666 class096662, class09666 class096663, class09733 class097332, class09780 class097802, class09753 class097532) {
        this.N = class097362;
        this.y = Objects.requireNonNull(class097432, "spec");
        this.L = n;
        this.u = n2;
        this.i = f;
        this.R = f2;
        this.M = class099622;
        this.B = class099623;
        this.Z = class096662;
        this.z = class096663;
        this.U = class097332;
        this.E = class097802;
        this.W = Objects.requireNonNull(class097532, "targetValue");
    }

    float B() {
        return this.i;
    }

    float Z() {
        return this.R;
    }

    public class09736 i() {
        return this.N;
    }

    class09733 m() {
        return this.U;
    }

    class09962 U() {
        return this.B;
    }

    class09962 z() {
        return this.M;
    }

    public class09753 u() {
        if (this.U == class09733.RUNTIME_VALUE) {
            return Objects.requireNonNull(this.E.N(), "transitionValue");
        }
        return switch (this.U.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class09753.N(this.u);
            case 1 -> class09753.N(this.L());
            case 3 -> class09753.N(this.B);
            case 4 -> class09753.N(this.z);
            case 2 -> throw new IllegalStateException("Runtime value handled above");
        };
    }

    public boolean y(class09743 class097432) {
        return this.U == class09733.RUNTIME_VALUE && this.N(class097432);
    }

    public boolean y(class09753 class097532) {
        if (this.U != class09733.RUNTIME_VALUE) {
            return false;
        }
        boolean bl = this.E.N(class097532);
        if (bl) {
            this.W = class097532;
        }
        return bl;
    }

    public float y() {
        float f;
        class09759 class097592;
        float f2;
        block10: {
            block9: {
                float f3;
                class09759 class097593;
                class09743 class097432 = this.y;
                if (!(class097432 instanceof class09728)) break block9;
                class09728 class097282 = (class09728)class097432;
                try {
                    float f4;
                    f2 = f4 = class097282.N();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                class097592 = class097593 = class097282.y();
                f = f3 = class097282.L();
                if (!(f2 <= 0.0f)) break block10;
            }
            return 1.0f;
        }
        float f5 = (this.m - f) / f2;
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        return class097592.N(f5);
    }

    class09666 E() {
        return this.Z;
    }

    public static class09738 N(class09736 class097362, class09743 class097432, int n, int n2) {
        Objects.requireNonNull(class097432, "spec");
        class09753 class097532 = class09753.N(n);
        class09753 class097533 = class09753.N(n2);
        if (class097432 instanceof class09815) {
            return class09738.N(class097362, class097432, class097532, class097533, n, n2, 0.0f, 0.0f, null, null, null, null);
        }
        return new class09738(class097362, class097432, n, n2, 0.0f, 0.0f, null, null, null, null, class09733.COLOR, null, class097533);
    }

    public static class09738 N(class09736 class097362, class09743 class097432, float f, float f2) {
        Objects.requireNonNull(class097432, "spec");
        class09753 class097532 = class09753.N(f);
        class09753 class097533 = class09753.N(f2);
        if (class097432 instanceof class09815) {
            return class09738.N(class097362, class097432, class097532, class097533, 0, 0, f, f2, null, null, null, null);
        }
        return new class09738(class097362, class097432, 0, 0, f, f2, null, null, null, null, class09733.FLOAT, null, class097533);
    }

    public static class09738 N(class09736 class097362, class09743 class097432, class09962 class099622, class09962 class099623) {
        Objects.requireNonNull(class097432, "spec");
        class09753 class097532 = class09753.N(class099622);
        class09753 class097533 = class09753.N(class099623);
        if (class097432 instanceof class09815) {
            return class09738.N(class097362, class097432, class097532, class097533, 0, 0, 0.0f, 0.0f, class099622, class099623, null, null);
        }
        return new class09738(class097362, class097432, 0, 0, 0.0f, 0.0f, class099622, class099623, null, null, class09733.AXIS_SIZE, null, class097533);
    }

    public boolean N(float f) {
        if (f <= 0.0f || this.N()) {
            return false;
        }
        if (this.U == class09733.RUNTIME_VALUE) {
            return this.E.N(f);
        }
        float f2 = this.y();
        this.m += f;
        float f3 = this.y();
        return Float.compare(f2, f3) != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean N() {
        float f;
        class09759 class097592;
        float f3;
        if (this.U == class09733.RUNTIME_VALUE) {
            return this.E.y();
        }
        class09743 class097432 = this.y;
        if (!(class097432 instanceof class09728)) return true;
        class09728 class097282 = (class09728)class097432;
        try {
            float f2;
            f3 = f2 = class097282.N();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        class09759 class097593 = class097592 = class097282.y();
        float f4 = f = class097282.L();
        if (!(this.m >= f4 + f3)) return false;
        return true;
    }

    public boolean N(class09743 class097432) {
        class09743 class097433 = class097432 == null ? class09743.Z() : class097432;
        return this.y.equals(class097433);
    }

    public boolean N(class09753 class097532) {
        return this.W.equals(class097532);
    }

    public static class09738 N(class09736 class097362, class09743 class097432, class09666 class096662, class09666 class096663) {
        Objects.requireNonNull(class097432, "spec");
        class09753 class097532 = class09753.N(class096662);
        class09753 class097533 = class09753.N(class096663);
        if (class097432 instanceof class09815) {
            return class09738.N(class097362, class097432, class097532, class097533, 0, 0, 0.0f, 0.0f, null, null, class096662, class096663);
        }
        return new class09738(class097362, class097432, 0, 0, 0.0f, 0.0f, null, null, class096662, class096663, class09733.TRANSLATE_LENGTH, null, class097533);
    }

    private static class09738 N(class09736 class097362, class09743 class097432, class09753 class097532, class09753 class097533, int n, int n2, float f, float f2, class09962 class099622, class09962 class099623, class09666 class096662, class09666 class096663) {
        class09815 class098152 = (class09815)class097432;
        return new class09738(class097362, class097432, n, n2, f, f2, class099622, class099623, class096662, class096663, class09733.RUNTIME_VALUE, Objects.requireNonNull(class098152.N(class097362, class097532, class097533), "valueTransitionRuntime"), class097533);
    }

    class09666 W() {
        return this.z;
    }

    int R() {
        return this.L;
    }
}

