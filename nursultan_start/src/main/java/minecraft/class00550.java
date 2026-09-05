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
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00547;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class06889;

public class class00550
extends class00547 {
    public static final class02362<class00667, class00550> z = class00381.N(class00550::y, class00550::N);

    public class00550(class06889 class068892, boolean bl, boolean bl2) {
        super(class068892.M, class068892.B, class068892.Z, 0.0f, 0.0f, bl, bl2, true, false);
    }

    public class00550(double d, double d2, double d3, boolean bl, boolean bl2) {
        super(d, d2, d3, 0.0f, 0.0f, bl, bl2, true, false);
    }

    private void y(class00667 class006672) {
        class006672.writeDouble(this.N);
        class006672.writeDouble(this.y);
        class006672.writeDouble(this.L);
        class006672.writeByte(class00547.N(this.R, this.M));
    }

    private static class00550 N(class00667 class006672) {
        double d = class006672.readDouble();
        double d2 = class006672.readDouble();
        double d3 = class006672.readDouble();
        short s = class006672.readUnsignedByte();
        boolean bl = class00547.N(s);
        boolean bl2 = class00547.y(s);
        return new class00550(d, d2, d3, bl, bl2);
    }

    public class02897<class00550> method_65080() {
        return class04248.ya;
    }
}

