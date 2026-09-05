/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00753
 *  minecraft.class01001
 *  minecraft.class03557
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05975
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07830
 *  minecraft.class08004
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00753;
import minecraft.class01001;
import minecraft.class03557;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05975;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07614;
import minecraft.class07830;
import minecraft.class08004;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07622
implements class05975 {
    private static final Logger N = LogUtils.getLogger();
    private boolean y;
    private class07614 L = class07614.field_18482;
    private int u;
    private int i;
    private int R;
    private int M;
    private int B;

    private void y(class04782 class047822) {
        class08004 class080042;
        class06889 class068892 = this.N(class047822, new class07209(this.R, this.M, this.B));
        if (class068892 == null) {
            return;
        }
        try {
            class080042 = new class08004((class07299)class047822);
            class080042.N((class01001)class047822, class047822.method_8404(class080042.method_24515()), class06113.field_16467, null);
        }
        catch (Exception exception) {
            N.warn("Failed to create zombie for village siege at {}", (Object)class068892, (Object)exception);
            return;
        }
        class080042.method_5808(class068892.M, class068892.B, class068892.Z, class047822.field_9229.z() * 360.0f, 0.0f);
        class047822.y((class07049)class080042);
    }

    private boolean N(class04782 class047822) {
        for (class08036 class080362 : class047822.method_18456()) {
            class07209 class072092;
            if (class080362.method_7325() || !class047822.method_19500(class072092 = class080362.method_24515()) || class047822.i(class072092).N(class03557.Ny)) continue;
            for (int i = 0; i < 10; ++i) {
                float f = class047822.field_9229.z() * ((float)Math.PI * 2);
                this.R = class072092.method_10263() + class04995.y((float)(class04995.P((double)f) * 32.0f));
                this.M = class072092.method_10264();
                this.B = class072092.method_10260() + class04995.y((float)(class04995.m((double)f) * 32.0f));
                if (this.N(class047822, new class07209(this.R, this.M, this.B)) == null) continue;
                this.i = 0;
                this.u = 20;
                break;
            }
            return true;
        }
        return false;
    }

    private @Nullable class06889 N(class04782 class047822, class07209 class072092) {
        for (int i = 0; i < 10; ++i) {
            int n;
            int n2;
            int n3 = class072092.method_10263() + class047822.field_9229.y(16) - 8;
            class07209 class072093 = new class07209(n3, n2 = class047822.method_8624(class07830.field_13202, n3, n = class072092.method_10260() + class047822.field_9229.y(16) - 8), n);
            if (!class047822.method_19500(class072093) || !class07150.y((class07078)class07078.yx, (class01001)class047822, (class06113)class06113.field_16467, (class07209)class072093, (class06069)class047822.field_9229)) continue;
            return class06889.L((class00753)class072093);
        }
        return null;
    }

    public void N(class04782 class047822, boolean bl) {
        if (class047822.method_8530() || !bl) {
            this.L = class07614.field_18482;
            this.y = false;
            return;
        }
        if (class047822.method_8532() % 24000L == 18000L) {
            class07614 class076142 = this.L = class047822.field_9229.y(10) == 0 ? class07614.field_18481 : class07614.field_18482;
        }
        if (this.L == class07614.field_18482) {
            return;
        }
        if (!this.y) {
            if (this.N(class047822)) {
                this.y = true;
            } else {
                return;
            }
        }
        if (this.i > 0) {
            --this.i;
            return;
        }
        this.i = 2;
        if (this.u > 0) {
            this.y(class047822);
            --this.u;
        } else {
            this.L = class07614.field_18482;
        }
    }
}

