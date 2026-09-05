/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package minecraft;

import java.util.UUID;
import minecraft.class00392;
import minecraft.class06685;
import minecraft.class06702;

public abstract class class06687 {
    private final UUID B;
    protected class00392 N;
    protected float y;
    protected class06685 L;
    protected class06702 u;
    protected boolean i;
    protected boolean R;
    protected boolean M;

    public float L() {
        return this.y;
    }

    public class06687 L(boolean bl) {
        this.M = bl;
        return this;
    }

    public boolean M() {
        return this.R;
    }

    public class06687(UUID uUID, class00392 class003922, class06685 class066852, class06702 class067022) {
        this.B = uUID;
        this.N = class003922;
        this.L = class066852;
        this.u = class067022;
        this.y = 1.0f;
    }

    public boolean B() {
        return this.M;
    }

    public class06702 i() {
        return this.u;
    }

    public class06685 u() {
        return this.L;
    }

    public class06687 y(boolean bl) {
        this.R = bl;
        return this;
    }

    public class00392 y() {
        return this.N;
    }

    public UUID N() {
        return this.B;
    }

    public class06687 N(boolean bl) {
        this.i = bl;
        return this;
    }

    public void N(class06685 class066852) {
        this.L = class066852;
    }

    public void N(class00392 class003922) {
        this.N = class003922;
    }

    public void N(class06702 class067022) {
        this.u = class067022;
    }

    public void N(float f) {
        this.y = f;
    }

    public boolean R() {
        return this.i;
    }
}

