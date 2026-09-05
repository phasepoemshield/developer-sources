/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05845
 */
package minecraft;

import minecraft.class05845;
import minecraft.class07242;

class class07231
implements class05845 {
    final /* synthetic */ class07242 N;

    class07231(class07242 class072422) {
        this.N = class072422;
    }

    public int N() {
        return 4;
    }

    public void N(int n, int n2) {
        switch (n) {
            case 0: {
                this.N.T = n2;
                break;
            }
            case 1: {
                this.N.b = n2;
                break;
            }
            case 2: {
                this.N.j = n2;
                break;
            }
            case 3: {
                this.N.v = n2;
                break;
            }
        }
    }

    public int N(int n) {
        switch (n) {
            case 0: {
                return this.N.T;
            }
            case 1: {
                return this.N.b;
            }
            case 2: {
                return this.N.j;
            }
            case 3: {
                return this.N.v;
            }
        }
        return 0;
    }
}

