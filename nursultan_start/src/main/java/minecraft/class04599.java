/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  minecraft.class00143
 *  minecraft.class00753
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07430
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.EnumSet;
import java.util.Optional;
import minecraft.class00143;
import minecraft.class00753;
import minecraft.class04596;
import minecraft.class04626;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import org.jspecify.annotations.Nullable;

class class04599
extends class04596 {
    private static final int L = 400;
    private static final double u = 0.1;
    private static final int i = 25;
    private static final float R = 0.35f;
    private static final float M = 0.6f;
    private static final float B = 0.33333334f;
    private static final int Z = 5;
    private int z;
    private int U;
    private boolean E;
    private @Nullable class06889 W;
    private int m;
    private static final int P = 600;
    private Long2LongOpenHashMap s;
    final /* synthetic */ class04626 y;

    public void L() {
        this.z = 0;
        this.m = 0;
        this.U = 0;
        this.E = true;
        this.y.w();
    }

    @Override
    public boolean M() {
        if (this.y.A > 0) {
            return false;
        }
        if (this.y.NI()) {
            return false;
        }
        if (this.y.method_73183().method_8419()) {
            return false;
        }
        Optional<class07209> var1 = this.s();
        if (var1.isPresent()) {
            this.y.f = var1.get();
            class04626.j(this.y).N((double)this.y.f.method_10263() + 0.5, (double)this.y.f.method_10264() + 0.5, (double)this.y.f.method_10260() + 0.5, (double)1.2f);
            return true;
        }
        this.y.A = class04995.N((class06069)class04626.v(this.y), (int)20, (int)60);
        return false;
    }

    private float P() {
        return (class04626.w(this.y).z() * 2.0f - 1.0f) * 0.33333334f;
    }

    class04599(class04626 class046262) {
        this.y = class046262;
        super(class046262);
        this.s = new Long2LongOpenHashMap();
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public boolean B() {
        return true;
    }

    @Override
    public boolean Z() {
        if (!this.E) {
            return false;
        }
        if (!this.y.v()) {
            return false;
        }
        if (this.y.method_73183().method_8419()) {
            return false;
        }
        if (this.W()) {
            return class04626.n(this.y).z() < 0.2f;
        }
        return true;
    }

    public void i() {
        if (!this.y.v()) {
            return;
        }
        ++this.m;
        if (this.m > 600) {
            this.y.l();
            this.E = false;
            this.y.A = 200;
            return;
        }
        class06889 class068892 = class06889.L((class00753)this.y.f).y(0.0, (double)0.6f, 0.0);
        if (class068892.R(this.y.method_73189()) > 1.0) {
            this.W = class068892;
            this.m();
            return;
        }
        if (this.W == null) {
            this.W = class068892;
        }
        boolean bl = this.y.method_73189().R(this.W) <= 0.1;
        boolean bl2 = true;
        if (!bl && this.m > 600) {
            this.y.l();
            return;
        }
        if (bl) {
            if (class04626.G(this.y).y(25) == 0) {
                this.W = new class06889(class068892.N() + (double)this.P(), class068892.y(), class068892.L() + (double)this.P());
                class04626.l(this.y).W();
            } else {
                bl2 = false;
            }
            this.y.p().N(class068892.N(), class068892.y(), class068892.L());
        }
        if (bl2) {
            this.m();
        }
        ++this.z;
        if (class04626.d(this.y).z() < 0.05f && this.z > this.U + 60) {
            this.U = this.z;
            this.y.method_5783(class04909.LR, 1.0f, 1.0f);
        }
    }

    private Optional<class07209> s() {
        Iterable var1 = class07209.method_25996((class07209)this.y.method_24515(), (int)5, (int)5, (int)5);
        Long2LongOpenHashMap long2LongOpenHashMap = new Long2LongOpenHashMap();
        for (class07209 class072092 : var1) {
            long l = this.s.getOrDefault(class072092.method_10063(), Long.MIN_VALUE);
            if (this.y.method_73183().N() < l) {
                long2LongOpenHashMap.put(class072092.method_10063(), l);
                continue;
            }
            if (!class04626.N(this.y.method_73183().method_8320(class072092))) continue;
            class00143 class001432 = class04626.k(this.y).N(class072092, 1);
            if (class001432 != null && class001432.z()) {
                return Optional.of(class072092);
            }
            long2LongOpenHashMap.put(class072092.method_10063(), this.y.method_73183().N() + 600L);
        }
        this.s = long2LongOpenHashMap;
        return Optional.empty();
    }

    private void m() {
        this.y.F().N(this.W.N(), this.W.y(), this.W.L(), (double)0.35f);
    }

    boolean U() {
        return this.E;
    }

    public void u() {
        if (this.W()) {
            this.y.N(true);
        }
        this.E = false;
        class04626.t(this.y).W();
        this.y.A = 200;
    }

    void E() {
        this.E = false;
    }

    private boolean W() {
        return this.z > 400;
    }
}

