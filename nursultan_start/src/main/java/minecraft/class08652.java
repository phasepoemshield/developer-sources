/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01028
 *  minecraft.class01590
 *  minecraft.class01608
 *  minecraft.class03255
 *  minecraft.class08320
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01028;
import minecraft.class01590;
import minecraft.class01608;
import minecraft.class03255;
import minecraft.class08320;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public final class class08652
implements class08320 {
    public final class01590 N;
    public final class01028 y;
    public final Matrix3x2fc L;
    public final int u;
    public final int i;
    public final int R;
    public final int M;
    public final boolean B;
    final boolean Z;
    public final @Nullable class03255 z;
    private @Nullable class01608 U;
    private @Nullable class03255 E;

    public class08652(class01590 class015902, class01028 class010282, Matrix3x2fc matrix3x2fc, int n, int n2, int n3, int n4, boolean bl, boolean bl2, @Nullable class03255 class032552) {
        this.N = class015902;
        this.y = class010282;
        this.L = matrix3x2fc;
        this.u = n;
        this.i = n2;
        this.R = n3;
        this.M = n4;
        this.B = bl;
        this.Z = bl2;
        this.z = class032552;
    }

    public class01608 N() {
        if (this.U == null) {
            this.U = this.N.N(this.y, (float)this.u, (float)this.i, this.R, this.B, this.Z, this.M);
            class03255 class032552 = this.U.N();
            if (class032552 != null) {
                class032552 = class032552.y(this.L);
                this.E = this.z != null ? this.z.y(class032552) : class032552;
            }
        }
        return this.U;
    }

    public @Nullable class03255 comp_4274() {
        this.N();
        return this.E;
    }
}

