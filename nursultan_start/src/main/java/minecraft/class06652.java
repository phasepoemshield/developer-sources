/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07280;

public class class06652
implements class00381<class07280> {
    public static final class02362<class00667, class06652> N = class00381.N(class06652::N, class06652::new);
    private final int y;
    private final class06889 L;

    private class06652(class00667 class006672) {
        this.y = class006672.E();
        this.L = class006672.U();
    }

    public class06652(int n, class06889 class068892) {
        this.y = n;
        this.L = class068892;
    }

    public class06652(class07049 class070492) {
        this(class070492.method_5628(), class070492.method_18798());
    }

    public class06889 y() {
        return this.L;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.y;
    }

    private void N(class00667 class006672) {
        class006672.L(this.y);
        class006672.y(this.L);
    }

    public class02897<class06652> method_65080() {
        return class04248.NH;
    }
}

