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

public class class00479
implements class00381<class07280> {
    public static final class02362<class00667, class00479> N = class00381.N(class00479::N, class00479::new);
    private final int y;
    private final int L;
    private final int u;

    public int L() {
        return this.u;
    }

    public class00479(int n, int n2, int n3) {
        this.y = n;
        this.L = n2;
        this.u = n3;
    }

    private class00479(class00667 class006672) {
        this.y = class006672.G();
        this.L = class006672.readShort();
        this.u = class006672.readShort();
    }

    public int y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.R(this.y);
        class006672.writeShort(this.L);
        class006672.writeShort(this.u);
    }

    public int N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class00479> method_65080() {
        return class04248.n;
    }
}

