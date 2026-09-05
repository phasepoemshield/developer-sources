/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class07321
 */
package minecraft;

import minecraft.class04995;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class08753;
import minecraft.class08773;

public class class08761
implements class08773 {
    private static final int N = 10;
    private static final int y = class04995.Z((int)7);
    private final boolean L;
    private int u;
    private int i;
    private int R;
    private float M;
    private volatile float B;

    private void L() {
        if (this.u == 0) {
            this.B = 0.0f;
        } else {
            float f = (float)this.i + this.M * (float)this.R;
            this.B = f / (float)this.u;
        }
    }

    public class08761(boolean bl) {
        this.L = bl;
    }

    private void y() {
        this.i += this.R;
        this.R = 0;
        this.L();
    }

    private boolean y(class08753 class087532) {
        return switch (class087532) {
            case class08753.field_61107 -> true;
            case class08753.field_61108 -> this.L;
            default -> false;
        };
    }

    public float N() {
        return this.B;
    }

    @Override
    public void N(class05946<class07299> class059462, class07321 class073212) {
    }

    @Override
    public void N(class08753 class087532, int n, int n2) {
        if (this.y(class087532)) {
            this.M = n2 == 0 ? 0.0f : (float)n / (float)n2;
            this.L();
        }
    }

    @Override
    public void N(class08753 class087532, int n) {
        if (!this.y(class087532)) {
            return;
        }
        switch (class087532) {
            case field_61107: {
                int n2 = this.L ? y : 0;
                this.u = 10 + n + n2;
                this.N(10);
                this.y();
                this.N(n);
                break;
            }
            case field_61108: {
                this.N(y);
            }
        }
    }

    private void N(int n) {
        this.R = n;
        this.M = 0.0f;
        this.L();
    }

    @Override
    public void N(class08753 class087532) {
        if (this.y(class087532)) {
            this.y();
        }
    }
}

