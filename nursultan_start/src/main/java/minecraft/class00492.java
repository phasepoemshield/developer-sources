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
import minecraft.class00475;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;

public class class00492
extends class00475 {
    public static final class02362<class00667, class00492> z = class00381.N(class00492::y, class00492::N);

    public class00492(int n, byte by, byte by2, boolean bl) {
        super(n, (short)0, (short)0, (short)0, by, by2, bl, true, false);
    }

    private void y(class00667 class006672) {
        class006672.L(this.N);
        class006672.writeByte((int)this.i);
        class006672.writeByte((int)this.R);
        class006672.writeBoolean(this.M);
    }

    private static class00492 N(class00667 class006672) {
        int n = class006672.E();
        byte by = class006672.readByte();
        byte by2 = class006672.readByte();
        boolean bl = class006672.readBoolean();
        return new class00492(n, by, by2, bl);
    }

    public class02897<class00492> method_65080() {
        return class04248.r;
    }
}

