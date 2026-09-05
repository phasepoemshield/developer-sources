/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class05845
 *  minecraft.class07084
 *  minecraft.class07501
 */
package minecraft;

import minecraft.class00419;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class05845;
import minecraft.class07084;
import minecraft.class07501;

class class00385
implements class05845 {
    final /* synthetic */ class00419 N;

    class00385(class00419 class004192) {
        this.N = class004192;
    }

    public int N() {
        return 3;
    }

    public void N(int n, int n2) {
        switch (n) {
            case 0: {
                this.N.M = n2;
                break;
            }
            case 1: {
                if (!this.N.z.method_8608() && !this.N.R.isEmpty()) {
                    class00419.N(this.N.z, this.N.U, class04909.yr);
                }
                this.N.B = class00419.N((class03556<class07084>)class07501.N((int)n2));
                break;
            }
            case 2: {
                this.N.Z = class00419.N((class03556<class07084>)class07501.N((int)n2));
            }
        }
    }

    public int N(int n) {
        return switch (n) {
            case 0 -> this.N.M;
            case 1 -> class07501.N(this.N.B);
            case 2 -> class07501.N(this.N.Z);
            default -> 0;
        };
    }
}

