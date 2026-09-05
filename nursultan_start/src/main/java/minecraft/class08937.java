/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06572
 *  minecraft.class06584
 *  minecraft.class08898
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Arrays;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06572;
import minecraft.class06584;
import minecraft.class08898;
import minecraft.class08910;
import minecraft.class08943;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public class class08937
implements class08910 {
    private static final int N = 16;
    private final class06572 y;
    private final float L;
    private final float[] u;
    private final class08910[] i;
    private final class08910 R;

    class08937(class06572 class065722, float f, float[] fArray, class08910[] class08910Array, class08910 class089102) {
        this.y = class065722;
        this.u = fArray;
        this.i = class08910Array;
        this.R = class089102;
        this.L = f;
    }

    private static int N(float[] fArray, float f) {
        if (fArray.length < 16) {
            for (int i = 0; i < fArray.length; ++i) {
                if (!(fArray[i] > f)) continue;
                return i - 1;
            }
            return fArray.length - 1;
        }
        int n = Arrays.binarySearch(fArray, f);
        if (n < 0) {
            return ~n - 1;
        }
        return n;
    }

    @Override
    public void method_65584(class08898 class088982, class06584 class065842, class08943 class089432, class03662 class036622, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        int n2;
        class088982.N((Object)this);
        float f = this.y.N(class065842, class034482, class089612, n) * this.L;
        class08910 class089102 = Float.isNaN(f) ? this.R : ((n2 = class08937.N(this.u, f)) == -1 ? this.R : this.i[n2]);
        class089102.method_65584(class088982, class065842, class089432, class036622, class034482, class089612, n);
    }
}

