/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07430
 *  minecraft.class07473
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07430;
import minecraft.class07473;
import org.jspecify.annotations.Nullable;

public class class05764
extends class07473 {
    private final class07473 N;
    private final int y;
    private boolean L;

    public void L() {
        if (this.L) {
            return;
        }
        this.L = true;
        this.N.L();
    }

    public boolean M() {
        return this.L;
    }

    public class05764(int n, class07473 class074732) {
        this.y = n;
        this.N = class074732;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || ((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        return this.N.equals(((class05764)((Object)object)).N);
    }

    public int hashCode() {
        return this.N.hashCode();
    }

    public boolean B() {
        return this.N.B();
    }

    public int Z() {
        return this.y;
    }

    public void i() {
        this.N.i();
    }

    public class07473 U() {
        return this.N;
    }

    public EnumSet<class07430> z() {
        return this.N.z();
    }

    public void u() {
        if (!this.L) {
            return;
        }
        this.L = false;
        this.N.u();
    }

    public boolean y() {
        return this.N.y();
    }

    public boolean N(class05764 class057642) {
        return this.O_() && class057642.Z() < this.Z();
    }

    public void N_71(EnumSet<class07430> enumSet) {
        this.N.N_71(enumSet);
    }

    protected int N(int n) {
        return this.N.N(n);
    }

    public boolean N() {
        return this.N.N();
    }

    public boolean O_() {
        return this.N.O_();
    }
}

