/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 *  minecraft.class07316
 */
package minecraft;

import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class07316;

public class class05871
implements class00381<class07280> {
    public static final class02362<class04247, class05871> N = class00381.N(class05871::N, class05871::new);
    private final int y;
    private final class07316 L;
    private final int u;
    private final int i;
    private final boolean R;
    private final boolean M;

    public int L() {
        return this.u;
    }

    public boolean M() {
        return this.R;
    }

    public class05871(int n, class07316 class073162, int n2, int n3, boolean bl, boolean bl2) {
        this.y = n;
        this.L = class073162.N();
        this.u = n2;
        this.i = n3;
        this.R = bl;
        this.M = bl2;
    }

    private class05871(class04247 class042472) {
        this.y = class042472.G();
        this.L = (class07316)class07316.y.decode((Object)class042472);
        this.u = class042472.E();
        this.i = class042472.E();
        this.R = class042472.readBoolean();
        this.M = class042472.readBoolean();
    }

    public boolean B() {
        return this.M;
    }

    public int u() {
        return this.i;
    }

    public class07316 y() {
        return this.L;
    }

    public int N() {
        return this.y;
    }

    private void N(class04247 class042472) {
        class042472.R(this.y);
        class07316.y.encode((Object)class042472, (Object)this.L);
        class042472.L(this.u);
        class042472.L(this.i);
        class042472.writeBoolean(this.R);
        class042472.writeBoolean(this.M);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class05871> method_65080() {
        return class04248.S;
    }
}

