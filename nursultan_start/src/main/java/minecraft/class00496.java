/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class06584
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class06584;
import minecraft.class07280;

public class class00496
implements class00381<class07280> {
    public static final class02362<class04247, class00496> N = class00381.N(class00496::N, class00496::new);
    private final int y;
    private final int L;
    private final int u;
    private final class06584 i;

    public class06584 L() {
        return this.i;
    }

    public class00496(int n, int n2, int n3, class06584 class065842) {
        this.y = n;
        this.L = n2;
        this.u = n3;
        this.i = class065842.t();
    }

    private class00496(class04247 class042472) {
        this.y = class042472.G();
        this.L = class042472.E();
        this.u = class042472.readShort();
        this.i = (class06584)class06584.B.decode((Object)class042472);
    }

    public int u() {
        return this.L;
    }

    public int y() {
        return this.u;
    }

    private void N(class04247 class042472) {
        class042472.R(this.y);
        class042472.L(this.L);
        class042472.writeShort(this.u);
        class06584.B.encode((Object)class042472, (Object)this.i);
    }

    public int N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class00496> method_65080() {
        return class04248.t;
    }
}

