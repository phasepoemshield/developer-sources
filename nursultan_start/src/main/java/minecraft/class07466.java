/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00891
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07305
 *  minecraft.class07449
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00891;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07305;
import minecraft.class07449;

public class class07466
extends class07449 {
    private static final int M = 240;
    private final Predicate<class07086> B;
    protected int N;
    protected int y = -1;
    protected int L = -1;

    public void L() {
        super.L();
        this.N = 0;
    }

    public class07466(class07079 class070792, Predicate<class07086> predicate) {
        super(class070792);
        this.B = predicate;
    }

    public class07466(class07079 class070792, int n, Predicate<class07086> predicate) {
        this(class070792, predicate);
        this.L = n;
    }

    public void i() {
        super.i();
        if (this.u.method_59922().y(20) == 0) {
            this.u.method_73183().N(1019, this.i, 0);
            if (!this.u.fields_0212a028292fd3c078969e3ee4c71d9e8_4.booleanValue()) {
                this.u.method_6104(this.u.method_6058());
            }
        }
        ++this.N;
        int n = (int)((float)this.N / (float)this.R() * 10.0f);
        if (n != this.y) {
            this.u.method_73183().method_8517(this.u.method_5628(), this.i, n);
            this.y = n;
        }
        if (this.N == this.R() && this.N(this.u.method_73183().y())) {
            this.u.method_73183().method_8650(this.i, false);
            this.u.method_73183().N(1021, this.i, 0);
            this.u.method_73183().N(2001, this.i, class00891.W((class00500)this.u.method_73183().method_8320(this.i)));
        }
    }

    public void u() {
        super.u();
        this.u.method_73183().method_8517(this.u.method_5628(), this.i, -1);
    }

    public boolean y() {
        return this.N <= this.R() && !this.M() && this.i.method_19769((class00737)this.u.method_73189(), 2.0) && this.N(this.u.method_73183().y());
    }

    private boolean N(class07086 class070862) {
        return this.B.test(class070862);
    }

    public boolean N() {
        if (!super.N()) {
            return false;
        }
        if (!((Boolean)class07466.N((class07049)this.u).method_64395().N(class07305.I)).booleanValue()) {
            return false;
        }
        return this.N(this.u.method_73183().y()) && !this.M();
    }

    protected int R() {
        return Math.max(240, this.L);
    }
}

