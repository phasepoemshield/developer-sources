/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class03255
 *  minecraft.class04995
 *  minecraft.class08320
 *  minecraft.class08763
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00734;
import minecraft.class03255;
import minecraft.class04995;
import minecraft.class08320;
import minecraft.class08763;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public final class class08650
implements class08320 {
    private final String N;
    private final Matrix3x2f y;
    private final class08763 L;
    private final int u;
    private final int i;
    private final @Nullable class03255 R;
    private final @Nullable class03255 M;
    private final @Nullable class03255 B;

    public class08763 L() {
        return this.L;
    }

    public @Nullable class03255 M() {
        return this.M;
    }

    public class08650(String string, Matrix3x2f matrix3x2f, class08763 class087632, int n, int n2, @Nullable class03255 class032552) {
        this.N = string;
        this.y = matrix3x2f;
        this.L = class087632;
        this.u = n;
        this.i = n2;
        this.R = class032552;
        this.M = this.L().B() ? this.B() : null;
        this.B = this.N(this.M != null ? this.M : new class03255(this.u, this.i, 16, 16));
    }

    private @Nullable class03255 B() {
        class00734 class007342 = this.L.M();
        int n = class04995.L((double)(class007342.y() * 16.0));
        int n2 = class04995.L((double)(class007342.L() * 16.0));
        if (n > 16 || n2 > 16) {
            float f = (float)(class007342.N * 16.0);
            float f2 = (float)(class007342.i * 16.0);
            int n3 = class04995.y((float)f);
            int n4 = class04995.y((float)f2);
            int n5 = this.u + n3 + 8;
            int n6 = this.i - n4 + 8;
            return new class03255(n5, n6, n, n2);
        }
        return null;
    }

    public int i() {
        return this.i;
    }

    public int u() {
        return this.u;
    }

    public Matrix3x2f y() {
        return this.y;
    }

    public String N() {
        return this.N;
    }

    private @Nullable class03255 N(class03255 class032552) {
        class03255 class032553 = class032552.y((Matrix3x2fc)this.y);
        return this.R != null ? this.R.y(class032553) : class032553;
    }

    public @Nullable class03255 comp_4274() {
        return this.B;
    }

    public @Nullable class03255 R() {
        return this.R;
    }
}

