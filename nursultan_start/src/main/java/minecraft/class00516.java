/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07209
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07209;
import minecraft.class07280;

public class class00516
implements class00381<class07280> {
    public static final class02362<class00667, class00516> N = class00381.N(class00516::N, class00516::new);
    private final int y;
    private final class07209 L;
    private final int u;
    private final boolean i;

    public int L() {
        return this.u;
    }

    public class00516(int n, class07209 class072092, int n2, boolean bl) {
        this.y = n;
        this.L = class072092.method_10062();
        this.u = n2;
        this.i = bl;
    }

    private class00516(class00667 class006672) {
        this.y = class006672.readInt();
        this.L = class006672.i();
        this.u = class006672.readInt();
        this.i = class006672.readBoolean();
    }

    public class07209 u() {
        return this.L;
    }

    public int y() {
        return this.y;
    }

    private void N(class00667 class006672) {
        class006672.writeInt(this.y);
        class006672.N(this.L);
        class006672.writeInt(this.u);
        class006672.writeBoolean(this.i);
    }

    public boolean N() {
        return this.i;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class00516> method_65080() {
        return class04248.p;
    }
}

