/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  minecraft.class04834
 *  minecraft.class07211
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import minecraft.class04800;
import minecraft.class04834;
import minecraft.class07211;

public class class04822 {
    private static final Set<class07211> N = EnumSet.allOf(class07211.class);
    private final List<class04800> y = Lists.newArrayList();
    private int L;
    private int u;
    private boolean i;

    public static class04822 L() {
        return new class04822();
    }

    public List<class04800> y() {
        return ImmutableList.copyOf(this.y);
    }

    public class04822 N(float f, float f2, float f3, float f4, float f5, float f6, class04834 class048342, float f7, float f8) {
        this.y.add(new class04800(null, this.L, this.u, f, f2, f3, f4, f5, f6, class048342, this.i, f7, f8, N));
        return this;
    }

    public class04822 N(String string, float f, float f2, float f3, float f4, float f5, float f6, class04834 class048342) {
        this.y.add(new class04800(string, this.L, this.u, f, f2, f3, f4, f5, f6, class048342, this.i, 1.0f, 1.0f, N));
        return this;
    }

    public class04822 N(float f, float f2, float f3, float f4, float f5, float f6, boolean bl) {
        this.y.add(new class04800(null, this.L, this.u, f, f2, f3, f4, f5, f6, class04834.N, bl, 1.0f, 1.0f, N));
        return this;
    }

    public class04822 N(float f, float f2, float f3, float f4, float f5, float f6, class04834 class048342) {
        this.y.add(new class04800(null, this.L, this.u, f, f2, f3, f4, f5, f6, class048342, this.i, 1.0f, 1.0f, N));
        return this;
    }

    public class04822 N(int n, int n2) {
        this.L = n;
        this.u = n2;
        return this;
    }

    public class04822 N(String string, float f, float f2, float f3, float f4, float f5, float f6) {
        this.y.add(new class04800(string, this.L, this.u, f, f2, f3, f4, f5, f6, class04834.N, this.i, 1.0f, 1.0f, N));
        return this;
    }

    public class04822 N(boolean bl) {
        this.i = bl;
        return this;
    }

    public class04822 N(String string, float f, float f2, float f3, int n, int n2, int n3, class04834 class048342, int n4, int n5) {
        this.N(n4, n5);
        this.y.add(new class04800(string, this.L, this.u, f, f2, f3, n, n2, n3, class048342, this.i, 1.0f, 1.0f, N));
        return this;
    }

    public class04822 N(String string, float f, float f2, float f3, int n, int n2, int n3, int n4, int n5) {
        this.N(n4, n5);
        this.y.add(new class04800(string, this.L, this.u, f, f2, f3, n, n2, n3, class04834.N, this.i, 1.0f, 1.0f, N));
        return this;
    }

    public class04822 N(float f, float f2, float f3, float f4, float f5, float f6) {
        this.y.add(new class04800(null, this.L, this.u, f, f2, f3, f4, f5, f6, class04834.N, this.i, 1.0f, 1.0f, N));
        return this;
    }

    public class04822 N(float f, float f2, float f3, float f4, float f5, float f6, Set<class07211> set) {
        this.y.add(new class04800(null, this.L, this.u, f, f2, f3, f4, f5, f6, class04834.N, this.i, 1.0f, 1.0f, set));
        return this;
    }

    public class04822 N() {
        return this.N(true);
    }
}

