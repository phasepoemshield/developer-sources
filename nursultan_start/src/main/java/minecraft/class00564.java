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

public class class00564
extends class00547 {
    public static final class02362<class00667, class00564> z = class00381.N(class00564::y, class00564::N);

    public class00564(class06889 class068892, float f, float f2, boolean bl, boolean bl2) {
        super(class068892.M, class068892.B, class068892.Z, f, f2, bl, bl2, true, true);
    }

    public class00564(double d, double d2, double d3, float f, float f2, boolean bl, boolean bl2) {
        super(d, d2, d3, f, f2, bl, bl2, true, true);
    }

    private void y(class00667 class006672) {
        class006672.writeDouble(this.N);
        class006672.writeDouble(this.y);
        class006672.writeDouble(this.L);
        class006672.writeFloat(this.u);
        class006672.writeFloat(this.i);
        class006672.writeByte(class00547.N(this.R, this.M));
    }

    private static class00564 N(class00667 class006672) {
        double d = class006672.readDouble();
        double d2 = class006672.readDouble();
        double d3 = class006672.readDouble();
        float f = class006672.readFloat();
        float f2 = class006672.readFloat();
        short s = class006672.readUnsignedByte();
        boolean bl = class00547.N(s);
        boolean bl2 = class00547.y(s);
        return new class00564(d, d2, d3, f, f2, bl, bl2);
    }

    public class02897<class00564> method_65080() {
        return class04248.yp;
    }
}

