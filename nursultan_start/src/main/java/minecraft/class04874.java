/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00803
 *  minecraft.class01001
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05975
 *  minecraft.class06069
 *  minecraft.class06091
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07830
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00803;
import minecraft.class01001;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05975;
import minecraft.class06069;
import minecraft.class06091;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07830;
import minecraft.class08036;

public class class04874
implements class05975 {
    private int N;

    public void N(class04782 class047822, boolean bl) {
        if (!bl) {
            return;
        }
        if (!((Boolean)class047822.method_64395().N(class07305.D)).booleanValue()) {
            return;
        }
        class06069 class060692 = class047822.field_9229;
        --this.N;
        if (this.N > 0) {
            return;
        }
        this.N += 12000 + class060692.y(1200);
        if (!class047822.method_8530()) {
            return;
        }
        if (class060692.y(5) != 0) {
            return;
        }
        int n = class047822.method_18456().size();
        if (n < 1) {
            return;
        }
        class08036 class080362 = (class08036)class047822.method_18456().get(class060692.y(n));
        if (class080362.method_7325()) {
            return;
        }
        if (class047822.method_19497(class080362.method_24515(), 2)) {
            return;
        }
        int n2 = (24 + class060692.y(24)) * (class060692.Z() ? -1 : 1);
        int n3 = (24 + class060692.y(24)) * (class060692.Z() ? -1 : 1);
        class07218 class072182 = class080362.method_24515().method_25503().y(n2, 0, n3);
        int n4 = 10;
        if (!class047822.N(class072182.method_10263() - 10, class072182.method_10260() - 10, class072182.method_10263() + 10, class072182.method_10260() + 10)) {
            return;
        }
        if (!((Boolean)class047822.method_75728().N(class00608.p, (class07209)class072182)).booleanValue()) {
            return;
        }
        int n5 = (int)Math.ceil(class047822.method_8404((class07209)class072182).y()) + 1;
        for (int i = 0; i < n5; ++i) {
            class072182.method_10099(class047822.N(class07830.field_13203, (class07209)class072182).method_10264());
            if (i == 0) {
                if (!this.N(class047822, (class07209)class072182, class060692, true)) {
                    break;
                }
            } else {
                this.N(class047822, (class07209)class072182, class060692, false);
            }
            class072182.method_20787(class072182.method_10263() + class060692.y(5) - class060692.y(5));
            class072182.method_20788(class072182.method_10260() + class060692.y(5) - class060692.y(5));
        }
    }

    private boolean N(class04782 class047822, class07209 class072092, class06069 class060692, boolean bl) {
        class00500 class005002 = class047822.method_8320(class072092);
        if (!class00803.N((class07290)class047822, (class07209)class072092, (class00500)class005002, (class04688)class005002.Y(), (class07078)class07078.yy)) {
            return false;
        }
        if (!class06091.N((class07078)class07078.yy, (class07284)class047822, (class06113)class06113.field_16527, (class07209)class072092, (class06069)class060692)) {
            return false;
        }
        class06091 class060912 = (class06091)class07078.yy.N((class07299)class047822, class06113.field_16527);
        if (class060912 != null) {
            if (bl) {
                class060912.M(true);
                class060912.I();
            }
            class060912.method_5814((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260());
            class060912.N((class01001)class047822, class047822.method_8404(class072092), class06113.field_16527, null);
            class047822.y((class07049)class060912);
            return true;
        }
        return false;
    }
}

