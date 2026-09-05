/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01317
 *  minecraft.class01328
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07952
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01317;
import minecraft.class01328;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07525;
import minecraft.class07952;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

class class07556
extends class07952<class08036> {
    private final class07525 Z;
    private @Nullable class08036 z;
    private int U;
    private int E;
    private final class01328 W;
    private final class01328 m = class01328.N().u();
    private final class01317 P;

    public void L() {
        this.U = this.N(5);
        this.E = 0;
        this.Z.l();
    }

    public class07556(class07525 class075252, @Nullable class01317 class013172) {
        super((class07079)class075252, class08036.class, 10, false, false, class013172);
        this.Z = class075252;
        this.P = (class074382, class047822) -> (class075252.N((class08036)class074382) || class075252.N(class074382, class047822)) && !class075252.method_5821((class07049)class074382);
        this.W = class01328.N().N(this.Z()).N(this.P);
    }

    public void i() {
        if (this.Z.T() == null) {
            super.N(null);
        }
        if (this.z != null) {
            if (--this.U <= 0) {
                this.L = this.z;
                this.z = null;
                super.L();
            }
        } else {
            if (this.L != null && !this.Z.method_5765()) {
                if (this.Z.N((class08036)this.L)) {
                    if (this.L.method_5858((class07049)this.Z) < 16.0) {
                        this.Z.v();
                    }
                    this.E = 0;
                } else if (this.L.method_5858((class07049)this.Z) > 256.0 && this.E++ >= this.N(30) && this.Z.L((class07049)this.L)) {
                    this.E = 0;
                }
            }
            super.i();
        }
    }

    public void u() {
        this.z = null;
        super.u();
    }

    public boolean y() {
        if (this.z != null) {
            if (!this.P.method_18303((class07438)this.z, class07556.N((class07049)this.Z))) {
                return false;
            }
            this.Z.N((class07049)this.z, 10.0f, 10.0f);
            return true;
        }
        if (this.L != null) {
            if (this.Z.method_5821((class07049)this.L)) {
                return false;
            }
            if (this.m.N(class07556.N((class07049)this.Z), (class07438)this.Z, this.L)) {
                return true;
            }
        }
        return super.y();
    }

    public boolean N() {
        this.z = class07556.N((class07049)this.Z).N(this.W.N(this.Z()), (class07438)this.Z);
        return this.z != null;
    }
}

