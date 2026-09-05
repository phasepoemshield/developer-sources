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

public class class08095
implements class00381<class07280> {
    public static final class02362<class00667, class08095> N = class00381.N(class08095::N, class08095::new);
    private final float y;
    private final int L;
    private final float u;

    public float L() {
        return this.u;
    }

    public class08095(float f, int n, float f2) {
        this.y = f;
        this.L = n;
        this.u = f2;
    }

    private class08095(class00667 class006672) {
        this.y = class006672.readFloat();
        this.L = class006672.E();
        this.u = class006672.readFloat();
    }

    public int y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.writeFloat(this.y);
        class006672.L(this.L);
        class006672.writeFloat(this.u);
    }

    public float N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class08095> method_65080() {
        return class04248.Na;
    }
}

