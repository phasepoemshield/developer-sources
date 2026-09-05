/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
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

public class class02860
implements class00381<class07280> {
    public static final class02362<class00667, class02860> N = class00381.N(class02860::N, class02860::new);
    private final double y;
    private final double L;
    private final double u;
    private final double i;
    private final long R;
    private final int M;
    private final int B;
    private final int Z;

    public double L() {
        return this.i;
    }

    public long M() {
        return this.R;
    }

    private class02860(class00667 class006672) {
        this.y = class006672.readDouble();
        this.L = class006672.readDouble();
        this.u = class006672.readDouble();
        this.i = class006672.readDouble();
        this.R = class006672.W();
        this.M = class006672.E();
        this.B = class006672.E();
        this.Z = class006672.E();
    }

    public class02860(class08057 class080572) {
        this.y = class080572.M();
        this.L = class080572.B();
        this.u = class080572.Z();
        this.i = class080572.U();
        this.R = class080572.z();
        this.M = class080572.W();
        this.B = class080572.b();
        this.Z = class080572.T();
    }

    public int B() {
        return this.M;
    }

    public int Z() {
        return this.Z;
    }

    public int z() {
        return this.B;
    }

    public double u() {
        return this.u;
    }

    public double y() {
        return this.L;
    }

    public double N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class00667 class006672) {
        class006672.writeDouble(this.y);
        class006672.writeDouble(this.L);
        class006672.writeDouble(this.u);
        class006672.writeDouble(this.i);
        class006672.N(this.R);
        class006672.L(this.M);
        class006672.L(this.B);
        class006672.L(this.Z);
    }

    public class02897<class02860> method_65080() {
        return class04248.X;
    }
}

