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

public class class08060
implements class00381<class07280> {
    public static final class02362<class00667, class08060> N = class00381.N(class08060::N, class08060::new);
    private final float y;
    private final int L;
    private final int u;

    public int L() {
        return this.u;
    }

    public class08060(float f, int n, int n2) {
        this.y = f;
        this.L = n;
        this.u = n2;
    }

    private class08060(class00667 class006672) {
        this.y = class006672.readFloat();
        this.u = class006672.E();
        this.L = class006672.E();
    }

    public int y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.writeFloat(this.y);
        class006672.L(this.u);
        class006672.L(this.L);
    }

    public float N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class08060> method_65080() {
        return class04248.NX;
    }
}

