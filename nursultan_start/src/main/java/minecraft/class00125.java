/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06584
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06584;

public class class00125
extends class06478 {
    private final class06202 N;
    private final int y;
    private final int L;
    private final class06584 u;
    private final boolean i;
    private final boolean R;

    public class00125(class06202 class062022, int n, int n2, int n3, int n4, class00392 class003922, class06584 class065842, boolean bl, boolean bl2) {
        super(0, 0, n3, n4, class003922);
        this.N = class062022;
        this.y = n;
        this.L = n2;
        this.u = class065842;
        this.i = bl;
        this.R = bl2;
    }

    protected void N(class01054 class010542, int n, int n2) {
        class010542.y((class01590)this.N.i_3, this.u, n, n2);
    }

    protected void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, (class00392)class00392.N((String)"narration.item", (Object[])new Object[]{this.u.d()}));
    }

    protected void method_48579(class01054 class010542, int n, int n2, float f) {
        class010542.N(this.u, this.method_46426() + this.y, this.method_46427() + this.L, 0);
        if (this.i) {
            class010542.N((class01590)this.N.i_3, this.u, this.method_46426() + this.y, this.method_46427() + this.L, null);
        }
        if (this.method_25370()) {
            class010542.y(this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), -1);
        }
        if (this.R && this.method_25367()) {
            this.N(class010542, n, n2);
        }
    }
}

