/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00547;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;

public class class00530
extends class00547 {
    public static final class02362<class00667, class00530> z = class00381.N(class00530::y, class00530::N);

    public class00530(float f, float f2, boolean bl, boolean bl2) {
        super(0.0, 0.0, 0.0, f, f2, bl, bl2, false, true);
    }

    private void y(class00667 class006672) {
        class006672.writeFloat(this.u);
        class006672.writeFloat(this.i);
        class006672.writeByte(class00547.N(this.R, this.M));
    }

    private static class00530 N(class00667 class006672) {
        float f = class006672.readFloat();
        float f2 = class006672.readFloat();
        short s = class006672.readUnsignedByte();
        boolean bl = class00547.N(s);
        boolean bl2 = class00547.y(s);
        return new class00530(f, f2, bl, bl2);
    }

    public class02897<class00530> method_65080() {
        return class04248.yF;
    }
}

