/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01235
 *  minecraft.class06584
 *  minecraft.class07288
 *  minecraft.class07324
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class01235;
import minecraft.class06584;
import minecraft.class06917;
import minecraft.class06937;
import minecraft.class07288;
import minecraft.class07324;
import minecraft.class08036;

public class class06928
extends class06937 {
    private final class06917 N;
    private final class08036 y;
    private int M;
    private final class07288 B;

    public class06928(class08036 class080362, class07288 class072882, class06917 class069172, int n, int n2, int n3) {
        super(class069172, n, n2, n3);
        this.y = class080362;
        this.B = class072882;
        this.N = class069172;
    }

    @Override
    public void N(class08036 class080362, class06584 class065842) {
        this.c_(class065842);
        class07324 class073242 = this.N.y();
        if (class073242 != null) {
            class06584 class065843;
            class06584 class065844 = this.N.method_5438(0);
            if (class073242.y(class065844, class065843 = this.N.method_5438(1)) || class073242.y(class065843, class065844)) {
                this.B.N(class073242);
                class080362.method_7281(class01235.S);
                this.N.method_5447(0, class065844);
                this.N.method_5447(1, class065843);
            }
            this.B.N(this.B.u() + class073242.T());
        }
    }

    @Override
    protected void N(class06584 class065842, int n) {
        this.M += n;
        this.c_(class065842);
    }

    @Override
    public class06584 N(int n) {
        if (this.R()) {
            this.M += Math.min(n, this.i().c());
        }
        return super.N(n);
    }

    @Override
    public boolean N(class06584 class065842) {
        return false;
    }

    @Override
    protected void c_(class06584 class065842) {
        class065842.N(this.y, this.M);
        this.M = 0;
    }
}

