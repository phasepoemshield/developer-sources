/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class08559
 *  minecraft.class08898
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class08559;
import minecraft.class08898;
import minecraft.class08910;
import minecraft.class08943;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public class class08939
implements class08910 {
    private final class08559 N;
    private final class08910 y;
    private final class08910 L;

    public class08939(class08559 class085592, class08910 class089102, class08910 class089103) {
        this.N = class085592;
        this.y = class089102;
        this.L = class089103;
    }

    @Override
    public void method_65584(class08898 class088982, class06584 class065842, class08943 class089432, class03662 class036622, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        class088982.N((Object)this);
        (this.N.method_65638(class065842, class034482, class089612 == null ? null : class089612.method_72393(), n, class036622) ? this.y : this.L).method_65584(class088982, class065842, class089432, class036622, class034482, class089612, n);
    }
}

