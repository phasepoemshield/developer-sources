/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00869
 *  minecraft.class04688
 *  minecraft.class07350
 */
package Nursultan;

import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00869;
import minecraft.class04688;
import minecraft.class07350;

public class class09371
implements class07350<class00500> {
    public int N;
    public int y;
    public int L;

    public class09371(class00554 class005542) {
    }

    public void accept(class00500 class005002, int n) {
        class04688 class046882 = class005002.Y();
        class00500 class005003 = class005002;
        if (!this.N(class005003)) {
            this.N += n;
            if (class005002.Q()) {
                this.y += n;
            }
        }
        if (!class046882.W()) {
            this.N += n;
            if (class046882.M()) {
                this.L += n;
            }
        }
    }

    private boolean N(class00500 class005002) {
        return class005002.N(class00869.N) || class005002.N(class00869.mr) || class005002.N(class00869.mh);
    }
}

