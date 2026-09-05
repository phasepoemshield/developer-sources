/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04801;

public class class04806 {
    private final class04792 N;
    private final class04801 y;

    private class04806(class04792 class047922, class04801 class048012) {
        this.N = class047922;
        this.y = class048012;
    }

    public static class04806 N(class04792 class047922, int n, int n2) {
        return new class04806(class047922, new class04801(n, n2));
    }

    public class01686 N() {
        return this.N.N().N(this.y.N, this.y.y);
    }

    public class04806 N(class02415 class024152) {
        return new class04806(class024152.apply(this.N), this.y);
    }
}

