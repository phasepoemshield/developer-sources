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
 *  minecraft.class08033
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class08033;

public class class06659
implements class00381<class07280> {
    public static final class02362<class00667, class06659> N = class00381.N(class06659::N, class06659::new);
    private static final int y = 1;
    private static final int L = 2;
    private static final int u = 4;
    private static final int i = 8;
    private final boolean R;
    private final boolean M;
    private final boolean B;
    private final boolean Z;
    private final float z;
    private final float U;

    public boolean L() {
        return this.B;
    }

    public float M() {
        return this.z;
    }

    public class06659(class08033 class080332) {
        this.R = class080332.N;
        this.M = class080332.y;
        this.B = class080332.L;
        this.Z = class080332.u;
        this.z = class080332.N();
        this.U = class080332.y();
    }

    private class06659(class00667 class006672) {
        byte by = class006672.readByte();
        this.R = (by & 1) != 0;
        this.M = (by & 2) != 0;
        this.B = (by & 4) != 0;
        this.Z = (by & 8) != 0;
        this.z = class006672.readFloat();
        this.U = class006672.readFloat();
    }

    public float B() {
        return this.U;
    }

    public boolean u() {
        return this.Z;
    }

    public boolean y() {
        return this.M;
    }

    public boolean N() {
        return this.R;
    }

    private void N(class00667 class006672) {
        byte by = 0;
        if (this.R) {
            by = (byte)(by | 1);
        }
        if (this.M) {
            by = (byte)(by | 2);
        }
        if (this.B) {
            by = (byte)(by | 4);
        }
        if (this.Z) {
            by = (byte)(by | 8);
        }
        class006672.writeByte((int)by);
        class006672.writeFloat(this.z);
        class006672.writeFloat(this.U);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class06659> method_65080() {
        return class04248.NR;
    }
}

