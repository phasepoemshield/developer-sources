/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class06781
 *  minecraft.class06884
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class06781;
import minecraft.class06884;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08092;

public interface class03589
extends class07290 {
    public static final class07211[] R = class07211.values();

    default public boolean L(class07209 class072092, class07211 class072112) {
        return this.u(class072092, class072112) > 0;
    }

    default public int m(class07209 class072092) {
        int n = 0;
        for (class07211 class072112 : R) {
            int n2 = this.u(class072092.method_10093(class072112), class072112);
            if (n2 >= 15) {
                return 15;
            }
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    default public int u(class07209 class072092, class07211 class072112) {
        class00500 class005002 = this.method_8320(class072092);
        int n = class005002.N((class07290)this, class072092, class072112);
        if (class005002.u((class07290)this, class072092)) {
            return Math.max(n, this.a_(class072092));
        }
        return n;
    }

    default public int y(class07209 class072092, class07211 class072112) {
        return this.method_8320(class072092).y((class07290)this, class072092, class072112);
    }

    default public int N(class07209 class072092, class07211 class072112, boolean bl) {
        class00500 class005002 = this.method_8320(class072092);
        if (bl) {
            return class06781.E((class00500)class005002) ? this.y(class072092, class072112) : 0;
        }
        if (class005002.N(class00869.BF)) {
            return 15;
        }
        if (class005002.N(class00869.Lf)) {
            return (Integer)class005002.L((class08092)class06884.R);
        }
        if (class005002.j()) {
            return this.y(class072092, class072112);
        }
        return 0;
    }

    default public boolean W(class07209 class072092) {
        if (this.u(class072092.method_10074(), class07211.field_11033) > 0) {
            return true;
        }
        if (this.u(class072092.method_10084(), class07211.field_11036) > 0) {
            return true;
        }
        if (this.u(class072092.method_10095(), class07211.field_11043) > 0) {
            return true;
        }
        if (this.u(class072092.method_10072(), class07211.field_11035) > 0) {
            return true;
        }
        if (this.u(class072092.method_10067(), class07211.field_11039) > 0) {
            return true;
        }
        return this.u(class072092.method_10078(), class07211.field_11034) > 0;
    }

    default public int a_(class07209 class072092) {
        int n = 0;
        if ((n = Math.max(n, this.y(class072092.method_10074(), class07211.field_11033))) >= 15) {
            return n;
        }
        if ((n = Math.max(n, this.y(class072092.method_10084(), class07211.field_11036))) >= 15) {
            return n;
        }
        if ((n = Math.max(n, this.y(class072092.method_10095(), class07211.field_11043))) >= 15) {
            return n;
        }
        if ((n = Math.max(n, this.y(class072092.method_10072(), class07211.field_11035))) >= 15) {
            return n;
        }
        if ((n = Math.max(n, this.y(class072092.method_10067(), class07211.field_11039))) >= 15) {
            return n;
        }
        if ((n = Math.max(n, this.y(class072092.method_10078(), class07211.field_11034))) >= 15) {
            return n;
        }
        return n;
    }
}

