/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10777
 *  minecraft.class01001
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07429
 *  minecraft.class07446
 *  minecraft.class07473
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10777;
import java.util.stream.Stream;
import minecraft.class01001;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07429;
import minecraft.class07446;
import minecraft.class07473;
import minecraft.class07629;
import org.jspecify.annotations.Nullable;

public abstract class class07643
extends class07629 {
    private @Nullable class07643 N;
    private int y = 1;

    public void w() {
        if (this.n()) {
            this.f().N((class07049)this.N, 1.0);
        }
    }

    private void Q() {
        ++this.y;
    }

    public void method_5773() {
        super.method_5773();
        if (this.l() && this.method_73183().field_9229.y(200) == 1 && this.method_73183().N(((Object)((Object)this)).getClass(), this.method_5829().L(8.0, 8.0, 8.0)).size() <= 1) {
            this.y = 1;
        }
    }

    public class07643(class07078<? extends class07643> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public boolean n() {
        return this.N != null && this.N.method_5805();
    }

    public boolean l() {
        return this.y > 1;
    }

    public boolean d() {
        return this.method_5858((class07049)this.N) <= 121.0;
    }

    public void t() {
        this.N.O();
        this.N = null;
    }

    public int v() {
        return super.n_();
    }

    public class07643 N(class07643 class076432) {
        this.N = class076432;
        class076432.Q();
        return class076432;
    }

    public void N(Stream<? extends class07643> stream) {
        stream.limit(this.v() - this.y).filter(class076432 -> class076432 != this).forEach(class076432 -> class076432.N(this));
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        super.N(class010012, class070522, class061132, class074462);
        if (class074462 == null) {
            class074462 = new class10777(this);
        } else {
            this.N(((class10777)class074462).N);
        }
        return class074462;
    }

    @Override
    public boolean W() {
        return !this.n();
    }

    private void O() {
        --this.y;
    }

    public boolean G() {
        return this.l() && this.y < this.v();
    }

    @Override
    protected void l_() {
        super.l_();
        this.e.N(5, (class07473)new class07429(this));
    }

    @Override
    public int n_() {
        return this.v();
    }
}

