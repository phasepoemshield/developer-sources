/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02753
 *  minecraft.class02765
 *  minecraft.class06889
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02753;
import minecraft.class02765;
import minecraft.class06889;
import minecraft.class08800;
import org.jspecify.annotations.Nullable;

public class class08805
extends class08800 {
    public float N;
    public float y;
    public boolean L;
    public @Nullable class06889 u;
    public boolean i;
    public boolean R;
    public double M;
    public float B;
    public final class02765 Z = new class02765();

    public class02753 N(int n) {
        return this.Z.N(n, this.B);
    }

    public float N(int n, class02753 class027532, class02753 class027533) {
        double d = this.i ? (double)n / Math.max(this.M / 4.0, 1.0) : (this.R ? (double)n : (n == 6 ? 0.0 : class027533.N() - class027532.N()));
        return (float)d;
    }
}

