/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05845
 */
package minecraft;

import minecraft.class00415;
import minecraft.class05845;

class class00416
implements class05845 {
    final /* synthetic */ class00415 N;

    class00416(class00415 class004152) {
        this.N = class004152;
    }

    public int N() {
        return 2;
    }

    public void N(int n, int n2) {
        switch (n) {
            case 0: {
                this.N.R = n2;
                break;
            }
            case 1: {
                this.N.M = n2;
            }
        }
    }

    public int N(int n) {
        return switch (n) {
            case 0 -> this.N.R;
            case 1 -> this.N.M;
            default -> 0;
        };
    }
}

