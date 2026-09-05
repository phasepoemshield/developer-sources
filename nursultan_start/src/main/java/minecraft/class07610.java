/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08978
 */
package minecraft;

import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08978;

public abstract class class07610
extends class07482 {
    protected final class06695 N;
    protected final class07438 y;
    protected final int L;
    protected final int u;
    protected final int i;
    protected static final int R = 3;

    protected class07610(int n, class08044 class080442, class06695 class066952, class07438 class074382) {
        super(null, n);
        this.L = 0;
        this.u = 1;
        this.i = 2;
        this.N = class066952;
        this.y = class074382;
        class066952.method_5435((class08978)class080442.z);
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.N.method_5432((class08978)class080362);
    }

    public static int N(int n) {
        return n * 3;
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            int n2 = 2 + this.N.method_5439();
            if (n < n2) {
                if (!this.N(class065843, n2, this.T.size(), true)) {
                    return class06584.E;
                }
            } else if (this.L(1).N(class065843) && !this.L(1).R()) {
                if (!this.N(class065843, 1, 2, false)) {
                    return class06584.E;
                }
            } else if (this.L(0).N(class065843) && !this.L(0).R()) {
                if (!this.N(class065843, 0, 1, false)) {
                    return class06584.E;
                }
            } else if (this.N.method_5439() == 0 || !this.N(class065843, 2, n2, false)) {
                int n3;
                int n4 = n3 = n2 + 27;
                int n5 = n4 + 9;
                if (n >= n4 && n < n5 ? !this.N(class065843, n2, n3, false) : (n >= n2 && n < n3 ? !this.N(class065843, n4, n5, false) : !this.N(class065843, n4, n3, false))) {
                    return class06584.E;
                }
                return class06584.E;
            }
            if (class065843.R()) {
                class069372.u(class06584.E);
            } else {
                class069372.M();
            }
        }
        return class065842;
    }

    protected abstract boolean N(class06695 var1);

    public boolean N(class08036 class080362) {
        return !this.N(this.N) && this.N.method_5443(class080362) && this.y.method_5805() && class080362.method_56094((class07049)this.y, 4.0);
    }
}

