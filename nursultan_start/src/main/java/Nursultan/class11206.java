/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09064
 *  minecraft.class08066
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class11173;
import Nursultan.class11182;
import Nursultan.class11186;
import Nursultan.class11187;
import Nursultan.class11189;
import Nursultan.class11192;
import Nursultan.class11194;
import Nursultan.class11205;
import Nursultan.class11218;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import minecraft.class08066;

public class class11206<C> {
    public Object N_0;
    public Object N_1;

    private void L() {
    }

    public class11206<C> L(Supplier<class08066> supplier) {
        return this.L(supplier, true);
    }

    public class11206<C> L(Supplier<class08066> supplier, boolean bl) {
        ((class11194)this.N_1).N(new class11186(supplier, bl));
        return this;
    }

    public class11206<C> L(class09064 class090642) {
        return this.N(33984, class090642);
    }

    class11206(class11187<C> class111872, class11194<C> class111942) {
        this.L();
        this.N_0 = class111872;
        this.N_1 = class111942;
    }

    public class11206<C> y(class09064 class090642, boolean bl) {
        ((class11194)this.N_1).N(new class11182(class090642, bl));
        return this;
    }

    public class11187<C> y_1(Supplier<class08066> supplier) {
        return ((class11187)this.N_0).N(supplier);
    }

    public class11206<C> y(Supplier<class08066> supplier, boolean bl) {
        ((class11194)this.N_1).N(new class11186(supplier, bl));
        ((class11194)this.N_1).y(true);
        return this;
    }

    public class11206<C> y(class09064 class090642) {
        return this.N(class090642, true);
    }

    public class11206<C> y(class11173<C> class111732) {
        ((class11194)this.N_1).y(class111732);
        return this;
    }

    public class11206<C> N(class11192<C> class111922) {
        return ((class11187)this.N_0).N(class111922);
    }

    public class11206<C> N_3(class11173<C> class111732) {
        ((class11194)this.N_1).N(class111732);
        return this;
    }

    public class11206<C> N(class09064 class090642) {
        return this.y(class090642, true);
    }

    public class11206<C> N_4(Supplier<class08066> supplier) {
        return this.y(supplier, true);
    }

    public class11206<C> N(class09064 class090642, boolean bl) {
        ((class11194)this.N_1).N(new class11182(class090642, bl));
        ((class11194)this.N_1).y(true);
        return this;
    }

    public class11187<C> N(Supplier<class08066> supplier, boolean bl) {
        return ((class11187)this.N_0).N(supplier, bl);
    }

    public class11206<C> N(int n, IntSupplier intSupplier) {
        ((class11194)this.N_1).N(new class11189(n, intSupplier));
        return this;
    }

    public class11206<C> N(int n, class09064 class090642) {
        ((class11194)this.N_1).N(new class11205(n, class090642));
        return this;
    }

    public class11206<C> N(IntSupplier intSupplier) {
        return this.N(33984, intSupplier);
    }

    public class11218<C> N() {
        return ((class11187)this.N_0).N();
    }
}

