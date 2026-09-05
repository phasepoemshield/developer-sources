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

public class class00477
extends class00475 {
    public static final class02362<class00667, class00477> z = class00381.N(class00477::y, class00477::N);

    public class00477(int n, short s, short s2, short s3, byte by, byte by2, boolean bl) {
        super(n, s, s2, s3, by, by2, bl, true, true);
    }

    private void y(class00667 class006672) {
        class006672.L(this.N);
        class006672.writeShort((int)this.y);
        class006672.writeShort((int)this.L);
        class006672.writeShort((int)this.u);
        class006672.writeByte((int)this.i);
        class006672.writeByte((int)this.R);
        class006672.writeBoolean(this.M);
    }

    private static class00477 N(class00667 class006672) {
        int n = class006672.E();
        short s = class006672.readShort();
        short s2 = class006672.readShort();
        short s3 = class006672.readShort();
        byte by = class006672.readByte();
        byte by2 = class006672.readByte();
        boolean bl = class006672.readBoolean();
        return new class00477(n, s, s2, s3, by, by2, bl);
    }

    public class02897<class00477> method_65080() {
        return class04248.D;
    }
}

