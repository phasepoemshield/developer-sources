/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00384
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07209
 *  minecraft.class08051
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00384;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07209;
import minecraft.class08051;

public class class07358
implements class00381<class08051> {
    public static final class02362<class00667, class07358> N = class00381.N(class07358::N, class07358::new);
    private static final int y = 1;
    private static final int L = 2;
    private static final int u = 4;
    private final class07209 i;
    private final String R;
    private final boolean M;
    private final boolean B;
    private final boolean Z;
    private final class00384 z;

    public boolean L() {
        return this.M;
    }

    public boolean M() {
        return this.Z;
    }

    public class07358(class07209 class072092, String string, class00384 class003842, boolean bl, boolean bl2, boolean bl3) {
        this.i = class072092;
        this.R = string;
        this.M = bl;
        this.B = bl2;
        this.Z = bl3;
        this.z = class003842;
    }

    private class07358(class00667 class006672) {
        this.i = class006672.i();
        this.R = class006672.s();
        this.z = (class00384)class006672.y(class00384.class);
        byte by = class006672.readByte();
        this.M = (by & 1) != 0;
        this.B = (by & 2) != 0;
        this.Z = (by & 4) != 0;
    }

    public class00384 B() {
        return this.z;
    }

    public boolean u() {
        return this.B;
    }

    public String y() {
        return this.R;
    }

    public class07209 N() {
        return this.i;
    }

    private void N(class00667 class006672) {
        class006672.N(this.i);
        class006672.N(this.R);
        class006672.N((Enum)this.z);
        int n = 0;
        if (this.M) {
            n |= 1;
        }
        if (this.B) {
            n |= 2;
        }
        if (this.Z) {
            n |= 4;
        }
        class006672.writeByte(n);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12077(this);
    }

    public class02897<class07358> method_65080() {
        return class04248.LU;
    }
}

