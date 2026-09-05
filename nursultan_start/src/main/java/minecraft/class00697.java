/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class06403
 *  minecraft.class06889
 *  minecraft.class07072
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07830
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00143;
import minecraft.class00676;
import minecraft.class00690;
import minecraft.class00692;
import minecraft.class00702;
import minecraft.class00737;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class06403;
import minecraft.class06889;
import minecraft.class07072;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07830;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class00697
extends class00692 {
    private static final class01328 y = class01328.N().u();
    private @Nullable class00143 L;
    private @Nullable class06889 u;
    private boolean i;

    @Override
    public void L() {
        this.L = null;
        this.u = null;
    }

    public class00697(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00697> B() {
        return class00702.N;
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
        int n;
        if (this.L != null && this.L.L()) {
            class07209 class072092 = class047822.N(class07830.field_13203, class06403.N((class07209)this.N.M()));
            int n2 = n = this.N.m() == null ? 0 : this.N.m().i();
            if (this.N.method_59922().y(n + 3) == 0) {
                this.N.W().N(class00702.L);
                return;
            }
            class08036 class080362 = class047822.N(y, (class07438)this.N, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260());
            double d = class080362 != null ? class072092.method_19770((class00737)class080362.method_73189()) / 512.0 : 64.0;
            if (class080362 != null && (this.N.method_59922().y((int)(d + 2.0)) == 0 || this.N.method_59922().y(n + 2) == 0)) {
                this.N(class080362);
                return;
            }
        }
        if (this.L == null || this.L.L()) {
            int n3;
            n = n3 = this.N.Z();
            if (this.N.method_59922().y(8) == 0) {
                this.i = !this.i;
                n += 6;
            }
            n = this.i ? ++n : --n;
            if (this.N.m() == null || this.N.m().i() < 0) {
                n -= 12;
                n &= 7;
                n += 12;
            } else if ((n %= 12) < 0) {
                n += 12;
            }
            this.L = this.N.N(n3, n, null);
            if (this.L != null) {
                this.L.N();
            }
        }
        this.Z();
    }

    @Override
    public void N(class00676 class006762, class07209 class072092, class07072 class070722, @Nullable class08036 class080362) {
        if (class080362 != null && this.N.method_18395((class07438)class080362)) {
            this.N(class080362);
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

    private void N(class08036 class080362) {
        this.N.W().N(class00702.y);
        this.N.W().y(class00702.y).N((class07438)class080362);
    }

    @Override
    public @Nullable class06889 R() {
        return this.u;
    }
}

