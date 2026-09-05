/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09728
 *  Nursultan.class09736
 *  Nursultan.class09743
 *  Nursultan.class09753
 *  Nursultan.class09759
 *  Nursultan.class09780
 *  Nursultan.class09815
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09728;
import Nursultan.class09736;
import Nursultan.class09743;
import Nursultan.class09753;
import Nursultan.class09759;
import Nursultan.class09780;
import Nursultan.class09815;
import java.util.Objects;

final class class10039 {
    private final class09743 N;
    private final float y;
    private final float L;
    private final class09780 u;
    private float i;

    private float L() {
        float f;
        float f2;
        block10: {
            block9: {
                float f3;
                class09759 class097592;
                class09743 class097432 = this.N;
                if (!(class097432 instanceof class09728)) break block9;
                class09728 class097282 = (class09728)class097432;
                try {
                    float f4;
                    f2 = f4 = class097282.N();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                class09759 class097593 = class097592 = class097282.y();
                f = f3 = class097282.L();
                if (!(f2 <= 0.0f)) break block10;
            }
            return 1.0f;
        }
        float f5 = (this.i - f) / f2;
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        return f5;
    }

    private class10039(class09743 class097432, float f, float f2, class09780 class097802) {
        this.N = Objects.requireNonNull(class097432, "spec");
        this.y = f;
        this.L = f2;
        this.u = class097802;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    float y() {
        float f;
        class09759 class097593;
        if (this.u != null) {
            return this.u.N().y();
        }
        class09743 class097432 = this.N;
        if (!(class097432 instanceof class09728)) return this.L;
        class09728 class097282 = (class09728)class097432;
        try {
            float f2;
            float f3 = f2 = class097282.N();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        class09759 class097592 = class097593 = class097282.y();
        float f4 = f = class097282.L();
        f = class097592.N(this.L());
        return this.y + (this.L - this.y) * f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean N() {
        float f;
        class09759 class097592;
        float f3;
        if (this.u != null) {
            return this.u.y();
        }
        class09743 class097432 = this.N;
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
        if (!(this.i >= f4 + f3)) return false;
        return true;
    }

    boolean N(float f) {
        if (this.u != null) {
            return this.u.N(f);
        }
        if (f <= 0.0f || this.N()) {
            return false;
        }
        float f2 = this.L();
        this.i += f;
        return Float.compare(f2, this.L()) != 0;
    }

    static class10039 N(class09736 class097362, class09743 class097432, float f, float f2) {
        if (class097432 instanceof class09815) {
            class09780 class097802 = Objects.requireNonNull(((class09815)class097432).N(class097362, class09753.N((float)f), class09753.N((float)f2)), "valueTransitionRuntime");
            return new class10039(class097432, f, f2, class097802);
        }
        return new class10039(class097432, f, f2, null);
    }
}

