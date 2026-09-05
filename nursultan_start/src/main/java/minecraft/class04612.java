/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07430
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class04596;
import minecraft.class04626;
import minecraft.class07430;

public class class04612
extends class04596 {
    private static final int u = 2400;
    int y;
    final /* synthetic */ class04626 L;

    public void L() {
        this.y = 0;
        super.L();
    }

    @Override
    public boolean M() {
        return this.L.f != null && !this.L.Nj() && this.U() && !this.L.y(this.L.f, 2);
    }

    class04612(class04626 class046262) {
        this.L = class046262;
        super(class046262);
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    @Override
    public boolean Z() {
        return this.M();
    }

    public void i() {
        if (this.L.f == null) {
            return;
        }
        ++this.y;
        if (this.y > this.N(2400)) {
            this.L.l();
            return;
        }
        if (class04626.b(this.L).E()) {
            return;
        }
        if (this.L.i(this.L.f)) {
            this.L.l();
            return;
        }
        this.L.N(this.L.f);
    }

    private boolean U() {
        return this.L.p > 600;
    }

    public void u() {
        this.y = 0;
        class04626.s(this.L).W();
        class04626.T(this.L).R();
    }
}

