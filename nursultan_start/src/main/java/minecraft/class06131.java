/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04650
 *  minecraft.class04680
 *  minecraft.class04995
 *  minecraft.class07536
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04650;
import minecraft.class04680;
import minecraft.class04995;
import minecraft.class06086;
import minecraft.class07536;

class class06131<T extends class04680> {
    private static final long R = 600L;
    private final T M;
    final int N;
    final int y;
    private long B;
    private long Z;
    class04650 L;
    private long z;
    private float U;
    protected boolean u;
    final /* synthetic */ class06086 i;

    public boolean L() {
        return this.u;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06131(class06086 class060862, class04680 class046802, int n, int n2) {
        this.i = class060862;
        this.M = class046802;
        this.N = n;
        this.y = n2;
        this.y();
    }

    public void u() {
        long l = class07536.L();
        if (this.B == -1L) {
            this.B = l;
            this.L = class04650.field_2210;
        }
        if (this.L == class04650.field_2210 && l - this.B <= 600L) {
            this.Z = l;
        }
        this.z = l - this.Z;
        this.N(l);
        this.M.N(this.i, this.z);
        class04650 class046502 = this.M.i();
        if (class046502 != this.L) {
            this.B = l - (long)((int)((1.0f - this.U) * 600.0f));
            this.L = class046502;
        }
        boolean bl = this.u;
        boolean bl2 = this.u = this.L == class04650.field_2209 && l - this.B > 600L;
        if (this.u && !bl) {
            this.M.y();
        }
    }

    public void y() {
        this.B = -1L;
        this.Z = -1L;
        this.L = class04650.field_2209;
        this.z = 0L;
        this.U = 0.0f;
        this.u = false;
    }

    public void N(class01054 class010542, int n) {
        if (this.u) {
            return;
        }
        class010542.i().pushMatrix();
        class010542.i().translate(this.M.N(n, this.U), this.M.N(this.N));
        this.M.N(class010542, (class01590)this.i.N.i_3, this.z);
        class010542.i().popMatrix();
    }

    private void N(long l) {
        float f = class04995.N((float)((float)(l - this.B) / 600.0f), (float)0.0f, (float)1.0f);
        f *= f;
        this.U = this.L == class04650.field_2209 ? 1.0f - f : f;
    }

    public T N() {
        return this.M;
    }
}

