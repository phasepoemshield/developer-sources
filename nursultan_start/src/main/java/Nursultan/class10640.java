/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00490
 *  minecraft.class00518
 *  minecraft.class01762
 *  minecraft.class01765
 *  minecraft.class01766
 *  minecraft.class06683
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00490;
import minecraft.class00518;
import minecraft.class01762;
import minecraft.class01765;
import minecraft.class01766;
import minecraft.class06683;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public class class10640
implements class01765 {
    final /* synthetic */ class00490 N;
    final /* synthetic */ boolean y;
    final /* synthetic */ MutableBoolean L;
    final /* synthetic */ class00518 u;
    final /* synthetic */ class01766 i;
    final /* synthetic */ class06683 R;

    public boolean L() {
        return this.N.L();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10640(class06683 class066832, class00490 class004902, boolean bl, MutableBoolean mutableBoolean, class00518 class005182, class01766 class017662) {
        this.R = class066832;
        this.N = class004902;
        this.y = bl;
        this.L = mutableBoolean;
        this.u = class005182;
        this.i = class017662;
    }

    private void B() {
        this.R.N(this.i, this.u, this.N);
        this.L.setFalse();
    }

    public void i() {
        this.N(true);
    }

    public void u() {
        this.N(false);
    }

    public @Nullable class00392 y() {
        return this.N.u();
    }

    public void N(@Nullable class01762 class017622) {
        this.N.N(class017622);
        this.B();
    }

    private void N(boolean bl) {
        this.N.N(bl);
        if (this.L.isTrue()) {
            this.B();
        }
        this.R.u(this.i, this.u);
    }

    public void N(@Nullable class00392 class003922) {
        if (this.L.isTrue() || !Objects.equals(class003922, this.N.u())) {
            this.N.N(class003922);
            this.B();
        }
    }

    public void N(int n) {
        class00392 class003922;
        if (!this.y) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        boolean bl = this.L.isTrue();
        if (this.u.R() && (class003922 = this.i.method_5476()) != null && !class003922.equals((Object)this.N.u())) {
            this.N.N(class003922);
            bl = true;
        }
        if (n != this.N.y()) {
            this.N.N(n);
            bl = true;
        }
        if (bl) {
            this.B();
        }
    }

    public int N() {
        return this.N.y();
    }
}

