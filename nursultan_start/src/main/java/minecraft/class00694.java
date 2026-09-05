/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class04782
 *  minecraft.class06403
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00143;
import minecraft.class00690;
import minecraft.class00692;
import minecraft.class00702;
import minecraft.class00737;
import minecraft.class04782;
import minecraft.class06403;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class00694
extends class00692 {
    private boolean y;
    private @Nullable class00143 L;
    private @Nullable class06889 u;

    @Override
    public void L() {
        this.y = true;
        this.L = null;
        this.u = null;
    }

    public class00694(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00694> B() {
        return class00702.i;
    }

    private void Z() {
        int n = this.N.Z();
        class06889 class068892 = this.N.u(1.0f);
        int n2 = this.N.N(-class068892.M * 40.0, 105.0, -class068892.Z * 40.0);
        if (this.N.m() == null || this.N.m().i() <= 0) {
            n2 -= 12;
            n2 &= 7;
            n2 += 12;
        } else if ((n2 %= 12) < 0) {
            n2 += 12;
        }
        this.L = this.N.N(n, n2, null);
        this.z();
    }

    private void z() {
        if (this.L != null) {
            this.L.N();
            if (!this.L.L()) {
                double d;
                class07209 class072092 = this.L.M();
                this.L.N();
                while ((d = (double)((float)class072092.method_10264() + this.N.method_59922().z() * 20.0f)) < (double)class072092.method_10264()) {
                }
                this.u = new class06889((double)class072092.method_10263(), d, (double)class072092.method_10260());
            }
        }
    }

    @Override
    public void N(class04782 class047822) {
        if (this.y || this.L == null) {
            this.y = false;
            this.Z();
        } else if (!class047822.N(class07830.field_13203, class06403.N((class07209)this.N.M())).method_19769((class00737)this.N.method_73189(), 10.0)) {
            this.N.W().N(class00702.N);
        }
    }

    @Override
    public @Nullable class06889 R() {
        return this.u;
    }
}

