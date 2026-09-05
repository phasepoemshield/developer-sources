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

public class class00525
extends class00547 {
    public static final class02362<class00667, class00525> z = class00381.N(class00525::y, class00525::N);

    public class00525(boolean bl, boolean bl2) {
        super(0.0, 0.0, 0.0, 0.0f, 0.0f, bl, bl2, false, false);
    }

    private void y(class00667 class006672) {
        class006672.writeByte(class00547.N(this.R, this.M));
    }

    private static class00525 N(class00667 class006672) {
        short s = class006672.readUnsignedByte();
        boolean bl = class00547.N(s);
        boolean bl2 = class00547.y(s);
        return new class00525(bl, bl2);
    }

    public class02897<class00525> method_65080() {
        return class04248.yA;
    }
}

