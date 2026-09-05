/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public class class02655
implements class00381<class07280> {
    public static final class02362<class00667, class02655> N = class00381.N(class02655::N, class02655::new);
    private final int y;
    private final double L;

    public class02655(int n, double d) {
        this.y = n;
        this.L = d;
    }

    private class02655(class00667 class006672) {
        this.y = class006672.E();
        this.L = class006672.readDouble();
    }

    public double y() {
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
        class006672.writeDouble(this.L);
    }

    public class02897<class02655> method_65080() {
        return class04248.yP;
    }
}

