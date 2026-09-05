/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00480
 *  minecraft.class02265
 *  minecraft.class07769
 *  minecraft.class07790
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Collection;
import minecraft.class00381;
import minecraft.class00480;
import minecraft.class02265;
import minecraft.class07769;
import minecraft.class07790;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class10791 {
    public final class08036 N;
    private boolean u = true;
    private int i;
    private int R;
    private int M = 127;
    private int B = 127;
    private boolean Z = true;
    private int z;
    public int y;
    final /* synthetic */ class07769 L;

    public class10791(class07769 class077692, class08036 class080362) {
        this.L = class077692;
        this.N = class080362;
    }

    public void y() {
        this.Z = true;
    }

    private class07790 N() {
        int n = this.i;
        int n2 = this.R;
        int n3 = this.M + 1 - this.i;
        int n4 = this.B + 1 - this.R;
        byte[] byArray = new byte[n3 * n4];
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n4; ++j) {
                byArray[i + j * n3] = this.L.B[n + i + (n2 + j) * 128];
            }
        }
        return new class07790(n, n2, n3, n4, byArray);
    }

    public void N(int n, int n2) {
        if (this.u) {
            this.i = Math.min(this.i, n);
            this.R = Math.min(this.R, n2);
            this.M = Math.max(this.M, n);
            this.B = Math.max(this.B, n2);
        } else {
            this.u = true;
            this.i = n;
            this.R = n2;
            this.M = n;
            this.B = n2;
        }
    }

    public @Nullable class00381<?> N(class02265 class022652) {
        Collection collection;
        class07790 class077902;
        if (this.u) {
            this.u = false;
            class077902 = this.N();
        } else {
            class077902 = null;
        }
        if (this.Z && this.z++ % 5 == 0) {
            this.Z = false;
            Collection var3 = this.L.z.values();
        } else {
            collection = null;
        }
        if (collection != null || class077902 != null) {
            return new class00480(class022652, this.L.M, this.L.Z, collection, class077902);
        }
        return null;
    }
}

