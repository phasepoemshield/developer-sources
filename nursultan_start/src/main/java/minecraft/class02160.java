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
 *  minecraft.class08057
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class08057;

public class class02160
implements class00381<class07280> {
    public static final class02362<class00667, class02160> N = class00381.N(class02160::N, class02160::new);
    private final double y;
    private final double L;
    private final long u;

    public long L() {
        return this.u;
    }

    public class02160(class08057 class080572) {
        this.y = class080572.Z();
        this.L = class080572.U();
        this.u = class080572.z();
    }

    private class02160(class00667 class006672) {
        this.y = class006672.readDouble();
        this.L = class006672.readDouble();
        this.u = class006672.W();
    }

    public double y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.writeDouble(this.y);
        class006672.writeDouble(this.L);
        class006672.N(this.u);
    }

    public double N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class02160> method_65080() {
        return class04248.NY;
    }
}

