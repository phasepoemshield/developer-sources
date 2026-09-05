/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class03860
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class06069
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import minecraft.class03300;
import minecraft.class03860;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class06069;
import org.jspecify.annotations.Nullable;

public class class03291
implements class03860 {
    private final List<class04890> N = Lists.newArrayList();

    public boolean L() {
        return this.N.isEmpty();
    }

    public class05163 u() {
        return class04890.N(this.N.stream());
    }

    public void y() {
        this.N.clear();
    }

    public class03300 N() {
        return new class03300(this.N);
    }

    public void N(class06069 class060692, int n, int n2) {
        class05163 class051632 = this.u();
        int n3 = n2 - n + 1 - class051632.i();
        int n4 = n3 > 1 ? n + class060692.y(n3) : n;
        int n5 = n4 - class051632.Z();
        this.N(n5);
    }

    public void N(class04890 class048902) {
        this.N.add(class048902);
    }

    public @Nullable class04890 N(class05163 class051632) {
        return class04890.N(this.N, (class05163)class051632);
    }

    @Deprecated
    public int N(int n, int n2, class06069 class060692, int n3) {
        int n4 = n - n3;
        class05163 class051632 = this.u();
        int n5 = class051632.i() + n2 + 1;
        if (n5 < n4) {
            n5 += class060692.y(n4 - n5);
        }
        int n6 = n5 - class051632.E();
        this.N(n6);
        return n6;
    }

    @Deprecated
    public void N(int n) {
        Iterator<class04890> var2 = this.N.iterator();
        while (var2.hasNext()) {
            var2.next().N(0, n, 0);
        }
    }
}

