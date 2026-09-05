/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00147
 *  minecraft.class00161
 *  minecraft.class00176
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import minecraft.class00147;
import minecraft.class00161;
import minecraft.class00176;
import minecraft.class06584;
import org.jspecify.annotations.Nullable;

public class class09174
implements class00161 {
    private final class00147 y;
    private @Nullable class06584 L = null;
    private @Nullable class00176 u = null;

    public class09174(class00147 class001472) {
        this.y = class001472;
    }

    public boolean y(class06584 class065842) {
        if (this.L != null) {
            return class06584.N((class06584)this.L, (class06584)class065842);
        }
        if (this.u != null && this.u.N(class065842, this.y)) {
            this.L = class065842.t();
            return true;
        }
        return false;
    }

    public void N(class09174 class091742) {
        this.L = class091742.L;
        this.u = class091742.u;
    }

    public void N(class00176 class001762) {
        this.L = null;
        this.u = class001762;
    }

    public void N(class06584 class065842) {
        this.L = class065842.t();
        this.u = null;
    }
}

