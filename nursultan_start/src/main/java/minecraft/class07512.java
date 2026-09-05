/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04387
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05349
 *  minecraft.class07086
 *  minecraft.class07305
 *  minecraft.class08299
 *  minecraft.class08329
 *  squeek.appleskin.helpers.ExhaustionHelper$ExhaustionManipulator
 */
package minecraft;

import minecraft.class04387;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05349;
import minecraft.class07086;
import minecraft.class07305;
import minecraft.class08299;
import minecraft.class08329;
import squeek.appleskin.helpers.ExhaustionHelper;

public class class07512
implements ExhaustionHelper.ExhaustionManipulator {
    private static final int N = 0;
    private static final float y = 0.0f;
    private int L = 20;
    private float u = 5.0f;
    private float i;
    private int R;

    public boolean L() {
        return this.L < 20;
    }

    public float u() {
        return this.u;
    }

    public void y(float f) {
        this.u = f;
    }

    public boolean y() {
        return (float)this.N() > 6.0f;
    }

    private void y(int n, float f) {
        this.L = class04995.N((int)(n + this.L), (int)0, (int)20);
        this.u = class04995.N((float)(f + this.u), (float)0.0f, (float)this.L);
    }

    public void N(class05349 class053492) {
        this.y(class053492.N(), class053492.y());
    }

    public void N(float f) {
        this.i = Math.min(this.i + f, 40.0f);
    }

    public void N(int n, float f) {
        this.y(n, class04387.N((int)n, (float)f));
    }

    public void N(int n) {
        this.L = n;
    }

    public void N(class08299 class082992) {
        this.L = class082992.N("foodLevel", 20);
        this.R = class082992.N("foodTickTimer", 0);
        this.u = class082992.N("foodSaturationLevel", 5.0f);
        this.i = class082992.N("foodExhaustionLevel", 0.0f);
    }

    public void N(class08329 class083292) {
        class083292.N("foodLevel", this.L);
        class083292.N("foodTickTimer", this.R);
        class083292.N("foodSaturationLevel", this.u);
        class083292.N("foodExhaustionLevel", this.i);
    }

    public int N() {
        return this.L;
    }

    public void N(class04770 class047702) {
        boolean bl;
        class04782 class047822 = class047702.method_51469();
        class07086 class070862 = class047822.y();
        if (this.i > 4.0f) {
            this.i -= 4.0f;
            if (this.u > 0.0f) {
                this.u = Math.max(this.u - 1.0f, 0.0f);
            } else if (class070862 != class07086.field_5801) {
                this.L = Math.max(this.L - 1, 0);
            }
        }
        if ((bl = ((Boolean)class047822.method_64395().N(class07305.J)).booleanValue()) && this.u > 0.0f && class047702.method_7317() && this.L >= 20) {
            ++this.R;
            if (this.R >= 10) {
                float f = Math.min(this.u, 6.0f);
                class047702.method_6025(f / 6.0f);
                this.N(f);
                this.R = 0;
            }
        } else if (bl && this.L >= 18 && class047702.method_7317()) {
            ++this.R;
            if (this.R >= 80) {
                class047702.method_6025(1.0f);
                this.N(6.0f);
                this.R = 0;
            }
        } else if (this.L <= 0) {
            ++this.R;
            if (this.R >= 80) {
                if (class047702.method_6032() > 10.0f || class070862 == class07086.field_5807 || class047702.method_6032() > 1.0f && class070862 == class07086.field_5802) {
                    class047702.method_64397(class047822, class047702.method_48923().z(), 1.0f);
                }
                this.R = 0;
            }
        } else {
            this.R = 0;
        }
    }

    public void setExhaustion(float f) {
        this.i = f;
    }

    public float getExhaustion() {
        return this.i;
    }
}

