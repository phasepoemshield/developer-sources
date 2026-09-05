/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00143
 *  minecraft.class01210
 *  minecraft.class07209
 *  minecraft.class07430
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import minecraft.class00143;
import minecraft.class01210;
import minecraft.class04596;
import minecraft.class04626;
import minecraft.class07209;
import minecraft.class07430;
import org.jspecify.annotations.Nullable;

public class class04623
extends class04596 {
    public static final int y = 2400;
    int L;
    private static final int R = 3;
    final List<class07209> u;
    private @Nullable class00143 M;
    private static final int B = 60;
    private int Z;
    final /* synthetic */ class04626 i;

    private void L(class07209 class072092) {
        this.u.add(class072092);
        while (this.u.size() > 3) {
            this.u.remove(0);
        }
    }

    public void L() {
        this.L = 0;
        this.Z = 0;
        super.L();
    }

    @Override
    public boolean M() {
        return this.i.C != null && !this.i.i(this.i.C) && !this.i.Nj() && this.i.d() && !this.u(this.i.C) && this.i.method_73183().method_8320(this.i.C).N(class01210.NC);
    }

    class04623(class04626 class046262) {
        this.i = class046262;
        super(class046262);
        this.u = Lists.newArrayList();
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    @Override
    public boolean Z() {
        return this.M();
    }

    public void i() {
        if (this.i.C == null) {
            return;
        }
        ++this.L;
        if (this.L > this.N(2400)) {
            this.E();
            return;
        }
        if (class04626.B(this.i).E()) {
            return;
        }
        if (this.i.y(this.i.C, 16)) {
            if (!this.y(this.i.C)) {
                this.E();
            } else if (this.M != null && class04626.Z(this.i).Z().N(this.M)) {
                ++this.Z;
                if (this.Z > 60) {
                    this.i.G();
                    this.Z = 0;
                }
            } else {
                this.M = class04626.z(this.i).Z();
            }
            return;
        }
        if (this.i.i(this.i.C)) {
            this.i.G();
            return;
        }
        this.i.N(this.i.C);
    }

    void U() {
        this.u.clear();
    }

    public void u() {
        this.L = 0;
        this.Z = 0;
        class04626.R(this.i).W();
        class04626.M(this.i).R();
    }

    private boolean u(class07209 class072092) {
        if (this.i.y(class072092, 2)) {
            return true;
        }
        class00143 class001432 = class04626.P(this.i).Z();
        return class001432 != null && class001432.E().equals((Object)class072092) && class001432.z() && class001432.L();
    }

    private boolean y(class07209 class072092) {
        int n = this.i.y(class072092, 3) ? 1 : 2;
        class04626.U(this.i).y(10.0f);
        class04626.E(this.i).N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), n, 1.0);
        return class04626.W(this.i).Z() != null && class04626.m(this.i).Z().z();
    }

    private void E() {
        if (this.i.C != null) {
            this.L(this.i.C);
        }
        this.i.G();
    }

    boolean N(class07209 class072092) {
        return this.u.contains(class072092);
    }
}

