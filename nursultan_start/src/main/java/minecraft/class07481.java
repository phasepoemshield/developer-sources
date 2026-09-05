/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07242
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class04770;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07242;
import minecraft.class08036;

public class class07481
extends class06937 {
    private final class08036 N;
    private int y;

    public class07481(class08036 class080362, class06695 class066952, int n, int n2, int n3) {
        super(class066952, n, n2, n3);
        this.N = class080362;
    }

    protected void N(class06584 class065842, int n) {
        this.y += n;
        this.c_(class065842);
    }

    public void N(class08036 class080362, class06584 class065842) {
        this.c_(class065842);
        super.N(class080362, class065842);
    }

    public class06584 N(int n) {
        if (this.R()) {
            this.y += Math.min(n, this.i().c());
        }
        return super.N(n);
    }

    public boolean N(class06584 class065842) {
        return false;
    }

    protected void c_(class06584 class065842) {
        class065842.N(this.N, this.y);
        class08036 class080362 = this.N;
        if (class080362 instanceof class04770) {
            class04770 class047702 = (class04770)class080362;
            class080362 = this.L;
            if (class080362 instanceof class07242) {
                ((class07242)class080362).N(class047702);
            }
        }
        this.y = 0;
    }
}

