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

public class class02668
implements class00381<class07280> {
    public static final class02362<class00667, class02668> N = class00381.N(class02668::N, class02668::new);
    private final int y;
    private final int L;
    private final int u;

    public int L() {
        return this.u;
    }

    public class02668(int n, int n2, int n3) {
        this.y = n;
        this.L = n2;
        this.u = n3;
    }

    private class02668(class00667 class006672) {
        this.y = class006672.readInt();
        this.L = class006672.readInt();
        this.u = class006672.readInt();
    }

    public int y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.writeInt(this.y);
        class006672.writeInt(this.L);
        class006672.writeInt(this.u);
    }

    public int N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class02668> method_65080() {
        return class04248.Nr;
    }
}

