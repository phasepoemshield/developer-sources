/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01001
 *  minecraft.class03927
 *  minecraft.class04398
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05372
 *  minecraft.class05487
 *  minecraft.class05975
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07448
 *  minecraft.class07617
 */
package minecraft;

import minecraft.class00734;
import minecraft.class01001;
import minecraft.class03927;
import minecraft.class04398;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05372;
import minecraft.class05487;
import minecraft.class05975;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07448;
import minecraft.class07617;

public class class05730
implements class05975 {
    private static final int N = 1200;
    private int y;

    private void y(class04782 class047822, class07209 class072092) {
        int n = 16;
        if (class047822.N(class07617.class, new class00734(class072092).L(16.0, 8.0, 16.0)).isEmpty()) {
            this.N(class072092, class047822, true);
        }
    }

    private void N(class07209 class072092, class04782 class047822, boolean bl) {
        class07617 class076172 = (class07617)class07078.l.N((class07299)class047822, class06113.field_16459);
        if (class076172 == null) {
            return;
        }
        class076172.N((class01001)class047822, class047822.method_8404(class072092), class06113.field_16459, null);
        if (bl) {
            class076172.NW();
        }
        class076172.method_5725(class072092, 0.0f, 0.0f);
        class047822.y((class07049)class076172);
    }

    public void N(class04782 class047822, boolean bl) {
        --this.y;
        if (this.y > 0) {
            return;
        }
        this.y = 1200;
        class04770 class047702 = class047822.method_18779();
        if (class047702 == null) {
            return;
        }
        class06069 class060692 = class047822.field_9229;
        int n = (8 + class060692.y(24)) * (class060692.Z() ? -1 : 1);
        int n2 = (8 + class060692.y(24)) * (class060692.Z() ? -1 : 1);
        class07209 class072092 = class047702.method_24515().method_10069(n, 0, n2);
        int n3 = 10;
        if (!class047822.N(class072092.method_10263() - 10, class072092.method_10260() - 10, class072092.method_10263() + 10, class072092.method_10260() + 10)) {
            return;
        }
        if (class07448.N((class07078)class07078.l, (class05487)class047822, (class07209)class072092)) {
            if (class047822.method_19497(class072092, 2)) {
                this.N(class047822, class072092);
            } else if (class047822.method_27056().N(class072092, class04398.m).y()) {
                this.y(class047822, class072092);
            }
        }
    }

    private void N(class04782 class047822, class07209 class072092) {
        int n = 48;
        if (class047822.method_19494().u(class035562 -> class035562.N(class03927.m), class072092, 48, class05372.field_18488) > 4L && class047822.N(class07617.class, new class00734(class072092).L(48.0, 8.0, 48.0)).size() < 5) {
            this.N(class072092, class047822, false);
        }
    }
}

