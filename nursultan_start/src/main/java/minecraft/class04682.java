/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01239
 *  minecraft.class01262
 *  minecraft.class01271
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class05973
 *  minecraft.class06202
 *  minecraft.class07536
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01239;
import minecraft.class01262;
import minecraft.class01271;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class05973;
import minecraft.class06202;
import minecraft.class07536;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class04682
implements class01239 {
    private static final class01894 N = class01894.y((String)"hud/hotbar");
    private static final class01894 y = class01894.y((String)"hud/hotbar_selection");
    private static final long L = 5000L;
    private static final long u = 2000L;
    private final class06202 i;
    private long R;
    private @Nullable class05973 M;

    private float L() {
        return class04995.N((float)((float)(this.R - class07536.L() + 5000L) / 2000.0f), (float)0.0f, (float)1.0f);
    }

    public class04682(class06202 class062022) {
        this.i = class062022;
    }

    public void y(int n) {
        int n2;
        for (n2 = this.M.i() + n; !(n2 < 0 || n2 > 8 || this.M.N(n2) != class05973.M && this.M.N(n2).ax_()); n2 += n) {
        }
        if (n2 >= 0 && n2 <= 8) {
            this.M.y(n2);
            this.R = class07536.L();
        }
    }

    public void y() {
        this.R = class07536.L();
        if (this.N()) {
            int n = this.M.i();
            if (n != -1) {
                this.M.y(n);
            }
        } else {
            this.M = new class05973((class01239)this);
        }
    }

    public void y(class01054 class010542) {
        float f = this.L();
        if (f > 0.0f && this.M != null) {
            class01262 class012622 = this.M.y();
            class00392 class003922 = class012622 == class05973.M ? this.M.L().y() : class012622.aw_();
            int n = ((class01590)this.i.i_3).N((class05936)class003922);
            int n2 = (class010542.N() - n) / 2;
            int n3 = class010542.y() - 35;
            class010542.N((class01590)this.i.i_3, class003922, n2, n3, n, class02566.y((float)f));
        }
    }

    public void N(class01054 class010542) {
        if (this.M == null) {
            return;
        }
        float f = this.L();
        if (f <= 0.0f) {
            this.M.u();
            return;
        }
        int n = class010542.N() / 2;
        int n2 = class04995.y((float)((float)class010542.y() - 22.0f * f));
        class01271 class012712 = this.M.R();
        this.N(class010542, f, n, n2, class012712);
    }

    public boolean N() {
        return this.M != null;
    }

    protected void N(class01054 class010542, float f, int n, int n2, class01271 class012712) {
        int n3 = class02566.y((float)f);
        class010542.N(class08394.Na, N, n - 91, n2, 182, 22, n3);
        if (class012712.N() >= 0) {
            class010542.N(class08394.Na, y, n - 91 - 1 + class012712.N() * 20, n2 - 1, 24, 23, n3);
        }
        for (int i = 0; i < 9; ++i) {
            this.N(class010542, i, class010542.N() / 2 - 90 + i * 20 + 2, n2 + 3, f, class012712.N(i));
        }
    }

    private void N(class01054 class010542, int n, int n2, float f, float f2, class01262 class012622) {
        if (class012622 != class05973.M) {
            class010542.i().pushMatrix();
            class010542.i().translate((float)n2, f);
            float f3 = class012622.ax_() ? 1.0f : 0.25f;
            class012622.N(class010542, f3, f2);
            class010542.i().popMatrix();
            if (f2 > 0.0f && class012622.ax_()) {
                class00392 class003922 = ((class05630)this.i.i_7).f[n].m();
                class010542.y((class01590)this.i.i_3, class003922, n2 + 19 - 2 - ((class01590)this.i.i_3).N((class05936)class003922), (int)f + 6 + 3, class02566.y((float)f2));
            }
        }
    }

    public void N(int n) {
        this.R = class07536.L();
        if (this.M != null) {
            this.M.y(n);
        } else {
            this.M = new class05973((class01239)this);
        }
    }

    public void N(class05973 class059732) {
        this.M = null;
        this.R = 0L;
    }
}

