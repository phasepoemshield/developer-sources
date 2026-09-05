/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class08898
 *  minecraft.class08910
 *  minecraft.class08943
 *  minecraft.class08961
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Iterator;
import java.util.List;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class08898;
import minecraft.class08910;
import minecraft.class08943;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public class class11666
implements class08910 {
    private final List<class08910> N;

    public class11666(List<class08910> list) {
        this.N = list;
    }

    public void method_65584(class08898 class088982, class06584 class065842, class08943 class089432, class03662 class036622, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        class088982.N((Object)this);
        class088982.N(this.N.size());
        Iterator<class08910> var8 = this.N.iterator();
        while (var8.hasNext()) {
            var8.next().method_65584(class088982, class065842, class089432, class036622, class034482, class089612, n);
        }
    }
}

