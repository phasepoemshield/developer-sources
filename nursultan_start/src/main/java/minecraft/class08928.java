/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00372
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class08898
 *  minecraft.class08900
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00372;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class08898;
import minecraft.class08900;
import minecraft.class08910;
import minecraft.class08943;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public class class08928<T>
implements class08910 {
    private final class00372<T> N;
    private final class08900<T> y;

    public class08928(class00372<T> class003722, class08900<T> class089002) {
        this.N = class003722;
        this.y = class089002;
    }

    @Override
    public void method_65584(class08898 class088982, class06584 class065842, class08943 class089432, class03662 class036622, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        class088982.N((Object)this);
        Object object = this.N.y(class065842, class034482, class089612 == null ? null : class089612.method_72393(), n, class036622);
        class08910 class089102 = this.y.get(object, class034482);
        if (class089102 != null) {
            class089102.method_65584(class088982, class065842, class089432, class036622, class034482, class089612, n);
        }
    }
}

