/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09065
 *  minecraft.class08066
 */
package Nursultan;

import Nursultan.class09065;
import Nursultan.class11171;
import Nursultan.class11192;
import Nursultan.class11194;
import Nursultan.class11206;
import Nursultan.class11214;
import Nursultan.class11218;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class08066;

public class class11187<C> {
    public Object N_0;
    public Object N_1;

    class11187(class09065 class090652) {
        this.y();
        this.N_0 = new ArrayList();
        this.N_1 = class090652;
    }

    private void y() {
    }

    public class11187<C> N(Supplier<class08066> supplier, boolean bl) {
        ((List)this.N_0).add(new class11214(supplier, bl));
        return this;
    }

    public class11206<C> N(class11192<C> class111922) {
        class11194<C> class111942 = new class11194<C>(class111922);
        ((List)this.N_0).add(class111942);
        return new class11206<C>(this, class111942);
    }

    public class11187<C> N(Supplier<class08066> supplier) {
        return this.N(supplier, true);
    }

    public class11218<C> N() {
        ((List)this.N_0).forEach(class11171::N);
        return new class11218(List.copyOf((List)this.N_0), (class09065)this.N_1);
    }
}

