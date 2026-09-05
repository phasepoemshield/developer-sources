/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class01894;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class06937 {
    private final int N;
    public final class06695 L;
    public int u;
    public final int i;
    public final int R;

    public @Nullable class01894 L() {
        return null;
    }

    public void M() {
        this.L.method_5431();
    }

    public class06937(class06695 class066952, int n, int n2, int n3) {
        this.L = class066952;
        this.N = n;
        this.i = n2;
        this.R = n3;
    }

    public int B() {
        return this.N;
    }

    public boolean Z() {
        return true;
    }

    public void i(class06584 class065842) {
        this.L.method_5447(this.N, class065842);
        this.M();
    }

    public class06584 i() {
        return this.L.method_5438(this.N);
    }

    public void u(class06584 class065842) {
        this.N(class065842, this.i());
    }

    public boolean u() {
        return false;
    }

    public boolean y(class08036 class080362) {
        return this.N(class080362) && this.N(this.i());
    }

    public int y() {
        return this.L.method_5444();
    }

    public class06584 y(class06584 class065842, int n) {
        if (class065842.R() || !this.N(class065842)) {
            return class065842;
        }
        class06584 class065843 = this.i();
        int n2 = Math.min(Math.min(n, class065842.c()), this.b_(class065842) - class065843.c());
        if (n2 <= 0) {
            return class065842;
        }
        if (class065843.R()) {
            this.u(class065842.N(n2));
        } else if (class06584.L((class06584)class065843, (class06584)class065842)) {
            class065842.B(n2);
            class065843.M(n2);
            this.u(class065843);
        }
        return class065842;
    }

    public class06584 y(int n, int n2, class08036 class080362) {
        Optional<class06584> var4 = this.N(n, n2, class080362);
        var4.ifPresent(class065842 -> this.N(class080362, (class06584)class065842));
        return var4.orElse(class06584.E);
    }

    protected void y(int n) {
    }

    public void y(class06584 class065842, class06584 class065843) {
        int n = class065843.c() - class065842.c();
        if (n > 0) {
            this.N(class065843, n);
        }
    }

    protected void N(class06584 class065842, int n) {
    }

    public boolean N(class06584 class065842) {
        return true;
    }

    public void N(class08036 class080362, class06584 class065842) {
        this.M();
    }

    public void N(class06584 class065842, class06584 class065843) {
        this.i(class065842);
    }

    public class06584 N(int n) {
        return this.L.method_5434(this.N, n);
    }

    public boolean N(class08036 class080362) {
        return true;
    }

    public boolean N() {
        return true;
    }

    public Optional<class06584> N(int n, int n2, class08036 class080362) {
        if (!this.N(class080362)) {
            return Optional.empty();
        }
        if (!this.y(class080362) && n2 < this.i().c()) {
            return Optional.empty();
        }
        class06584 class065842 = this.N(n = Math.min(n, n2));
        if (class065842.R()) {
            return Optional.empty();
        }
        if (this.i().R()) {
            this.N(class06584.E, class065842);
        }
        return Optional.of(class065842);
    }

    public boolean R() {
        return !this.i().R();
    }

    public class06584 R(class06584 class065842) {
        return this.y(class065842, class065842.c());
    }

    public int b_(class06584 class065842) {
        return Math.min(this.y(), class065842.U());
    }

    protected void c_(class06584 class065842) {
    }
}

