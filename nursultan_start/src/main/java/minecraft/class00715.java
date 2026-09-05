/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class01328
 *  minecraft.class01763
 *  minecraft.class04782
 *  minecraft.class06403
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07830
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00143;
import minecraft.class00690;
import minecraft.class00692;
import minecraft.class00702;
import minecraft.class01328;
import minecraft.class01763;
import minecraft.class04782;
import minecraft.class06403;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07830;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class00715
extends class00692 {
    private static final class01328 y = class01328.N().u();
    private @Nullable class00143 L;
    private @Nullable class06889 u;

    @Override
    public void L() {
        this.L = null;
        this.u = null;
    }

    public class00715(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00715> B() {
        return class00702.L;
    }

    private void Z() {
        if (this.L != null && !this.L.L()) {
            double d;
            class07209 class072092 = this.L.M();
            this.L.N();
            double d2 = class072092.method_10263();
            double d3 = class072092.method_10260();
            while ((d = (double)((float)class072092.method_10264() + this.N.method_59922().z() * 20.0f)) < (double)class072092.method_10264()) {
            }
            this.u = new class06889(d2, d, d3);
        }
    }

    private void y(class04782 class047822) {
        if (this.L == null || this.L.L()) {
            int n;
            class06889 class068892;
            int n2 = this.N.Z();
            class07209 class072092 = class047822.N(class07830.field_13203, class06403.N((class07209)this.N.M()));
            class08036 class080362 = class047822.N(y, (class07438)this.N, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260());
            if (class080362 != null) {
                class068892 = new class06889(class080362.method_23317(), 0.0, class080362.method_23321()).u();
                n = this.N.N(-class068892.M * 40.0, 105.0, -class068892.Z * 40.0);
            } else {
                n = this.N.N(40.0, (double)class072092.method_10264(), 0.0);
            }
            class068892 = new class01763(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
            this.L = this.N.N(n2, n, (class01763)class068892);
            if (this.L != null) {
                this.L.N();
            }
        }
        this.Z();
        if (this.L != null && this.L.L()) {
            this.N.W().N(class00702.u);
        }
    }

    @Override
    public void N(class04782 class047822) {
        double d;
        double d2 = d = this.u == null ? 0.0 : this.u.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
        if (d < 100.0 || d > 22500.0 || this.N.field_5976 || this.N.field_5992) {
            this.y(class047822);
        }
    }

    @Override
    public @Nullable class06889 R() {
        return this.u;
    }
}

