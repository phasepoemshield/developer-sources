/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01687
 *  minecraft.class04834
 *  minecraft.class07211
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Set;
import minecraft.class01687;
import minecraft.class04809;
import minecraft.class04834;
import minecraft.class07211;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class class04800 {
    private final @Nullable String N;
    private final Vector3fc y;
    private final Vector3fc L;
    private final class04834 u;
    private final boolean i;
    private final class04809 R;
    private final class04809 M;
    private final Set<class07211> B;

    public class04800(@Nullable String string, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, class04834 class048342, boolean bl, float f9, float f10, Set<class07211> set) {
        this.N = string;
        this.R = new class04809(f, f2);
        this.y = new Vector3f(f3, f4, f5);
        this.L = new Vector3f(f6, f7, f8);
        this.u = class048342;
        this.i = bl;
        this.M = new class04809(f9, f10);
        this.B = set;
    }

    public class01687 N(int n, int n2) {
        return new class01687((int)this.R.N(), (int)this.R.y(), this.y.x(), this.y.y(), this.y.z(), this.L.x(), this.L.y(), this.L.z(), this.u.y, this.u.L, this.u.u, this.i, (float)n * this.M.N(), (float)n2 * this.M.y(), this.B);
    }
}

