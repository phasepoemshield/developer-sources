/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07999
 */
package minecraft;

import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07869;
import minecraft.class07999;

class class07875
extends class07999 {
    final /* synthetic */ class07869 y;

    public class07875(class07869 class078692) {
        this.y = class078692;
        super((class07475)class078692, 1.25, true);
    }

    public void u() {
        this.y.N(false);
        super.u();
    }

    protected void N(class07438 class074382) {
        if (this.y(class074382)) {
            this.M();
            this.N.method_6121(class07875.N((class07049)this.N), (class07049)class074382);
            this.y.N(false);
        } else if (this.N.method_5858((class07049)class074382) < (double)((class074382.method_17681() + 3.0f) * (class074382.method_17681() + 3.0f))) {
            if (this.Z()) {
                this.y.N(false);
                this.M();
            }
            if (this.U() <= 10) {
                this.y.N(true);
                this.y.v();
            }
        } else {
            this.M();
            this.y.N(false);
        }
    }
}

