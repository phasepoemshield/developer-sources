/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.cache.LoadingCache
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;
import minecraft.class06646;
import minecraft.class06649;
import minecraft.class07209;
import minecraft.class07211;

public class class06653 {
    private final class07209 N;
    private final class07211 y;
    private final class07211 L;
    private final LoadingCache<class07209, class06646> u;
    private final int i;
    private final int R;
    private final int M;

    public class07211 L() {
        return this.L;
    }

    public class06653(class07209 class072092, class07211 class072112, class07211 class072113, LoadingCache<class07209, class06646> loadingCache, int n, int n2, int n3) {
        this.N = class072092;
        this.y = class072112;
        this.L = class072113;
        this.u = loadingCache;
        this.i = n;
        this.R = n2;
        this.M = n3;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("up", (Object)this.L).add("forwards", (Object)this.y).add("frontTopLeft", (Object)this.N).toString();
    }

    public int i() {
        return this.R;
    }

    public int u() {
        return this.i;
    }

    public class07211 y() {
        return this.y;
    }

    public class07209 N() {
        return this.N;
    }

    public class06646 N(int n, int n2, int n3) {
        return (class06646)this.u.getUnchecked((Object)class06649.N(this.N, this.y(), this.L(), n, n2, n3));
    }

    public int R() {
        return this.M;
    }
}

